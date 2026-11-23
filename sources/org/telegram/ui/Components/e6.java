package org.telegram.ui.Components;

import android.view.View;
public final class e6 implements te.f, we.a {
    public final View f34684a;
    public boolean f34685b;
    public boolean f34686c;
    public int d;
    public int f34687e;

    public e6(View view) {
        this.f34684a = view;
    }

    @Override
    public final void a() {
        if (!this.f34685b) {
            this.f34684a.setVisibility(8);
        }
        this.f34686c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e6) {
            return this.f34684a.equals(((e6) obj).f34684a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f34684a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f34684a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f34684a.hashCode();
    }
}
