package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.i, oe.a {
    public final View f24082a;
    public boolean f24083b;
    public boolean f24084c;
    public int d;
    public int e;

    public f6(View view) {
        this.f24082a = view;
    }

    @Override
    public final void a() {
        if (!this.f24083b) {
            this.f24082a.setVisibility(8);
        }
        this.f24084c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f24082a.equals(((f6) obj).f24082a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f24082a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f24082a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f24082a.hashCode();
    }
}
