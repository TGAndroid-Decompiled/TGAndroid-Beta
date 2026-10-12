package org.telegram.ui.Components;

import android.view.View;
public final class h6 implements me.h, pe.a {
    public final View f26661a;
    public boolean f26662b;
    public boolean f26663c;
    public int d;
    public int f26664e;

    public h6(View view) {
        this.f26661a = view;
    }

    @Override
    public final void a() {
        if (!this.f26662b) {
            this.f26661a.setVisibility(8);
        }
        this.f26663c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h6) {
            return this.f26661a.equals(((h6) obj).f26661a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26661a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26661a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26661a.hashCode();
    }
}
