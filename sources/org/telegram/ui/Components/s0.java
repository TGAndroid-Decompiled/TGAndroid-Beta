package org.telegram.ui.Components;

import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s0 implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.q1 {
    public final int f37846a;
    public final Object f37847b;
    public final Object f37848c;
    public final Object d;
    public final Object f37849e;
    public final Object f37850f;
    public final Object h;

    public s0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f37846a = i7;
        this.f37847b = obj;
        this.f37848c = obj2;
        this.d = obj3;
        this.f37849e = obj4;
        this.f37850f = obj5;
        this.h = obj6;
    }

    @Override
    public void a(f5.f fVar, List list) {
        switch (this.f37846a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f37847b;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.f37850f;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.h;
                f5.h a10 = ((f5.l) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a10.f11156c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f37848c).currency)) * (a10.f11155b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new bi.c8((org.telegram.messenger.c20) this.f37849e, list, fVar, c20Var, f2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f37847b;
                wg.u uVar = (wg.u) this.f37850f;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) this.h;
                f5.h a11 = ((f5.l) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a11.f11156c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f37848c).currency)) * (a11.f11155b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new bi.c8((wg.u) this.f37849e, list, fVar, uVar, f2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f37846a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f37847b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.f37848c;
                org.telegram.ui.cn cnVar = (org.telegram.ui.cn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f37849e;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.f37850f;
                org.telegram.ui.Cells.c2[] c2VarArr = (org.telegram.ui.Cells.c2[]) this.h;
                if (user != null) {
                    org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(cVar.f21765a);
                    a02.f26719a.c(new org.telegram.messenger.vp(3, cnVar.a(), user.f27105id, a02));
                } else {
                    org.telegram.messenger.yr a03 = org.telegram.messenger.yr.a0(cVar.f21765a);
                    a03.f26719a.c(new org.telegram.messenger.vp(3, cnVar.a(), -chat.f26956id, a03));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = ijVar.e1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (c2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (cnVar.getParentActivity() != null) {
                        cnVar.g8();
                        UndoView undoView = cnVar.M3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(cVar.f21765a).sendRequest(tL_contacts_blockFromReplies, new x1(cVar, 0));
                return;
            default:
                org.telegram.ui.mj0 mj0Var = (org.telegram.ui.mj0) this.f37847b;
                org.telegram.ui.dk0 dk0Var = mj0Var.f47889a;
                dk0Var.Y[0].setText((String) this.f37848c);
                dk0Var.Y[1].setText((String) this.d);
                dk0Var.Y[2].setText((String) this.f37849e);
                dk0Var.R1(true, true);
                mj0Var.c((org.telegram.ui.gf0) this.f37850f, (m4.d0) this.h);
                return;
        }
    }

    public s0(TLRPC.User user, org.telegram.messenger.c cVar, org.telegram.ui.cn cnVar, TLRPC.Chat chat, org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.c2[] c2VarArr, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f37846a = 0;
        this.f37847b = user;
        this.f37848c = cVar;
        this.d = cnVar;
        this.f37849e = chat;
        this.f37850f = ijVar;
        this.h = c2VarArr;
    }
}
