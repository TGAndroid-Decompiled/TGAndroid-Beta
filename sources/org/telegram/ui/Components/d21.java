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
public final class d21 extends v51 {
    public final li.k f25331m3;
    public final t5 f25332n3;
    public final t5 f25333o3;
    public final RectF f25334p3;
    public final Paint f25335q3;
    public final t5 f25336r3;
    public Drawable f25337s3;
    public int f25338t3;
    public final Paint f25339u3;
    public final p21 f25340v3;

    public d21(p21 p21Var, Context context, int i10, w11 w11Var, x11 x11Var, x11 x11Var2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, 0, false, w11Var, x11Var, x11Var2, p6Var);
        this.f25340v3 = p21Var;
        this.f25331m3 = new li.k(23);
        gr grVar = gr.h;
        this.f25332n3 = new t5(this, 320L, grVar);
        this.f25333o3 = new t5(this, 320L, grVar);
        this.f25334p3 = new RectF();
        this.f25335q3 = new Paint(1);
        this.f25336r3 = new t5(this, 420L, grVar);
        this.f25339u3 = new Paint(1);
    }

    @Override
    public final Integer V0(int i10) {
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        int i10;
        boolean z11;
        float d = this.f25332n3.d(canScrollHorizontally(-1));
        float d10 = this.f25333o3.d(canScrollHorizontally(1));
        int i11 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i11 <= 0 && d10 <= 0.0f) {
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
        float f12 = 0.0f;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof k21) {
                k21 k21Var = (k21) childAt;
                if (k21Var.f27717s) {
                    if (width > k21Var.getX()) {
                        width = k21Var.getX();
                        RecyclerView.R(k21Var);
                    }
                    if (f12 < k21Var.getX() + k21Var.getWidth()) {
                        f12 = k21Var.getX() + k21Var.getWidth();
                        RecyclerView.R(k21Var);
                    }
                }
            }
        }
        int i13 = (f12 > width ? 1 : (f12 == width ? 0 : -1));
        org.telegram.ui.ActionBar.p6 p6Var = this.f31008n2;
        if (i13 > 0) {
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.06f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            Paint paint = this.f25339u3;
            paint.setColor(r12);
            RectF rectF = org.telegram.messenger.i0.P;
            f10 = 14.0f;
            f7 = 1.0f;
            rectF.set(width + org.telegram.messenger.i0.L(1.0f), (getHeight() - org.telegram.messenger.i0.L(28.0f)) / 2.0f, f12 - org.telegram.messenger.i0.L(1.0f), (org.telegram.messenger.i0.L(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), paint);
            if (this.f25337s3 == null) {
                this.f25337s3 = getContext().getResources().getDrawable(2131232200).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20895b9, p6Var);
            if (this.f25338t3 != w02) {
                Drawable drawable = this.f25337s3;
                this.f25338t3 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            this.f25337s3.setBounds((int) (org.telegram.messenger.i0.L(-17.0f) + f12), (int) (rectF.top + org.telegram.messenger.i0.L(10.0f)), (int) (f12 + org.telegram.messenger.i0.L(-7.0f)), (int) (rectF.top + org.telegram.messenger.i0.L(20.0f)));
            this.f25337s3.draw(canvas2);
        } else {
            f7 = 1.0f;
            f10 = 14.0f;
        }
        super.dispatchDraw(canvas);
        p21 p21Var = this.f25340v3;
        long j10 = p21Var.K;
        int i14 = (j10 > p21Var.f29329e0 ? 1 : (j10 == p21Var.f29329e0 ? 0 : -1));
        t5 t5Var = this.f25336r3;
        if (i14 != 0) {
            p21Var.L = j10;
            t5Var.e(true, 0.0f);
        }
        p21Var.K = p21Var.f29329e0;
        k21 k21Var2 = null;
        k21 k21Var3 = null;
        int i15 = 0;
        while (i15 < getChildCount()) {
            View childAt2 = getChildAt(i15);
            if (childAt2 instanceof k21) {
                k21 k21Var4 = (k21) childAt2;
                if (!k21Var4.f27720y) {
                    i10 = i11;
                    if (k21Var4.getTopicId() == p21Var.f29329e0) {
                        k21Var2 = k21Var4;
                    }
                    z11 = z10;
                    if (k21Var4.getTopicId() == p21Var.L) {
                        k21Var3 = k21Var4;
                    }
                    i15++;
                    i11 = i10;
                    z10 = z11;
                }
            }
            i10 = i11;
            z11 = z10;
            i15++;
            i11 = i10;
            z10 = z11;
        }
        int i16 = i11;
        boolean z12 = z10;
        if (k21Var2 != null) {
            float x10 = k21Var2.getX() + org.telegram.messenger.i0.L(f7);
            float y3 = k21Var2.getY() + org.telegram.messenger.i0.L(4.0f);
            float x11 = (k21Var2.getX() + k21Var2.getWidth()) - org.telegram.messenger.i0.L(f7);
            float y10 = (k21Var2.getY() + getHeight()) - org.telegram.messenger.i0.L(4.0f);
            RectF rectF2 = this.f25334p3;
            rectF2.set(x10, y3, x11, y10);
            if (k21Var3 != null) {
                RectF rectF3 = org.telegram.messenger.i0.P;
                rectF3.set(k21Var3.getX() + org.telegram.messenger.i0.L(f7), k21Var3.getY() + org.telegram.messenger.i0.L(4.0f), (k21Var3.getX() + k21Var3.getWidth()) - org.telegram.messenger.i0.L(f7), (k21Var3.getY() + getHeight()) - org.telegram.messenger.i0.L(4.0f));
                org.telegram.messenger.i0.Z1(rectF3, rectF2, t5Var.e(false, f7), rectF2);
            }
            int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var), 31);
            Paint paint2 = this.f25335q3;
            paint2.setColor(o10);
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f10), paint2);
        }
        if (z12) {
            canvas2.save();
            li.k kVar = this.f25331m3;
            if (i16 > 0) {
                RectF rectF4 = org.telegram.messenger.i0.P;
                f11 = 0.0f;
                rectF4.set(0.0f, 0.0f, org.telegram.messenger.i0.L(12.0f), getHeight());
                kVar.o(canvas2, rectF4, 0, d);
            } else {
                f11 = 0.0f;
            }
            if (d10 > f11) {
                RectF rectF5 = org.telegram.messenger.i0.P;
                rectF5.set(getWidth() - org.telegram.messenger.i0.L(12.0f), f11, getWidth(), getHeight());
                kVar.o(canvas2, rectF5, 2, d10);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
