package org.telegram.messenger;

import android.view.View;
public final class zr implements View.OnAttachStateChangeListener {
    public final yr f26967a;
    public final int f26968b;
    public final hs f26969c;

    public zr(hs hsVar, yr yrVar, int i3) {
        this.f26969c = hsVar;
        this.f26967a = yrVar;
        this.f26968b = i3;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        this.f26969c.b(this.f26967a, this.f26968b);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        this.f26969c.n(this.f26967a, this.f26968b);
    }
}
