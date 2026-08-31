package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.jh1;
public final class ab implements View.OnLayoutChangeListener {
    public final boolean f25214a;
    public final ic f25215b;

    public ab(ic icVar, boolean z4) {
        this.f25215b = icVar;
        this.f25214a = z4;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        fb fbVar;
        int i18;
        ic icVar = this.f25215b;
        nb nbVar = icVar.f27741e;
        nbVar.removeOnLayoutChangeListener(this);
        if (icVar.f27747l) {
            nbVar.onShow();
            org.telegram.ui.ActionBar.p2 p2Var = icVar.f27743g;
            boolean z4 = this.f25214a;
            if (z4 && (p2Var instanceof jh1)) {
                p2Var = ((jh1) p2Var).X();
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
            icVar.f27751p = fbVar;
            if (fbVar == null && p2Var != null) {
                icVar.f27751p = new lh.t0(p2Var, 6);
            }
            o1.j jVar = icVar.d;
            if (jVar == null || !jVar.f16330f) {
                fb fbVar2 = icVar.f27751p;
                if (fbVar2 != null) {
                    i18 = fbVar2.f(icVar.f27738a);
                } else {
                    i18 = 0;
                }
                icVar.f27750o = i18;
            }
            fb fbVar3 = icVar.f27751p;
            if (fbVar3 != null) {
                fbVar3.b(icVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !icVar.f27754s) {
                if (nbVar != null && icVar.f27752q == null) {
                    icVar.f27752q = nbVar.createTransition();
                }
                nbVar.transitionRunningEnter = true;
                nbVar.delegate = icVar.f27751p;
                nbVar.invalidate();
                mb mbVar = icVar.f27752q;
                Objects.requireNonNull(nbVar);
                mbVar.A(nbVar, new wa(nbVar, 1), new fg(this, 15), new il(2, this, z4));
                return;
            }
            fb fbVar4 = icVar.f27751p;
            nbVar.delegate = fbVar4;
            if (fbVar4 != null && !z4) {
                fbVar4.c(nbVar.getHeight());
            }
            icVar.l();
            nbVar.onEnterTransitionStart();
            nbVar.onEnterTransitionEnd();
            if (icVar.f27756u) {
                icVar.i(true);
            }
        }
    }
}
