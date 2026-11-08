package org.telegram.ui.Components;

import android.view.View;
public final class x5 implements te.f, we.a {
    public final View f40208a;
    public boolean f40209b;
    public boolean f40210c;
    public int d;
    public int f40211e;

    public x5(View view) {
        this.f40208a = view;
    }

    @Override
    public final void a() {
        if (!this.f40209b) {
            this.f40208a.setVisibility(8);
        }
        this.f40210c = false;
    }

    @Override
    public final int b(boolean z9) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x5) {
            return this.f40208a.equals(((x5) obj).f40208a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f40208a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f40208a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f40208a.hashCode();
    }
}
