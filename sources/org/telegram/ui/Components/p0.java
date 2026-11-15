package org.telegram.ui.Components;

import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p0 implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.q1 {
    public final int f38133a;
    public final Object f38134b;
    public final Object f38135c;
    public final Object d;
    public final Object f38136e;
    public final Object f38137f;
    public final Object h;

    public p0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f38133a = i7;
        this.f38134b = obj;
        this.f38135c = obj2;
        this.d = obj3;
        this.f38136e = obj4;
        this.f38137f = obj5;
        this.h = obj6;
    }

    @Override
    public void a(f5.f fVar, List list) {
        switch (this.f38133a) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f38134b;
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) this.f38137f;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.h;
                f5.i a10 = ((f5.m) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a10.f10984c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f38135c).currency)) * (a10.f10983b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore, new di.u6((org.telegram.messenger.z10) this.f38136e, list, fVar, z10Var, e2Var, tL_inputStorePaymentPremiumGiftCode, 4));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f38134b;
                wg.t tVar = (wg.t) this.f38137f;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.h;
                f5.i a11 = ((f5.m) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a11.f10984c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f38135c).currency)) * (a11.f10983b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.d).sendRequest(tL_payments_canPurchaseStore2, new di.u6((wg.t) this.f38136e, list, fVar, tVar, e2Var2, tL_inputStorePaymentPremiumGiveaway, 3));
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f38133a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f38134b;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.f38135c;
                org.telegram.ui.an anVar = (org.telegram.ui.an) this.d;
                TLRPC.Chat chat = (TLRPC.Chat) this.f38136e;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.f38137f;
                org.telegram.ui.Cells.c2[] c2VarArr = (org.telegram.ui.Cells.c2[]) this.h;
                if (user != null) {
                    org.telegram.messenger.vr a02 = org.telegram.messenger.vr.a0(cVar.f22778a);
                    a02.f27220a.c(new org.telegram.messenger.sp(3, anVar.a(), user.f28200id, a02));
                } else {
                    org.telegram.messenger.vr a03 = org.telegram.messenger.vr.a0(cVar.f22778a);
                    a03.f27220a.c(new org.telegram.messenger.sp(3, anVar.a(), -chat.f28051id, a03));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = gjVar.e1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (c2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (anVar.getParentActivity() != null) {
                        anVar.h8();
                        UndoView undoView = anVar.N3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(cVar.f22778a).sendRequest(tL_contacts_blockFromReplies, new v1(cVar, 0));
                return;
            default:
                org.telegram.ui.nj0 nj0Var = (org.telegram.ui.nj0) this.f38134b;
                org.telegram.ui.ek0 ek0Var = nj0Var.f49572a;
                ek0Var.Z[0].setText((String) this.f38135c);
                ek0Var.Z[1].setText((String) this.d);
                ek0Var.Z[2].setText((String) this.f38136e);
                ek0Var.R1(true, true);
                nj0Var.c((org.telegram.ui.ef0) this.f38137f, (k8.a) this.h);
                return;
        }
    }

    public p0(TLRPC.User user, org.telegram.messenger.c cVar, org.telegram.ui.an anVar, TLRPC.Chat chat, org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.c2[] c2VarArr, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f38133a = 0;
        this.f38134b = user;
        this.f38135c = cVar;
        this.d = anVar;
        this.f38136e = chat;
        this.f38137f = gjVar;
        this.h = c2VarArr;
    }
}
