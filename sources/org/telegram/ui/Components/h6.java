package org.telegram.ui.Components;

import android.view.View;
public final class h6 implements me.h, pe.a {
    public final View f26949a;
    public boolean f26950b;
    public boolean f26951c;
    public int d;
    public int f26952e;

    public h6(View view) {
        this.f26949a = view;
    }

    @Override
    public final void a() {
        if (!this.f26950b) {
            this.f26949a.setVisibility(8);
        }
        this.f26951c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h6) {
            return this.f26949a.equals(((h6) obj).f26949a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26949a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26949a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26949a.hashCode();
    }
}
