package org.telegram.ui.Components;

import android.view.View;
public final class d6 implements le.h, oe.a {
    public final View f23225a;
    public boolean f23226b;
    public boolean f23227c;
    public int d;
    public int e;

    public d6(View view) {
        this.f23225a = view;
    }

    @Override
    public final void a() {
        if (!this.f23226b) {
            this.f23225a.setVisibility(8);
        }
        this.f23227c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d6) {
            return this.f23225a.equals(((d6) obj).f23225a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f23225a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f23225a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f23225a.hashCode();
    }
}
