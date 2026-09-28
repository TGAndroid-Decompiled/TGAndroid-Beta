package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.i, oe.a {
    public final View f24136a;
    public boolean f24137b;
    public boolean f24138c;
    public int d;
    public int e;

    public f6(View view) {
        this.f24136a = view;
    }

    @Override
    public final void a() {
        if (!this.f24137b) {
            this.f24136a.setVisibility(8);
        }
        this.f24138c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f24136a.equals(((f6) obj).f24136a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f24136a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f24136a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f24136a.hashCode();
    }
}
