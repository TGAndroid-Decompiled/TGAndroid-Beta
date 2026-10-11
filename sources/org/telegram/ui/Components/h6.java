package org.telegram.ui.Components;

import android.view.View;
public final class h6 implements me.h, pe.a {
    public final View f26978a;
    public boolean f26979b;
    public boolean f26980c;
    public int d;
    public int f26981e;

    public h6(View view) {
        this.f26978a = view;
    }

    @Override
    public final void a() {
        if (!this.f26979b) {
            this.f26978a.setVisibility(8);
        }
        this.f26980c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h6) {
            return this.f26978a.equals(((h6) obj).f26978a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26978a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26978a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26978a.hashCode();
    }
}
