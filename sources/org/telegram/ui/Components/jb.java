package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.bi1;
public final class jb implements View.OnLayoutChangeListener {
    public final boolean f27423a;
    public final qc f27424b;

    public jb(qc qcVar, boolean z10) {
        this.f27424b = qcVar;
        this.f27423a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ob obVar;
        int i18;
        qc qcVar = this.f27424b;
        ub ubVar = qcVar.f29675e;
        ubVar.removeOnLayoutChangeListener(this);
        if (qcVar.f29681l) {
            ubVar.onShow();
            org.telegram.ui.ActionBar.n2 n2Var = qcVar.f29677g;
            boolean z10 = this.f27423a;
            if (z10 && (n2Var instanceof bi1)) {
                n2Var = ((bi1) n2Var).X();
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
            qcVar.f29685p = obVar;
            if (obVar == null && n2Var != null) {
                qcVar.f29685p = new ah.n0(n2Var, 6);
            }
            o1.k kVar = qcVar.d;
            if (kVar == null || !kVar.f16818f) {
                ob obVar2 = qcVar.f29685p;
                if (obVar2 != null) {
                    i18 = obVar2.f(qcVar.f29672a);
                } else {
                    i18 = 0;
                }
                qcVar.f29684o = i18;
            }
            ob obVar3 = qcVar.f29685p;
            if (obVar3 != null) {
                obVar3.b(qcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !qcVar.f29688s) {
                if (ubVar != null && qcVar.f29686q == null) {
                    qcVar.f29686q = ubVar.createTransition();
                }
                ubVar.transitionRunningEnter = true;
                ubVar.delegate = qcVar.f29685p;
                ubVar.invalidate();
                tb tbVar = qcVar.f29686q;
                Objects.requireNonNull(ubVar);
                tbVar.h0(ubVar, new fb(ubVar, 1), new pg(this, 15), new ml(2, this, z10));
                return;
            }
            ob obVar4 = qcVar.f29685p;
            ubVar.delegate = obVar4;
            if (obVar4 != null && !z10) {
                obVar4.c(ubVar.getHeight());
            }
            qcVar.l();
            ubVar.onEnterTransitionStart();
            ubVar.onEnterTransitionEnd();
            if (qcVar.f29690u) {
                qcVar.i(true);
            }
        }
    }
}
