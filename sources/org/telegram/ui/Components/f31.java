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
public final class f31 extends c71 {
    public final org.telegram.ui.s10 f26070d3;
    public final f6 f26071e3;
    public final f6 f26072f3;
    public final RectF f26073g3;
    public final Paint f26074h3;
    public final f6 f26075i3;
    public Drawable f26076j3;
    public int f26077k3;
    public final Paint f26078l3;
    public final s31 f26079m3;

    public f31(s31 s31Var, Context context, int i10, e31 e31Var, z21 z21Var, z21 z21Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, e31Var, z21Var, z21Var2, d6Var);
        this.f26079m3 = s31Var;
        this.f26070d3 = new org.telegram.ui.s10();
        bs bsVar = bs.h;
        this.f26071e3 = new f6(this, 320L, bsVar);
        this.f26072f3 = new f6(this, 320L, bsVar);
        this.f26073g3 = new RectF();
        this.f26074h3 = new Paint(1);
        this.f26075i3 = new f6(this, 420L, bsVar);
        this.f26078l3 = new Paint(1);
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
        float e = this.f26071e3.e(canScrollHorizontally(-1));
        float e7 = this.f26072f3.e(canScrollHorizontally(1));
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
            if (childAt instanceof m31) {
                m31 m31Var = (m31) childAt;
                if (m31Var.f28379s) {
                    if (width > m31Var.getX()) {
                        width = m31Var.getX();
                        RecyclerView.R(m31Var);
                    }
                    if (f12 < m31Var.getX() + m31Var.getWidth()) {
                        f12 = m31Var.getX() + m31Var.getWidth();
                        RecyclerView.R(m31Var);
                    }
                }
            }
        }
        int i13 = (f12 > width ? 1 : (f12 == width ? 0 : -1));
        org.telegram.ui.ActionBar.d6 d6Var = this.f27583n2;
        if (i13 > 0) {
            int m12 = org.telegram.ui.ActionBar.h6.m1(0.06f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
            Paint paint = this.f26078l3;
            paint.setColor(m12);
            RectF rectF = AndroidUtilities.rectTmp;
            f10 = 14.0f;
            f7 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f12 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.f26076j3 == null) {
                this.f26076j3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20958b9, d6Var);
            if (this.f26077k3 != w02) {
                Drawable drawable = this.f26076j3;
                this.f26077k3 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            this.f26076j3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f12), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f12 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.f26076j3.draw(canvas2);
        } else {
            f7 = 1.0f;
            f10 = 14.0f;
        }
        super.dispatchDraw(canvas);
        s31 s31Var = this.f26079m3;
        long j10 = s31Var.H;
        int i14 = (j10 > s31Var.V ? 1 : (j10 == s31Var.V ? 0 : -1));
        f6 f6Var = this.f26075i3;
        if (i14 != 0) {
            s31Var.I = j10;
            f6Var.d(0.0f, true);
        }
        s31Var.H = s31Var.V;
        m31 m31Var2 = null;
        m31 m31Var3 = null;
        int i15 = 0;
        while (i15 < getChildCount()) {
            View childAt2 = getChildAt(i15);
            if (childAt2 instanceof m31) {
                m31 m31Var4 = (m31) childAt2;
                if (!m31Var4.f28381x) {
                    i10 = i11;
                    if (m31Var4.getTopicId() == s31Var.V) {
                        m31Var2 = m31Var4;
                    }
                    z11 = z10;
                    if (m31Var4.getTopicId() == s31Var.I) {
                        m31Var3 = m31Var4;
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
        if (m31Var2 != null) {
            float x10 = m31Var2.getX() + AndroidUtilities.dp(f7);
            float y3 = m31Var2.getY() + AndroidUtilities.dp(4.0f);
            float x11 = (m31Var2.getX() + m31Var2.getWidth()) - AndroidUtilities.dp(f7);
            float y10 = (m31Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.f26073g3;
            rectF2.set(x10, y3, x11, y10);
            if (m31Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(m31Var3.getX() + AndroidUtilities.dp(f7), m31Var3.getY() + AndroidUtilities.dp(4.0f), (m31Var3.getX() + m31Var3.getWidth()) - AndroidUtilities.dp(f7), (m31Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, f6Var.d(f7, false), rectF2);
            }
            int o10 = i0.a.o(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var), 31);
            Paint paint2 = this.f26074h3;
            paint2.setColor(o10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint2);
        }
        if (z12) {
            canvas2.save();
            org.telegram.ui.s10 s10Var = this.f26070d3;
            if (i16 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f11 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                s10Var.b(canvas2, rectF4, 0, e);
            } else {
                f11 = 0.0f;
            }
            if (e7 > f11) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f11, getWidth(), getHeight());
                s10Var.b(canvas2, rectF5, 2, e7);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
