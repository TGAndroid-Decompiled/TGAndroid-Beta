package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class al implements LayoutTransition.TransitionListener {
    public g6 f32091a;
    public int f32092b;
    public final org.telegram.ui.ActionBar.z f32093c;
    public final zn d;

    public al(zn znVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = znVar;
        this.f32093c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f32092b - 1;
        this.f32092b = i11;
        if (i11 == 0 && this.f32091a != null) {
            this.f32093c.getViewTreeObserver().removeOnPreDrawListener(this.f32091a);
            this.f32091a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f32092b == 0 && this.f32091a == null) {
            this.f32091a = new g6(this, 1);
            this.f32093c.getViewTreeObserver().addOnPreDrawListener(this.f32091a);
        }
        this.f32092b++;
    }
}
