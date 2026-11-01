package org.telegram.ui.Components;

import android.view.View;
public final class u5 implements fe.i, ie.a {
    public final View f30861a;
    public boolean f30862b;
    public boolean f30863c;
    public int d;
    public int e;

    public u5(View view) {
        this.f30861a = view;
    }

    @Override
    public final void a() {
        if (!this.f30862b) {
            this.f30861a.setVisibility(8);
        }
        this.f30863c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u5) {
            return this.f30861a.equals(((u5) obj).f30861a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f30861a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f30861a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f30861a.hashCode();
    }
}
