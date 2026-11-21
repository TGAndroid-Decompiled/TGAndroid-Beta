package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gm extends org.telegram.ui.Components.ap0 {
    public final org.telegram.messenger.fj V2;
    public final mm W2;

    public gm(mm mmVar, Activity activity, bn bnVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.h6 h6Var, boolean z12, org.telegram.messenger.fj fjVar) {
        super(activity, bnVar, arrayList, null, null, z10, null, null, false, false, z11, null, h6Var);
        this.W2 = mmVar;
        this.V2 = fjVar;
        this.W1 = z12;
    }

    @Override
    public final void L() {
        int i7;
        bn bnVar = this.W2.f49937a;
        Activity parentActivity = bnVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
        org.telegram.messenger.g0.Z2(parentActivity, i7);
        super.L();
        if (bnVar.f45946a0.getVisibility() == 0) {
            bnVar.fragmentView.requestLayout();
        }
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        mm mmVar = this.W2;
        bn bnVar = mmVar.f49937a;
        int i10 = bn.f45936md;
        bnVar.h8();
        if (mmVar.f49937a.N3 != null && z10) {
            if (hVar.m() == 1) {
                if (((TLRPC.Dialog) hVar.n(0)).f28435id != mmVar.f49937a.getUserConfig().e() || !org.telegram.ui.Components.lc.b0(mmVar.f49937a).h0(i7, ((TLRPC.Dialog) hVar.n(0)).f28435id)) {
                    mmVar.f49937a.N3.k(((TLRPC.Dialog) hVar.n(0)).f28435id, 53, Integer.valueOf(i7), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            mmVar.f49937a.N3.k(0L, 53, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
        }
    }

    @Override
    public final void T0(final View view) {
        hi.la laVar;
        bn bnVar = this.W2.f49937a;
        org.telegram.messenger.aj ajVar = null;
        if (view instanceof org.telegram.ui.Cells.e7) {
            laVar = hi.na.b((org.telegram.ui.Cells.e7) view);
        } else {
            laVar = null;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.fj fjVar = this.V2;
        if (fjVar.c1() != 0) {
            ajVar = (org.telegram.messenger.aj) bnVar.P6.f(fjVar.c1());
        }
        if (ajVar != null) {
            arrayList.addAll(ajVar.d);
        } else {
            arrayList.add(fjVar);
        }
        final hi.sa D = hi.sa.D(bnVar.getParentActivity(), this.f30170a);
        D.S = new org.telegram.messenger.u10() {
            @Override
            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l11 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                hi.sa saVar = D;
                hi.la laVar2 = null;
                if (booleanValue) {
                    gm gmVar = gm.this;
                    org.telegram.messenger.g0.g3(new eh(5, gmVar, l11));
                    gmVar.dismiss();
                    saVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.e7) && view2.isAttachedToWindow()) {
                        laVar2 = hi.na.b((org.telegram.ui.Cells.e7) view2);
                    }
                    saVar.X(laVar2);
                }
                org.telegram.messenger.g0.g3(runnable);
            }
        };
        D.T(laVar, hi.c7.y(arrayList));
    }
}
