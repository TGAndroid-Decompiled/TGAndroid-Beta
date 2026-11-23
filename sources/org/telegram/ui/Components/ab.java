package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.qb1;
public final class ab implements View.OnLayoutChangeListener {
    public final boolean f33443a;
    public final gc f33444b;

    public ab(gc gcVar, boolean z10) {
        this.f33444b = gcVar;
        this.f33443a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        fb fbVar;
        int i17;
        gc gcVar = this.f33444b;
        lb lbVar = gcVar.f35485e;
        lbVar.removeOnLayoutChangeListener(this);
        if (gcVar.f35491l) {
            lbVar.onShow();
            org.telegram.ui.ActionBar.g2 g2Var = gcVar.f35487g;
            boolean z10 = this.f33443a;
            if (z10 && (g2Var instanceof qb1)) {
                g2Var = ((qb1) g2Var).c0();
            }
            FrameLayout frameLayout = gcVar.h;
            if (g2Var == null || (fbVar = g2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(2131296353);
                    if (tag instanceof fb) {
                        fbVar = (fb) tag;
                    }
                }
                fbVar = null;
            }
            gcVar.f35495p = fbVar;
            if (fbVar == null && g2Var != null) {
                gcVar.f35495p = new org.telegram.ui.ActionBar.a2(1, g2Var);
            }
            r1.g gVar = gcVar.d;
            if (gVar == null || !gVar.f56327f) {
                fb fbVar2 = gcVar.f35495p;
                if (fbVar2 != null) {
                    i17 = fbVar2.f(gcVar.f35482a);
                } else {
                    i17 = 0;
                }
                gcVar.f35494o = i17;
            }
            fb fbVar3 = gcVar.f35495p;
            if (fbVar3 != null) {
                fbVar3.b(gcVar);
            }
            if (g2Var != null) {
                g2Var.setupBulletinGlass(gcVar);
            }
            if (org.telegram.messenger.np.g1().getBoolean("view_animations", true) && !gcVar.f35498s) {
                if (lbVar != null && gcVar.f35496q == null) {
                    gcVar.f35496q = lbVar.createTransition();
                }
                lbVar.transitionRunningEnter = true;
                lbVar.delegate = gcVar.f35495p;
                lbVar.invalidate();
                kb kbVar = gcVar.f35496q;
                Objects.requireNonNull(lbVar);
                kbVar.J(lbVar, new wa(lbVar, 1), new ng(this, 15), new rl(2, this, z10));
                return;
            }
            fb fbVar4 = gcVar.f35495p;
            lbVar.delegate = fbVar4;
            if (fbVar4 != null && !z10) {
                fbVar4.c(lbVar.getHeight());
            }
            gcVar.l();
            lbVar.onEnterTransitionStart();
            lbVar.onEnterTransitionEnd();
            if (gcVar.f35500u) {
                gcVar.i(true);
            }
        }
    }
}
