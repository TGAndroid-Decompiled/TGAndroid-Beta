package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class el implements LayoutTransition.TransitionListener {
    public dl f32240a;
    public int f32241b;
    public final org.telegram.ui.ActionBar.z f32242c;
    public final eo d;

    public el(eo eoVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = eoVar;
        this.f32242c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f32241b - 1;
        this.f32241b = i11;
        if (i11 == 0 && this.f32240a != null) {
            this.f32242c.getViewTreeObserver().removeOnPreDrawListener(this.f32240a);
            this.f32240a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f32241b == 0 && this.f32240a == null) {
            this.f32240a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.l lVar;
                    lVar = ((org.telegram.ui.ActionBar.p2) el.this.d).actionBar;
                    lVar.invalidate();
                    return true;
                }
            };
            this.f32242c.getViewTreeObserver().addOnPreDrawListener(this.f32240a);
        }
        this.f32241b++;
    }
}
