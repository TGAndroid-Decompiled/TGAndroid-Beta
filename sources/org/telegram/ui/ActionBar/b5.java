package org.telegram.ui.ActionBar;

import android.view.View;
public final class b5 implements te.f, we.a {
    public final View f28448a;
    public boolean f28449b;
    public float f28450c = 1.0f;
    public float d = 1.0f;
    public float f28451e = 1.0f;

    public b5(View view) {
        this.f28448a = view;
    }

    @Override
    public final void a() {
        View view = this.f28448a;
        if (!c5.h(view)) {
            if (view instanceof d5) {
                ((d5) view).Y();
            } else {
                view.setVisibility(8);
            }
            c(1.0f, 1.0f);
        }
    }

    @Override
    public final int b(boolean z10) {
        return 0;
    }

    public final void c(float f10, float f11) {
        float f12 = this.f28450c;
        if (f12 == f10 && this.d == f11) {
            return;
        }
        int i7 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
        View view = this.f28448a;
        if (i7 == 0) {
            this.f28451e = view.getAlpha();
        }
        this.f28450c = f10;
        this.d = f11;
        view.setAlpha(this.f28451e * f10);
        float min = Math.min(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10), f11);
        view.setScaleX(min);
        view.setScaleY(min);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b5) && ((b5) obj).f28448a == this.f28448a) {
            return true;
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f28448a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return c5.f(this.f28448a);
    }

    public final int hashCode() {
        return this.f28448a.hashCode();
    }
}
