package org.telegram.ui.Components;

import android.view.View;
public final class u5 implements fe.i, ie.a {
    public final View f30813a;
    public boolean f30814b;
    public boolean f30815c;
    public int d;
    public int e;

    public u5(View view) {
        this.f30813a = view;
    }

    @Override
    public final void a() {
        if (!this.f30814b) {
            this.f30813a.setVisibility(8);
        }
        this.f30815c = false;
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u5) {
            return this.f30813a.equals(((u5) obj).f30813a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f30813a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f30813a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f30813a.hashCode();
    }
}
