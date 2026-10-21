package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.og1;
public final class jb implements View.OnLayoutChangeListener {
    public final boolean f27486a;
    public final qc f27487b;

    public jb(qc qcVar, boolean z10) {
        this.f27487b = qcVar;
        this.f27486a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ob obVar;
        int i18;
        qc qcVar = this.f27487b;
        ub ubVar = qcVar.e;
        ubVar.removeOnLayoutChangeListener(this);
        if (qcVar.f29533l) {
            ubVar.onShow();
            org.telegram.ui.ActionBar.n2 n2Var = qcVar.f29529g;
            boolean z10 = this.f27486a;
            if (z10 && (n2Var instanceof og1)) {
                n2Var = ((og1) n2Var).X();
            }
            FrameLayout frameLayout = qcVar.h;
            if (n2Var == null || (obVar = n2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof ob) {
                        obVar = (ob) tag;
                    }
                }
                obVar = null;
            }
            qcVar.f29537p = obVar;
            if (obVar == null && n2Var != null) {
                qcVar.f29537p = new ah.m0(n2Var, 6);
            }
            o1.k kVar = qcVar.d;
            if (kVar == null || !kVar.f17552f) {
                ob obVar2 = qcVar.f29537p;
                if (obVar2 != null) {
                    i18 = obVar2.f(qcVar.f29525a);
                } else {
                    i18 = 0;
                }
                qcVar.f29536o = i18;
            }
            ob obVar3 = qcVar.f29537p;
            if (obVar3 != null) {
                obVar3.b(qcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !qcVar.f29540s) {
                if (ubVar != null && qcVar.f29538q == null) {
                    qcVar.f29538q = ubVar.createTransition();
                }
                ubVar.transitionRunningEnter = true;
                ubVar.delegate = qcVar.f29537p;
                ubVar.invalidate();
                tb tbVar = qcVar.f29538q;
                Objects.requireNonNull(ubVar);
                tbVar.D0(ubVar, new fb(ubVar, 1), new pg(this, 15), new xl(2, this, z10));
                return;
            }
            ob obVar4 = qcVar.f29537p;
            ubVar.delegate = obVar4;
            if (obVar4 != null && !z10) {
                obVar4.c(ubVar.getHeight());
            }
            qcVar.l();
            ubVar.onEnterTransitionStart();
            ubVar.onEnterTransitionEnd();
            if (qcVar.f29542u) {
                qcVar.i(true);
            }
        }
    }
}
