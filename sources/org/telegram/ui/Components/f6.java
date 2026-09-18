package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.h, oe.a {
    public final View f24024a;
    public boolean f24025b;
    public boolean f24026c;
    public int d;
    public int e;

    public f6(View view) {
        this.f24024a = view;
    }

    @Override
    public final void a() {
        if (!this.f24025b) {
            this.f24024a.setVisibility(8);
        }
        this.f24026c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f24024a.equals(((f6) obj).f24024a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f24024a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f24024a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f24024a.hashCode();
    }
}
