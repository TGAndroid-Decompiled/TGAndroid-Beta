package org.telegram.ui.Components;

import android.view.View;
public final class e6 implements vd.g, yd.a {
    public final View f27932a;
    public boolean f27933b;
    public boolean f27934c;
    public int d;
    public int f27935e;

    public e6(View view) {
        this.f27932a = view;
    }

    @Override
    public final void a() {
        if (!this.f27933b) {
            this.f27932a.setVisibility(8);
        }
        this.f27934c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e6) {
            return this.f27932a.equals(((e6) obj).f27932a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f27932a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f27932a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f27932a.hashCode();
    }
}
