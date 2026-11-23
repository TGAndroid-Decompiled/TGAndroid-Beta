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
public final class m11 extends g51 {
    public final i61 f37339n3;
    public final c6 f37340o3;
    public final c6 f37341p3;
    public final RectF f37342q3;
    public final Paint f37343r3;
    public final c6 f37344s3;
    public Drawable f37345t3;
    public int f37346u3;
    public final Paint f37347v3;
    public final z11 f37348w3;

    public m11(z11 z11Var, Context context, int i7, h11 h11Var, i11 i11Var, i11 i11Var2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, 0, false, h11Var, i11Var, i11Var2, i6Var);
        this.f37348w3 = z11Var;
        this.f37339n3 = new i61(1);
        kr krVar = kr.h;
        this.f37340o3 = new c6(this, 320L, krVar);
        this.f37341p3 = new c6(this, 320L, krVar);
        this.f37342q3 = new RectF();
        this.f37343r3 = new Paint(1);
        this.f37344s3 = new c6(this, 420L, krVar);
        this.f37347v3 = new Paint(1);
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
        float d = this.f37340o3.d(canScrollHorizontally(-1));
        float d2 = this.f37341p3.d(canScrollHorizontally(1));
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
            if (childAt instanceof u11) {
                u11 u11Var = (u11) childAt;
                if (u11Var.f40230s) {
                    if (width > u11Var.getX()) {
                        width = u11Var.getX();
                        RecyclerView.R(u11Var);
                    }
                    if (f13 < u11Var.getX() + u11Var.getWidth()) {
                        f13 = u11Var.getX() + u11Var.getWidth();
                        RecyclerView.R(u11Var);
                    }
                }
            }
        }
        int i12 = (f13 > width ? 1 : (f13 == width ? 0 : -1));
        org.telegram.ui.ActionBar.i6 i6Var = this.f34767o2;
        if (i12 > 0) {
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.06f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var));
            Paint paint = this.f37347v3;
            paint.setColor(r12);
            RectF rectF = org.telegram.messenger.g0.P;
            f11 = 14.0f;
            f10 = 1.0f;
            rectF.set(width + org.telegram.messenger.g0.L(1.0f), (getHeight() - org.telegram.messenger.g0.L(28.0f)) / 2.0f, f13 - org.telegram.messenger.g0.L(1.0f), (org.telegram.messenger.g0.L(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), paint);
            if (this.f37345t3 == null) {
                this.f37345t3 = getContext().getResources().getDrawable(2131232206).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29417b9, i6Var);
            if (this.f37346u3 != w02) {
                Drawable drawable = this.f37345t3;
                this.f37346u3 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            this.f37345t3.setBounds((int) (org.telegram.messenger.g0.L(-17.0f) + f13), (int) (rectF.top + org.telegram.messenger.g0.L(10.0f)), (int) (f13 + org.telegram.messenger.g0.L(-7.0f)), (int) (rectF.top + org.telegram.messenger.g0.L(20.0f)));
            this.f37345t3.draw(canvas2);
        } else {
            f10 = 1.0f;
            f11 = 14.0f;
        }
        super.dispatchDraw(canvas);
        z11 z11Var = this.f37348w3;
        long j3 = z11Var.L;
        int i13 = (j3 > z11Var.f42633f0 ? 1 : (j3 == z11Var.f42633f0 ? 0 : -1));
        c6 c6Var = this.f37344s3;
        if (i13 != 0) {
            z11Var.M = j3;
            c6Var.e(true, 0.0f);
        }
        z11Var.L = z11Var.f42633f0;
        u11 u11Var2 = null;
        u11 u11Var3 = null;
        int i14 = 0;
        while (i14 < getChildCount()) {
            View childAt2 = getChildAt(i14);
            if (childAt2 instanceof u11) {
                u11 u11Var4 = (u11) childAt2;
                if (!u11Var4.f40233y) {
                    i7 = i10;
                    if (u11Var4.getTopicId() == z11Var.f42633f0) {
                        u11Var2 = u11Var4;
                    }
                    z11 = z10;
                    if (u11Var4.getTopicId() == z11Var.M) {
                        u11Var3 = u11Var4;
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
        if (u11Var2 != null) {
            float x10 = u11Var2.getX() + org.telegram.messenger.g0.L(f10);
            float y10 = u11Var2.getY() + org.telegram.messenger.g0.L(4.0f);
            float x11 = (u11Var2.getX() + u11Var2.getWidth()) - org.telegram.messenger.g0.L(f10);
            float y11 = (u11Var2.getY() + getHeight()) - org.telegram.messenger.g0.L(4.0f);
            RectF rectF2 = this.f37342q3;
            rectF2.set(x10, y10, x11, y11);
            if (u11Var3 != null) {
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(u11Var3.getX() + org.telegram.messenger.g0.L(f10), u11Var3.getY() + org.telegram.messenger.g0.L(4.0f), (u11Var3.getX() + u11Var3.getWidth()) - org.telegram.messenger.g0.L(f10), (u11Var3.getY() + getHeight()) - org.telegram.messenger.g0.L(4.0f));
                org.telegram.messenger.g0.Z1(rectF3, rectF2, c6Var.e(false, f10), rectF2);
            }
            int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var), 31);
            Paint paint2 = this.f37343r3;
            paint2.setColor(o4);
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(f11), paint2);
        }
        if (z12) {
            canvas2.save();
            i61 i61Var = this.f37339n3;
            if (i15 > 0) {
                RectF rectF4 = org.telegram.messenger.g0.P;
                f12 = 0.0f;
                rectF4.set(0.0f, 0.0f, org.telegram.messenger.g0.L(12.0f), getHeight());
                i61Var.u(canvas2, rectF4, 0, d);
            } else {
                f12 = 0.0f;
            }
            if (d2 > f12) {
                RectF rectF5 = org.telegram.messenger.g0.P;
                rectF5.set(getWidth() - org.telegram.messenger.g0.L(12.0f), f12, getWidth(), getHeight());
                i61Var.u(canvas2, rectF5, 2, d2);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
