package org.telegram.ui.Components;

import android.view.View;
public final class e6 implements ne.h, qe.a {
    public final View f25971a;
    public boolean f25972b;
    public boolean f25973c;
    public int d;
    public int e;

    public e6(View view) {
        this.f25971a = view;
    }

    @Override
    public final void a() {
        if (!this.f25972b) {
            this.f25971a.setVisibility(8);
        }
        this.f25973c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e6) {
            return this.f25971a.equals(((e6) obj).f25971a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f25971a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f25971a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f25971a.hashCode();
    }
}
