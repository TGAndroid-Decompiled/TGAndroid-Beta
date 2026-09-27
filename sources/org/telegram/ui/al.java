package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class al implements LayoutTransition.TransitionListener {
    public i6 f32094a;
    public int f32095b;
    public final org.telegram.ui.ActionBar.a0 f32096c;
    public final xn d;

    public al(xn xnVar, org.telegram.ui.ActionBar.a0 a0Var) {
        this.d = xnVar;
        this.f32096c = a0Var;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f32095b - 1;
        this.f32095b = i11;
        if (i11 == 0 && this.f32094a != null) {
            this.f32096c.getViewTreeObserver().removeOnPreDrawListener(this.f32094a);
            this.f32094a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f32095b == 0 && this.f32094a == null) {
            this.f32094a = new i6(this, 1);
            this.f32096c.getViewTreeObserver().addOnPreDrawListener(this.f32094a);
        }
        this.f32095b++;
    }
}
