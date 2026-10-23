package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ug1;
public final class jb implements View.OnLayoutChangeListener {
    public final boolean f27650a;
    public final qc f27651b;

    public jb(qc qcVar, boolean z10) {
        this.f27651b = qcVar;
        this.f27650a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ob obVar;
        int i18;
        qc qcVar = this.f27651b;
        ub ubVar = qcVar.e;
        ubVar.removeOnLayoutChangeListener(this);
        if (qcVar.f29834l) {
            ubVar.onShow();
            org.telegram.ui.ActionBar.o2 o2Var = qcVar.f29830g;
            boolean z10 = this.f27650a;
            if (z10 && (o2Var instanceof ug1)) {
                o2Var = ((ug1) o2Var).X();
            }
            FrameLayout frameLayout = qcVar.h;
            if (o2Var == null || (obVar = o2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof ob) {
                        obVar = (ob) tag;
                    }
                }
                obVar = null;
            }
            qcVar.f29838p = obVar;
            if (obVar == null && o2Var != null) {
                qcVar.f29838p = new ah.m0(o2Var, 6);
            }
            o1.k kVar = qcVar.d;
            if (kVar == null || !kVar.f17615f) {
                ob obVar2 = qcVar.f29838p;
                if (obVar2 != null) {
                    i18 = obVar2.f(qcVar.f29826a);
                } else {
                    i18 = 0;
                }
                qcVar.f29837o = i18;
            }
            ob obVar3 = qcVar.f29838p;
            if (obVar3 != null) {
                obVar3.b(qcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !qcVar.f29841s) {
                if (ubVar != null && qcVar.f29839q == null) {
                    qcVar.f29839q = ubVar.createTransition();
                }
                ubVar.transitionRunningEnter = true;
                ubVar.delegate = qcVar.f29838p;
                ubVar.invalidate();
                tb tbVar = qcVar.f29839q;
                Objects.requireNonNull(ubVar);
                tbVar.D0(ubVar, new fb(ubVar, 1), new pg(this, 16), new xl(2, this, z10));
                return;
            }
            ob obVar4 = qcVar.f29838p;
            ubVar.delegate = obVar4;
            if (obVar4 != null && !z10) {
                obVar4.c(ubVar.getHeight());
            }
            qcVar.l();
            ubVar.onEnterTransitionStart();
            ubVar.onEnterTransitionEnd();
            if (qcVar.f29843u) {
                qcVar.i(true);
            }
        }
    }
}
