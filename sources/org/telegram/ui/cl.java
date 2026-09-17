package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class cl implements LayoutTransition.TransitionListener {
    public h6 f32824a;
    public int f32825b;
    public final org.telegram.ui.ActionBar.a0 f32826c;
    public final bo d;

    public cl(bo boVar, org.telegram.ui.ActionBar.a0 a0Var) {
        this.d = boVar;
        this.f32826c = a0Var;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f32825b - 1;
        this.f32825b = i11;
        if (i11 == 0 && this.f32824a != null) {
            this.f32826c.getViewTreeObserver().removeOnPreDrawListener(this.f32824a);
            this.f32824a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f32825b == 0 && this.f32824a == null) {
            this.f32824a = new h6(this, 1);
            this.f32826c.getViewTreeObserver().addOnPreDrawListener(this.f32824a);
        }
        this.f32825b++;
    }
}
