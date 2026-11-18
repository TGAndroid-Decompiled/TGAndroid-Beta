package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.qb1;
public final class ab implements View.OnLayoutChangeListener {
    public final boolean f33323a;
    public final gc f33324b;

    public ab(gc gcVar, boolean z10) {
        this.f33324b = gcVar;
        this.f33323a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        fb fbVar;
        int i17;
        gc gcVar = this.f33324b;
        lb lbVar = gcVar.f35457e;
        lbVar.removeOnLayoutChangeListener(this);
        if (gcVar.f35463l) {
            lbVar.onShow();
            org.telegram.ui.ActionBar.h2 h2Var = gcVar.f35459g;
            boolean z10 = this.f33323a;
            if (z10 && (h2Var instanceof qb1)) {
                h2Var = ((qb1) h2Var).c0();
            }
            FrameLayout frameLayout = gcVar.h;
            if (h2Var == null || (fbVar = h2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(2131296351);
                    if (tag instanceof fb) {
                        fbVar = (fb) tag;
                    }
                }
                fbVar = null;
            }
            gcVar.f35467p = fbVar;
            if (fbVar == null && h2Var != null) {
                gcVar.f35467p = new org.telegram.ui.ActionBar.b2(1, h2Var);
            }
            r1.g gVar = gcVar.d;
            if (gVar == null || !gVar.f56317f) {
                fb fbVar2 = gcVar.f35467p;
                if (fbVar2 != null) {
                    i17 = fbVar2.f(gcVar.f35454a);
                } else {
                    i17 = 0;
                }
                gcVar.f35466o = i17;
            }
            fb fbVar3 = gcVar.f35467p;
            if (fbVar3 != null) {
                fbVar3.b(gcVar);
            }
            if (h2Var != null) {
                h2Var.setupBulletinGlass(gcVar);
            }
            if (org.telegram.messenger.mp.g1().getBoolean("view_animations", true) && !gcVar.f35470s) {
                if (lbVar != null && gcVar.f35468q == null) {
                    gcVar.f35468q = lbVar.createTransition();
                }
                lbVar.transitionRunningEnter = true;
                lbVar.delegate = gcVar.f35467p;
                lbVar.invalidate();
                kb kbVar = gcVar.f35468q;
                Objects.requireNonNull(lbVar);
                kbVar.u(lbVar, new wa(lbVar, 1), new lg(this, 15), new pl(2, this, z10));
                return;
            }
            fb fbVar4 = gcVar.f35467p;
            lbVar.delegate = fbVar4;
            if (fbVar4 != null && !z10) {
                fbVar4.c(lbVar.getHeight());
            }
            gcVar.l();
            lbVar.onEnterTransitionStart();
            lbVar.onEnterTransitionEnd();
            if (gcVar.f35472u) {
                gcVar.i(true);
            }
        }
    }
}
