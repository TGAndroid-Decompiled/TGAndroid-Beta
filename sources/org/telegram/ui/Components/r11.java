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

public final class r11 extends k51 {

    public final org.telegram.ui.v10 f32037b3;

    public final y5 f32038c3;

    public final y5 f32039d3;

    public final RectF f32040e3;

    public final Paint f32041f3;

    public final y5 f32042g3;

    public Drawable f32043h3;

    public int f32044i3;

    public final Paint f32045j3;

    public final d21 f32046k3;

    public r11(d21 d21Var, Context context, int i10, q11 q11Var, k11 k11Var, k11 k11Var2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, 0, false, q11Var, k11Var, k11Var2, c6Var);
        this.f32046k3 = d21Var;
        this.f32037b3 = new org.telegram.ui.v10();
        er erVar = er.h;
        this.f32038c3 = new y5(this, 320L, erVar);
        this.f32039d3 = new y5(this, 320L, erVar);
        this.f32040e3 = new RectF();
        this.f32041f3 = new Paint(1);
        this.f32042g3 = new y5(this, 420L, erVar);
        this.f32045j3 = new Paint(1);
    }

    @Override
    public final Integer W0(int i10) {
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        float fE = this.f32038c3.e(canScrollHorizontally(-1));
        float fE2 = this.f32039d3.e(canScrollHorizontally(1));
        int i11 = (fE > 0.0f ? 1 : (fE == 0.0f ? 0 : -1));
        boolean z10 = i11 > 0 || fE2 > 0.0f;
        if (z10) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float width = getWidth();
        float x8 = 0.0f;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof y11) {
                y11 y11Var = (y11) childAt;
                if (y11Var.f34785s) {
                    if (width > y11Var.getX()) {
                        width = y11Var.getX();
                        RecyclerView.R(y11Var);
                    }
                    if (x8 < y11Var.getX() + y11Var.getWidth()) {
                        x8 = y11Var.getX() + y11Var.getWidth();
                        RecyclerView.R(y11Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f35277l2;
        if (x8 > width) {
            int iL1 = org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            Paint paint = this.f32045j3;
            paint.setColor(iL1);
            RectF rectF = AndroidUtilities.rectTmp;
            f10 = 14.0f;
            f11 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, x8 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.f32043h3 == null) {
                this.f32043h3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23020b9, c6Var);
            if (this.f32044i3 != iV0) {
                Drawable drawable = this.f32043h3;
                this.f32044i3 = iV0;
                drawable.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.SRC_IN));
            }
            this.f32043h3.setBounds((int) (AndroidUtilities.dp(-17.0f) + x8), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (x8 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.f32043h3.draw(canvas2);
        } else {
            f10 = 14.0f;
            f11 = 1.0f;
        }
        super.dispatchDraw(canvas);
        d21 d21Var = this.f32046k3;
        long j10 = d21Var.D;
        long j11 = d21Var.R;
        y5 y5Var = this.f32042g3;
        if (j10 != j11) {
            d21Var.E = j10;
            y5Var.d(0.0f, true);
        }
        d21Var.D = d21Var.R;
        y11 y11Var2 = null;
        y11 y11Var3 = null;
        int i13 = 0;
        while (i13 < getChildCount()) {
            View childAt2 = getChildAt(i13);
            if (childAt2 instanceof y11) {
                y11 y11Var4 = (y11) childAt2;
                if (y11Var4.f34787x) {
                    f13 = fE2;
                    i10 = i11;
                } else {
                    i10 = i11;
                    if (y11Var4.getTopicId() == d21Var.R) {
                        y11Var2 = y11Var4;
                    }
                    f13 = fE2;
                    if (y11Var4.getTopicId() == d21Var.E) {
                        y11Var3 = y11Var4;
                    }
                }
            } else {
                f13 = fE2;
                i10 = i11;
            }
            i13++;
            i11 = i10;
            fE2 = f13;
        }
        float f14 = fE2;
        int i14 = i11;
        if (y11Var2 != null) {
            float x10 = y11Var2.getX() + AndroidUtilities.dp(f11);
            float y10 = y11Var2.getY() + AndroidUtilities.dp(4.0f);
            float x11 = (y11Var2.getX() + y11Var2.getWidth()) - AndroidUtilities.dp(f11);
            float y11 = (y11Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.f32040e3;
            rectF2.set(x10, y10, x11, y11);
            if (y11Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(y11Var3.getX() + AndroidUtilities.dp(f11), y11Var3.getY() + AndroidUtilities.dp(4.0f), (y11Var3.getX() + y11Var3.getWidth()) - AndroidUtilities.dp(f11), (y11Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, y5Var.d(1.0f, false), rectF2);
            }
            int iK = i0.b.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var), 31);
            Paint paint2 = this.f32041f3;
            paint2.setColor(iK);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint2);
        }
        if (z10) {
            canvas2.save();
            org.telegram.ui.v10 v10Var = this.f32037b3;
            if (i14 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f12 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                v10Var.b(canvas2, rectF4, 0, fE);
            } else {
                f12 = 0.0f;
            }
            if (f14 > f12) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f12, getWidth(), getHeight());
                v10Var.b(canvas2, rectF5, 2, f14);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
