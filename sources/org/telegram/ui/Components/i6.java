package org.telegram.ui.Components;

import android.view.View;
public final class i6 implements oe.h, re.a {
    public final View f29195a;
    public boolean f29196b;
    public boolean f29197c;
    public int d;
    public int e;

    public i6(View view) {
        this.f29195a = view;
    }

    @Override
    public final void a() {
        if (!this.f29196b) {
            this.f29195a.setVisibility(8);
        }
        this.f29197c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i6) {
            return this.f29195a.equals(((i6) obj).f29195a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f29195a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f29195a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f29195a.hashCode();
    }
}
