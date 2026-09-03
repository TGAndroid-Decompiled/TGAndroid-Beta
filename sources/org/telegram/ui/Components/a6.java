package org.telegram.ui.Components;

import android.view.View;
public final class a6 implements xd.f, ae.a {
    public final View f25165a;
    public boolean f25166b;
    public boolean f25167c;
    public int d;
    public int f25168e;

    public a6(View view) {
        this.f25165a = view;
    }

    @Override
    public final void a() {
        if (!this.f25166b) {
            this.f25165a.setVisibility(8);
        }
        this.f25167c = false;
    }

    @Override
    public final int b(boolean z4) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a6) {
            return this.f25165a.equals(((a6) obj).f25165a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f25165a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f25165a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f25165a.hashCode();
    }
}
