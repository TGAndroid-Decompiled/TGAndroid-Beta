package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class dl implements LayoutTransition.TransitionListener {
    public cl f37077a;
    public int f37078b;
    public final org.telegram.ui.ActionBar.y f37079c;
    public final zn d;

    public dl(zn znVar, org.telegram.ui.ActionBar.y yVar) {
        this.d = znVar;
        this.f37079c = yVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f37078b - 1;
        this.f37078b = i11;
        if (i11 == 0 && this.f37077a != null) {
            this.f37079c.getViewTreeObserver().removeOnPreDrawListener(this.f37077a);
            this.f37077a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f37078b == 0 && this.f37077a == null) {
            this.f37077a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.m2) dl.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f37079c.getViewTreeObserver().addOnPreDrawListener(this.f37077a);
        }
        this.f37078b++;
    }
}
