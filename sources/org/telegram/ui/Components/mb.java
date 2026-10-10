package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ci1;
public final class mb implements View.OnLayoutChangeListener {
    public final boolean f28755a;
    public final tc f28756b;

    public mb(tc tcVar, boolean z10) {
        this.f28756b = tcVar;
        this.f28755a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        rb rbVar;
        int i18;
        tc tcVar = this.f28756b;
        xb xbVar = tcVar.f31092e;
        xbVar.removeOnLayoutChangeListener(this);
        if (tcVar.f31098l) {
            xbVar.onShow();
            org.telegram.ui.ActionBar.n2 n2Var = tcVar.f31094g;
            boolean z10 = this.f28755a;
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
            tcVar.f31102p = rbVar;
            if (rbVar == null && n2Var != null) {
                tcVar.f31102p = new ai.x4(n2Var, 5);
            }
            o1.k kVar = tcVar.d;
            if (kVar == null || !kVar.f16935f) {
                rb rbVar2 = tcVar.f31102p;
                if (rbVar2 != null) {
                    i18 = rbVar2.f(tcVar.f31089a);
                } else {
                    i18 = 0;
                }
                tcVar.f31101o = i18;
            }
            rb rbVar3 = tcVar.f31102p;
            if (rbVar3 != null) {
                rbVar3.b(tcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !tcVar.f31105s) {
                if (xbVar != null && tcVar.f31103q == null) {
                    tcVar.f31103q = xbVar.createTransition();
                }
                xbVar.transitionRunningEnter = true;
                xbVar.delegate = tcVar.f31102p;
                xbVar.invalidate();
                wb wbVar = tcVar.f31103q;
                Objects.requireNonNull(xbVar);
                wbVar.z(xbVar, new ib(xbVar, 1), new rg(this, 15), new dm(2, this, z10));
                return;
            }
            rb rbVar4 = tcVar.f31102p;
            xbVar.delegate = rbVar4;
            if (rbVar4 != null && !z10) {
                rbVar4.c(xbVar.getHeight());
            }
            tcVar.l();
            xbVar.onEnterTransitionStart();
            xbVar.onEnterTransitionEnd();
            if (tcVar.f31107u) {
                tcVar.i(true);
            }
        }
    }
}
