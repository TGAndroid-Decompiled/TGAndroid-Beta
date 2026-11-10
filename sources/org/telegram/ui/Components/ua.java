package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.rb1;
public final class ua implements View.OnLayoutChangeListener {
    public final boolean f38602a;
    public final bc f38603b;

    public ua(bc bcVar, boolean z9) {
        this.f38603b = bcVar;
        this.f38602a = z9;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        za zaVar;
        int i17;
        bc bcVar = this.f38603b;
        fb fbVar = bcVar.f32199e;
        fbVar.removeOnLayoutChangeListener(this);
        if (bcVar.f32205l) {
            fbVar.onShow();
            org.telegram.ui.ActionBar.f2 f2Var = bcVar.f32201g;
            boolean z9 = this.f38602a;
            if (z9 && (f2Var instanceof rb1)) {
                f2Var = ((rb1) f2Var).c0();
            }
            FrameLayout frameLayout = bcVar.h;
            if (f2Var == null || (zaVar = f2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(2131296351);
                    if (tag instanceof za) {
                        zaVar = (za) tag;
                    }
                }
                zaVar = null;
            }
            bcVar.f32209p = zaVar;
            if (zaVar == null && f2Var != null) {
                bcVar.f32209p = new org.telegram.ui.ActionBar.z1(1, f2Var);
            }
            r1.g gVar = bcVar.d;
            if (gVar == null || !gVar.f54273f) {
                za zaVar2 = bcVar.f32209p;
                if (zaVar2 != null) {
                    i17 = zaVar2.f(bcVar.f32196a);
                } else {
                    i17 = 0;
                }
                bcVar.f32208o = i17;
            }
            za zaVar3 = bcVar.f32209p;
            if (zaVar3 != null) {
                zaVar3.b(bcVar);
            }
            if (org.telegram.messenger.qp.e1().getBoolean("view_animations", true) && !bcVar.f32212s) {
                if (fbVar != null && bcVar.f32210q == null) {
                    bcVar.f32210q = fbVar.createTransition();
                }
                fbVar.transitionRunningEnter = true;
                fbVar.delegate = bcVar.f32209p;
                fbVar.invalidate();
                eb ebVar = bcVar.f32210q;
                Objects.requireNonNull(fbVar);
                ebVar.B(fbVar, new qa(fbVar, 1), new wf(this, 15), new al(2, this, z9));
                return;
            }
            za zaVar4 = bcVar.f32209p;
            fbVar.delegate = zaVar4;
            if (zaVar4 != null && !z9) {
                zaVar4.c(fbVar.getHeight());
            }
            bcVar.l();
            fbVar.onEnterTransitionStart();
            fbVar.onEnterTransitionEnd();
            if (bcVar.f32214u) {
                bcVar.i(true);
            }
        }
    }
}
