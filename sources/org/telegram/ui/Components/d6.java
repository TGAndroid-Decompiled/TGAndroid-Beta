package org.telegram.ui.Components;

import android.view.View;
public final class d6 implements le.h, oe.a {
    public final View f23226a;
    public boolean f23227b;
    public boolean f23228c;
    public int d;
    public int e;

    public d6(View view) {
        this.f23226a = view;
    }

    @Override
    public final void a() {
        if (!this.f23227b) {
            this.f23226a.setVisibility(8);
        }
        this.f23228c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d6) {
            return this.f23226a.equals(((d6) obj).f23226a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f23226a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f23226a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f23226a.hashCode();
    }
}
