package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c1 implements org.telegram.ui.ActionBar.b2, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f27015a;
    public final Object f27016b;
    public final Object f27017c;
    public final Object d;
    public final Object e;
    public final Object f27018f;
    public final Object h;

    public c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f27015a = i10;
        this.f27016b = obj;
        this.f27017c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f27018f = obj5;
        this.h = obj6;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f27015a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f27016b;
                AccountInstance accountInstance = (AccountInstance) this.f27017c;
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                MessageObject messageObject = (MessageObject) this.f27018f;
                org.telegram.ui.Cells.y1[] y1VarArr = (org.telegram.ui.Cells.y1[]) this.h;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(wnVar.a(), user.f22177id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(wnVar.a(), -chat.f22028id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (y1VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (wnVar.getParentActivity() != null) {
                        wnVar.Z7();
                        UndoView undoView = wnVar.K3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new b2(accountInstance, 0));
                return;
            default:
                org.telegram.ui.sm0 sm0Var = (org.telegram.ui.sm0) this.f27016b;
                org.telegram.ui.kn0 kn0Var = sm0Var.f43362a;
                kn0Var.Y[0].setText((String) this.f27017c);
                kn0Var.Y[1].setText((String) this.d);
                kn0Var.Y[2].setText((String) this.e);
                kn0Var.N1(true, true);
                sm0Var.c((org.telegram.ui.nj0) this.f27018f, (m4.w1) this.h);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(d5.i iVar, List list) {
        switch (this.f27015a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f27016b;
                Utilities.Callback callback = (Utilities.Callback) this.f27018f;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.h;
                d5.l a2 = ((d5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f7991c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f27017c).currency)) * (a2.f7990b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new bi.b8((Utilities.Callback) this.e, list, iVar, callback, r2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f27016b;
                vg.v vVar = (vg.v) this.f27018f;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) this.h;
                d5.l a10 = ((d5.o) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a10.f7991c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f27017c).currency)) * (a10.f7990b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new bi.b8((vg.v) this.e, list, iVar, vVar, r2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                return;
        }
    }

    public c1(TLRPC.User user, AccountInstance accountInstance, org.telegram.ui.wn wnVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.y1[] y1VarArr, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f27015a = 0;
        this.f27016b = user;
        this.f27017c = accountInstance;
        this.d = wnVar;
        this.e = chat;
        this.f27018f = messageObject;
        this.h = y1VarArr;
    }
}
