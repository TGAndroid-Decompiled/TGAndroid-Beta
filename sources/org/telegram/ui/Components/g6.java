package org.telegram.ui.Components;

import android.view.View;
public final class g6 implements ne.h, qe.a {
    public final View f26516a;
    public boolean f26517b;
    public boolean f26518c;
    public int d;
    public int e;

    public g6(View view) {
        this.f26516a = view;
    }

    @Override
    public final void a() {
        if (!this.f26517b) {
            this.f26516a.setVisibility(8);
        }
        this.f26518c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g6) {
            return this.f26516a.equals(((g6) obj).f26516a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26516a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26516a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26516a.hashCode();
    }
}
