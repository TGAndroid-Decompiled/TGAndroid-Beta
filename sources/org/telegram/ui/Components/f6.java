package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.i, oe.a {
    public final View f24187a;
    public boolean f24188b;
    public boolean f24189c;
    public int d;
    public int e;

    public f6(View view) {
        this.f24187a = view;
    }

    @Override
    public final void a() {
        if (!this.f24188b) {
            this.f24187a.setVisibility(8);
        }
        this.f24189c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f24187a.equals(((f6) obj).f24187a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f24187a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f24187a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f24187a.hashCode();
    }
}
