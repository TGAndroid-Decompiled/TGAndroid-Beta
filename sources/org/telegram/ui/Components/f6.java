package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.h, oe.a {
    public final View f25926a;
    public boolean f25927b;
    public boolean f25928c;
    public int d;
    public int f25929e;

    public f6(View view) {
        this.f25926a = view;
    }

    @Override
    public final void a() {
        if (!this.f25927b) {
            this.f25926a.setVisibility(8);
        }
        this.f25928c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f25926a.equals(((f6) obj).f25926a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f25926a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f25926a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f25926a.hashCode();
    }
}
