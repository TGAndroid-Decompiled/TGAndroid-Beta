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
    public final int f23455a;
    public final Object f23456b;
    public final Object f23457c;
    public final Object d;
    public final Object e;
    public final Object f23458f;
    public final Object h;

    public d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f23455a = i10;
        this.f23456b = obj;
        this.f23457c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f23458f = obj5;
        this.h = obj6;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f23455a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f23456b;
                AccountInstance accountInstance = (AccountInstance) this.f23457c;
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                MessageObject messageObject = (MessageObject) this.f23458f;
                org.telegram.ui.Cells.a2[] a2VarArr = (org.telegram.ui.Cells.a2[]) this.h;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(znVar.a(), user.f18475id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(znVar.a(), -chat.f18328id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (a2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (znVar.getParentActivity() != null) {
                        znVar.Q7();
                        UndoView undoView = znVar.y3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new x1(accountInstance, 0));
                return;
            default:
                org.telegram.ui.xm0 xm0Var = (org.telegram.ui.xm0) this.f23456b;
                org.telegram.ui.pn0 pn0Var = xm0Var.f39626a;
                pn0Var.Y[0].setText((String) this.f23457c);
                pn0Var.Y[1].setText((String) this.d);
                pn0Var.Y[2].setText((String) this.e);
                pn0Var.N1(true, true);
                xm0Var.c((org.telegram.ui.sl0) this.f23458f, (m5.e) this.h);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        switch (this.f23455a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f23456b;
                Utilities.Callback callback = (Utilities.Callback) this.f23458f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                c5.k a2 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f3907c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f23457c).currency)) * (a2.f3906b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new mh1((Utilities.Callback) this.e, list, hVar, callback, n2Var, tL_inputStorePaymentPremiumGiftCode, 2));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f23456b;
                tg.v vVar = (tg.v) this.f23458f;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.h;
                c5.k a10 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a10.f3907c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f23457c).currency)) * (a10.f3906b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new mh1((tg.v) this.e, list, hVar, vVar, n2Var2, tL_inputStorePaymentPremiumGiveaway, 1));
                return;
        }
    }

    public d1(TLRPC.User user, AccountInstance accountInstance, org.telegram.ui.zn znVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.a2[] a2VarArr, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f23455a = 0;
        this.f23456b = user;
        this.f23457c = accountInstance;
        this.d = znVar;
        this.e = chat;
        this.f23458f = messageObject;
        this.h = a2VarArr;
    }
}
