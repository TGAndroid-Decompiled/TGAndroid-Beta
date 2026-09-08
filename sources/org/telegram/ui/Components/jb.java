package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.bi1;
public final class jb implements View.OnLayoutChangeListener {
    public final boolean f27450a;
    public final qc f27451b;

    public jb(qc qcVar, boolean z10) {
        this.f27451b = qcVar;
        this.f27450a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ob obVar;
        int i18;
        qc qcVar = this.f27451b;
        ub ubVar = qcVar.f29702e;
        ubVar.removeOnLayoutChangeListener(this);
        if (qcVar.f29708l) {
            ubVar.onShow();
            org.telegram.ui.ActionBar.n2 n2Var = qcVar.f29704g;
            boolean z10 = this.f27450a;
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
            qcVar.f29712p = obVar;
            if (obVar == null && n2Var != null) {
                qcVar.f29712p = new ah.n0(n2Var, 6);
            }
            o1.k kVar = qcVar.d;
            if (kVar == null || !kVar.f16845f) {
                ob obVar2 = qcVar.f29712p;
                if (obVar2 != null) {
                    i18 = obVar2.f(qcVar.f29699a);
                } else {
                    i18 = 0;
                }
                qcVar.f29711o = i18;
            }
            ob obVar3 = qcVar.f29712p;
            if (obVar3 != null) {
                obVar3.b(qcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !qcVar.f29715s) {
                if (ubVar != null && qcVar.f29713q == null) {
                    qcVar.f29713q = ubVar.createTransition();
                }
                ubVar.transitionRunningEnter = true;
                ubVar.delegate = qcVar.f29712p;
                ubVar.invalidate();
                tb tbVar = qcVar.f29713q;
                Objects.requireNonNull(ubVar);
                tbVar.h0(ubVar, new fb(ubVar, 1), new pg(this, 15), new ml(2, this, z10));
                return;
            }
            ob obVar4 = qcVar.f29712p;
            ubVar.delegate = obVar4;
            if (obVar4 != null && !z10) {
                obVar4.c(ubVar.getHeight());
            }
            qcVar.l();
            ubVar.onEnterTransitionStart();
            ubVar.onEnterTransitionEnd();
            if (qcVar.f29717u) {
                qcVar.i(true);
            }
        }
    }
}
