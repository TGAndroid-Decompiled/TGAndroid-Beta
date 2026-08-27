package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public final class bs0 extends f2.k1 {

    public final float f36875k;

    public final LinearInterpolator f36873i = new LinearInterpolator();

    public final DecelerateInterpolator f36874j = new DecelerateInterpolator(1.5f);

    public int f36876l = 0;

    public int f36877m = 0;

    public bs0(Context context) {
        this.f36875k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i10) {
        f2.x0 x0Var = this.f5733c;
        if (x0Var instanceof f2.k0) {
            return ((f2.k0) x0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, f2.j1 j1Var) {
        if (this.f5732b.f1864x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f36876l;
        int i13 = i12 - i10;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f36876l = i13;
        int i14 = this.f36877m;
        int i15 = i14 - i11;
        int i16 = i14 * i15 > 0 ? i15 : 0;
        this.f36877m = i16;
        if (i13 == 0 && i16 == 0) {
            PointF pointFA = a(this.f5731a);
            if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
                j1Var.d = this.f5731a;
                h();
            } else {
                f2.k1.b(pointFA);
                this.f36876l = (int) (pointFA.x * 10000.0f);
                this.f36877m = (int) (pointFA.y * 10000.0f);
                j1Var.b((int) (this.f36876l * 1.2f), (int) (this.f36877m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f36875k)) * 1.2f), this.f36873i);
            }
        }
    }

    @Override
    public final void f() {
        this.f36877m = 0;
        this.f36876l = 0;
    }

    @Override
    public final void g(View view, f2.j1 j1Var) {
        int i10;
        f2.x0 x0Var = this.f5733c;
        if (x0Var == null || !x0Var.d()) {
            i10 = 0;
        } else {
            f2.y0 y0Var = (f2.y0) view.getLayoutParams();
            int iX = f2.x0.x(view) - ((ViewGroup.MarginLayoutParams) y0Var).leftMargin;
            int iY = f2.x0.y(view) + ((ViewGroup.MarginLayoutParams) y0Var).rightMargin;
            int iD = x0Var.D();
            int iE = x0Var.f5862m - x0Var.E();
            if (iX <= iD || iY >= iE) {
                int i11 = iY - iX;
                int i12 = (iE - iD) - i11;
                int i13 = i11 + i12;
                i10 = i12 - iX;
                if (i10 <= 0 && (i10 = i13 - iY) >= 0) {
                    i10 = 0;
                }
            } else {
                i10 = 0;
            }
        }
        int iMax = Math.max(180, (int) Math.ceil(((double) ((int) Math.ceil(Math.abs(i10) * this.f36875k))) / 0.3356d));
        if (iMax > 0) {
            j1Var.b(-i10, 0, Math.max(400, iMax), this.f36874j);
        }
    }

    @Override
    public final void e() {
    }
}
