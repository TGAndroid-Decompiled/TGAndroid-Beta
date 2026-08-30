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
public final class k21 extends g61 {
    public final org.telegram.ui.g20 c3;
    public final z5 f26128d3;
    public final z5 f26129e3;
    public final RectF f26130f3;
    public final Paint f26131g3;
    public final z5 f26132h3;
    public Drawable f26133i3;
    public int f26134j3;
    public final Paint f26135k3;
    public final w21 f26136l3;

    public k21(w21 w21Var, Context context, int i10, j21 j21Var, e21 e21Var, e21 e21Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, 0, false, j21Var, e21Var, e21Var2, f6Var);
        this.f26136l3 = w21Var;
        this.c3 = new org.telegram.ui.g20();
        nr nrVar = nr.h;
        this.f26128d3 = new z5(this, 320L, nrVar);
        this.f26129e3 = new z5(this, 320L, nrVar);
        this.f26130f3 = new RectF();
        this.f26131g3 = new Paint(1);
        this.f26132h3 = new z5(this, 420L, nrVar);
        this.f26135k3 = new Paint(1);
    }

    @Override
    public final Integer W0(int i10) {
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        float e = this.f26128d3.e(canScrollHorizontally(-1));
        float e6 = this.f26129e3.e(canScrollHorizontally(1));
        int i11 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        if (i11 <= 0 && e6 <= 0.0f) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float width = getWidth();
        float f14 = 0.0f;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof r21) {
                r21 r21Var = (r21) childAt;
                if (r21Var.f28375s) {
                    if (width > r21Var.getX()) {
                        width = r21Var.getX();
                        RecyclerView.R(r21Var);
                    }
                    if (f14 < r21Var.getX() + r21Var.getWidth()) {
                        f14 = r21Var.getX() + r21Var.getWidth();
                        RecyclerView.R(r21Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f28750m2;
        if (f14 > width) {
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.06f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            Paint paint = this.f26135k3;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            f10 = 14.0f;
            f11 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f14 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.f26133i3 == null) {
                this.f26133i3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19873b9, f6Var);
            if (this.f26134j3 != v02) {
                Drawable drawable = this.f26133i3;
                this.f26134j3 = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            this.f26133i3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f14), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f14 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.f26133i3.draw(canvas2);
        } else {
            f10 = 14.0f;
            f11 = 1.0f;
        }
        super.dispatchDraw(canvas);
        w21 w21Var = this.f26136l3;
        long j10 = w21Var.E;
        long j11 = w21Var.S;
        z5 z5Var = this.f26132h3;
        if (j10 != j11) {
            w21Var.F = j10;
            z5Var.d(0.0f, true);
        }
        w21Var.E = w21Var.S;
        r21 r21Var2 = null;
        r21 r21Var3 = null;
        int i13 = 0;
        while (i13 < getChildCount()) {
            View childAt2 = getChildAt(i13);
            if (childAt2 instanceof r21) {
                r21 r21Var4 = (r21) childAt2;
                if (!r21Var4.f28377x) {
                    i10 = i11;
                    if (r21Var4.getTopicId() == w21Var.S) {
                        r21Var2 = r21Var4;
                    }
                    f13 = e6;
                    if (r21Var4.getTopicId() == w21Var.F) {
                        r21Var3 = r21Var4;
                    }
                    i13++;
                    i11 = i10;
                    e6 = f13;
                }
            }
            f13 = e6;
            i10 = i11;
            i13++;
            i11 = i10;
            e6 = f13;
        }
        float f15 = e6;
        int i14 = i11;
        if (r21Var2 != null) {
            float x10 = r21Var2.getX() + AndroidUtilities.dp(f11);
            float y10 = r21Var2.getY() + AndroidUtilities.dp(4.0f);
            float x11 = (r21Var2.getX() + r21Var2.getWidth()) - AndroidUtilities.dp(f11);
            float y11 = (r21Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.f26130f3;
            rectF2.set(x10, y10, x11, y11);
            if (r21Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(r21Var3.getX() + AndroidUtilities.dp(f11), r21Var3.getY() + AndroidUtilities.dp(4.0f), (r21Var3.getX() + r21Var3.getWidth()) - AndroidUtilities.dp(f11), (r21Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, z5Var.d(1.0f, false), rectF2);
            }
            int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), 31);
            Paint paint2 = this.f26131g3;
            paint2.setColor(k10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint2);
        }
        if (z4) {
            canvas2.save();
            org.telegram.ui.g20 g20Var = this.c3;
            if (i14 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f12 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                g20Var.b(canvas2, rectF4, 0, e);
            } else {
                f12 = 0.0f;
            }
            if (f15 > f12) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f12, getWidth(), getHeight());
                g20Var.b(canvas2, rectF5, 2, f15);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
