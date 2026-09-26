package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.i, oe.a {
    public final View f24146a;
    public boolean f24147b;
    public boolean f24148c;
    public int d;
    public int e;

    public f6(View view) {
        this.f24146a = view;
    }

    @Override
    public final void a() {
        if (!this.f24147b) {
            this.f24146a.setVisibility(8);
        }
        this.f24148c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f24146a.equals(((f6) obj).f24146a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f24146a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f24146a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f24146a.hashCode();
    }
}
