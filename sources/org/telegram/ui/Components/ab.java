package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.hh1;
public final class ab implements View.OnLayoutChangeListener {
    public final boolean f23337a;
    public final ic f23338b;

    public ab(ic icVar, boolean z4) {
        this.f23338b = icVar;
        this.f23337a = z4;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        fb fbVar;
        int i18;
        ic icVar = this.f23338b;
        nb nbVar = icVar.e;
        nbVar.removeOnLayoutChangeListener(this);
        if (icVar.f25674l) {
            nbVar.onShow();
            org.telegram.ui.ActionBar.p2 p2Var = icVar.f25670g;
            boolean z4 = this.f23337a;
            if (z4 && (p2Var instanceof hh1)) {
                p2Var = ((hh1) p2Var).X();
            }
            FrameLayout frameLayout = icVar.h;
            if (p2Var == null || (fbVar = p2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof fb) {
                        fbVar = (fb) tag;
                    }
                }
                fbVar = null;
            }
            icVar.f25678p = fbVar;
            if (fbVar == null && p2Var != null) {
                icVar.f25678p = new kh.t0(p2Var, 6);
            }
            o1.j jVar = icVar.d;
            if (jVar == null || !jVar.f16192f) {
                fb fbVar2 = icVar.f25678p;
                if (fbVar2 != null) {
                    i18 = fbVar2.f(icVar.f25666a);
                } else {
                    i18 = 0;
                }
                icVar.f25677o = i18;
            }
            fb fbVar3 = icVar.f25678p;
            if (fbVar3 != null) {
                fbVar3.b(icVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !icVar.f25681s) {
                if (nbVar != null && icVar.f25679q == null) {
                    icVar.f25679q = nbVar.createTransition();
                }
                nbVar.transitionRunningEnter = true;
                nbVar.delegate = icVar.f25678p;
                nbVar.invalidate();
                mb mbVar = icVar.f25679q;
                Objects.requireNonNull(nbVar);
                mbVar.v(nbVar, new wa(nbVar, 1), new fg(this, 15), new gl(2, this, z4));
                return;
            }
            fb fbVar4 = icVar.f25678p;
            nbVar.delegate = fbVar4;
            if (fbVar4 != null && !z4) {
                fbVar4.c(nbVar.getHeight());
            }
            icVar.l();
            nbVar.onEnterTransitionStart();
            nbVar.onEnterTransitionEnd();
            if (icVar.f25683u) {
                icVar.i(true);
            }
        }
    }
}
