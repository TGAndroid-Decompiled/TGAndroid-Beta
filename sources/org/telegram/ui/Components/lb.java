package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.bi1;
public final class lb implements View.OnLayoutChangeListener {
    public final boolean f28335a;
    public final sc f28336b;

    public lb(sc scVar, boolean z10) {
        this.f28336b = scVar;
        this.f28335a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        qb qbVar;
        int i18;
        sc scVar = this.f28336b;
        wb wbVar = scVar.f30829e;
        wbVar.removeOnLayoutChangeListener(this);
        if (scVar.f30835l) {
            wbVar.onShow();
            org.telegram.ui.ActionBar.m2 m2Var = scVar.f30831g;
            boolean z10 = this.f28335a;
            if (z10 && (m2Var instanceof bi1)) {
                m2Var = ((bi1) m2Var).X();
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
            scVar.f30839p = qbVar;
            if (qbVar == null && m2Var != null) {
                scVar.f30839p = new ai.x4(m2Var, 5);
            }
            o1.k kVar = scVar.d;
            if (kVar == null || !kVar.f17017f) {
                qb qbVar2 = scVar.f30839p;
                if (qbVar2 != null) {
                    i18 = qbVar2.f(scVar.f30826a);
                } else {
                    i18 = 0;
                }
                scVar.f30838o = i18;
            }
            qb qbVar3 = scVar.f30839p;
            if (qbVar3 != null) {
                qbVar3.b(scVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !scVar.f30842s) {
                if (wbVar != null && scVar.f30840q == null) {
                    scVar.f30840q = wbVar.createTransition();
                }
                wbVar.transitionRunningEnter = true;
                wbVar.delegate = scVar.f30839p;
                wbVar.invalidate();
                vb vbVar = scVar.f30840q;
                Objects.requireNonNull(wbVar);
                vbVar.y(wbVar, new hb(wbVar, 1), new rg(this, 15), new dm(2, this, z10));
                return;
            }
            qb qbVar4 = scVar.f30839p;
            wbVar.delegate = qbVar4;
            if (qbVar4 != null && !z10) {
                qbVar4.c(wbVar.getHeight());
            }
            scVar.l();
            wbVar.onEnterTransitionStart();
            wbVar.onEnterTransitionEnd();
            if (scVar.f30844u) {
                scVar.i(true);
            }
        }
    }
}
