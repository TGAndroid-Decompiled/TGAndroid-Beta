package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mh1;
public final class d1 implements org.telegram.ui.ActionBar.a2, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f25539a;
    public final Object f25540b;
    public final Object f25541c;
    public final Object d;
    public final Object f25542e;
    public final Object f25543f;
    public final Object h;

    public d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f25539a = i10;
        this.f25540b = obj;
        this.f25541c = obj2;
        this.d = obj3;
        this.f25542e = obj4;
        this.f25543f = obj5;
        this.h = obj6;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f25539a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f25540b;
                AccountInstance accountInstance = (AccountInstance) this.f25541c;
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f25542e;
                MessageObject messageObject = (MessageObject) this.f25543f;
                org.telegram.ui.Cells.a2[] a2VarArr = (org.telegram.ui.Cells.a2[]) this.h;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(znVar.a(), user.f20185id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(znVar.a(), -chat.f20038id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (a2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (znVar.getParentActivity() != null) {
                        znVar.T7();
                        UndoView undoView = znVar.y3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new y1(accountInstance, 0));
                return;
            default:
                org.telegram.ui.vm0 vm0Var = (org.telegram.ui.vm0) this.f25540b;
                org.telegram.ui.nn0 nn0Var = vm0Var.f42905a;
                nn0Var.Y[0].setText((String) this.f25541c);
                nn0Var.Y[1].setText((String) this.d);
                nn0Var.Y[2].setText((String) this.f25542e);
                nn0Var.M1(true, true);
                vm0Var.c((org.telegram.ui.tk0) this.f25543f, (org.telegram.ui.ActionBar.b5) this.h);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        switch (this.f25539a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f25540b;
                Utilities.Callback callback = (Utilities.Callback) this.f25543f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                c5.k a2 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f4267c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f25541c).currency)) * (a2.f4266b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new mh1((Utilities.Callback) this.f25542e, list, hVar, callback, n2Var, tL_inputStorePaymentPremiumGiftCode, 2));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f25540b;
                tg.v vVar = (tg.v) this.f25543f;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.h;
                c5.k a10 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a10.f4267c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f25541c).currency)) * (a10.f4266b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new mh1((tg.v) this.f25542e, list, hVar, vVar, n2Var2, tL_inputStorePaymentPremiumGiveaway, 1));
                return;
        }
    }

    public d1(TLRPC.User user, AccountInstance accountInstance, org.telegram.ui.zn znVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.a2[] a2VarArr, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f25539a = 0;
        this.f25540b = user;
        this.f25541c = accountInstance;
        this.d = znVar;
        this.f25542e = chat;
        this.f25543f = messageObject;
        this.h = a2VarArr;
    }
}
