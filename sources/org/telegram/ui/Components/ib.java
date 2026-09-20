package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ai1;
public final class ib implements View.OnLayoutChangeListener {
    public final boolean f24983a;
    public final pc f24984b;

    public ib(pc pcVar, boolean z10) {
        this.f24984b = pcVar;
        this.f24983a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        nb nbVar;
        int i18;
        pc pcVar = this.f24984b;
        tb tbVar = pcVar.e;
        tbVar.removeOnLayoutChangeListener(this);
        if (pcVar.f27254l) {
            tbVar.onShow();
            org.telegram.ui.ActionBar.n2 n2Var = pcVar.f27250g;
            boolean z10 = this.f24983a;
            if (z10 && (n2Var instanceof ai1)) {
                n2Var = ((ai1) n2Var).X();
            }
            FrameLayout frameLayout = pcVar.h;
            if (n2Var == null || (nbVar = n2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof nb) {
                        nbVar = (nb) tag;
                    }
                }
                nbVar = null;
            }
            pcVar.f27258p = nbVar;
            if (nbVar == null && n2Var != null) {
                pcVar.f27258p = new ai.w4(n2Var, 5);
            }
            o1.k kVar = pcVar.d;
            if (kVar == null || !kVar.f15515f) {
                nb nbVar2 = pcVar.f27258p;
                if (nbVar2 != null) {
                    i18 = nbVar2.f(pcVar.f27246a);
                } else {
                    i18 = 0;
                }
                pcVar.f27257o = i18;
            }
            nb nbVar3 = pcVar.f27258p;
            if (nbVar3 != null) {
                nbVar3.b(pcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !pcVar.f27261s) {
                if (tbVar != null && pcVar.f27259q == null) {
                    pcVar.f27259q = tbVar.createTransition();
                }
                tbVar.transitionRunningEnter = true;
                tbVar.delegate = pcVar.f27258p;
                tbVar.invalidate();
                sb sbVar = pcVar.f27259q;
                Objects.requireNonNull(tbVar);
                sbVar.U(tbVar, new eb(tbVar, 1), new og(this, 15), new ml(2, this, z10));
                return;
            }
            nb nbVar4 = pcVar.f27258p;
            tbVar.delegate = nbVar4;
            if (nbVar4 != null && !z10) {
                nbVar4.c(tbVar.getHeight());
            }
            pcVar.l();
            tbVar.onEnterTransitionStart();
            tbVar.onEnterTransitionEnd();
            if (pcVar.f27263u) {
                pcVar.i(true);
            }
        }
    }
}
