package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ei1;
public final class lb implements View.OnLayoutChangeListener {
    public final boolean f28135a;
    public final sc f28136b;

    public lb(sc scVar, boolean z10) {
        this.f28136b = scVar;
        this.f28135a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        qb qbVar;
        int i18;
        sc scVar = this.f28136b;
        wb wbVar = scVar.f30532e;
        wbVar.removeOnLayoutChangeListener(this);
        if (scVar.f30538l) {
            wbVar.onShow();
            org.telegram.ui.ActionBar.m2 m2Var = scVar.f30534g;
            boolean z10 = this.f28135a;
            if (z10 && (m2Var instanceof ei1)) {
                m2Var = ((ei1) m2Var).X();
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
            scVar.f30542p = qbVar;
            if (qbVar == null && m2Var != null) {
                scVar.f30542p = new ai.x4(m2Var, 5);
            }
            o1.k kVar = scVar.d;
            if (kVar == null || !kVar.f16684f) {
                qb qbVar2 = scVar.f30542p;
                if (qbVar2 != null) {
                    i18 = qbVar2.f(scVar.f30529a);
                } else {
                    i18 = 0;
                }
                scVar.f30541o = i18;
            }
            qb qbVar3 = scVar.f30542p;
            if (qbVar3 != null) {
                qbVar3.b(scVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !scVar.f30545s) {
                if (wbVar != null && scVar.f30543q == null) {
                    scVar.f30543q = wbVar.createTransition();
                }
                wbVar.transitionRunningEnter = true;
                wbVar.delegate = scVar.f30542p;
                wbVar.invalidate();
                vb vbVar = scVar.f30543q;
                Objects.requireNonNull(wbVar);
                vbVar.G(wbVar, new hb(wbVar, 1), new tg(this, 15), new fm(2, this, z10));
                return;
            }
            qb qbVar4 = scVar.f30542p;
            wbVar.delegate = qbVar4;
            if (qbVar4 != null && !z10) {
                qbVar4.c(wbVar.getHeight());
            }
            scVar.l();
            wbVar.onEnterTransitionStart();
            wbVar.onEnterTransitionEnd();
            if (scVar.f30547u) {
                scVar.i(true);
            }
        }
    }
}
