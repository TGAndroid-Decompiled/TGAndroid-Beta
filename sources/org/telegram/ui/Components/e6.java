package org.telegram.ui.Components;

import android.view.View;
public final class e6 implements le.h, oe.a {
    public final View f22565a;
    public boolean f22566b;
    public boolean f22567c;
    public int d;
    public int e;

    public e6(View view) {
        this.f22565a = view;
    }

    @Override
    public final void a() {
        if (!this.f22566b) {
            this.f22565a.setVisibility(8);
        }
        this.f22567c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e6) {
            return this.f22565a.equals(((e6) obj).f22565a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f22565a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f22565a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f22565a.hashCode();
    }
}
