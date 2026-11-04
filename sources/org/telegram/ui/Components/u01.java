package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class u01 extends l41 {
    public final k4.j f38591n3;
    public final u5 f38592o3;
    public final u5 f38593p3;
    public final RectF f38594q3;
    public final Paint f38595r3;
    public final u5 f38596s3;
    public Drawable f38597t3;
    public int f38598u3;
    public final Paint f38599v3;
    public final g11 f38600w3;

    public u01(g11 g11Var, Context context, int i3, p01 p01Var, q01 q01Var, q01 q01Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, 0, false, p01Var, q01Var, q01Var2, e6Var);
        this.f38600w3 = g11Var;
        this.f38591n3 = new k4.j(24);
        xq xqVar = xq.h;
        this.f38592o3 = new u5(this, 320L, xqVar);
        this.f38593p3 = new u5(this, 320L, xqVar);
        this.f38594q3 = new RectF();
        this.f38595r3 = new Paint(1);
        this.f38596s3 = new u5(this, 420L, xqVar);
        this.f38599v3 = new Paint(1);
    }

    @Override
    public final Integer V0(int i3) {
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        int i3;
        boolean z11;
        float d = this.f38592o3.d(canScrollHorizontally(-1));
        float d10 = this.f38593p3.d(canScrollHorizontally(1));
        int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i10 <= 0 && d10 <= 0.0f) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float width = getWidth();
        float f13 = 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof b11) {
                b11 b11Var = (b11) childAt;
                if (b11Var.f32054s) {
                    if (width > b11Var.getX()) {
                        width = b11Var.getX();
                        RecyclerView.R(b11Var);
                    }
                    if (f13 < b11Var.getX() + b11Var.getWidth()) {
                        f13 = b11Var.getX() + b11Var.getWidth();
                        RecyclerView.R(b11Var);
                    }
                }
            }
        }
        int i12 = (f13 > width ? 1 : (f13 == width ? 0 : -1));
        org.telegram.ui.ActionBar.e6 e6Var = this.f38460o2;
        if (i12 > 0) {
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
            Paint paint = this.f38599v3;
            paint.setColor(r12);
            RectF rectF = org.telegram.messenger.g0.P;
            f11 = 14.0f;
            f10 = 1.0f;
            rectF.set(width + org.telegram.messenger.g0.L(1.0f), (getHeight() - org.telegram.messenger.g0.L(28.0f)) / 2.0f, f13 - org.telegram.messenger.g0.L(1.0f), (org.telegram.messenger.g0.L(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), paint);
            if (this.f38597t3 == null) {
                this.f38597t3 = getContext().getResources().getDrawable(2131232201).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27845b9, e6Var);
            if (this.f38598u3 != w02) {
                Drawable drawable = this.f38597t3;
                this.f38598u3 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            this.f38597t3.setBounds((int) (org.telegram.messenger.g0.L(-17.0f) + f13), (int) (rectF.top + org.telegram.messenger.g0.L(10.0f)), (int) (f13 + org.telegram.messenger.g0.L(-7.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(20.0f)));
            this.f38597t3.draw(canvas2);
        } else {
            f10 = 1.0f;
            f11 = 14.0f;
        }
        super.dispatchDraw(canvas);
        g11 g11Var = this.f38600w3;
        long j10 = g11Var.L;
        int i13 = (j10 > g11Var.f33928f0 ? 1 : (j10 == g11Var.f33928f0 ? 0 : -1));
        u5 u5Var = this.f38596s3;
        if (i13 != 0) {
            g11Var.M = j10;
            u5Var.e(true, 0.0f);
        }
        g11Var.L = g11Var.f33928f0;
        b11 b11Var2 = null;
        b11 b11Var3 = null;
        int i14 = 0;
        while (i14 < getChildCount()) {
            View childAt2 = getChildAt(i14);
            if (childAt2 instanceof b11) {
                b11 b11Var4 = (b11) childAt2;
                if (!b11Var4.f32057y) {
                    i3 = i10;
                    if (b11Var4.getTopicId() == g11Var.f33928f0) {
                        b11Var2 = b11Var4;
                    }
                    z11 = z10;
                    if (b11Var4.getTopicId() == g11Var.M) {
                        b11Var3 = b11Var4;
                    }
                    i14++;
                    i10 = i3;
                    z10 = z11;
                }
            }
            i3 = i10;
            z11 = z10;
            i14++;
            i10 = i3;
            z10 = z11;
        }
        int i15 = i10;
        boolean z12 = z10;
        if (b11Var2 != null) {
            float x10 = b11Var2.getX() + org.telegram.messenger.g0.L(f10);
            float y9 = b11Var2.getY() + org.telegram.messenger.g0.L(4.0f);
            float x11 = (b11Var2.getX() + b11Var2.getWidth()) - org.telegram.messenger.g0.L(f10);
            float y10 = (b11Var2.getY() + getHeight()) - org.telegram.messenger.g0.L(4.0f);
            RectF rectF2 = this.f38594q3;
            rectF2.set(x10, y9, x11, y10);
            if (b11Var3 != null) {
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(b11Var3.getX() + org.telegram.messenger.g0.L(f10), b11Var3.getY() + org.telegram.messenger.g0.L(4.0f), (b11Var3.getX() + b11Var3.getWidth()) - org.telegram.messenger.g0.L(f10), (b11Var3.getY() + getHeight()) - org.telegram.messenger.g0.L(4.0f));
                org.telegram.messenger.g0.Z1(rectF3, rectF2, u5Var.e(false, f10), rectF2);
            }
            int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var), 31);
            Paint paint2 = this.f38595r3;
            paint2.setColor(o10);
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), paint2);
        }
        if (z12) {
            canvas2.save();
            k4.j jVar = this.f38591n3;
            if (i15 > 0) {
                RectF rectF4 = org.telegram.messenger.g0.P;
                f12 = 0.0f;
                rectF4.set(0.0f, 0.0f, org.telegram.messenger.g0.L(12.0f), getHeight());
                jVar.w(canvas2, rectF4, 0, d);
            } else {
                f12 = 0.0f;
            }
            if (d10 > f12) {
                RectF rectF5 = org.telegram.messenger.g0.P;
                rectF5.set(getWidth() - org.telegram.messenger.g0.L(12.0f), f12, getWidth(), getHeight());
                jVar.w(canvas2, rectF5, 2, d10);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
