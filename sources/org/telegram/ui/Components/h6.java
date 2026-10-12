package org.telegram.ui.Components;

import android.view.View;
public final class h6 implements me.h, pe.a {
    public final View f26657a;
    public boolean f26658b;
    public boolean f26659c;
    public int d;
    public int f26660e;

    public h6(View view) {
        this.f26657a = view;
    }

    @Override
    public final void a() {
        if (!this.f26658b) {
            this.f26657a.setVisibility(8);
        }
        this.f26659c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h6) {
            return this.f26657a.equals(((h6) obj).f26657a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26657a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26657a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26657a.hashCode();
    }
}
