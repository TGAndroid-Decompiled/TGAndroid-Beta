package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class cl implements LayoutTransition.TransitionListener {
    public bl f32828a;
    public int f32829b;
    public final org.telegram.ui.ActionBar.z f32830c;
    public final bo d;

    public cl(bo boVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = boVar;
        this.f32830c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f32829b - 1;
        this.f32829b = i11;
        if (i11 == 0 && this.f32828a != null) {
            this.f32830c.getViewTreeObserver().removeOnPreDrawListener(this.f32828a);
            this.f32828a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f32829b == 0 && this.f32828a == null) {
            this.f32828a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.n2) cl.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f32830c.getViewTreeObserver().addOnPreDrawListener(this.f32828a);
        }
        this.f32829b++;
    }
}
