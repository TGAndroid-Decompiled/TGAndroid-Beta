package org.telegram.ui.ActionBar;

import android.view.View;
public final class f5 implements te.f, we.a {
    public final View f28949a;
    public boolean f28950b;
    public float f28951c = 1.0f;
    public float d = 1.0f;
    public float f28952e = 1.0f;

    public f5(View view) {
        this.f28949a = view;
    }

    @Override
    public final void a() {
        View view = this.f28949a;
        if (!g5.h(view)) {
            if (view instanceof h5) {
                ((h5) view).Y();
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
        float f12 = this.f28951c;
        if (f12 == f10 && this.d == f11) {
            return;
        }
        int i7 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
        View view = this.f28949a;
        if (i7 == 0) {
            this.f28952e = view.getAlpha();
        }
        this.f28951c = f10;
        this.d = f11;
        view.setAlpha(this.f28952e * f10);
        float min = Math.min(org.telegram.messenger.g0.T1(0.6f, 1.0f, f10), f11);
        view.setScaleX(min);
        view.setScaleY(min);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof f5) && ((f5) obj).f28949a == this.f28949a) {
            return true;
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f28949a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return g5.f(this.f28949a);
    }

    public final int hashCode() {
        return this.f28949a.hashCode();
    }
}
