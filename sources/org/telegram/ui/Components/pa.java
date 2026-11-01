package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.hd1;
public final class pa implements View.OnLayoutChangeListener {
    public final boolean f29391a;
    public final wb f29392b;

    public pa(wb wbVar, boolean z10) {
        this.f29392b = wbVar;
        this.f29391a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ua uaVar;
        int i18;
        wb wbVar = this.f29392b;
        bb bbVar = wbVar.e;
        bbVar.removeOnLayoutChangeListener(this);
        if (wbVar.f32203l) {
            bbVar.onShow();
            org.telegram.ui.ActionBar.k2 k2Var = wbVar.f32199g;
            boolean z10 = this.f29391a;
            if (z10 && (k2Var instanceof hd1)) {
                k2Var = ((hd1) k2Var).c0();
            }
            FrameLayout frameLayout = wbVar.h;
            if (k2Var == null || (uaVar = k2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(2131296351);
                    if (tag instanceof ua) {
                        uaVar = (ua) tag;
                    }
                }
                uaVar = null;
            }
            wbVar.f32207p = uaVar;
            if (uaVar == null && k2Var != null) {
                wbVar.f32207p = new org.telegram.ui.ActionBar.e2(1, k2Var);
            }
            o1.j jVar = wbVar.d;
            if (jVar == null || !jVar.f13952f) {
                ua uaVar2 = wbVar.f32207p;
                if (uaVar2 != null) {
                    i18 = uaVar2.f(wbVar.f32195a);
                } else {
                    i18 = 0;
                }
                wbVar.f32206o = i18;
            }
            ua uaVar3 = wbVar.f32207p;
            if (uaVar3 != null) {
                uaVar3.b(wbVar);
            }
            if (org.telegram.messenger.wp.d1().getBoolean("view_animations", true) && !wbVar.f32210s) {
                if (bbVar != null && wbVar.f32208q == null) {
                    wbVar.f32208q = bbVar.createTransition();
                }
                bbVar.transitionRunningEnter = true;
                bbVar.delegate = wbVar.f32207p;
                bbVar.invalidate();
                ab abVar = wbVar.f32208q;
                Objects.requireNonNull(bbVar);
                abVar.p0(bbVar, new la(bbVar, 1), new tf(this, 16), new gl(2, this, z10));
                return;
            }
            ua uaVar4 = wbVar.f32207p;
            bbVar.delegate = uaVar4;
            if (uaVar4 != null && !z10) {
                uaVar4.c(bbVar.getHeight());
            }
            wbVar.l();
            bbVar.onEnterTransitionStart();
            bbVar.onEnterTransitionEnd();
            if (wbVar.f32212u) {
                wbVar.i(true);
            }
        }
    }
}
