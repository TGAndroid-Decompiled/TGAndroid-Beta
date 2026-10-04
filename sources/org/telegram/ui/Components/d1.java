package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fh1;
public final class d1 implements org.telegram.ui.ActionBar.a2, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f25499a;
    public final Object f25500b;
    public final Object f25501c;
    public final Object d;
    public final Object f25502e;
    public final Object f25503f;
    public final Object h;

    public d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f25499a = i10;
        this.f25500b = obj;
        this.f25501c = obj2;
        this.d = obj3;
        this.f25502e = obj4;
        this.f25503f = obj5;
        this.h = obj6;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f25499a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f25500b;
                AccountInstance accountInstance = (AccountInstance) this.f25501c;
                org.telegram.ui.yn ynVar = (org.telegram.ui.yn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f25502e;
                MessageObject messageObject = (MessageObject) this.f25503f;
                org.telegram.ui.Cells.a2[] a2VarArr = (org.telegram.ui.Cells.a2[]) this.h;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(ynVar.a(), user.f20184id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(ynVar.a(), -chat.f20037id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (a2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (ynVar.getParentActivity() != null) {
                        ynVar.Q7();
                        UndoView undoView = ynVar.f43541w3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new y1(accountInstance, 0));
                return;
            default:
                org.telegram.ui.sm0 sm0Var = (org.telegram.ui.sm0) this.f25500b;
                org.telegram.ui.kn0 kn0Var = sm0Var.f40531a;
                kn0Var.Y[0].setText((String) this.f25501c);
                kn0Var.Y[1].setText((String) this.d);
                kn0Var.Y[2].setText((String) this.f25502e);
                kn0Var.N1(true, true);
                sm0Var.c((org.telegram.ui.nl0) this.f25503f, (o0.a) this.h);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        switch (this.f25499a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f25500b;
                Utilities.Callback callback = (Utilities.Callback) this.f25503f;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.h;
                c5.k a2 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f4216c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f25501c).currency)) * (a2.f4215b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new fh1((Utilities.Callback) this.f25502e, list, hVar, callback, n2Var, tL_inputStorePaymentPremiumGiftCode, 2));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f25500b;
                tg.v vVar = (tg.v) this.f25503f;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.h;
                c5.k a10 = ((c5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a10.f4216c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f25501c).currency)) * (a10.f4215b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new fh1((tg.v) this.f25502e, list, hVar, vVar, n2Var2, tL_inputStorePaymentPremiumGiveaway, 1));
                return;
        }
    }

    public d1(TLRPC.User user, AccountInstance accountInstance, org.telegram.ui.yn ynVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.a2[] a2VarArr, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f25499a = 0;
        this.f25500b = user;
        this.f25501c = accountInstance;
        this.d = ynVar;
        this.f25502e = chat;
        this.f25503f = messageObject;
        this.h = a2VarArr;
    }
}
