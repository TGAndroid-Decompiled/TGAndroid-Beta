package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.h, oe.a {
    public final View f26295a;
    public boolean f26296b;
    public boolean f26297c;
    public int d;
    public int f26298e;

    public f6(View view) {
        this.f26295a = view;
    }

    @Override
    public final void a() {
        if (!this.f26296b) {
            this.f26295a.setVisibility(8);
        }
        this.f26297c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f26295a.equals(((f6) obj).f26295a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26295a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26295a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26295a.hashCode();
    }
}
