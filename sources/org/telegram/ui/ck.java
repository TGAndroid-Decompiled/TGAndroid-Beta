package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class ck implements LayoutTransition.TransitionListener {
    public bk f44378a;
    public int f44379b;
    public final org.telegram.ui.ActionBar.x f44380c;
    public final wm d;

    public ck(wm wmVar, org.telegram.ui.ActionBar.x xVar) {
        this.d = wmVar;
        this.f44380c = xVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i3) {
        int i10 = this.f44379b - 1;
        this.f44379b = i10;
        if (i10 == 0 && this.f44378a != null) {
            this.f44380c.getViewTreeObserver().removeOnPreDrawListener(this.f44378a);
            this.f44378a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i3) {
        if (this.f44379b == 0 && this.f44378a == null) {
            this.f44378a = new bk(this, 0);
            this.f44380c.getViewTreeObserver().addOnPreDrawListener(this.f44378a);
        }
        this.f44379b++;
    }
}
