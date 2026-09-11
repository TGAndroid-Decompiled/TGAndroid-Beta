package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.h, oe.a {
    public final View f25925a;
    public boolean f25926b;
    public boolean f25927c;
    public int d;
    public int f25928e;

    public f6(View view) {
        this.f25925a = view;
    }

    @Override
    public final void a() {
        if (!this.f25926b) {
            this.f25925a.setVisibility(8);
        }
        this.f25927c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f25925a.equals(((f6) obj).f25925a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f25925a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f25925a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f25925a.hashCode();
    }
}
