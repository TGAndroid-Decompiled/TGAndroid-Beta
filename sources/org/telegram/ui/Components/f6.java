package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.i, oe.a {
    public final View f24076a;
    public boolean f24077b;
    public boolean f24078c;
    public int d;
    public int e;

    public f6(View view) {
        this.f24076a = view;
    }

    @Override
    public final void a() {
        if (!this.f24077b) {
            this.f24076a.setVisibility(8);
        }
        this.f24078c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f24076a.equals(((f6) obj).f24076a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f24076a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f24076a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f24076a.hashCode();
    }
}
