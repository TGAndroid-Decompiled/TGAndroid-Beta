package org.telegram.ui.Components;

import android.view.View;
public final class a6 implements xd.f, ae.a {
    public final View f23323a;
    public boolean f23324b;
    public boolean f23325c;
    public int d;
    public int e;

    public a6(View view) {
        this.f23323a = view;
    }

    @Override
    public final void a() {
        if (!this.f23324b) {
            this.f23323a.setVisibility(8);
        }
        this.f23325c = false;
    }

    @Override
    public final int b(boolean z4) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a6) {
            return this.f23323a.equals(((a6) obj).f23323a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f23323a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f23323a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f23323a.hashCode();
    }
}
