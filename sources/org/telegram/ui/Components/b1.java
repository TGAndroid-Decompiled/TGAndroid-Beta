package org.telegram.ui.Components;

import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class b1 implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.q1 {
    public final int f33596a;
    public final Object f33597b;
    public final Object f33598c;
    public final Object d;
    public final Object f33599e;
    public final Object f33600f;
    public final Object h;

    public b1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f33596a = i7;
        this.f33597b = obj;
        this.f33598c = obj2;
        this.d = obj3;
        this.f33599e = obj4;
        this.f33600f = obj5;
        this.h = obj6;
    }

    @Override
    public void a(f5.f fVar, List list) {
        switch (this.f33596a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f33597b;
                org.telegram.messenger.w10 w10Var = (org.telegram.messenger.w10) this.f33600f;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.h;
                f5.i a10 = ((f5.m) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a10.f11283c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f33598c).currency)) * (a10.f11282b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new di.y6((org.telegram.messenger.w10) this.f33599e, list, fVar, w10Var, g2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f33597b;
                wg.u uVar = (wg.u) this.f33600f;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.h;
                f5.i a11 = ((f5.m) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a11.f11283c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f33598c).currency)) * (a11.f11282b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new di.y6((wg.u) this.f33599e, list, fVar, uVar, g2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f33596a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f33597b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.f33598c;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f33599e;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.f33600f;
                org.telegram.ui.Cells.d2[] d2VarArr = (org.telegram.ui.Cells.d2[]) this.h;
                if (user != null) {
                    org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(cVar.f23343a);
                    a02.f27149a.c(new org.telegram.messenger.np(3, bnVar.a(), user.f28641id, a02));
                } else {
                    org.telegram.messenger.tr a03 = org.telegram.messenger.tr.a0(cVar.f23343a);
                    a03.f27149a.c(new org.telegram.messenger.np(3, bnVar.a(), -chat.f28492id, a03));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = fjVar.e1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (d2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (bnVar.getParentActivity() != null) {
                        bnVar.h8();
                        UndoView undoView = bnVar.N3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(cVar.f23343a).sendRequest(tL_contacts_blockFromReplies, new e2(cVar, 0));
                return;
            default:
                org.telegram.ui.oj0 oj0Var = (org.telegram.ui.oj0) this.f33597b;
                org.telegram.ui.fk0 fk0Var = oj0Var.f50706a;
                fk0Var.Z[0].setText((String) this.f33598c);
                fk0Var.Z[1].setText((String) this.d);
                fk0Var.Z[2].setText((String) this.f33599e);
                fk0Var.R1(true, true);
                oj0Var.c((org.telegram.ui.gf0) this.f33600f, (jb.m) this.h);
                return;
        }
    }

    public b1(TLRPC.User user, org.telegram.messenger.c cVar, org.telegram.ui.bn bnVar, TLRPC.Chat chat, org.telegram.messenger.fj fjVar, org.telegram.ui.Cells.d2[] d2VarArr, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f33596a = 0;
        this.f33597b = user;
        this.f33598c = cVar;
        this.d = bnVar;
        this.f33599e = chat;
        this.f33600f = fjVar;
        this.h = d2VarArr;
    }
}
