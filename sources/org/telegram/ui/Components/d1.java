package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dh1;
public final class d1 implements org.telegram.ui.ActionBar.b2, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f23478a;
    public final Object f23479b;
    public final Object f23480c;
    public final Object d;
    public final Object e;
    public final Object f23481f;
    public final Object h;

    public d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f23478a = i10;
        this.f23479b = obj;
        this.f23480c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f23481f = obj5;
        this.h = obj6;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f23478a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f23479b;
                AccountInstance accountInstance = (AccountInstance) this.f23480c;
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                MessageObject messageObject = (MessageObject) this.f23481f;
                org.telegram.ui.Cells.a2[] a2VarArr = (org.telegram.ui.Cells.a2[]) this.h;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(xnVar.a(), user.f18476id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(xnVar.a(), -chat.f18329id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (a2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (xnVar.getParentActivity() != null) {
                        xnVar.Q7();
                        UndoView undoView = xnVar.y3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new y1(accountInstance, 0));
                return;
            default:
                org.telegram.ui.rm0 rm0Var = (org.telegram.ui.rm0) this.f23479b;
                org.telegram.ui.jn0 jn0Var = rm0Var.f37159a;
                jn0Var.Y[0].setText((String) this.f23480c);
                jn0Var.Y[1].setText((String) this.d);
                jn0Var.Y[2].setText((String) this.e);
                jn0Var.N1(true, true);
                rm0Var.c((org.telegram.ui.ml0) this.f23481f, (o0.a) this.h);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        switch (this.f23478a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f23479b;
                Utilities.Callback callback = (Utilities.Callback) this.f23481f;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.h;
                c5.k a2 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f3900c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f23480c).currency)) * (a2.f3899b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new dh1((Utilities.Callback) this.e, list, hVar, callback, o2Var, tL_inputStorePaymentPremiumGiftCode, 2));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f23479b;
                tg.v vVar = (tg.v) this.f23481f;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.h;
                c5.k a10 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a10.f3900c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f23480c).currency)) * (a10.f3899b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new dh1((tg.v) this.e, list, hVar, vVar, o2Var2, tL_inputStorePaymentPremiumGiveaway, 1));
                return;
        }
    }

    public d1(TLRPC.User user, AccountInstance accountInstance, org.telegram.ui.xn xnVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.a2[] a2VarArr, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f23478a = 0;
        this.f23479b = user;
        this.f23480c = accountInstance;
        this.d = xnVar;
        this.e = chat;
        this.f23481f = messageObject;
        this.h = a2VarArr;
    }
}
