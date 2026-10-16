package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sh1;
public final class d1 implements org.telegram.ui.ActionBar.z1, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f23928a;
    public final Object f23929b;
    public final Object f23930c;
    public final Object d;
    public final Object e;
    public final Object f23931f;
    public final Object h;

    public d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f23928a = i10;
        this.f23929b = obj;
        this.f23930c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f23931f = obj5;
        this.h = obj6;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f23928a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f23929b;
                AccountInstance accountInstance = (AccountInstance) this.f23930c;
                org.telegram.ui.fo foVar = (org.telegram.ui.fo) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.e;
                MessageObject messageObject = (MessageObject) this.f23931f;
                org.telegram.ui.Cells.a2[] a2VarArr = (org.telegram.ui.Cells.a2[]) this.h;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(foVar.a(), user.f19063id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(foVar.a(), -chat.f18916id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (a2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (foVar.getParentActivity() != null) {
                        foVar.T7();
                        UndoView undoView = foVar.y3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new y1(accountInstance, 0));
                return;
            default:
                org.telegram.ui.an0 an0Var = (org.telegram.ui.an0) this.f23929b;
                org.telegram.ui.sn0 sn0Var = an0Var.f33999a;
                sn0Var.Y[0].setText((String) this.f23930c);
                sn0Var.Y[1].setText((String) this.d);
                sn0Var.Y[2].setText((String) this.e);
                sn0Var.M1(true, true);
                an0Var.c((org.telegram.ui.xk0) this.f23931f, (m2.t) this.h);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        switch (this.f23928a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f23929b;
                Utilities.Callback callback = (Utilities.Callback) this.f23931f;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.h;
                c5.l a2 = ((c5.p) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f4396c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f23930c).currency)) * (a2.f4395b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new sh1((Utilities.Callback) this.e, list, iVar, callback, m2Var, tL_inputStorePaymentPremiumGiftCode, 2));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f23929b;
                ug.v vVar = (ug.v) this.f23931f;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.h;
                c5.l a10 = ((c5.p) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a10.f4396c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f23930c).currency)) * (a10.f4395b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new sh1((ug.v) this.e, list, iVar, vVar, m2Var2, tL_inputStorePaymentPremiumGiveaway, 1));
                return;
        }
    }

    public d1(TLRPC.User user, AccountInstance accountInstance, org.telegram.ui.fo foVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.a2[] a2VarArr, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f23928a = 0;
        this.f23929b = user;
        this.f23930c = accountInstance;
        this.d = foVar;
        this.e = chat;
        this.f23931f = messageObject;
        this.h = a2VarArr;
    }
}
