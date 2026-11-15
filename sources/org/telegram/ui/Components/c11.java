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
public final class c11 extends u41 {
    public final h6.m f33460n3;
    public final u5 f33461o3;
    public final u5 f33462p3;
    public final RectF f33463q3;
    public final Paint f33464r3;
    public final u5 f33465s3;
    public Drawable f33466t3;
    public int f33467u3;
    public final Paint f33468v3;
    public final p11 f33469w3;

    public c11(p11 p11Var, Context context, int i7, x01 x01Var, y01 y01Var, y01 y01Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i7, 0, false, x01Var, y01Var, y01Var2, e6Var);
        this.f33469w3 = p11Var;
        this.f33460n3 = new h6.m(29);
        er erVar = er.h;
        this.f33461o3 = new u5(this, 320L, erVar);
        this.f33462p3 = new u5(this, 320L, erVar);
        this.f33463q3 = new RectF();
        this.f33464r3 = new Paint(1);
        this.f33465s3 = new u5(this, 420L, erVar);
        this.f33468v3 = new Paint(1);
    }

    @Override
    public final Integer V0(int i7) {
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        int i7;
        boolean z11;
        float d = this.f33461o3.d(canScrollHorizontally(-1));
        float d2 = this.f33462p3.d(canScrollHorizontally(1));
        int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i10 <= 0 && d2 <= 0.0f) {
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
            if (childAt instanceof k11) {
                k11 k11Var = (k11) childAt;
                if (k11Var.f36233s) {
                    if (width > k11Var.getX()) {
                        width = k11Var.getX();
                        RecyclerView.R(k11Var);
                    }
                    if (f13 < k11Var.getX() + k11Var.getWidth()) {
                        f13 = k11Var.getX() + k11Var.getWidth();
                        RecyclerView.R(k11Var);
                    }
                }
            }
        }
        int i12 = (f13 > width ? 1 : (f13 == width ? 0 : -1));
        org.telegram.ui.ActionBar.e6 e6Var = this.f40069o2;
        if (i12 > 0) {
            int r12 = org.telegram.ui.ActionBar.j6.r1(0.06f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var));
            Paint paint = this.f33468v3;
            paint.setColor(r12);
            RectF rectF = org.telegram.messenger.g0.P;
            f11 = 14.0f;
            f10 = 1.0f;
            rectF.set(width + org.telegram.messenger.g0.L(1.0f), (getHeight() - org.telegram.messenger.g0.L(28.0f)) / 2.0f, f13 - org.telegram.messenger.g0.L(1.0f), (org.telegram.messenger.g0.L(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), paint);
            if (this.f33466t3 == null) {
                this.f33466t3 = getContext().getResources().getDrawable(2131232202).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28815b9, e6Var);
            if (this.f33467u3 != w02) {
                Drawable drawable = this.f33466t3;
                this.f33467u3 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            this.f33466t3.setBounds((int) (org.telegram.messenger.g0.L(-17.0f) + f13), (int) (rectF.top + org.telegram.messenger.g0.L(10.0f)), (int) (f13 + org.telegram.messenger.g0.L(-7.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(20.0f)));
            this.f33466t3.draw(canvas2);
        } else {
            f10 = 1.0f;
            f11 = 14.0f;
        }
        super.dispatchDraw(canvas);
        p11 p11Var = this.f33469w3;
        long j3 = p11Var.L;
        int i13 = (j3 > p11Var.f38153f0 ? 1 : (j3 == p11Var.f38153f0 ? 0 : -1));
        u5 u5Var = this.f33465s3;
        if (i13 != 0) {
            p11Var.M = j3;
            u5Var.e(true, 0.0f);
        }
        p11Var.L = p11Var.f38153f0;
        k11 k11Var2 = null;
        k11 k11Var3 = null;
        int i14 = 0;
        while (i14 < getChildCount()) {
            View childAt2 = getChildAt(i14);
            if (childAt2 instanceof k11) {
                k11 k11Var4 = (k11) childAt2;
                if (!k11Var4.f36236y) {
                    i7 = i10;
                    if (k11Var4.getTopicId() == p11Var.f38153f0) {
                        k11Var2 = k11Var4;
                    }
                    z11 = z10;
                    if (k11Var4.getTopicId() == p11Var.M) {
                        k11Var3 = k11Var4;
                    }
                    i14++;
                    i10 = i7;
                    z10 = z11;
                }
            }
            i7 = i10;
            z11 = z10;
            i14++;
            i10 = i7;
            z10 = z11;
        }
        int i15 = i10;
        boolean z12 = z10;
        if (k11Var2 != null) {
            float x10 = k11Var2.getX() + org.telegram.messenger.g0.L(f10);
            float y10 = k11Var2.getY() + org.telegram.messenger.g0.L(4.0f);
            float x11 = (k11Var2.getX() + k11Var2.getWidth()) - org.telegram.messenger.g0.L(f10);
            float y11 = (k11Var2.getY() + getHeight()) - org.telegram.messenger.g0.L(4.0f);
            RectF rectF2 = this.f33463q3;
            rectF2.set(x10, y10, x11, y11);
            if (k11Var3 != null) {
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(k11Var3.getX() + org.telegram.messenger.g0.L(f10), k11Var3.getY() + org.telegram.messenger.g0.L(4.0f), (k11Var3.getX() + k11Var3.getWidth()) - org.telegram.messenger.g0.L(f10), (k11Var3.getY() + getHeight()) - org.telegram.messenger.g0.L(4.0f));
                org.telegram.messenger.g0.Z1(rectF3, rectF2, u5Var.e(false, f10), rectF2);
            }
            int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var), 31);
            Paint paint2 = this.f33464r3;
            paint2.setColor(o4);
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), paint2);
        }
        if (z12) {
            canvas2.save();
            h6.m mVar = this.f33460n3;
            if (i15 > 0) {
                RectF rectF4 = org.telegram.messenger.g0.P;
                f12 = 0.0f;
                rectF4.set(0.0f, 0.0f, org.telegram.messenger.g0.L(12.0f), getHeight());
                mVar.m(canvas2, rectF4, 0, d);
            } else {
                f12 = 0.0f;
            }
            if (d2 > f12) {
                RectF rectF5 = org.telegram.messenger.g0.P;
                rectF5.set(getWidth() - org.telegram.messenger.g0.L(12.0f), f12, getWidth(), getHeight());
                mVar.m(canvas2, rectF5, 2, d2);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
