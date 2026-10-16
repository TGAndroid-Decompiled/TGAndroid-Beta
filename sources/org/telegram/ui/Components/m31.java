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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class m31 extends i71 {
    public final org.telegram.ui.p20 f26908d3;
    public final g6 f26909e3;
    public final g6 f26910f3;
    public final RectF f26911g3;
    public final Paint f26912h3;
    public final g6 f26913i3;
    public Drawable f26914j3;
    public int f26915k3;
    public final Paint f26916l3;
    public final y31 f26917m3;

    public m31(y31 y31Var, Context context, int i10, l31 l31Var, e31 e31Var, e31 e31Var2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, 0, false, l31Var, e31Var, e31Var2, c6Var);
        this.f26917m3 = y31Var;
        this.f26908d3 = new org.telegram.ui.p20();
        es esVar = es.h;
        this.f26909e3 = new g6(this, 320L, esVar);
        this.f26910f3 = new g6(this, 320L, esVar);
        this.f26911g3 = new RectF();
        this.f26912h3 = new Paint(1);
        this.f26913i3 = new g6(this, 420L, esVar);
        this.f26916l3 = new Paint(1);
    }

    @Override
    public final Integer W0(int i10) {
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
        float e = this.f26909e3.e(canScrollHorizontally(-1));
        float e7 = this.f26910f3.e(canScrollHorizontally(1));
        int i11 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        if (i11 <= 0 && e7 <= 0.0f) {
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
            if (childAt instanceof t31) {
                t31 t31Var = (t31) childAt;
                if (t31Var.f28965s) {
                    if (width > t31Var.getX()) {
                        width = t31Var.getX();
                        RecyclerView.R(t31Var);
                    }
                    if (f12 < t31Var.getX() + t31Var.getWidth()) {
                        f12 = t31Var.getX() + t31Var.getWidth();
                        RecyclerView.R(t31Var);
                    }
                }
            }
        }
        int i13 = (f12 > width ? 1 : (f12 == width ? 0 : -1));
        org.telegram.ui.ActionBar.c6 c6Var = this.f27148n2;
        if (i13 > 0) {
            int m12 = org.telegram.ui.ActionBar.g6.m1(0.06f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            Paint paint = this.f26916l3;
            paint.setColor(m12);
            RectF rectF = AndroidUtilities.rectTmp;
            f10 = 14.0f;
            f7 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f12 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.f26914j3 == null) {
                this.f26914j3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19565b9, c6Var);
            if (this.f26915k3 != w02) {
                Drawable drawable = this.f26914j3;
                this.f26915k3 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            this.f26914j3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f12), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f12 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.f26914j3.draw(canvas2);
        } else {
            f7 = 1.0f;
            f10 = 14.0f;
        }
        super.dispatchDraw(canvas);
        y31 y31Var = this.f26917m3;
        long j10 = y31Var.H;
        int i14 = (j10 > y31Var.V ? 1 : (j10 == y31Var.V ? 0 : -1));
        g6 g6Var = this.f26913i3;
        if (i14 != 0) {
            y31Var.I = j10;
            g6Var.d(0.0f, true);
        }
        y31Var.H = y31Var.V;
        t31 t31Var2 = null;
        t31 t31Var3 = null;
        int i15 = 0;
        while (i15 < getChildCount()) {
            View childAt2 = getChildAt(i15);
            if (childAt2 instanceof t31) {
                t31 t31Var4 = (t31) childAt2;
                if (!t31Var4.f28967x) {
                    i10 = i11;
                    if (t31Var4.getTopicId() == y31Var.V) {
                        t31Var2 = t31Var4;
                    }
                    z11 = z10;
                    if (t31Var4.getTopicId() == y31Var.I) {
                        t31Var3 = t31Var4;
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
        if (t31Var2 != null) {
            float x10 = t31Var2.getX() + AndroidUtilities.dp(f7);
            float y3 = t31Var2.getY() + AndroidUtilities.dp(4.0f);
            float x11 = (t31Var2.getX() + t31Var2.getWidth()) - AndroidUtilities.dp(f7);
            float y10 = (t31Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.f26911g3;
            rectF2.set(x10, y3, x11, y10);
            if (t31Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(t31Var3.getX() + AndroidUtilities.dp(f7), t31Var3.getY() + AndroidUtilities.dp(4.0f), (t31Var3.getX() + t31Var3.getWidth()) - AndroidUtilities.dp(f7), (t31Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, g6Var.d(f7, false), rectF2);
            }
            int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var), 31);
            Paint paint2 = this.f26912h3;
            paint2.setColor(k10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint2);
        }
        if (z12) {
            canvas2.save();
            org.telegram.ui.p20 p20Var = this.f26908d3;
            if (i16 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f11 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                p20Var.b(canvas2, rectF4, 0, e);
            } else {
                f11 = 0.0f;
            }
            if (e7 > f11) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f11, getWidth(), getHeight());
                p20Var.b(canvas2, rectF5, 2, e7);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
