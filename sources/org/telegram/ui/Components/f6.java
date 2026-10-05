package org.telegram.ui.Components;

import android.view.View;
public final class f6 implements le.h, oe.a {
    public final View f26346a;
    public boolean f26347b;
    public boolean f26348c;
    public int d;
    public int f26349e;

    public f6(View view) {
        this.f26346a = view;
    }

    @Override
    public final void a() {
        if (!this.f26347b) {
            this.f26346a.setVisibility(8);
        }
        this.f26348c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f6) {
            return this.f26346a.equals(((f6) obj).f26346a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26346a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26346a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26346a.hashCode();
    }
}
