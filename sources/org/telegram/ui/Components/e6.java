package org.telegram.ui.Components;

import android.view.View;
public final class e6 implements te.f, we.a {
    public final View f34674a;
    public boolean f34675b;
    public boolean f34676c;
    public int d;
    public int f34677e;

    public e6(View view) {
        this.f34674a = view;
    }

    @Override
    public final void a() {
        if (!this.f34675b) {
            this.f34674a.setVisibility(8);
        }
        this.f34676c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e6) {
            return this.f34674a.equals(((e6) obj).f34674a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f34674a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f34674a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f34674a.hashCode();
    }
}
