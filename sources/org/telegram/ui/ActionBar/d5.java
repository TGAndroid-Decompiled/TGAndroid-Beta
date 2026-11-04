package org.telegram.ui.ActionBar;

import android.view.View;
public final class d5 implements qe.f, te.a {
    public final View f27460a;
    public boolean f27461b;
    public float f27462c = 1.0f;
    public float d = 1.0f;
    public float f27463e = 1.0f;

    public d5(View view) {
        this.f27460a = view;
    }

    @Override
    public final void a() {
        View view = this.f27460a;
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
    public final int b(boolean z10) {
        return 0;
    }

    public final void c(float f10, float f11) {
        float f12 = this.f27462c;
        if (f12 == f10 && this.d == f11) {
            return;
        }
        int i3 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
        View view = this.f27460a;
        if (i3 == 0) {
            this.f27463e = view.getAlpha();
        }
        this.f27462c = f10;
        this.d = f11;
        view.setAlpha(this.f27463e * f10);
        float min = Math.min(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10), f11);
        view.setScaleX(min);
        view.setScaleY(min);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof d5) && ((d5) obj).f27460a == this.f27460a) {
            return true;
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f27460a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return e5.f(this.f27460a);
    }

    public final int hashCode() {
        return this.f27460a.hashCode();
    }
}
