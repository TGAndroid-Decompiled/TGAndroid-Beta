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
public final class o11 extends i51 {
    public final org.telegram.ui.s10 f31254b3;
    public final y5 f31255c3;
    public final y5 f31256d3;
    public final RectF f31257e3;
    public final Paint f31258f3;
    public final y5 f31259g3;
    public Drawable f31260h3;
    public int f31261i3;
    public final Paint f31262j3;
    public final b21 f31263k3;

    public o11(b21 b21Var, Context context, int i9, n11 n11Var, i11 i11Var, i11 i11Var2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, 0, false, n11Var, i11Var, i11Var2, b6Var);
        this.f31263k3 = b21Var;
        this.f31254b3 = new org.telegram.ui.s10();
        gr grVar = gr.h;
        this.f31255c3 = new y5(this, 320L, grVar);
        this.f31256d3 = new y5(this, 320L, grVar);
        this.f31257e3 = new RectF();
        this.f31258f3 = new Paint(1);
        this.f31259g3 = new y5(this, 420L, grVar);
        this.f31262j3 = new Paint(1);
    }

    @Override
    public final Integer W0(int i9) {
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        int i9;
        float e10 = this.f31255c3.e(canScrollHorizontally(-1));
        float e11 = this.f31256d3.e(canScrollHorizontally(1));
        int i10 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
        if (i10 <= 0 && e11 <= 0.0f) {
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
        float f14 = 0.0f;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof v11) {
                v11 v11Var = (v11) childAt;
                if (v11Var.f33233s) {
                    if (width > v11Var.getX()) {
                        width = v11Var.getX();
                        RecyclerView.R(v11Var);
                    }
                    if (f14 < v11Var.getX() + v11Var.getWidth()) {
                        f14 = v11Var.getX() + v11Var.getWidth();
                        RecyclerView.R(v11Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.f34260l2;
        if (f14 > width) {
            int l1 = org.telegram.ui.ActionBar.f6.l1(0.06f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
            Paint paint = this.f31262j3;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            f10 = 14.0f;
            f11 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f14 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.f31260h3 == null) {
                this.f31260h3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22968b9, b6Var);
            if (this.f31261i3 != v02) {
                Drawable drawable = this.f31260h3;
                this.f31261i3 = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            this.f31260h3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f14), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f14 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.f31260h3.draw(canvas2);
        } else {
            f10 = 14.0f;
            f11 = 1.0f;
        }
        super.dispatchDraw(canvas);
        b21 b21Var = this.f31263k3;
        long j10 = b21Var.D;
        long j11 = b21Var.R;
        y5 y5Var = this.f31259g3;
        if (j10 != j11) {
            b21Var.E = j10;
            y5Var.d(0.0f, true);
        }
        b21Var.D = b21Var.R;
        v11 v11Var2 = null;
        v11 v11Var3 = null;
        int i12 = 0;
        while (i12 < getChildCount()) {
            View childAt2 = getChildAt(i12);
            if (childAt2 instanceof v11) {
                v11 v11Var4 = (v11) childAt2;
                if (!v11Var4.f33235x) {
                    i9 = i10;
                    if (v11Var4.getTopicId() == b21Var.R) {
                        v11Var2 = v11Var4;
                    }
                    f13 = e11;
                    if (v11Var4.getTopicId() == b21Var.E) {
                        v11Var3 = v11Var4;
                    }
                    i12++;
                    i10 = i9;
                    e11 = f13;
                }
            }
            f13 = e11;
            i9 = i10;
            i12++;
            i10 = i9;
            e11 = f13;
        }
        float f15 = e11;
        int i13 = i10;
        if (v11Var2 != null) {
            float x10 = v11Var2.getX() + AndroidUtilities.dp(f11);
            float y10 = v11Var2.getY() + AndroidUtilities.dp(4.0f);
            float x11 = (v11Var2.getX() + v11Var2.getWidth()) - AndroidUtilities.dp(f11);
            float y11 = (v11Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.f31257e3;
            rectF2.set(x10, y10, x11, y11);
            if (v11Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(v11Var3.getX() + AndroidUtilities.dp(f11), v11Var3.getY() + AndroidUtilities.dp(4.0f), (v11Var3.getX() + v11Var3.getWidth()) - AndroidUtilities.dp(f11), (v11Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, y5Var.d(1.0f, false), rectF2);
            }
            int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var), 31);
            Paint paint2 = this.f31258f3;
            paint2.setColor(k10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint2);
        }
        if (z10) {
            canvas2.save();
            org.telegram.ui.s10 s10Var = this.f31254b3;
            if (i13 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f12 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                s10Var.b(canvas2, rectF4, 0, e10);
            } else {
                f12 = 0.0f;
            }
            if (f15 > f12) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f12, getWidth(), getHeight());
                s10Var.b(canvas2, rectF5, 2, f15);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
