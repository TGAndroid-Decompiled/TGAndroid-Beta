package org.telegram.ui.Components;

import android.view.View;
public final class i6 implements oe.h, re.a {
    public final View f29197a;
    public boolean f29198b;
    public boolean f29199c;
    public int d;
    public int e;

    public i6(View view) {
        this.f29197a = view;
    }

    @Override
    public final void a() {
        if (!this.f29198b) {
            this.f29197a.setVisibility(8);
        }
        this.f29199c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i6) {
            return this.f29197a.equals(((i6) obj).f29197a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f29197a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f29197a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f29197a.hashCode();
    }
}
