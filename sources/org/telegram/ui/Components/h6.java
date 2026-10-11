package org.telegram.ui.Components;

import android.view.View;
public final class h6 implements me.h, pe.a {
    public final View f26911a;
    public boolean f26912b;
    public boolean f26913c;
    public int d;
    public int f26914e;

    public h6(View view) {
        this.f26911a = view;
    }

    @Override
    public final void a() {
        if (!this.f26912b) {
            this.f26911a.setVisibility(8);
        }
        this.f26913c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h6) {
            return this.f26911a.equals(((h6) obj).f26911a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f26911a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f26911a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f26911a.hashCode();
    }
}
