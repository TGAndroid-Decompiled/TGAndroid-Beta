package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ji1;
public final class lb implements View.OnLayoutChangeListener {
    public final boolean f26716a;
    public final sc f26717b;

    public lb(sc scVar, boolean z10) {
        this.f26717b = scVar;
        this.f26716a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        qb qbVar;
        int i18;
        sc scVar = this.f26717b;
        wb wbVar = scVar.e;
        wbVar.removeOnLayoutChangeListener(this);
        if (scVar.f28807l) {
            wbVar.onShow();
            org.telegram.ui.ActionBar.m2 m2Var = scVar.f28803g;
            boolean z10 = this.f26716a;
            if (z10 && (m2Var instanceof ji1)) {
                m2Var = ((ji1) m2Var).X();
            }
            FrameLayout frameLayout = scVar.h;
            if (m2Var == null || (qbVar = m2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof qb) {
                        qbVar = (qb) tag;
                    }
                }
                qbVar = null;
            }
            scVar.f28811p = qbVar;
            if (qbVar == null && m2Var != null) {
                scVar.f28811p = new ah.m0(m2Var, 6);
            }
            o1.k kVar = scVar.d;
            if (kVar == null || !kVar.f16154f) {
                qb qbVar2 = scVar.f28811p;
                if (qbVar2 != null) {
                    i18 = qbVar2.f(scVar.f28799a);
                } else {
                    i18 = 0;
                }
                scVar.f28810o = i18;
            }
            qb qbVar3 = scVar.f28811p;
            if (qbVar3 != null) {
                qbVar3.b(scVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !scVar.f28814s) {
                if (wbVar != null && scVar.f28812q == null) {
                    scVar.f28812q = wbVar.createTransition();
                }
                wbVar.transitionRunningEnter = true;
                wbVar.delegate = scVar.f28811p;
                wbVar.invalidate();
                vb vbVar = scVar.f28812q;
                Objects.requireNonNull(wbVar);
                vbVar.X(wbVar, new hb(wbVar, 1), new qg(this, 15), new zl(2, this, z10));
                return;
            }
            qb qbVar4 = scVar.f28811p;
            wbVar.delegate = qbVar4;
            if (qbVar4 != null && !z10) {
                qbVar4.c(wbVar.getHeight());
            }
            scVar.l();
            wbVar.onEnterTransitionStart();
            wbVar.onEnterTransitionEnd();
            if (scVar.f28816u) {
                scVar.i(true);
            }
        }
    }
}
