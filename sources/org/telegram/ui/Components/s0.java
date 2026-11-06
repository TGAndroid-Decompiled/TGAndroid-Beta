package org.telegram.ui.Components;

import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s0 implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.q1 {
    public final int f37845a;
    public final Object f37846b;
    public final Object f37847c;
    public final Object d;
    public final Object f37848e;
    public final Object f37849f;
    public final Object h;

    public s0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f37845a = i7;
        this.f37846b = obj;
        this.f37847c = obj2;
        this.d = obj3;
        this.f37848e = obj4;
        this.f37849f = obj5;
        this.h = obj6;
    }

    @Override
    public void a(f5.f fVar, List list) {
        switch (this.f37845a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f37846b;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.f37849f;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.h;
                f5.h a10 = ((f5.l) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a10.f11156c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f37847c).currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new bi.c8((org.telegram.messenger.c20) this.f37848e, list, fVar, c20Var, f2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f37846b;
                wg.v vVar = (wg.v) this.f37849f;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) this.h;
                f5.h a11 = ((f5.l) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a11.f11156c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f37847c).currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new bi.c8((wg.v) this.f37848e, list, fVar, vVar, f2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f37845a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f37846b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.f37847c;
                org.telegram.ui.an anVar = (org.telegram.ui.an) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f37848e;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.f37849f;
                org.telegram.ui.Cells.c2[] c2VarArr = (org.telegram.ui.Cells.c2[]) this.h;
                if (user != null) {
                    org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(cVar.f21723a);
                    a02.f26688a.c(new org.telegram.messenger.vp(3, anVar.a(), user.f27101id, a02));
                } else {
                    org.telegram.messenger.yr a03 = org.telegram.messenger.yr.a0(cVar.f21723a);
                    a03.f26688a.c(new org.telegram.messenger.vp(3, anVar.a(), -chat.f26952id, a03));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = ijVar.f1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (c2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (anVar.getParentActivity() != null) {
                        anVar.f8();
                        UndoView undoView = anVar.M3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(cVar.f21723a).sendRequest(tL_contacts_blockFromReplies, new x1(cVar, 0));
                return;
            default:
                org.telegram.ui.kj0 kj0Var = (org.telegram.ui.kj0) this.f37846b;
                org.telegram.ui.bk0 bk0Var = kj0Var.f47201a;
                bk0Var.Y[0].setText((String) this.f37847c);
                bk0Var.Y[1].setText((String) this.d);
                bk0Var.Y[2].setText((String) this.f37848e);
                bk0Var.R1(true, true);
                kj0Var.c((org.telegram.ui.ef0) this.f37849f, (m4.d0) this.h);
                return;
        }
    }

    public s0(TLRPC.User user, org.telegram.messenger.c cVar, org.telegram.ui.an anVar, TLRPC.Chat chat, org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.c2[] c2VarArr, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f37845a = 0;
        this.f37846b = user;
        this.f37847c = cVar;
        this.d = anVar;
        this.f37848e = chat;
        this.f37849f = ijVar;
        this.h = c2VarArr;
    }
}
