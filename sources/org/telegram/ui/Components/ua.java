package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.gb1;
public final class ua implements View.OnLayoutChangeListener {
    public final boolean f38705a;
    public final ac f38706b;

    public ua(ac acVar, boolean z10) {
        this.f38706b = acVar;
        this.f38705a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        za zaVar;
        int i17;
        ac acVar = this.f38706b;
        fb fbVar = acVar.f31788e;
        fbVar.removeOnLayoutChangeListener(this);
        if (acVar.f31794l) {
            fbVar.onShow();
            org.telegram.ui.ActionBar.d2 d2Var = acVar.f31790g;
            boolean z10 = this.f38705a;
            if (z10 && (d2Var instanceof gb1)) {
                d2Var = ((gb1) d2Var).c0();
            }
            FrameLayout frameLayout = acVar.h;
            if (d2Var == null || (zaVar = d2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(2131296351);
                    if (tag instanceof za) {
                        zaVar = (za) tag;
                    }
                }
                zaVar = null;
            }
            acVar.f31798p = zaVar;
            if (zaVar == null && d2Var != null) {
                acVar.f31798p = new org.telegram.ui.ActionBar.x1(1, d2Var);
            }
            q1.g gVar = acVar.d;
            if (gVar == null || !gVar.f53647f) {
                za zaVar2 = acVar.f31798p;
                if (zaVar2 != null) {
                    i17 = zaVar2.f(acVar.f31785a);
                } else {
                    i17 = 0;
                }
                acVar.f31797o = i17;
            }
            za zaVar3 = acVar.f31798p;
            if (zaVar3 != null) {
                zaVar3.b(acVar);
            }
            if (org.telegram.messenger.hp.e1().getBoolean("view_animations", true) && !acVar.f31801s) {
                if (fbVar != null && acVar.f31799q == null) {
                    acVar.f31799q = fbVar.createTransition();
                }
                fbVar.transitionRunningEnter = true;
                fbVar.delegate = acVar.f31798p;
                fbVar.invalidate();
                eb ebVar = acVar.f31799q;
                Objects.requireNonNull(fbVar);
                ebVar.G(fbVar, new qa(fbVar, 1), new vf(this, 15), new zk(2, this, z10));
                return;
            }
            za zaVar4 = acVar.f31798p;
            fbVar.delegate = zaVar4;
            if (zaVar4 != null && !z10) {
                zaVar4.c(fbVar.getHeight());
            }
            acVar.l();
            fbVar.onEnterTransitionStart();
            fbVar.onEnterTransitionEnd();
            if (acVar.f31803u) {
                acVar.i(true);
            }
        }
    }
}
