package org.telegram.ui.Components;

import android.view.View;
public final class x5 implements te.f, we.a {
    public final View f40187a;
    public boolean f40188b;
    public boolean f40189c;
    public int d;
    public int f40190e;

    public x5(View view) {
        this.f40187a = view;
    }

    @Override
    public final void a() {
        if (!this.f40188b) {
            this.f40187a.setVisibility(8);
        }
        this.f40189c = false;
    }

    @Override
    public final int b(boolean z9) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x5) {
            return this.f40187a.equals(((x5) obj).f40187a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f40187a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f40187a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f40187a.hashCode();
    }
}
