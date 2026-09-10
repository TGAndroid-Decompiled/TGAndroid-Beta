package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.gi1;
public final class ib implements View.OnLayoutChangeListener {
    public final boolean f23980a;
    public final pc f23981b;

    public ib(pc pcVar, boolean z10) {
        this.f23981b = pcVar;
        this.f23980a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        nb nbVar;
        int i18;
        pc pcVar = this.f23981b;
        tb tbVar = pcVar.e;
        tbVar.removeOnLayoutChangeListener(this);
        if (pcVar.f26083l) {
            tbVar.onShow();
            org.telegram.ui.ActionBar.p2 p2Var = pcVar.f26079g;
            boolean z10 = this.f23980a;
            if (z10 && (p2Var instanceof gi1)) {
                p2Var = ((gi1) p2Var).X();
            }
            FrameLayout frameLayout = pcVar.h;
            if (p2Var == null || (nbVar = p2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof nb) {
                        nbVar = (nb) tag;
                    }
                }
                nbVar = null;
            }
            pcVar.f26087p = nbVar;
            if (nbVar == null && p2Var != null) {
                pcVar.f26087p = new bi.rd(p2Var, 2);
            }
            o1.k kVar = pcVar.d;
            if (kVar == null || !kVar.f14127f) {
                nb nbVar2 = pcVar.f26087p;
                if (nbVar2 != null) {
                    i18 = nbVar2.f(pcVar.f26075a);
                } else {
                    i18 = 0;
                }
                pcVar.f26086o = i18;
            }
            nb nbVar3 = pcVar.f26087p;
            if (nbVar3 != null) {
                nbVar3.b(pcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !pcVar.f26090s) {
                if (tbVar != null && pcVar.f26088q == null) {
                    pcVar.f26088q = tbVar.createTransition();
                }
                tbVar.transitionRunningEnter = true;
                tbVar.delegate = pcVar.f26087p;
                tbVar.invalidate();
                sb sbVar = pcVar.f26088q;
                Objects.requireNonNull(tbVar);
                sbVar.I(tbVar, new eb(tbVar, 1), new rg(this, 15), new rl(2, this, z10));
                return;
            }
            nb nbVar4 = pcVar.f26087p;
            tbVar.delegate = nbVar4;
            if (nbVar4 != null && !z10) {
                nbVar4.c(tbVar.getHeight());
            }
            pcVar.l();
            tbVar.onEnterTransitionStart();
            tbVar.onEnterTransitionEnd();
            if (pcVar.f26092u) {
                pcVar.i(true);
            }
        }
    }
}
