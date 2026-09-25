package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.i, oe.a {
    public final View f24083a;
    public boolean f24084b;
    public boolean f24085c;
    public int d;
    public int e;

    public f6(View view) {
        this.f24083a = view;
    }

    @Override
    public final void a() {
        if (!this.f24084b) {
            this.f24083a.setVisibility(8);
        }
        this.f24085c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f24083a.equals(((f6) obj).f24083a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f24083a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f24083a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f24083a.hashCode();
    }
}
