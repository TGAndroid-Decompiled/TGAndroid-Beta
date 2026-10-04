package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.h, oe.a {
    public final View f26289a;
    public boolean f26290b;
    public boolean f26291c;
    public int d;
    public int f26292e;

    public f6(View view) {
        this.f26289a = view;
    }

    @Override
    public final void a() {
        if (!this.f26290b) {
            this.f26289a.setVisibility(8);
        }
        this.f26291c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f26289a.equals(((f6) obj).f26289a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26289a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26289a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26289a.hashCode();
    }
}
