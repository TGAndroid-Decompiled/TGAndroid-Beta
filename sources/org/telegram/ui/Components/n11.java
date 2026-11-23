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
public final class n11 extends h51 {
    public final h6.m f37740n3;
    public final d6 f37741o3;
    public final d6 f37742p3;
    public final RectF f37743q3;
    public final Paint f37744r3;
    public final d6 f37745s3;
    public Drawable f37746t3;
    public int f37747u3;
    public final Paint f37748v3;
    public final a21 f37749w3;

    public n11(a21 a21Var, Context context, int i7, i11 i11Var, j11 j11Var, j11 j11Var2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, 0, false, i11Var, j11Var, j11Var2, h6Var);
        this.f37749w3 = a21Var;
        this.f37740n3 = new h6.m(29);
        nr nrVar = nr.h;
        this.f37741o3 = new d6(this, 320L, nrVar);
        this.f37742p3 = new d6(this, 320L, nrVar);
        this.f37743q3 = new RectF();
        this.f37744r3 = new Paint(1);
        this.f37745s3 = new d6(this, 420L, nrVar);
        this.f37748v3 = new Paint(1);
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
        float d = this.f37741o3.d(canScrollHorizontally(-1));
        float d2 = this.f37742p3.d(canScrollHorizontally(1));
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
            if (childAt instanceof v11) {
                v11 v11Var = (v11) childAt;
                if (v11Var.f40639s) {
                    if (width > v11Var.getX()) {
                        width = v11Var.getX();
                        RecyclerView.R(v11Var);
                    }
                    if (f13 < v11Var.getX() + v11Var.getWidth()) {
                        f13 = v11Var.getX() + v11Var.getWidth();
                        RecyclerView.R(v11Var);
                    }
                }
            }
        }
        int i12 = (f13 > width ? 1 : (f13 == width ? 0 : -1));
        org.telegram.ui.ActionBar.h6 h6Var = this.f34873o2;
        if (i12 > 0) {
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var));
            Paint paint = this.f37748v3;
            paint.setColor(r12);
            RectF rectF = org.telegram.messenger.g0.P;
            f11 = 14.0f;
            f10 = 1.0f;
            rectF.set(width + org.telegram.messenger.g0.L(1.0f), (getHeight() - org.telegram.messenger.g0.L(28.0f)) / 2.0f, f13 - org.telegram.messenger.g0.L(1.0f), (org.telegram.messenger.g0.L(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), paint);
            if (this.f37746t3 == null) {
                this.f37746t3 = getContext().getResources().getDrawable(2131232203).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347b9, h6Var);
            if (this.f37747u3 != w02) {
                Drawable drawable = this.f37746t3;
                this.f37747u3 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            this.f37746t3.setBounds((int) (org.telegram.messenger.g0.L(-17.0f) + f13), (int) (rectF.top + org.telegram.messenger.g0.L(10.0f)), (int) (f13 + org.telegram.messenger.g0.L(-7.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(20.0f)));
            this.f37746t3.draw(canvas2);
        } else {
            f10 = 1.0f;
            f11 = 14.0f;
        }
        super.dispatchDraw(canvas);
        a21 a21Var = this.f37749w3;
        long j3 = a21Var.L;
        int i13 = (j3 > a21Var.f33290f0 ? 1 : (j3 == a21Var.f33290f0 ? 0 : -1));
        d6 d6Var = this.f37745s3;
        if (i13 != 0) {
            a21Var.M = j3;
            d6Var.e(true, 0.0f);
        }
        a21Var.L = a21Var.f33290f0;
        v11 v11Var2 = null;
        v11 v11Var3 = null;
        int i14 = 0;
        while (i14 < getChildCount()) {
            View childAt2 = getChildAt(i14);
            if (childAt2 instanceof v11) {
                v11 v11Var4 = (v11) childAt2;
                if (!v11Var4.f40642y) {
                    i7 = i10;
                    if (v11Var4.getTopicId() == a21Var.f33290f0) {
                        v11Var2 = v11Var4;
                    }
                    z11 = z10;
                    if (v11Var4.getTopicId() == a21Var.M) {
                        v11Var3 = v11Var4;
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
        if (v11Var2 != null) {
            float x10 = v11Var2.getX() + org.telegram.messenger.g0.L(f10);
            float y10 = v11Var2.getY() + org.telegram.messenger.g0.L(4.0f);
            float x11 = (v11Var2.getX() + v11Var2.getWidth()) - org.telegram.messenger.g0.L(f10);
            float y11 = (v11Var2.getY() + getHeight()) - org.telegram.messenger.g0.L(4.0f);
            RectF rectF2 = this.f37743q3;
            rectF2.set(x10, y10, x11, y11);
            if (v11Var3 != null) {
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(v11Var3.getX() + org.telegram.messenger.g0.L(f10), v11Var3.getY() + org.telegram.messenger.g0.L(4.0f), (v11Var3.getX() + v11Var3.getWidth()) - org.telegram.messenger.g0.L(f10), (v11Var3.getY() + getHeight()) - org.telegram.messenger.g0.L(4.0f));
                org.telegram.messenger.g0.Z1(rectF3, rectF2, d6Var.e(false, f10), rectF2);
            }
            int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var), 31);
            Paint paint2 = this.f37744r3;
            paint2.setColor(o4);
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), paint2);
        }
        if (z12) {
            canvas2.save();
            h6.m mVar = this.f37740n3;
            if (i15 > 0) {
                RectF rectF4 = org.telegram.messenger.g0.P;
                f12 = 0.0f;
                rectF4.set(0.0f, 0.0f, org.telegram.messenger.g0.L(12.0f), getHeight());
                mVar.n(canvas2, rectF4, 0, d);
            } else {
                f12 = 0.0f;
            }
            if (d2 > f12) {
                RectF rectF5 = org.telegram.messenger.g0.P;
                rectF5.set(getWidth() - org.telegram.messenger.g0.L(12.0f), f12, getWidth(), getHeight());
                mVar.n(canvas2, rectF5, 2, d2);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
