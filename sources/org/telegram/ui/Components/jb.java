package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.th1;
public final class jb implements View.OnLayoutChangeListener {
    public final boolean f25354a;
    public final qc f25355b;

    public jb(qc qcVar, boolean z10) {
        this.f25355b = qcVar;
        this.f25354a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ob obVar;
        int i18;
        qc qcVar = this.f25355b;
        ub ubVar = qcVar.e;
        ubVar.removeOnLayoutChangeListener(this);
        if (qcVar.f27573l) {
            ubVar.onShow();
            org.telegram.ui.ActionBar.m2 m2Var = qcVar.f27569g;
            boolean z10 = this.f25354a;
            if (z10 && (m2Var instanceof th1)) {
                m2Var = ((th1) m2Var).X();
            }
            FrameLayout frameLayout = qcVar.h;
            if (m2Var == null || (obVar = m2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof ob) {
                        obVar = (ob) tag;
                    }
                }
                obVar = null;
            }
            qcVar.f27577p = obVar;
            if (obVar == null && m2Var != null) {
                qcVar.f27577p = new ai.w4(m2Var, 5);
            }
            o1.k kVar = qcVar.d;
            if (kVar == null || !kVar.f15511f) {
                ob obVar2 = qcVar.f27577p;
                if (obVar2 != null) {
                    i18 = obVar2.f(qcVar.f27565a);
                } else {
                    i18 = 0;
                }
                qcVar.f27576o = i18;
            }
            ob obVar3 = qcVar.f27577p;
            if (obVar3 != null) {
                obVar3.b(qcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !qcVar.f27580s) {
                if (ubVar != null && qcVar.f27578q == null) {
                    qcVar.f27578q = ubVar.createTransition();
                }
                ubVar.transitionRunningEnter = true;
                ubVar.delegate = qcVar.f27577p;
                ubVar.invalidate();
                tb tbVar = qcVar.f27578q;
                Objects.requireNonNull(ubVar);
                tbVar.U(ubVar, new fb(ubVar, 1), new pg(this, 15), new nl(2, this, z10));
                return;
            }
            ob obVar4 = qcVar.f27577p;
            ubVar.delegate = obVar4;
            if (obVar4 != null && !z10) {
                obVar4.c(ubVar.getHeight());
            }
            qcVar.l();
            ubVar.onEnterTransitionStart();
            ubVar.onEnterTransitionEnd();
            if (qcVar.f27582u) {
                qcVar.i(true);
            }
        }
    }
}
