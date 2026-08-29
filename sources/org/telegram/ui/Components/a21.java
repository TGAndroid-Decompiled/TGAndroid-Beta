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
public final class a21 extends u51 {
    public final org.telegram.ui.u10 f26630b3;
    public final d6 c3;
    public final d6 f26631d3;
    public final RectF f26632e3;
    public final Paint f26633f3;
    public final d6 f26634g3;
    public Drawable f26635h3;
    public int f26636i3;
    public final Paint f26637j3;
    public final m21 f26638k3;

    public a21(m21 m21Var, Context context, int i10, z11 z11Var, u11 u11Var, u11 u11Var2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, 0, false, z11Var, u11Var, u11Var2, c6Var);
        this.f26638k3 = m21Var;
        this.f26630b3 = new org.telegram.ui.u10();
        jr jrVar = jr.h;
        this.c3 = new d6(this, 320L, jrVar);
        this.f26631d3 = new d6(this, 320L, jrVar);
        this.f26632e3 = new RectF();
        this.f26633f3 = new Paint(1);
        this.f26634g3 = new d6(this, 420L, jrVar);
        this.f26637j3 = new Paint(1);
    }

    @Override
    public final Integer W0(int i10) {
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        float f9;
        float f10;
        float f11;
        float f12;
        int i10;
        float e10 = this.c3.e(canScrollHorizontally(-1));
        float e11 = this.f26631d3.e(canScrollHorizontally(1));
        int i11 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
        if (i11 <= 0 && e11 <= 0.0f) {
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
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof h21) {
                h21 h21Var = (h21) childAt;
                if (h21Var.f29044s) {
                    if (width > h21Var.getX()) {
                        width = h21Var.getX();
                        RecyclerView.R(h21Var);
                    }
                    if (f13 < h21Var.getX() + h21Var.getWidth()) {
                        f13 = h21Var.getX() + h21Var.getWidth();
                        RecyclerView.R(h21Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f29709l2;
        if (f13 > width) {
            int l1 = org.telegram.ui.ActionBar.g6.l1(0.06f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            Paint paint = this.f26637j3;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            f9 = 14.0f;
            f10 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f13 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.f26635h3 == null) {
                this.f26635h3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23030b9, c6Var);
            if (this.f26636i3 != v02) {
                Drawable drawable = this.f26635h3;
                this.f26636i3 = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            this.f26635h3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f13), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f13 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.f26635h3.draw(canvas2);
        } else {
            f9 = 14.0f;
            f10 = 1.0f;
        }
        super.dispatchDraw(canvas);
        m21 m21Var = this.f26638k3;
        long j10 = m21Var.D;
        long j11 = m21Var.R;
        d6 d6Var = this.f26634g3;
        if (j10 != j11) {
            m21Var.E = j10;
            d6Var.d(0.0f, true);
        }
        m21Var.D = m21Var.R;
        h21 h21Var2 = null;
        h21 h21Var3 = null;
        int i13 = 0;
        while (i13 < getChildCount()) {
            View childAt2 = getChildAt(i13);
            if (childAt2 instanceof h21) {
                h21 h21Var4 = (h21) childAt2;
                if (!h21Var4.f29046x) {
                    i10 = i11;
                    if (h21Var4.getTopicId() == m21Var.R) {
                        h21Var2 = h21Var4;
                    }
                    f12 = e11;
                    if (h21Var4.getTopicId() == m21Var.E) {
                        h21Var3 = h21Var4;
                    }
                    i13++;
                    i11 = i10;
                    e11 = f12;
                }
            }
            f12 = e11;
            i10 = i11;
            i13++;
            i11 = i10;
            e11 = f12;
        }
        float f14 = e11;
        int i14 = i11;
        if (h21Var2 != null) {
            float x4 = h21Var2.getX() + AndroidUtilities.dp(f10);
            float y8 = h21Var2.getY() + AndroidUtilities.dp(4.0f);
            float x10 = (h21Var2.getX() + h21Var2.getWidth()) - AndroidUtilities.dp(f10);
            float y10 = (h21Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.f26632e3;
            rectF2.set(x4, y8, x10, y10);
            if (h21Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(h21Var3.getX() + AndroidUtilities.dp(f10), h21Var3.getY() + AndroidUtilities.dp(4.0f), (h21Var3.getX() + h21Var3.getWidth()) - AndroidUtilities.dp(f10), (h21Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, d6Var.d(1.0f, false), rectF2);
            }
            int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var), 31);
            Paint paint2 = this.f26633f3;
            paint2.setColor(k9);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f9), AndroidUtilities.dp(f9), paint2);
        }
        if (z10) {
            canvas2.save();
            org.telegram.ui.u10 u10Var = this.f26630b3;
            if (i14 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f11 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                u10Var.b(canvas2, rectF4, 0, e10);
            } else {
                f11 = 0.0f;
            }
            if (f14 > f11) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f11, getWidth(), getHeight());
                u10Var.b(canvas2, rectF5, 2, f14);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
