package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c1 implements org.telegram.ui.ActionBar.z1, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f25192a;
    public final Object f25193b;
    public final Object f25194c;
    public final Object d;
    public final Object e;
    public final Object f25195f;
    public final Object h;

    public c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f25192a = i10;
        this.f25193b = obj;
        this.f25194c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f25195f = obj5;
        this.h = obj6;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f25192a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f25193b;
                AccountInstance accountInstance = (AccountInstance) this.f25194c;
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                MessageObject messageObject = (MessageObject) this.f25195f;
                org.telegram.ui.Cells.z1[] z1VarArr = (org.telegram.ui.Cells.z1[]) this.h;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(snVar.a(), user.f20490id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(snVar.a(), -chat.f20343id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (z1VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (snVar.getParentActivity() != null) {
                        snVar.T7();
                        UndoView undoView = snVar.K3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new x1(accountInstance, 0));
                return;
            default:
                org.telegram.ui.im0 im0Var = (org.telegram.ui.im0) this.f25193b;
                org.telegram.ui.an0 an0Var = im0Var.f38269a;
                an0Var.Y[0].setText((String) this.f25194c);
                an0Var.Y[1].setText((String) this.d);
                an0Var.Y[2].setText((String) this.e);
                an0Var.M1(true, true);
                im0Var.c((org.telegram.ui.oj0) this.f25195f, (n2.e) this.h);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        switch (this.f25192a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f25193b;
                Utilities.Callback callback = (Utilities.Callback) this.f25195f;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.h;
                c5.l a2 = ((c5.p) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f4769c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f25194c).currency)) * (a2.f4768b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new ai.f8((Utilities.Callback) this.e, list, iVar, callback, o2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f25193b;
                ug.t tVar = (ug.t) this.f25195f;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.h;
                c5.l a10 = ((c5.p) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a10.f4769c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f25194c).currency)) * (a10.f4768b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new ai.f8((ug.t) this.e, list, iVar, tVar, o2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                return;
        }
    }

    public c1(TLRPC.User user, AccountInstance accountInstance, org.telegram.ui.sn snVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.z1[] z1VarArr, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f25192a = 0;
        this.f25193b = user;
        this.f25194c = accountInstance;
        this.d = snVar;
        this.e = chat;
        this.f25195f = messageObject;
        this.h = z1VarArr;
    }
}
