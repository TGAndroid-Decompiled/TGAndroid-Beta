package org.telegram.ui.Components;

import android.view.View;
public final class a6 implements xd.f, ae.a {
    public final View f23299a;
    public boolean f23300b;
    public boolean f23301c;
    public int d;
    public int e;

    public a6(View view) {
        this.f23299a = view;
    }

    @Override
    public final void a() {
        if (!this.f23300b) {
            this.f23299a.setVisibility(8);
        }
        this.f23301c = false;
    }

    @Override
    public final int b(boolean z4) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a6) {
            return this.f23299a.equals(((a6) obj).f23299a);
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f23299a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return this.f23299a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.f23299a.hashCode();
    }
}
