package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w5 implements oe.h, re.a {
    public final View f23213a;
    public boolean f23214b;
    public float f23215c = 1.0f;
    public float d = 1.0f;
    public float e = 1.0f;

    public w5(View view) {
        this.f23213a = view;
    }

    @Override
    public final void a() {
        View view = this.f23213a;
        if (!x5.g(view)) {
            if (view instanceof y5) {
                ((y5) view).X();
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
        float f11 = this.f23215c;
        if (f11 == f7 && this.d == f10) {
            return;
        }
        int i10 = (f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1));
        View view = this.f23213a;
        if (i10 == 0) {
            this.e = view.getAlpha();
        }
        this.f23215c = f7;
        this.d = f10;
        view.setAlpha(this.e * f7);
        float min = Math.min(AndroidUtilities.lerp(0.6f, 1.0f, f7), f10);
        view.setScaleX(min);
        view.setScaleY(min);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof w5) && ((w5) obj).f23213a == this.f23213a) {
            return true;
        }
        return false;
    }

    @Override
    public final int getHeight() {
        return this.f23213a.getMeasuredHeight();
    }

    @Override
    public final int getWidth() {
        return x5.e(this.f23213a);
    }

    public final int hashCode() {
        return this.f23213a.hashCode();
    }
}
