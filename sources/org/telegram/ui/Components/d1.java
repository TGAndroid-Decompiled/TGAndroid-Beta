package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lh1;
public final class d1 implements org.telegram.ui.ActionBar.z1, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f25394a;
    public final Object f25395b;
    public final Object f25396c;
    public final Object d;
    public final Object f25397e;
    public final Object f25398f;
    public final Object h;

    public d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f25394a = i10;
        this.f25395b = obj;
        this.f25396c = obj2;
        this.d = obj3;
        this.f25397e = obj4;
        this.f25398f = obj5;
        this.h = obj6;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f25394a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f25395b;
                AccountInstance accountInstance = (AccountInstance) this.f25396c;
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f25397e;
                MessageObject messageObject = (MessageObject) this.f25398f;
                org.telegram.ui.Cells.a2[] a2VarArr = (org.telegram.ui.Cells.a2[]) this.h;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(znVar.a(), user.f20179id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(znVar.a(), -chat.f20032id);
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
                org.telegram.ui.um0 um0Var = (org.telegram.ui.um0) this.f25395b;
                org.telegram.ui.mn0 mn0Var = um0Var.f42650a;
                mn0Var.Y[0].setText((String) this.f25396c);
                mn0Var.Y[1].setText((String) this.d);
                mn0Var.Y[2].setText((String) this.f25397e);
                mn0Var.M1(true, true);
                um0Var.c((org.telegram.ui.sk0) this.f25398f, (n7.z0) this.h);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        switch (this.f25394a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f25395b;
                Utilities.Callback callback = (Utilities.Callback) this.f25398f;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.h;
                c5.k a2 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f4266c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f25396c).currency)) * (a2.f4265b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new lh1((Utilities.Callback) this.f25397e, list, hVar, callback, m2Var, tL_inputStorePaymentPremiumGiftCode, 2));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f25395b;
                tg.u uVar = (tg.u) this.f25398f;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.h;
                c5.k a10 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a10.f4266c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f25396c).currency)) * (a10.f4265b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new lh1((tg.u) this.f25397e, list, hVar, uVar, m2Var2, tL_inputStorePaymentPremiumGiveaway, 1));
                return;
        }
    }

    public d1(TLRPC.User user, AccountInstance accountInstance, org.telegram.ui.zn znVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.a2[] a2VarArr, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f25394a = 0;
        this.f25395b = user;
        this.f25396c = accountInstance;
        this.d = znVar;
        this.f25397e = chat;
        this.f25398f = messageObject;
        this.h = a2VarArr;
    }
}
