package org.telegram.ui.ActionBar;

import android.view.View;
public final class e5 implements te.f, we.a {
    public final View f28976a;
    public boolean f28977b;
    public float f28978c = 1.0f;
    public float d = 1.0f;
    public float f28979e = 1.0f;

    public e5(View view) {
        this.f28976a = view;
    }

    @Override
    public final void a() {
        View view = this.f28976a;
        if (!f5.h(view)) {
            if (view instanceof g5) {
                ((g5) view).Y();
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
        float f12 = this.f28978c;
        if (f12 == f10 && this.d == f11) {
            return;
        }
        int i7 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
        View view = this.f28976a;
        if (i7 == 0) {
            this.f28979e = view.getAlpha();
        }
        this.f28978c = f10;
        this.d = f11;
        view.setAlpha(this.f28979e * f10);
        float min = Math.min(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10), f11);
        view.setScaleX(min);
        view.setScaleY(min);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e5) && ((e5) obj).f28976a == this.f28976a) {
            return true;
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f28976a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return f5.f(this.f28976a);
    }

    public final int hashCode() {
        return this.f28976a.hashCode();
    }
}
