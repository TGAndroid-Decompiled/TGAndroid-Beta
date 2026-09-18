package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.yh1;
public final class jb implements View.OnLayoutChangeListener {
    public final boolean f25284a;
    public final qc f25285b;

    public jb(qc qcVar, boolean z10) {
        this.f25285b = qcVar;
        this.f25284a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ob obVar;
        int i18;
        qc qcVar = this.f25285b;
        ub ubVar = qcVar.e;
        ubVar.removeOnLayoutChangeListener(this);
        if (qcVar.f27552l) {
            ubVar.onShow();
            org.telegram.ui.ActionBar.n2 n2Var = qcVar.f27548g;
            boolean z10 = this.f25284a;
            if (z10 && (n2Var instanceof yh1)) {
                n2Var = ((yh1) n2Var).X();
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
            qcVar.f27556p = obVar;
            if (obVar == null && n2Var != null) {
                qcVar.f27556p = new ai.w4(n2Var, 5);
            }
            o1.k kVar = qcVar.d;
            if (kVar == null || !kVar.f15483f) {
                ob obVar2 = qcVar.f27556p;
                if (obVar2 != null) {
                    i18 = obVar2.f(qcVar.f27544a);
                } else {
                    i18 = 0;
                }
                qcVar.f27555o = i18;
            }
            ob obVar3 = qcVar.f27556p;
            if (obVar3 != null) {
                obVar3.b(qcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !qcVar.f27559s) {
                if (ubVar != null && qcVar.f27557q == null) {
                    qcVar.f27557q = ubVar.createTransition();
                }
                ubVar.transitionRunningEnter = true;
                ubVar.delegate = qcVar.f27556p;
                ubVar.invalidate();
                tb tbVar = qcVar.f27557q;
                Objects.requireNonNull(ubVar);
                tbVar.U(ubVar, new fb(ubVar, 1), new og(this, 15), new ml(2, this, z10));
                return;
            }
            ob obVar4 = qcVar.f27556p;
            ubVar.delegate = obVar4;
            if (obVar4 != null && !z10) {
                obVar4.c(ubVar.getHeight());
            }
            qcVar.l();
            ubVar.onEnterTransitionStart();
            ubVar.onEnterTransitionEnd();
            if (qcVar.f27561u) {
                qcVar.i(true);
            }
        }
    }
}
