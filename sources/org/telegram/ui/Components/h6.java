package org.telegram.ui.Components;

import android.view.View;
public final class h6 implements me.h, pe.a {
    public final View f26972a;
    public boolean f26973b;
    public boolean f26974c;
    public int d;
    public int f26975e;

    public h6(View view) {
        this.f26972a = view;
    }

    @Override
    public final void a() {
        if (!this.f26973b) {
            this.f26972a.setVisibility(8);
        }
        this.f26974c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h6) {
            return this.f26972a.equals(((h6) obj).f26972a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26972a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26972a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26972a.hashCode();
    }
}
