package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ei1;
public final class lb implements View.OnLayoutChangeListener {
    public final boolean f28150a;
    public final sc f28151b;

    public lb(sc scVar, boolean z10) {
        this.f28151b = scVar;
        this.f28150a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        qb qbVar;
        int i18;
        sc scVar = this.f28151b;
        wb wbVar = scVar.f30536e;
        wbVar.removeOnLayoutChangeListener(this);
        if (scVar.f30542l) {
            wbVar.onShow();
            org.telegram.ui.ActionBar.m2 m2Var = scVar.f30538g;
            boolean z10 = this.f28150a;
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
            scVar.f30546p = qbVar;
            if (qbVar == null && m2Var != null) {
                scVar.f30546p = new ai.x4(m2Var, 5);
            }
            o1.k kVar = scVar.d;
            if (kVar == null || !kVar.f16683f) {
                qb qbVar2 = scVar.f30546p;
                if (qbVar2 != null) {
                    i18 = qbVar2.f(scVar.f30533a);
                } else {
                    i18 = 0;
                }
                scVar.f30545o = i18;
            }
            qb qbVar3 = scVar.f30546p;
            if (qbVar3 != null) {
                qbVar3.b(scVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !scVar.f30549s) {
                if (wbVar != null && scVar.f30547q == null) {
                    scVar.f30547q = wbVar.createTransition();
                }
                wbVar.transitionRunningEnter = true;
                wbVar.delegate = scVar.f30546p;
                wbVar.invalidate();
                vb vbVar = scVar.f30547q;
                Objects.requireNonNull(wbVar);
                vbVar.G(wbVar, new hb(wbVar, 1), new tg(this, 15), new fm(2, this, z10));
                return;
            }
            qb qbVar4 = scVar.f30546p;
            wbVar.delegate = qbVar4;
            if (qbVar4 != null && !z10) {
                qbVar4.c(wbVar.getHeight());
            }
            scVar.l();
            wbVar.onEnterTransitionStart();
            wbVar.onEnterTransitionEnd();
            if (scVar.f30551u) {
                scVar.i(true);
            }
        }
    }
}
