package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class dl implements LayoutTransition.TransitionListener {
    public cl f37044a;
    public int f37045b;
    public final org.telegram.ui.ActionBar.z f37046c;
    public final zn d;

    public dl(zn znVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = znVar;
        this.f37046c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f37045b - 1;
        this.f37045b = i11;
        if (i11 == 0 && this.f37044a != null) {
            this.f37046c.getViewTreeObserver().removeOnPreDrawListener(this.f37044a);
            this.f37044a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f37045b == 0 && this.f37044a == null) {
            this.f37044a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.n2) dl.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f37046c.getViewTreeObserver().addOnPreDrawListener(this.f37044a);
        }
        this.f37045b++;
    }
}
