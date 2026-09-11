package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lh1;
public final class e1 implements org.telegram.ui.ActionBar.a2, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f25505a;
    public final Object f25506b;
    public final Object f25507c;
    public final Object d;
    public final Object f25508e;
    public final Object f25509f;
    public final Object h;

    public e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f25505a = i10;
        this.f25506b = obj;
        this.f25507c = obj2;
        this.d = obj3;
        this.f25508e = obj4;
        this.f25509f = obj5;
        this.h = obj6;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f25505a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f25506b;
                AccountInstance accountInstance = (AccountInstance) this.f25507c;
                org.telegram.ui.co coVar = (org.telegram.ui.co) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f25508e;
                MessageObject messageObject = (MessageObject) this.f25509f;
                org.telegram.ui.Cells.z1[] z1VarArr = (org.telegram.ui.Cells.z1[]) this.h;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(coVar.a(), user.f20016id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(coVar.a(), -chat.f19869id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (z1VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (coVar.getParentActivity() != null) {
                        coVar.Q7();
                        UndoView undoView = coVar.y3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new y1(accountInstance, 0));
                return;
            default:
                org.telegram.ui.xm0 xm0Var = (org.telegram.ui.xm0) this.f25506b;
                org.telegram.ui.pn0 pn0Var = xm0Var.f42763a;
                pn0Var.Y[0].setText((String) this.f25507c);
                pn0Var.Y[1].setText((String) this.d);
                pn0Var.Y[2].setText((String) this.f25508e);
                pn0Var.N1(true, true);
                xm0Var.c((org.telegram.ui.rl0) this.f25509f, (o0.a) this.h);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        switch (this.f25505a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f25506b;
                Utilities.Callback callback = (Utilities.Callback) this.f25509f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                c5.k a2 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f4410c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f25507c).currency)) * (a2.f4409b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new lh1((Utilities.Callback) this.f25508e, list, hVar, callback, n2Var, tL_inputStorePaymentPremiumGiftCode, 2));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f25506b;
                ug.w wVar = (ug.w) this.f25509f;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.h;
                c5.k a10 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a10.f4410c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f25507c).currency)) * (a10.f4409b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new lh1((ug.w) this.f25508e, list, hVar, wVar, n2Var2, tL_inputStorePaymentPremiumGiveaway, 1));
                return;
        }
    }

    public e1(TLRPC.User user, AccountInstance accountInstance, org.telegram.ui.co coVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.z1[] z1VarArr, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f25505a = 0;
        this.f25506b = user;
        this.f25507c = accountInstance;
        this.d = coVar;
        this.f25508e = chat;
        this.f25509f = messageObject;
        this.h = z1VarArr;
    }
}
