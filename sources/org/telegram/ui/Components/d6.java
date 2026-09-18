package org.telegram.ui.Components;

import android.view.View;
public final class d6 implements le.h, oe.a {
    public final View f23216a;
    public boolean f23217b;
    public boolean f23218c;
    public int d;
    public int e;

    public d6(View view) {
        this.f23216a = view;
    }

    @Override
    public final void a() {
        if (!this.f23217b) {
            this.f23216a.setVisibility(8);
        }
        this.f23218c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d6) {
            return this.f23216a.equals(((d6) obj).f23216a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f23216a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f23216a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f23216a.hashCode();
    }
}
