package org.telegram.ui.Components;

import android.view.View;
public final class z5 implements td.f, wd.a {
    public final View f35193a;
    public boolean f35194b;
    public boolean f35195c;
    public int d;
    public int f35196e;

    public z5(View view) {
        this.f35193a = view;
    }

    @Override
    public final void a() {
        if (!this.f35194b) {
            this.f35193a.setVisibility(8);
        }
        this.f35195c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z5) {
            return this.f35193a.equals(((z5) obj).f35193a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f35193a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f35193a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f35193a.hashCode();
    }
}
