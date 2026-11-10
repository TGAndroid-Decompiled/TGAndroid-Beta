package org.telegram.ui.Components;

import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class r0 implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.q1 {
    public final int f37435a;
    public final Object f37436b;
    public final Object f37437c;
    public final Object d;
    public final Object f37438e;
    public final Object f37439f;
    public final Object h;

    public r0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f37435a = i7;
        this.f37436b = obj;
        this.f37437c = obj2;
        this.d = obj3;
        this.f37438e = obj4;
        this.f37439f = obj5;
        this.h = obj6;
    }

    @Override
    public void a(f5.f fVar, List list) {
        switch (this.f37435a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f37436b;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.f37439f;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.h;
                f5.h a10 = ((f5.l) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a10.f11161c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f37437c).currency)) * (a10.f11160b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new bi.c8((org.telegram.messenger.c20) this.f37438e, list, fVar, c20Var, f2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f37436b;
                wg.u uVar = (wg.u) this.f37439f;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) this.h;
                f5.h a11 = ((f5.l) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a11.f11161c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f37437c).currency)) * (a11.f11160b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new bi.c8((wg.u) this.f37438e, list, fVar, uVar, f2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f37435a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f37436b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.f37437c;
                org.telegram.ui.cn cnVar = (org.telegram.ui.cn) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f37438e;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.f37439f;
                org.telegram.ui.Cells.c2[] c2VarArr = (org.telegram.ui.Cells.c2[]) this.h;
                if (user != null) {
                    org.telegram.messenger.yr a02 = org.telegram.messenger.yr.a0(cVar.f21770a);
                    a02.f26723a.c(new org.telegram.messenger.vp(3, cnVar.a(), user.f27109id, a02));
                } else {
                    org.telegram.messenger.yr a03 = org.telegram.messenger.yr.a0(cVar.f21770a);
                    a03.f26723a.c(new org.telegram.messenger.vp(3, cnVar.a(), -chat.f26960id, a03));
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
                ConnectionsManager.getInstance(cVar.f21770a).sendRequest(tL_contacts_blockFromReplies, new w1(cVar, 0));
                return;
            default:
                org.telegram.ui.nj0 nj0Var = (org.telegram.ui.nj0) this.f37436b;
                org.telegram.ui.ek0 ek0Var = nj0Var.f48219a;
                ek0Var.Y[0].setText((String) this.f37437c);
                ek0Var.Y[1].setText((String) this.d);
                ek0Var.Y[2].setText((String) this.f37438e);
                ek0Var.R1(true, true);
                nj0Var.c((org.telegram.ui.hf0) this.f37439f, (m4.d0) this.h);
                return;
        }
    }

    public r0(TLRPC.User user, org.telegram.messenger.c cVar, org.telegram.ui.cn cnVar, TLRPC.Chat chat, org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.c2[] c2VarArr, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f37435a = 0;
        this.f37436b = user;
        this.f37437c = cVar;
        this.d = cnVar;
        this.f37438e = chat;
        this.f37439f = ijVar;
        this.h = c2VarArr;
    }
}
