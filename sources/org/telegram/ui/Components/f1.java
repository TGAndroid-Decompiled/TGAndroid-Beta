package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qh1;
public final class f1 implements org.telegram.ui.ActionBar.c2, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f22797a;
    public final Object f22798b;
    public final Object f22799c;
    public final Object d;
    public final Object e;
    public final Object f22800f;
    public final Object h;

    public f1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f22797a = i10;
        this.f22798b = obj;
        this.f22799c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f22800f = obj5;
        this.h = obj6;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f22797a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f22798b;
                AccountInstance accountInstance = (AccountInstance) this.f22799c;
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                MessageObject messageObject = (MessageObject) this.f22800f;
                org.telegram.ui.Cells.z1[] z1VarArr = (org.telegram.ui.Cells.z1[]) this.h;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(eoVar.a(), user.f17342id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(eoVar.a(), -chat.f17195id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (z1VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (eoVar.getParentActivity() != null) {
                        eoVar.Q7();
                        UndoView undoView = eoVar.y3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new z1(accountInstance, 0));
                return;
            default:
                org.telegram.ui.wm0 wm0Var = (org.telegram.ui.wm0) this.f22798b;
                org.telegram.ui.on0 on0Var = wm0Var.f38247a;
                on0Var.Y[0].setText((String) this.f22799c);
                on0Var.Y[1].setText((String) this.d);
                on0Var.Y[2].setText((String) this.e);
                on0Var.N1(true, true);
                wm0Var.c((org.telegram.ui.ql0) this.f22800f, (n7.a1) this.h);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        switch (this.f22797a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f22798b;
                Utilities.Callback callback = (Utilities.Callback) this.f22800f;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.h;
                c5.k a2 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f4320c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f22799c).currency)) * (a2.f4319b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new qh1((Utilities.Callback) this.e, list, hVar, callback, p2Var, tL_inputStorePaymentPremiumGiftCode, 2));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f22798b;
                sg.v vVar = (sg.v) this.f22800f;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.h;
                c5.k a10 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a10.f4320c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f22799c).currency)) * (a10.f4319b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new qh1((sg.v) this.e, list, hVar, vVar, p2Var2, tL_inputStorePaymentPremiumGiveaway, 1));
                return;
        }
    }

    public f1(TLRPC.User user, AccountInstance accountInstance, org.telegram.ui.eo eoVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.z1[] z1VarArr, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f22797a = 0;
        this.f22798b = user;
        this.f22799c = accountInstance;
        this.d = eoVar;
        this.e = chat;
        this.f22800f = messageObject;
        this.h = z1VarArr;
    }
}
