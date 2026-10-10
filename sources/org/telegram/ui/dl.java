package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class dl implements LayoutTransition.TransitionListener {
    public cl f37088a;
    public int f37089b;
    public final org.telegram.ui.ActionBar.z f37090c;
    public final zn d;

    public dl(zn znVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = znVar;
        this.f37090c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f37089b - 1;
        this.f37089b = i11;
        if (i11 == 0 && this.f37088a != null) {
            this.f37090c.getViewTreeObserver().removeOnPreDrawListener(this.f37088a);
            this.f37088a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f37089b == 0 && this.f37088a == null) {
            this.f37088a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.n2) dl.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f37090c.getViewTreeObserver().addOnPreDrawListener(this.f37088a);
        }
        this.f37089b++;
    }
}
