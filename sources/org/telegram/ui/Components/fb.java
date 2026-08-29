package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.vg1;
public final class fb implements View.OnLayoutChangeListener {
    public final boolean f28366a;
    public final mc f28367b;

    public fb(mc mcVar, boolean z10) {
        this.f28367b = mcVar;
        this.f28366a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        kb kbVar;
        int i18;
        mc mcVar = this.f28367b;
        rb rbVar = mcVar.f30648e;
        rbVar.removeOnLayoutChangeListener(this);
        if (mcVar.f30654l) {
            rbVar.onShow();
            org.telegram.ui.ActionBar.o2 o2Var = mcVar.f30650g;
            boolean z10 = this.f28366a;
            if (z10 && (o2Var instanceof vg1)) {
                o2Var = ((vg1) o2Var).X();
            }
            FrameLayout frameLayout = mcVar.h;
            if (o2Var == null || (kbVar = o2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof kb) {
                        kbVar = (kb) tag;
                    }
                }
                kbVar = null;
            }
            mcVar.f30658p = kbVar;
            if (kbVar == null && o2Var != null) {
                mcVar.f30658p = new ih.u0(o2Var, 7);
            }
            o1.k kVar = mcVar.d;
            if (kVar == null || !kVar.f19039f) {
                kb kbVar2 = mcVar.f30658p;
                if (kbVar2 != null) {
                    i18 = kbVar2.f(mcVar.f30645a);
                } else {
                    i18 = 0;
                }
                mcVar.f30657o = i18;
            }
            kb kbVar3 = mcVar.f30658p;
            if (kbVar3 != null) {
                kbVar3.b(mcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !mcVar.f30661s) {
                if (rbVar != null && mcVar.f30659q == null) {
                    mcVar.f30659q = rbVar.createTransition();
                }
                rbVar.transitionRunningEnter = true;
                rbVar.delegate = mcVar.f30658p;
                rbVar.invalidate();
                qb qbVar = mcVar.f30659q;
                Objects.requireNonNull(rbVar);
                qbVar.r(rbVar, new bb(rbVar, 1), new ig(this, 15), new hl(2, this, z10));
                return;
            }
            kb kbVar4 = mcVar.f30658p;
            rbVar.delegate = kbVar4;
            if (kbVar4 != null && !z10) {
                kbVar4.c(rbVar.getHeight());
            }
            mcVar.l();
            rbVar.onEnterTransitionStart();
            rbVar.onEnterTransitionEnd();
            if (mcVar.f30663u) {
                mcVar.i(true);
            }
        }
    }
}
