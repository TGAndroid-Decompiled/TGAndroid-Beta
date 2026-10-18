package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.qg1;
public final class jb implements View.OnLayoutChangeListener {
    public final boolean f27489a;
    public final qc f27490b;

    public jb(qc qcVar, boolean z10) {
        this.f27490b = qcVar;
        this.f27489a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ob obVar;
        int i18;
        qc qcVar = this.f27490b;
        ub ubVar = qcVar.e;
        ubVar.removeOnLayoutChangeListener(this);
        if (qcVar.f29640l) {
            ubVar.onShow();
            org.telegram.ui.ActionBar.n2 n2Var = qcVar.f29636g;
            boolean z10 = this.f27489a;
            if (z10 && (n2Var instanceof qg1)) {
                n2Var = ((qg1) n2Var).X();
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
            qcVar.f29644p = obVar;
            if (obVar == null && n2Var != null) {
                qcVar.f29644p = new ah.m0(n2Var, 6);
            }
            o1.k kVar = qcVar.d;
            if (kVar == null || !kVar.f17551f) {
                ob obVar2 = qcVar.f29644p;
                if (obVar2 != null) {
                    i18 = obVar2.f(qcVar.f29632a);
                } else {
                    i18 = 0;
                }
                qcVar.f29643o = i18;
            }
            ob obVar3 = qcVar.f29644p;
            if (obVar3 != null) {
                obVar3.b(qcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !qcVar.f29647s) {
                if (ubVar != null && qcVar.f29645q == null) {
                    qcVar.f29645q = ubVar.createTransition();
                }
                ubVar.transitionRunningEnter = true;
                ubVar.delegate = qcVar.f29644p;
                ubVar.invalidate();
                tb tbVar = qcVar.f29645q;
                Objects.requireNonNull(ubVar);
                tbVar.D0(ubVar, new fb(ubVar, 1), new pg(this, 15), new xl(2, this, z10));
                return;
            }
            ob obVar4 = qcVar.f29644p;
            ubVar.delegate = obVar4;
            if (obVar4 != null && !z10) {
                obVar4.c(ubVar.getHeight());
            }
            qcVar.l();
            ubVar.onEnterTransitionStart();
            ubVar.onEnterTransitionEnd();
            if (qcVar.f29649u) {
                qcVar.i(true);
            }
        }
    }
}
