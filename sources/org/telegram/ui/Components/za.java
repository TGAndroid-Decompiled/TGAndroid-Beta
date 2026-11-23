package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.ob1;
public final class za implements View.OnLayoutChangeListener {
    public final boolean f42779a;
    public final fc f42780b;

    public za(fc fcVar, boolean z10) {
        this.f42780b = fcVar;
        this.f42779a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        eb ebVar;
        int i17;
        fc fcVar = this.f42780b;
        kb kbVar = fcVar.f35087e;
        kbVar.removeOnLayoutChangeListener(this);
        if (fcVar.f35093l) {
            kbVar.onShow();
            org.telegram.ui.ActionBar.g2 g2Var = fcVar.f35089g;
            boolean z10 = this.f42779a;
            if (z10 && (g2Var instanceof ob1)) {
                g2Var = ((ob1) g2Var).c0();
            }
            FrameLayout frameLayout = fcVar.h;
            if (g2Var == null || (ebVar = g2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(2131296353);
                    if (tag instanceof eb) {
                        ebVar = (eb) tag;
                    }
                }
                ebVar = null;
            }
            fcVar.f35097p = ebVar;
            if (ebVar == null && g2Var != null) {
                fcVar.f35097p = new org.telegram.ui.ActionBar.a2(1, g2Var);
            }
            r1.g gVar = fcVar.d;
            if (gVar == null || !gVar.f56440f) {
                eb ebVar2 = fcVar.f35097p;
                if (ebVar2 != null) {
                    i17 = ebVar2.f(fcVar.f35084a);
                } else {
                    i17 = 0;
                }
                fcVar.f35096o = i17;
            }
            eb ebVar3 = fcVar.f35097p;
            if (ebVar3 != null) {
                ebVar3.b(fcVar);
            }
            if (g2Var != null) {
                g2Var.setupBulletinGlass(fcVar);
            }
            if (org.telegram.messenger.mp.g1().getBoolean("view_animations", true) && !fcVar.f35100s) {
                if (kbVar != null && fcVar.f35098q == null) {
                    fcVar.f35098q = kbVar.createTransition();
                }
                kbVar.transitionRunningEnter = true;
                kbVar.delegate = fcVar.f35097p;
                kbVar.invalidate();
                jb jbVar = fcVar.f35098q;
                Objects.requireNonNull(kbVar);
                jbVar.H(kbVar, new va(kbVar, 1), new ng(this, 15), new pl(2, this, z10));
                return;
            }
            eb ebVar4 = fcVar.f35097p;
            kbVar.delegate = ebVar4;
            if (ebVar4 != null && !z10) {
                ebVar4.c(kbVar.getHeight());
            }
            fcVar.l();
            kbVar.onEnterTransitionStart();
            kbVar.onEnterTransitionEnd();
            if (fcVar.f35102u) {
                fcVar.i(true);
            }
        }
    }
}
