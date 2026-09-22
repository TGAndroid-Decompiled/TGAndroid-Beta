package org.telegram.ui.Components;

import android.view.View;
public final class e6 implements le.h, oe.a {
    public final View f23866a;
    public boolean f23867b;
    public boolean f23868c;
    public int d;
    public int e;

    public e6(View view) {
        this.f23866a = view;
    }

    @Override
    public final void a() {
        if (!this.f23867b) {
            this.f23866a.setVisibility(8);
        }
        this.f23868c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e6) {
            return this.f23866a.equals(((e6) obj).f23866a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f23866a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f23866a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f23866a.hashCode();
    }
}
