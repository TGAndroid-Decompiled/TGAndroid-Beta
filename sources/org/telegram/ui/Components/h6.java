package org.telegram.ui.Components;

import android.view.View;
public final class h6 implements ne.h, qe.a {
    public final View f25182a;
    public boolean f25183b;
    public boolean f25184c;
    public int d;
    public int e;

    public h6(View view) {
        this.f25182a = view;
    }

    @Override
    public final void a() {
        if (!this.f25183b) {
            this.f25182a.setVisibility(8);
        }
        this.f25184c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h6) {
            return this.f25182a.equals(((h6) obj).f25182a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f25182a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f25182a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f25182a.hashCode();
    }
}
