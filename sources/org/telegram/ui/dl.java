package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class dl implements LayoutTransition.TransitionListener {
    public cl f37042a;
    public int f37043b;
    public final org.telegram.ui.ActionBar.z f37044c;
    public final zn d;

    public dl(zn znVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = znVar;
        this.f37044c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f37043b - 1;
        this.f37043b = i11;
        if (i11 == 0 && this.f37042a != null) {
            this.f37044c.getViewTreeObserver().removeOnPreDrawListener(this.f37042a);
            this.f37042a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f37043b == 0 && this.f37042a == null) {
            this.f37042a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.n2) dl.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f37044c.getViewTreeObserver().addOnPreDrawListener(this.f37042a);
        }
        this.f37043b++;
    }
}
