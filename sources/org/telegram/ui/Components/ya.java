package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.sg1;

public final class ya implements View.OnLayoutChangeListener {

    public final boolean f34872a;

    public final ec f34873b;

    public ya(ec ecVar, boolean z10) {
        this.f34873b = ecVar;
        this.f34872a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        db bulletinDelegate;
        ec ecVar = this.f34873b;
        jb jbVar = ecVar.f28016e;
        jbVar.removeOnLayoutChangeListener(this);
        if (ecVar.f28022l) {
            jbVar.onShow();
            org.telegram.ui.ActionBar.n2 n2VarX = ecVar.f28018g;
            boolean z10 = this.f34872a;
            if (z10 && (n2VarX instanceof sg1)) {
                n2VarX = ((sg1) n2VarX).X();
            }
            FrameLayout frameLayout = ecVar.h;
            if (n2VarX == null || (bulletinDelegate = n2VarX.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof db) {
                        bulletinDelegate = (db) tag;
                    } else {
                        bulletinDelegate = null;
                    }
                } else {
                    bulletinDelegate = null;
                }
            }
            ecVar.f28026p = bulletinDelegate;
            if (bulletinDelegate == null && n2VarX != null) {
                ecVar.f28026p = new gh.w0(n2VarX, 7);
            }
            o1.j jVar = ecVar.d;
            if (jVar == null || !jVar.f19141f) {
                db dbVar = ecVar.f28026p;
                ecVar.f28025o = dbVar != null ? dbVar.f(ecVar.f28013a) : 0;
            }
            db dbVar2 = ecVar.f28026p;
            if (dbVar2 != null) {
                dbVar2.b(ecVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !ecVar.f28029s) {
                if (jbVar != null && ecVar.f28027q == null) {
                    ecVar.f28027q = jbVar.createTransition();
                }
                jbVar.transitionRunningEnter = true;
                jbVar.delegate = ecVar.f28026p;
                jbVar.invalidate();
                ib ibVar = ecVar.f28027q;
                Objects.requireNonNull(jbVar);
                ibVar.g(jbVar, new ua(jbVar, 1), new bg(this, 15), new zk(2, this, z10));
                return;
            }
            db dbVar3 = ecVar.f28026p;
            jbVar.delegate = dbVar3;
            if (dbVar3 != null && !z10) {
                dbVar3.c(jbVar.getHeight());
            }
            ecVar.l();
            jbVar.onEnterTransitionStart();
            jbVar.onEnterTransitionEnd();
            if (ecVar.f28031u) {
                ecVar.i(true);
            }
        }
    }
}
