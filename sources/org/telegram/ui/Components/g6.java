package org.telegram.ui.Components;

import android.view.View;
public final class g6 implements ne.h, qe.a {
    public final View f26483a;
    public boolean f26484b;
    public boolean f26485c;
    public int d;
    public int e;

    public g6(View view) {
        this.f26483a = view;
    }

    @Override
    public final void a() {
        if (!this.f26484b) {
            this.f26483a.setVisibility(8);
        }
        this.f26485c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g6) {
            return this.f26483a.equals(((g6) obj).f26483a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26483a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26483a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26483a.hashCode();
    }
}
