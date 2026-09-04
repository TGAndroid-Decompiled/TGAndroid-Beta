package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class cl implements LayoutTransition.TransitionListener {
    public bl f35167a;
    public int f35168b;
    public final org.telegram.ui.ActionBar.z f35169c;
    public final co d;

    public cl(co coVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = coVar;
        this.f35169c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f35168b - 1;
        this.f35168b = i11;
        if (i11 == 0 && this.f35167a != null) {
            this.f35169c.getViewTreeObserver().removeOnPreDrawListener(this.f35167a);
            this.f35167a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f35168b == 0 && this.f35167a == null) {
            this.f35167a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.n2) cl.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f35169c.getViewTreeObserver().addOnPreDrawListener(this.f35167a);
        }
        this.f35168b++;
    }
}
