package org.telegram.ui.Components;

import android.view.View;
public final class g6 implements ne.h, qe.a {
    public final View f26488a;
    public boolean f26489b;
    public boolean f26490c;
    public int d;
    public int e;

    public g6(View view) {
        this.f26488a = view;
    }

    @Override
    public final void a() {
        if (!this.f26489b) {
            this.f26488a.setVisibility(8);
        }
        this.f26490c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g6) {
            return this.f26488a.equals(((g6) obj).f26488a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26488a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26488a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26488a.hashCode();
    }
}
