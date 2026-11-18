package org.telegram.ui.Components;

import android.view.View;
public final class d6 implements te.f, we.a {
    public final View f34281a;
    public boolean f34282b;
    public boolean f34283c;
    public int d;
    public int f34284e;

    public d6(View view) {
        this.f34281a = view;
    }

    @Override
    public final void a() {
        if (!this.f34282b) {
            this.f34281a.setVisibility(8);
        }
        this.f34283c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d6) {
            return this.f34281a.equals(((d6) obj).f34281a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f34281a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f34281a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f34281a.hashCode();
    }
}
