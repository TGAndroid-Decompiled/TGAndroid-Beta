package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class al implements LayoutTransition.TransitionListener {
    public g6 f32115a;
    public int f32116b;
    public final org.telegram.ui.ActionBar.z f32117c;
    public final zn d;

    public al(zn znVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = znVar;
        this.f32117c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f32116b - 1;
        this.f32116b = i11;
        if (i11 == 0 && this.f32115a != null) {
            this.f32117c.getViewTreeObserver().removeOnPreDrawListener(this.f32115a);
            this.f32115a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f32116b == 0 && this.f32115a == null) {
            this.f32115a = new g6(this, 1);
            this.f32117c.getViewTreeObserver().addOnPreDrawListener(this.f32115a);
        }
        this.f32116b++;
    }
}
