package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fm extends org.telegram.ui.Components.po0 {
    public final org.telegram.messenger.gj V2;
    public final lm W2;

    public fm(lm lmVar, Activity activity, an anVar, ArrayList arrayList, boolean z10, boolean z11, org.telegram.ui.ActionBar.e6 e6Var, boolean z12, org.telegram.messenger.gj gjVar) {
        super(activity, anVar, arrayList, null, null, z10, null, null, false, false, z11, null, e6Var);
        this.W2 = lmVar;
        this.V2 = gjVar;
        this.W1 = z12;
    }

    @Override
    public final void L() {
        int i7;
        an anVar = this.W2.f49005a;
        Activity parentActivity = anVar.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
        org.telegram.messenger.g0.a3(parentActivity, i7);
        super.L();
        if (anVar.f45118a0.getVisibility() == 0) {
            anVar.fragmentView.requestLayout();
        }
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        lm lmVar = this.W2;
        an anVar = lmVar.f49005a;
        int i10 = an.f45108ld;
        anVar.h8();
        if (lmVar.f49005a.N3 != null && z10) {
            if (hVar.m() == 1) {
                if (((TLRPC.Dialog) hVar.n(0)).f28055id != lmVar.f49005a.getUserConfig().e() || !org.telegram.ui.Components.cc.a0(lmVar.f49005a).g0(i7, ((TLRPC.Dialog) hVar.n(0)).f28055id)) {
                    lmVar.f49005a.N3.k(((TLRPC.Dialog) hVar.n(0)).f28055id, 53, Integer.valueOf(i7), tL_forumTopic, null, null);
                    return;
                }
                return;
            }
            lmVar.f49005a.N3.k(0L, 53, Integer.valueOf(i7), Integer.valueOf(hVar.m()), null, null);
        }
    }

    @Override
    public final void S0(final View view) {
        hi.la laVar;
        an anVar = this.W2.f49005a;
        org.telegram.messenger.bj bjVar = null;
        if (view instanceof org.telegram.ui.Cells.c7) {
            laVar = hi.na.b((org.telegram.ui.Cells.c7) view);
        } else {
            laVar = null;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.gj gjVar = this.V2;
        if (gjVar.c1() != 0) {
            bjVar = (org.telegram.messenger.bj) anVar.O6.f(gjVar.c1());
        }
        if (bjVar != null) {
            arrayList.addAll(bjVar.d);
        } else {
            arrayList.add(gjVar);
        }
        final hi.sa D = hi.sa.D(anVar.getParentActivity(), this.f29679a);
        D.S = new org.telegram.messenger.w10() {
            @Override
            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Long l11 = (Long) obj4;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                hi.sa saVar = D;
                hi.la laVar2 = null;
                if (booleanValue) {
                    fm fmVar = fm.this;
                    org.telegram.messenger.g0.h3(new zg(7, fmVar, l11));
                    fmVar.dismiss();
                    saVar.X(null);
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.c7) && view2.isAttachedToWindow()) {
                        laVar2 = hi.na.b((org.telegram.ui.Cells.c7) view2);
                    }
                    saVar.X(laVar2);
                }
                org.telegram.messenger.g0.h3(runnable);
            }
        };
        D.T(laVar, hi.d7.y(arrayList));
    }
}
