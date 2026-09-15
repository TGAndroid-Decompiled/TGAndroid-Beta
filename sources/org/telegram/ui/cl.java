package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class cl implements LayoutTransition.TransitionListener {
    public bl f32821a;
    public int f32822b;
    public final org.telegram.ui.ActionBar.z f32823c;
    public final bo d;

    public cl(bo boVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = boVar;
        this.f32823c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f32822b - 1;
        this.f32822b = i11;
        if (i11 == 0 && this.f32821a != null) {
            this.f32823c.getViewTreeObserver().removeOnPreDrawListener(this.f32821a);
            this.f32821a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f32822b == 0 && this.f32821a == null) {
            this.f32821a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.n2) cl.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f32823c.getViewTreeObserver().addOnPreDrawListener(this.f32821a);
        }
        this.f32822b++;
    }
}
