package org.telegram.ui.Components;

import android.view.View;
public final class v5 implements qe.f, te.a {
    public final View f39008a;
    public boolean f39009b;
    public boolean f39010c;
    public int d;
    public int f39011e;

    public v5(View view) {
        this.f39008a = view;
    }

    @Override
    public final void a() {
        if (!this.f39009b) {
            this.f39008a.setVisibility(8);
        }
        this.f39010c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v5) {
            return this.f39008a.equals(((v5) obj).f39008a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f39008a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f39008a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f39008a.hashCode();
    }
}
