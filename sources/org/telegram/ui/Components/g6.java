package org.telegram.ui.Components;

import android.view.View;
public final class g6 implements ne.h, qe.a {
    public final View f26515a;
    public boolean f26516b;
    public boolean f26517c;
    public int d;
    public int e;

    public g6(View view) {
        this.f26515a = view;
    }

    @Override
    public final void a() {
        if (!this.f26516b) {
            this.f26515a.setVisibility(8);
        }
        this.f26517c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g6) {
            return this.f26515a.equals(((g6) obj).f26515a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26515a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26515a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26515a.hashCode();
    }
}
