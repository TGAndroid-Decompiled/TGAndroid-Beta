package org.telegram.ui.ActionBar;

import android.view.View;
public final class d5 implements te.f, we.a {
    public final View f27437a;
    public boolean f27438b;
    public float f27439c = 1.0f;
    public float d = 1.0f;
    public float f27440e = 1.0f;

    public d5(View view) {
        this.f27437a = view;
    }

    @Override
    public final void a() {
        View view = this.f27437a;
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
        float f12 = this.f27439c;
        if (f12 == f10 && this.d == f11) {
            return;
        }
        int i7 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
        View view = this.f27437a;
        if (i7 == 0) {
            this.f27440e = view.getAlpha();
        }
        this.f27439c = f10;
        this.d = f11;
        view.setAlpha(this.f27440e * f10);
        float min = Math.min(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10), f11);
        view.setScaleX(min);
        view.setScaleY(min);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof d5) && ((d5) obj).f27437a == this.f27437a) {
            return true;
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f27437a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return e5.f(this.f27437a);
    }

    public final int hashCode() {
        return this.f27437a.hashCode();
    }
}
