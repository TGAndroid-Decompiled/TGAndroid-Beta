package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.qb1;
public final class ab implements View.OnLayoutChangeListener {
    public final boolean f33477a;
    public final gc f33478b;

    public ab(gc gcVar, boolean z10) {
        this.f33478b = gcVar;
        this.f33477a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        fb fbVar;
        int i17;
        gc gcVar = this.f33478b;
        lb lbVar = gcVar.f35523e;
        lbVar.removeOnLayoutChangeListener(this);
        if (gcVar.f35529l) {
            lbVar.onShow();
            org.telegram.ui.ActionBar.g2 g2Var = gcVar.f35525g;
            boolean z10 = this.f33477a;
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
            gcVar.f35533p = fbVar;
            if (fbVar == null && g2Var != null) {
                gcVar.f35533p = new org.telegram.ui.ActionBar.a2(1, g2Var);
            }
            r1.g gVar = gcVar.d;
            if (gVar == null || !gVar.f56362f) {
                fb fbVar2 = gcVar.f35533p;
                if (fbVar2 != null) {
                    i17 = fbVar2.f(gcVar.f35520a);
                } else {
                    i17 = 0;
                }
                gcVar.f35532o = i17;
            }
            fb fbVar3 = gcVar.f35533p;
            if (fbVar3 != null) {
                fbVar3.b(gcVar);
            }
            if (g2Var != null) {
                g2Var.setupBulletinGlass(gcVar);
            }
            if (org.telegram.messenger.np.g1().getBoolean("view_animations", true) && !gcVar.f35536s) {
                if (lbVar != null && gcVar.f35534q == null) {
                    gcVar.f35534q = lbVar.createTransition();
                }
                lbVar.transitionRunningEnter = true;
                lbVar.delegate = gcVar.f35533p;
                lbVar.invalidate();
                kb kbVar = gcVar.f35534q;
                Objects.requireNonNull(lbVar);
                kbVar.J(lbVar, new wa(lbVar, 1), new og(this, 15), new rl(2, this, z10));
                return;
            }
            fb fbVar4 = gcVar.f35533p;
            lbVar.delegate = fbVar4;
            if (fbVar4 != null && !z10) {
                fbVar4.c(lbVar.getHeight());
            }
            gcVar.l();
            lbVar.onEnterTransitionStart();
            lbVar.onEnterTransitionEnd();
            if (gcVar.f35538u) {
                gcVar.i(true);
            }
        }
    }
}
