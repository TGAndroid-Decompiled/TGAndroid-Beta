package org.telegram.ui.ActionBar;

import android.view.View;
public final class d5 implements te.f, we.a {
    public final View f27440a;
    public boolean f27441b;
    public float f27442c = 1.0f;
    public float d = 1.0f;
    public float f27443e = 1.0f;

    public d5(View view) {
        this.f27440a = view;
    }

    @Override
    public final void a() {
        View view = this.f27440a;
        if (!e5.h(view)) {
            if (view instanceof f5) {
                ((f5) view).X();
            } else {
                view.setVisibility(8);
            }
            c(1.0f, 1.0f);
        }
    }

    @Override
    public final int b(boolean z9) {
        return 0;
    }

    public final void c(float f10, float f11) {
        float f12 = this.f27442c;
        if (f12 == f10 && this.d == f11) {
            return;
        }
        int i7 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
        View view = this.f27440a;
        if (i7 == 0) {
            this.f27443e = view.getAlpha();
        }
        this.f27442c = f10;
        this.d = f11;
        view.setAlpha(this.f27443e * f10);
        float min = Math.min(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10), f11);
        view.setScaleX(min);
        view.setScaleY(min);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof d5) && ((d5) obj).f27440a == this.f27440a) {
            return true;
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f27440a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return e5.f(this.f27440a);
    }

    public final int hashCode() {
        return this.f27440a.hashCode();
    }
}
