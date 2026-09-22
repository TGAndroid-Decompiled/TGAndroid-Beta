package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class bl implements LayoutTransition.TransitionListener {
    public g6 f32500a;
    public int f32501b;
    public final org.telegram.ui.ActionBar.z f32502c;
    public final zn d;

    public bl(zn znVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = znVar;
        this.f32502c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f32501b - 1;
        this.f32501b = i11;
        if (i11 == 0 && this.f32500a != null) {
            this.f32502c.getViewTreeObserver().removeOnPreDrawListener(this.f32500a);
            this.f32500a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f32501b == 0 && this.f32500a == null) {
            this.f32500a = new g6(this, 1);
            this.f32502c.getViewTreeObserver().addOnPreDrawListener(this.f32500a);
        }
        this.f32501b++;
    }
}
