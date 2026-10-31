package org.telegram.ui.ActionBar;

import android.view.View;
public final class n5 implements fe.i, ie.a {
    public final View f20612a;
    public boolean f20613b;
    public float f20614c = 1.0f;
    public float d = 1.0f;
    public float e = 1.0f;

    public n5(View view) {
        this.f20612a = view;
    }

    @Override
    public final void a() {
        View view = this.f20612a;
        if (!o5.h(view)) {
            if (view instanceof p5) {
                ((p5) view).X();
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

    public final void c(float f7, float f10) {
        float f11 = this.f20614c;
        if (f11 == f7 && this.d == f10) {
            return;
        }
        int i10 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
        View view = this.f20612a;
        if (i10 == 0) {
            this.e = view.getAlpha();
        }
        this.f20614c = f7;
        this.d = f10;
        view.setAlpha(this.e * f7);
        float min = Math.min(org.telegram.messenger.i0.T1(0.6f, 1.0f, f7), f10);
        view.setScaleX(min);
        view.setScaleY(min);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof n5) && ((n5) obj).f20612a == this.f20612a) {
            return true;
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f20612a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return o5.f(this.f20612a);
    }

    public final int hashCode() {
        return this.f20612a.hashCode();
    }
}
