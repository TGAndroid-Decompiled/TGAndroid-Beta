package org.telegram.ui.Components;

import android.view.View;
public final class d6 implements le.h, oe.a {
    public final View f23213a;
    public boolean f23214b;
    public boolean f23215c;
    public int d;
    public int e;

    public d6(View view) {
        this.f23213a = view;
    }

    @Override
    public final void a() {
        if (!this.f23214b) {
            this.f23213a.setVisibility(8);
        }
        this.f23215c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d6) {
            return this.f23213a.equals(((d6) obj).f23213a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f23213a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f23213a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f23213a.hashCode();
    }
}
