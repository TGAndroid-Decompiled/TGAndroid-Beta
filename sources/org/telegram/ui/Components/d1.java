package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mh1;
public final class d1 implements org.telegram.ui.ActionBar.b2, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f23171a;
    public final Object f23172b;
    public final Object f23173c;
    public final Object d;
    public final Object e;
    public final Object f23174f;
    public final Object h;

    public d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f23171a = i10;
        this.f23172b = obj;
        this.f23173c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f23174f = obj5;
        this.h = obj6;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f23171a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f23172b;
                AccountInstance accountInstance = (AccountInstance) this.f23173c;
                org.telegram.ui.bo boVar = (org.telegram.ui.bo) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                MessageObject messageObject = (MessageObject) this.f23174f;
                org.telegram.ui.Cells.z1[] z1VarArr = (org.telegram.ui.Cells.z1[]) this.h;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(boVar.a(), user.f18268id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(boVar.a(), -chat.f18121id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (z1VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (boVar.getParentActivity() != null) {
                        boVar.Q7();
                        UndoView undoView = boVar.y3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new x1(accountInstance, 0));
                return;
            default:
                org.telegram.ui.ym0 ym0Var = (org.telegram.ui.ym0) this.f23172b;
                org.telegram.ui.qn0 qn0Var = ym0Var.f39936a;
                qn0Var.Y[0].setText((String) this.f23173c);
                qn0Var.Y[1].setText((String) this.d);
                qn0Var.Y[2].setText((String) this.e);
                qn0Var.N1(true, true);
                ym0Var.c((org.telegram.ui.sl0) this.f23174f, (o0.a) this.h);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        switch (this.f23171a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f23172b;
                Utilities.Callback callback = (Utilities.Callback) this.f23174f;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.h;
                c5.k a2 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f3906c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f23173c).currency)) * (a2.f3905b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new mh1((Utilities.Callback) this.e, list, hVar, callback, o2Var, tL_inputStorePaymentPremiumGiftCode, 2));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f23172b;
                tg.w wVar = (tg.w) this.f23174f;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.h;
                c5.k a10 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a10.f3906c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f23173c).currency)) * (a10.f3905b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new mh1((tg.w) this.e, list, hVar, wVar, o2Var2, tL_inputStorePaymentPremiumGiveaway, 1));
                return;
        }
    }

    public d1(TLRPC.User user, AccountInstance accountInstance, org.telegram.ui.bo boVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.z1[] z1VarArr, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f23171a = 0;
        this.f23172b = user;
        this.f23173c = accountInstance;
        this.d = boVar;
        this.e = chat;
        this.f23174f = messageObject;
        this.h = z1VarArr;
    }
}
