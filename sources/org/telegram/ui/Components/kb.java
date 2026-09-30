package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.th1;
public final class kb implements View.OnLayoutChangeListener {
    public final boolean f25735a;
    public final rc f25736b;

    public kb(rc rcVar, boolean z10) {
        this.f25736b = rcVar;
        this.f25735a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        pb pbVar;
        int i18;
        rc rcVar = this.f25736b;
        vb vbVar = rcVar.e;
        vbVar.removeOnLayoutChangeListener(this);
        if (rcVar.f27948l) {
            vbVar.onShow();
            org.telegram.ui.ActionBar.m2 m2Var = rcVar.f27944g;
            boolean z10 = this.f25735a;
            if (z10 && (m2Var instanceof th1)) {
                m2Var = ((th1) m2Var).X();
            }
            FrameLayout frameLayout = rcVar.h;
            if (m2Var == null || (pbVar = m2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof pb) {
                        pbVar = (pb) tag;
                    }
                }
                pbVar = null;
            }
            rcVar.f27952p = pbVar;
            if (pbVar == null && m2Var != null) {
                rcVar.f27952p = new ai.w4(m2Var, 5);
            }
            o1.k kVar = rcVar.d;
            if (kVar == null || !kVar.f15542f) {
                pb pbVar2 = rcVar.f27952p;
                if (pbVar2 != null) {
                    i18 = pbVar2.f(rcVar.f27940a);
                } else {
                    i18 = 0;
                }
                rcVar.f27951o = i18;
            }
            pb pbVar3 = rcVar.f27952p;
            if (pbVar3 != null) {
                pbVar3.b(rcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !rcVar.f27955s) {
                if (vbVar != null && rcVar.f27953q == null) {
                    rcVar.f27953q = vbVar.createTransition();
                }
                vbVar.transitionRunningEnter = true;
                vbVar.delegate = rcVar.f27952p;
                vbVar.invalidate();
                ub ubVar = rcVar.f27953q;
                Objects.requireNonNull(vbVar);
                ubVar.U(vbVar, new gb(vbVar, 1), new qg(this, 15), new pl(2, this, z10));
                return;
            }
            pb pbVar4 = rcVar.f27952p;
            vbVar.delegate = pbVar4;
            if (pbVar4 != null && !z10) {
                pbVar4.c(vbVar.getHeight());
            }
            rcVar.l();
            vbVar.onEnterTransitionStart();
            vbVar.onEnterTransitionEnd();
            if (rcVar.f27957u) {
                rcVar.i(true);
            }
        }
    }
}
