package org.telegram.ui;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
public final class bl implements LayoutTransition.TransitionListener {
    public al f32905a;
    public int f32906b;
    public final org.telegram.ui.ActionBar.z f32907c;
    public final zn d;

    public bl(zn znVar, org.telegram.ui.ActionBar.z zVar) {
        this.d = znVar;
        this.f32907c = zVar;
    }

    @Override
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        int i11 = this.f32906b - 1;
        this.f32906b = i11;
        if (i11 == 0 && this.f32905a != null) {
            this.f32907c.getViewTreeObserver().removeOnPreDrawListener(this.f32905a);
            this.f32905a = null;
        }
    }

    @Override
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i10) {
        if (this.f32906b == 0 && this.f32905a == null) {
            this.f32905a = new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    org.telegram.ui.ActionBar.k kVar;
                    kVar = ((org.telegram.ui.ActionBar.p2) bl.this.d).actionBar;
                    kVar.invalidate();
                    return true;
                }
            };
            this.f32907c.getViewTreeObserver().addOnPreDrawListener(this.f32905a);
        }
        this.f32906b++;
    }
}
