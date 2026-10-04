package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.h, oe.a {
    public final View f26290a;
    public boolean f26291b;
    public boolean f26292c;
    public int d;
    public int f26293e;

    public f6(View view) {
        this.f26290a = view;
    }

    @Override
    public final void a() {
        if (!this.f26291b) {
            this.f26290a.setVisibility(8);
        }
        this.f26292c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f26290a.equals(((f6) obj).f26290a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26290a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26290a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26290a.hashCode();
    }
}
