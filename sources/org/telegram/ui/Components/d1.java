package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dh1;
public final class d1 implements org.telegram.ui.ActionBar.a2, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f23175a;
    public final Object f23176b;
    public final Object f23177c;
    public final Object d;
    public final Object e;
    public final Object f23178f;
    public final Object h;

    public d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f23175a = i10;
        this.f23176b = obj;
        this.f23177c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f23178f = obj5;
        this.h = obj6;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f23175a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f23176b;
                AccountInstance accountInstance = (AccountInstance) this.f23177c;
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                MessageObject messageObject = (MessageObject) this.f23178f;
                org.telegram.ui.Cells.z1[] z1VarArr = (org.telegram.ui.Cells.z1[]) this.h;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(xnVar.a(), user.f18230id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(xnVar.a(), -chat.f18083id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (z1VarArr[0].b()) {
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
                org.telegram.ui.qm0 qm0Var = (org.telegram.ui.qm0) this.f23176b;
                org.telegram.ui.in0 in0Var = qm0Var.f36476a;
                in0Var.Y[0].setText((String) this.f23177c);
                in0Var.Y[1].setText((String) this.d);
                in0Var.Y[2].setText((String) this.e);
                in0Var.N1(true, true);
                qm0Var.c((org.telegram.ui.jl0) this.f23178f, (o0.a) this.h);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        switch (this.f23175a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f23176b;
                Utilities.Callback callback = (Utilities.Callback) this.f23178f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                c5.k a2 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f3898c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f23177c).currency)) * (a2.f3897b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new dh1((Utilities.Callback) this.e, list, hVar, callback, n2Var, tL_inputStorePaymentPremiumGiftCode, 2));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f23176b;
                tg.w wVar = (tg.w) this.f23178f;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.h;
                c5.k a10 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a10.f3898c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f23177c).currency)) * (a10.f3897b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new dh1((tg.w) this.e, list, hVar, wVar, n2Var2, tL_inputStorePaymentPremiumGiveaway, 1));
                return;
        }
    }

    public d1(TLRPC.User user, AccountInstance accountInstance, org.telegram.ui.xn xnVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.z1[] z1VarArr, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f23175a = 0;
        this.f23176b = user;
        this.f23177c = accountInstance;
        this.d = xnVar;
        this.e = chat;
        this.f23178f = messageObject;
        this.h = z1VarArr;
    }
}
