package org.telegram.ui.Components;

import android.view.View;
public final class w5 implements te.f, we.a {
    public final View f39881a;
    public boolean f39882b;
    public boolean f39883c;
    public int d;
    public int f39884e;

    public w5(View view) {
        this.f39881a = view;
    }

    @Override
    public final void a() {
        if (!this.f39882b) {
            this.f39881a.setVisibility(8);
        }
        this.f39883c = false;
    }

    @Override
    public final int b(boolean z9) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w5) {
            return this.f39881a.equals(((w5) obj).f39881a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f39881a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f39881a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f39881a.hashCode();
    }
}
