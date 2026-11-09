package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.qb1;
public final class va implements View.OnLayoutChangeListener {
    public final boolean f39017a;
    public final cc f39018b;

    public va(cc ccVar, boolean z9) {
        this.f39018b = ccVar;
        this.f39017a = z9;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        ab abVar;
        int i17;
        cc ccVar = this.f39018b;
        gb gbVar = ccVar.f32623e;
        gbVar.removeOnLayoutChangeListener(this);
        if (ccVar.f32629l) {
            gbVar.onShow();
            org.telegram.ui.ActionBar.f2 f2Var = ccVar.f32625g;
            boolean z9 = this.f39017a;
            if (z9 && (f2Var instanceof qb1)) {
                f2Var = ((qb1) f2Var).c0();
            }
            FrameLayout frameLayout = ccVar.h;
            if (f2Var == null || (abVar = f2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(2131296351);
                    if (tag instanceof ab) {
                        abVar = (ab) tag;
                    }
                }
                abVar = null;
            }
            ccVar.f32633p = abVar;
            if (abVar == null && f2Var != null) {
                ccVar.f32633p = new org.telegram.ui.ActionBar.z1(1, f2Var);
            }
            r1.g gVar = ccVar.d;
            if (gVar == null || !gVar.f54274f) {
                ab abVar2 = ccVar.f32633p;
                if (abVar2 != null) {
                    i17 = abVar2.f(ccVar.f32620a);
                } else {
                    i17 = 0;
                }
                ccVar.f32632o = i17;
            }
            ab abVar3 = ccVar.f32633p;
            if (abVar3 != null) {
                abVar3.b(ccVar);
            }
            if (org.telegram.messenger.qp.e1().getBoolean("view_animations", true) && !ccVar.f32636s) {
                if (gbVar != null && ccVar.f32634q == null) {
                    ccVar.f32634q = gbVar.createTransition();
                }
                gbVar.transitionRunningEnter = true;
                gbVar.delegate = ccVar.f32633p;
                gbVar.invalidate();
                fb fbVar = ccVar.f32634q;
                Objects.requireNonNull(gbVar);
                fbVar.B(gbVar, new ra(gbVar, 1), new xf(this, 15), new bl(2, this, z9));
                return;
            }
            ab abVar4 = ccVar.f32633p;
            gbVar.delegate = abVar4;
            if (abVar4 != null && !z9) {
                abVar4.c(gbVar.getHeight());
            }
            ccVar.l();
            gbVar.onEnterTransitionStart();
            gbVar.onEnterTransitionEnd();
            if (ccVar.f32638u) {
                ccVar.i(true);
            }
        }
    }
}
