package org.telegram.ui.Components;

import android.view.View;
public final class g6 implements ne.h, qe.a {
    public final View f26512a;
    public boolean f26513b;
    public boolean f26514c;
    public int d;
    public int e;

    public g6(View view) {
        this.f26512a = view;
    }

    @Override
    public final void a() {
        if (!this.f26513b) {
            this.f26512a.setVisibility(8);
        }
        this.f26514c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g6) {
            return this.f26512a.equals(((g6) obj).f26512a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26512a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26512a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26512a.hashCode();
    }
}
