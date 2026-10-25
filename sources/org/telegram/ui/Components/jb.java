package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ug1;
public final class jb implements View.OnLayoutChangeListener {
    public final boolean f29579a;
    public final qc f29580b;

    public jb(qc qcVar, boolean z10) {
        this.f29580b = qcVar;
        this.f29579a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ob obVar;
        int i18;
        qc qcVar = this.f29580b;
        ub ubVar = qcVar.e;
        ubVar.removeOnLayoutChangeListener(this);
        if (qcVar.f31890m) {
            ubVar.onShow();
            org.telegram.ui.ActionBar.r2 r2Var = qcVar.f31885g;
            boolean z10 = this.f29579a;
            if (z10 && (r2Var instanceof ug1)) {
                r2Var = ((ug1) r2Var).X();
            }
            FrameLayout frameLayout = qcVar.h;
            if (r2Var == null || (obVar = r2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof ob) {
                        obVar = (ob) tag;
                    }
                }
                obVar = null;
            }
            qcVar.f31894q = obVar;
            if (obVar == null && r2Var != null) {
                qcVar.f31894q = new bh.c0(r2Var, 6);
            }
            o1.j jVar = qcVar.d;
            if (jVar == null || !jVar.f18963f) {
                ob obVar2 = qcVar.f31894q;
                if (obVar2 != null) {
                    i18 = obVar2.f(qcVar.f31881a);
                } else {
                    i18 = 0;
                }
                qcVar.f31893p = i18;
            }
            ob obVar3 = qcVar.f31894q;
            if (obVar3 != null) {
                obVar3.b(qcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !qcVar.f31897t) {
                if (ubVar != null && qcVar.f31895r == null) {
                    qcVar.f31895r = ubVar.createTransition();
                }
                ubVar.transitionRunningEnter = true;
                ubVar.delegate = qcVar.f31894q;
                ubVar.invalidate();
                tb tbVar = qcVar.f31895r;
                Objects.requireNonNull(ubVar);
                tbVar.Q0(ubVar, new fb(ubVar, 1), new pg(this, 16), new yl(2, this, z10));
                return;
            }
            ob obVar4 = qcVar.f31894q;
            ubVar.delegate = obVar4;
            if (obVar4 != null && !z10) {
                obVar4.c(ubVar.getHeight());
            }
            qcVar.l();
            ubVar.onEnterTransitionStart();
            ubVar.onEnterTransitionEnd();
            if (qcVar.v) {
                qcVar.i(true);
            }
        }
    }
}
