package org.telegram.ui.Components;

import android.view.View;
public final class d6 implements te.f, we.a {
    public final View f34216a;
    public boolean f34217b;
    public boolean f34218c;
    public int d;
    public int f34219e;

    public d6(View view) {
        this.f34216a = view;
    }

    @Override
    public final void a() {
        if (!this.f34217b) {
            this.f34216a.setVisibility(8);
        }
        this.f34218c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d6) {
            return this.f34216a.equals(((d6) obj).f34216a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f34216a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f34216a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f34216a.hashCode();
    }
}
