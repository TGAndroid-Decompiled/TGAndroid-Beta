package org.telegram.ui.Components;

import android.view.View;
public final class i6 implements oe.h, re.a {
    public final View f29223a;
    public boolean f29224b;
    public boolean f29225c;
    public int d;
    public int e;

    public i6(View view) {
        this.f29223a = view;
    }

    @Override
    public final void a() {
        if (!this.f29224b) {
            this.f29223a.setVisibility(8);
        }
        this.f29225c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i6) {
            return this.f29223a.equals(((i6) obj).f29223a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f29223a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f29223a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f29223a.hashCode();
    }
}
