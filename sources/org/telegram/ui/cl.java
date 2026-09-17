package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class cl implements LayoutTransition.TransitionListener {
    public bl f35168a;
    public int f35169b;
    public final org.telegram.ui.ActionBar.z f35170c;
    public final co d;

    public cl(co coVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = coVar;
        this.f35170c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f35169b - 1;
        this.f35169b = i11;
        if (i11 == 0 && this.f35168a != null) {
            this.f35170c.getViewTreeObserver().removeOnPreDrawListener(this.f35168a);
            this.f35168a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f35169b == 0 && this.f35168a == null) {
            this.f35168a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.n2) cl.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f35170c.getViewTreeObserver().addOnPreDrawListener(this.f35168a);
        }
        this.f35169b++;
    }
}
