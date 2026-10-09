package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ci1;
public final class mb implements View.OnLayoutChangeListener {
    public final boolean f28803a;
    public final tc f28804b;

    public mb(tc tcVar, boolean z10) {
        this.f28804b = tcVar;
        this.f28803a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        rb rbVar;
        int i18;
        tc tcVar = this.f28804b;
        xb xbVar = tcVar.f31126e;
        xbVar.removeOnLayoutChangeListener(this);
        if (tcVar.f31132l) {
            xbVar.onShow();
            org.telegram.ui.ActionBar.n2 n2Var = tcVar.f31128g;
            boolean z10 = this.f28803a;
            if (z10 && (n2Var instanceof ci1)) {
                n2Var = ((ci1) n2Var).X();
            }
            FrameLayout frameLayout = tcVar.h;
            if (n2Var == null || (rbVar = n2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof rb) {
                        rbVar = (rb) tag;
                    }
                }
                rbVar = null;
            }
            tcVar.f31136p = rbVar;
            if (rbVar == null && n2Var != null) {
                tcVar.f31136p = new ai.x4(n2Var, 5);
            }
            o1.k kVar = tcVar.d;
            if (kVar == null || !kVar.f16931f) {
                rb rbVar2 = tcVar.f31136p;
                if (rbVar2 != null) {
                    i18 = rbVar2.f(tcVar.f31123a);
                } else {
                    i18 = 0;
                }
                tcVar.f31135o = i18;
            }
            rb rbVar3 = tcVar.f31136p;
            if (rbVar3 != null) {
                rbVar3.b(tcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !tcVar.f31139s) {
                if (xbVar != null && tcVar.f31137q == null) {
                    tcVar.f31137q = xbVar.createTransition();
                }
                xbVar.transitionRunningEnter = true;
                xbVar.delegate = tcVar.f31136p;
                xbVar.invalidate();
                wb wbVar = tcVar.f31137q;
                Objects.requireNonNull(xbVar);
                wbVar.z(xbVar, new ib(xbVar, 1), new rg(this, 15), new dm(2, this, z10));
                return;
            }
            rb rbVar4 = tcVar.f31136p;
            xbVar.delegate = rbVar4;
            if (rbVar4 != null && !z10) {
                rbVar4.c(xbVar.getHeight());
            }
            tcVar.l();
            xbVar.onEnterTransitionStart();
            xbVar.onEnterTransitionEnd();
            if (tcVar.f31141u) {
                tcVar.i(true);
            }
        }
    }
}
