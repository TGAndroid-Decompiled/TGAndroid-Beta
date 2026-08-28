package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class qk implements LayoutTransition.TransitionListener {
    public pk f41814a;
    public int f41815b;
    public final org.telegram.ui.ActionBar.z f41816c;
    public final qn d;

    public qk(qn qnVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = qnVar;
        this.f41816c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i9) {
        int i10 = this.f41815b - 1;
        this.f41815b = i10;
        if (i10 == 0 && this.f41814a != null) {
            this.f41816c.getViewTreeObserver().removeOnPreDrawListener(this.f41814a);
            this.f41814a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i9) {
        if (this.f41815b == 0 && this.f41814a == null) {
            this.f41814a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.o2) qk.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f41816c.getViewTreeObserver().addOnPreDrawListener(this.f41814a);
        }
        this.f41815b++;
    }
}
