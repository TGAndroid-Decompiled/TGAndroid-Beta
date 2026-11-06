package org.telegram.ui.Components;

import android.view.View;
public final class x5 implements te.f, we.a {
    public final View f40153a;
    public boolean f40154b;
    public boolean f40155c;
    public int d;
    public int f40156e;

    public x5(View view) {
        this.f40153a = view;
    }

    @Override
    public final void a() {
        if (!this.f40154b) {
            this.f40153a.setVisibility(8);
        }
        this.f40155c = false;
    }

    @Override
    public final int b(boolean z9) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x5) {
            return this.f40153a.equals(((x5) obj).f40153a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f40153a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f40153a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f40153a.hashCode();
    }
}
