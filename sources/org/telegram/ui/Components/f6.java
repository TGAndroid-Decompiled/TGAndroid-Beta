package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.i, oe.a {
    public final View f24177a;
    public boolean f24178b;
    public boolean f24179c;
    public int d;
    public int e;

    public f6(View view) {
        this.f24177a = view;
    }

    @Override
    public final void a() {
        if (!this.f24178b) {
            this.f24177a.setVisibility(8);
        }
        this.f24179c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f24177a.equals(((f6) obj).f24177a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f24177a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f24177a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f24177a.hashCode();
    }
}
