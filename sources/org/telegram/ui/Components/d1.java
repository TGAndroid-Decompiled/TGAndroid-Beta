package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class d1 implements org.telegram.ui.ActionBar.a2, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f25305a;
    public final Object f25306b;
    public final Object f25307c;
    public final Object d;
    public final Object e;
    public final Object f25308f;
    public final Object h;

    public d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f25305a = i10;
        this.f25306b = obj;
        this.f25307c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f25308f = obj5;
        this.h = obj6;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f25305a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f25306b;
                AccountInstance accountInstance = (AccountInstance) this.f25307c;
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                MessageObject messageObject = (MessageObject) this.f25308f;
                org.telegram.ui.Cells.a2[] a2VarArr = (org.telegram.ui.Cells.a2[]) this.h;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(qnVar.a(), user.f20427id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(qnVar.a(), -chat.f20280id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (a2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (qnVar.getParentActivity() != null) {
                        qnVar.T7();
                        UndoView undoView = qnVar.y3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new y1(accountInstance, 0));
                return;
            default:
                org.telegram.ui.em0 em0Var = (org.telegram.ui.em0) this.f25306b;
                org.telegram.ui.vm0 vm0Var = em0Var.f36691a;
                vm0Var.Y[0].setText((String) this.f25307c);
                vm0Var.Y[1].setText((String) this.d);
                vm0Var.Y[2].setText((String) this.e);
                vm0Var.M1(true, true);
                em0Var.c((org.telegram.ui.ck0) this.f25308f, (mi.q) this.h);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        switch (this.f25305a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f25306b;
                Utilities.Callback callback = (Utilities.Callback) this.f25308f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                c5.l a2 = ((c5.p) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f4764c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f25307c).currency)) * (a2.f4763b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new ai.f8((Utilities.Callback) this.e, list, iVar, callback, n2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f25306b;
                ug.u uVar = (ug.u) this.f25308f;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.h;
                c5.l a10 = ((c5.p) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a10.f4764c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f25307c).currency)) * (a10.f4763b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new ai.f8((ug.u) this.e, list, iVar, uVar, n2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                return;
        }
    }

    public d1(TLRPC.User user, AccountInstance accountInstance, org.telegram.ui.qn qnVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.a2[] a2VarArr, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f25305a = 0;
        this.f25306b = user;
        this.f25307c = accountInstance;
        this.d = qnVar;
        this.e = chat;
        this.f25308f = messageObject;
        this.h = a2VarArr;
    }
}
