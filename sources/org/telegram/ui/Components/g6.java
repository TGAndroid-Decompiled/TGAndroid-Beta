package org.telegram.ui.Components;

import android.view.View;
public final class g6 implements ne.h, qe.a {
    public final View f26490a;
    public boolean f26491b;
    public boolean f26492c;
    public int d;
    public int e;

    public g6(View view) {
        this.f26490a = view;
    }

    @Override
    public final void a() {
        if (!this.f26491b) {
            this.f26490a.setVisibility(8);
        }
        this.f26492c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g6) {
            return this.f26490a.equals(((g6) obj).f26490a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26490a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26490a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26490a.hashCode();
    }
}
