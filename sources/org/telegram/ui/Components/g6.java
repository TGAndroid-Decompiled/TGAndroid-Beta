package org.telegram.ui.Components;

import android.view.View;
public final class g6 implements ne.h, qe.a {
    public final View f26547a;
    public boolean f26548b;
    public boolean f26549c;
    public int d;
    public int e;

    public g6(View view) {
        this.f26547a = view;
    }

    @Override
    public final void a() {
        if (!this.f26548b) {
            this.f26547a.setVisibility(8);
        }
        this.f26549c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g6) {
            return this.f26547a.equals(((g6) obj).f26547a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26547a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26547a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26547a.hashCode();
    }
}
