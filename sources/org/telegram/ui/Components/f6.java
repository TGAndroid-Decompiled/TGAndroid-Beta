package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.i, oe.a {
    public final View f24137a;
    public boolean f24138b;
    public boolean f24139c;
    public int d;
    public int e;

    public f6(View view) {
        this.f24137a = view;
    }

    @Override
    public final void a() {
        if (!this.f24138b) {
            this.f24137a.setVisibility(8);
        }
        this.f24139c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f24137a.equals(((f6) obj).f24137a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f24137a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f24137a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f24137a.hashCode();
    }
}
