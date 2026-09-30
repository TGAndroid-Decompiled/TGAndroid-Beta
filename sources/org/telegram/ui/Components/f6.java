package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.i, oe.a {
    public final View f24126a;
    public boolean f24127b;
    public boolean f24128c;
    public int d;
    public int e;

    public f6(View view) {
        this.f24126a = view;
    }

    @Override
    public final void a() {
        if (!this.f24127b) {
            this.f24126a.setVisibility(8);
        }
        this.f24128c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f24126a.equals(((f6) obj).f24126a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f24126a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f24126a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f24126a.hashCode();
    }
}
