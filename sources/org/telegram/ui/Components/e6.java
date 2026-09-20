package org.telegram.ui.Components;

import android.view.View;
public final class e6 implements le.h, oe.a {
    public final View f23744a;
    public boolean f23745b;
    public boolean f23746c;
    public int d;
    public int e;

    public e6(View view) {
        this.f23744a = view;
    }

    @Override
    public final void a() {
        if (!this.f23745b) {
            this.f23744a.setVisibility(8);
        }
        this.f23746c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e6) {
            return this.f23744a.equals(((e6) obj).f23744a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f23744a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f23744a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f23744a.hashCode();
    }
}
