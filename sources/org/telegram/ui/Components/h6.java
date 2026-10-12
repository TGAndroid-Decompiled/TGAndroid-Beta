package org.telegram.ui.Components;

import android.view.View;
public final class h6 implements ne.h, qe.a {
    public final View f25513a;
    public boolean f25514b;
    public boolean f25515c;
    public int d;
    public int e;

    public h6(View view) {
        this.f25513a = view;
    }

    @Override
    public final void a() {
        if (!this.f25514b) {
            this.f25513a.setVisibility(8);
        }
        this.f25515c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h6) {
            return this.f25513a.equals(((h6) obj).f25513a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f25513a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f25513a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f25513a.hashCode();
    }
}
