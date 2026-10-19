package org.telegram.ui.Components;

import android.view.View;
public final class g6 implements ne.h, qe.a {
    public final View f26486a;
    public boolean f26487b;
    public boolean f26488c;
    public int d;
    public int e;

    public g6(View view) {
        this.f26486a = view;
    }

    @Override
    public final void a() {
        if (!this.f26487b) {
            this.f26486a.setVisibility(8);
        }
        this.f26488c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g6) {
            return this.f26486a.equals(((g6) obj).f26486a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26486a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26486a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26486a.hashCode();
    }
}
