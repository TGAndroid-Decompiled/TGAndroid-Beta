package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.th1;
public final class kb implements View.OnLayoutChangeListener {
    public final boolean f28058a;
    public final rc f28059b;

    public kb(rc rcVar, boolean z10) {
        this.f28059b = rcVar;
        this.f28058a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        pb pbVar;
        int i18;
        rc rcVar = this.f28059b;
        vb vbVar = rcVar.f30334e;
        vbVar.removeOnLayoutChangeListener(this);
        if (rcVar.f30340l) {
            vbVar.onShow();
            org.telegram.ui.ActionBar.n2 n2Var = rcVar.f30336g;
            boolean z10 = this.f28058a;
            if (z10 && (n2Var instanceof th1)) {
                n2Var = ((th1) n2Var).W();
            }
            FrameLayout frameLayout = rcVar.h;
            if (n2Var == null || (pbVar = n2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof pb) {
                        pbVar = (pb) tag;
                    }
                }
                pbVar = null;
            }
            rcVar.f30344p = pbVar;
            if (pbVar == null && n2Var != null) {
                rcVar.f30344p = new ai.w4(n2Var, 5);
            }
            o1.k kVar = rcVar.d;
            if (kVar == null || !kVar.f16976f) {
                pb pbVar2 = rcVar.f30344p;
                if (pbVar2 != null) {
                    i18 = pbVar2.f(rcVar.f30331a);
                } else {
                    i18 = 0;
                }
                rcVar.f30343o = i18;
            }
            pb pbVar3 = rcVar.f30344p;
            if (pbVar3 != null) {
                pbVar3.b(rcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !rcVar.f30347s) {
                if (vbVar != null && rcVar.f30345q == null) {
                    rcVar.f30345q = vbVar.createTransition();
                }
                vbVar.transitionRunningEnter = true;
                vbVar.delegate = rcVar.f30344p;
                vbVar.invalidate();
                ub ubVar = rcVar.f30345q;
                Objects.requireNonNull(vbVar);
                ubVar.L(vbVar, new gb(vbVar, 1), new qg(this, 15), new pl(2, this, z10));
                return;
            }
            pb pbVar4 = rcVar.f30344p;
            vbVar.delegate = pbVar4;
            if (pbVar4 != null && !z10) {
                pbVar4.c(vbVar.getHeight());
            }
            rcVar.l();
            vbVar.onEnterTransitionStart();
            vbVar.onEnterTransitionEnd();
            if (rcVar.f30349u) {
                rcVar.i(true);
            }
        }
    }
}
