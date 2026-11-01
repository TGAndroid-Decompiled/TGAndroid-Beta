package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
public final class cl implements LayoutTransition.TransitionListener {
    public bl f36343a;
    public int f36344b;
    public final org.telegram.ui.ActionBar.y f36345c;
    public final un d;

    public cl(un unVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = unVar;
        this.f36345c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f36344b - 1;
        this.f36344b = i11;
        if (i11 == 0 && this.f36343a != null) {
            this.f36345c.getViewTreeObserver().removeOnPreDrawListener(this.f36343a);
            this.f36343a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f36344b == 0 && this.f36343a == null) {
            this.f36343a = new bl(this, 0);
            this.f36345c.getViewTreeObserver().addOnPreDrawListener(this.f36343a);
        }
        this.f36344b++;
    }
}
