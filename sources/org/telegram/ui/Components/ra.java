package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.mb1;
public final class ra implements View.OnLayoutChangeListener {
    public final boolean f38907a;
    public final xb f38908b;

    public ra(xb xbVar, boolean z10) {
        this.f38908b = xbVar;
        this.f38907a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        wa waVar;
        int i17;
        xb xbVar = this.f38908b;
        cb cbVar = xbVar.f41631e;
        cbVar.removeOnLayoutChangeListener(this);
        if (xbVar.f41637l) {
            cbVar.onShow();
            org.telegram.ui.ActionBar.e2 e2Var = xbVar.f41633g;
            boolean z10 = this.f38907a;
            if (z10 && (e2Var instanceof mb1)) {
                e2Var = ((mb1) e2Var).c0();
            }
            FrameLayout frameLayout = xbVar.h;
            if (e2Var == null || (waVar = e2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(2131296351);
                    if (tag instanceof wa) {
                        waVar = (wa) tag;
                    }
                }
                waVar = null;
            }
            xbVar.f41641p = waVar;
            if (waVar == null && e2Var != null) {
                xbVar.f41641p = new org.telegram.ui.ActionBar.y1(1, e2Var);
            }
            r1.g gVar = xbVar.d;
            if (gVar == null || !gVar.f55742f) {
                wa waVar2 = xbVar.f41641p;
                if (waVar2 != null) {
                    i17 = waVar2.f(xbVar.f41628a);
                } else {
                    i17 = 0;
                }
                xbVar.f41640o = i17;
            }
            wa waVar3 = xbVar.f41641p;
            if (waVar3 != null) {
                waVar3.b(xbVar);
            }
            if (org.telegram.messenger.np.e1().getBoolean("view_animations", true) && !xbVar.f41644s) {
                if (cbVar != null && xbVar.f41642q == null) {
                    xbVar.f41642q = cbVar.createTransition();
                }
                cbVar.transitionRunningEnter = true;
                cbVar.delegate = xbVar.f41641p;
                cbVar.invalidate();
                bb bbVar = xbVar.f41642q;
                Objects.requireNonNull(cbVar);
                bbVar.y(cbVar, new na(cbVar, 1), new dg(this, 15), new il(2, this, z10));
                return;
            }
            wa waVar4 = xbVar.f41641p;
            cbVar.delegate = waVar4;
            if (waVar4 != null && !z10) {
                waVar4.c(cbVar.getHeight());
            }
            xbVar.l();
            cbVar.onEnterTransitionStart();
            cbVar.onEnterTransitionEnd();
            if (xbVar.f41646u) {
                xbVar.i(true);
            }
        }
    }
}
