package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.i, oe.a {
    public final View f23860a;
    public boolean f23861b;
    public boolean f23862c;
    public int d;
    public int e;

    public f6(View view) {
        this.f23860a = view;
    }

    @Override
    public final void a() {
        if (!this.f23861b) {
            this.f23860a.setVisibility(8);
        }
        this.f23862c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f23860a.equals(((f6) obj).f23860a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f23860a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f23860a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f23860a.hashCode();
    }
}
