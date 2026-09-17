package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.bi1;
public final class jb implements View.OnLayoutChangeListener {
    public final boolean f27451a;
    public final qc f27452b;

    public jb(qc qcVar, boolean z10) {
        this.f27452b = qcVar;
        this.f27451a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ob obVar;
        int i18;
        qc qcVar = this.f27452b;
        ub ubVar = qcVar.f29703e;
        ubVar.removeOnLayoutChangeListener(this);
        if (qcVar.f29709l) {
            ubVar.onShow();
            org.telegram.ui.ActionBar.n2 n2Var = qcVar.f29705g;
            boolean z10 = this.f27451a;
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
            qcVar.f29713p = obVar;
            if (obVar == null && n2Var != null) {
                qcVar.f29713p = new ah.n0(n2Var, 6);
            }
            o1.k kVar = qcVar.d;
            if (kVar == null || !kVar.f16845f) {
                ob obVar2 = qcVar.f29713p;
                if (obVar2 != null) {
                    i18 = obVar2.f(qcVar.f29700a);
                } else {
                    i18 = 0;
                }
                qcVar.f29712o = i18;
            }
            ob obVar3 = qcVar.f29713p;
            if (obVar3 != null) {
                obVar3.b(qcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !qcVar.f29716s) {
                if (ubVar != null && qcVar.f29714q == null) {
                    qcVar.f29714q = ubVar.createTransition();
                }
                ubVar.transitionRunningEnter = true;
                ubVar.delegate = qcVar.f29713p;
                ubVar.invalidate();
                tb tbVar = qcVar.f29714q;
                Objects.requireNonNull(ubVar);
                tbVar.h0(ubVar, new fb(ubVar, 1), new pg(this, 15), new ml(2, this, z10));
                return;
            }
            ob obVar4 = qcVar.f29713p;
            ubVar.delegate = obVar4;
            if (obVar4 != null && !z10) {
                obVar4.c(ubVar.getHeight());
            }
            qcVar.l();
            ubVar.onEnterTransitionStart();
            ubVar.onEnterTransitionEnd();
            if (qcVar.f29718u) {
                qcVar.i(true);
            }
        }
    }
}
