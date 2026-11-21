package org.telegram.ui.Components;

import android.view.View;
public final class e6 implements te.f, we.a {
    public final View f34686a;
    public boolean f34687b;
    public boolean f34688c;
    public int d;
    public int f34689e;

    public e6(View view) {
        this.f34686a = view;
    }

    @Override
    public final void a() {
        if (!this.f34687b) {
            this.f34686a.setVisibility(8);
        }
        this.f34688c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e6) {
            return this.f34686a.equals(((e6) obj).f34686a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f34686a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f34686a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f34686a.hashCode();
    }
}
