package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.rh1;
public final class jb implements View.OnLayoutChangeListener {
    public final boolean f25439a;
    public final qc f25440b;

    public jb(qc qcVar, boolean z10) {
        this.f25440b = qcVar;
        this.f25439a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ob obVar;
        int i18;
        qc qcVar = this.f25440b;
        ub ubVar = qcVar.e;
        ubVar.removeOnLayoutChangeListener(this);
        if (qcVar.f27693l) {
            ubVar.onShow();
            org.telegram.ui.ActionBar.o2 o2Var = qcVar.f27689g;
            boolean z10 = this.f25439a;
            if (z10 && (o2Var instanceof rh1)) {
                o2Var = ((rh1) o2Var).X();
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
            qcVar.f27697p = obVar;
            if (obVar == null && o2Var != null) {
                qcVar.f27697p = new ai.w4(o2Var, 5);
            }
            o1.k kVar = qcVar.d;
            if (kVar == null || !kVar.f15565f) {
                ob obVar2 = qcVar.f27697p;
                if (obVar2 != null) {
                    i18 = obVar2.f(qcVar.f27685a);
                } else {
                    i18 = 0;
                }
                qcVar.f27696o = i18;
            }
            ob obVar3 = qcVar.f27697p;
            if (obVar3 != null) {
                obVar3.b(qcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !qcVar.f27700s) {
                if (ubVar != null && qcVar.f27698q == null) {
                    qcVar.f27698q = ubVar.createTransition();
                }
                ubVar.transitionRunningEnter = true;
                ubVar.delegate = qcVar.f27697p;
                ubVar.invalidate();
                tb tbVar = qcVar.f27698q;
                Objects.requireNonNull(ubVar);
                tbVar.U(ubVar, new fb(ubVar, 1), new pg(this, 15), new ol(2, this, z10));
                return;
            }
            ob obVar4 = qcVar.f27697p;
            ubVar.delegate = obVar4;
            if (obVar4 != null && !z10) {
                obVar4.c(ubVar.getHeight());
            }
            qcVar.l();
            ubVar.onEnterTransitionStart();
            ubVar.onEnterTransitionEnd();
            if (qcVar.f27702u) {
                qcVar.i(true);
            }
        }
    }
}
