package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.h, oe.a {
    public final View f25952a;
    public boolean f25953b;
    public boolean f25954c;
    public int d;
    public int f25955e;

    public f6(View view) {
        this.f25952a = view;
    }

    @Override
    public final void a() {
        if (!this.f25953b) {
            this.f25952a.setVisibility(8);
        }
        this.f25954c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f25952a.equals(((f6) obj).f25952a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f25952a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f25952a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f25952a.hashCode();
    }
}
