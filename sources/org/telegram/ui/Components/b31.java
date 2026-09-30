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
public final class b31 extends u61 {
    public final org.telegram.ui.g20 f22805m3;
    public final e6 f22806n3;
    public final e6 f22807o3;
    public final RectF f22808p3;
    public final Paint f22809q3;
    public final e6 f22810r3;
    public Drawable f22811s3;
    public int f22812t3;
    public final Paint f22813u3;
    public final n31 f22814v3;

    public b31(n31 n31Var, Context context, int i10, a31 a31Var, s21 s21Var, s21 s21Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, a31Var, s21Var, s21Var2, d6Var);
        this.f22814v3 = n31Var;
        this.f22805m3 = new org.telegram.ui.g20();
        tr trVar = tr.h;
        this.f22806n3 = new e6(this, 320L, trVar);
        this.f22807o3 = new e6(this, 320L, trVar);
        this.f22808p3 = new RectF();
        this.f22809q3 = new Paint(1);
        this.f22810r3 = new e6(this, 420L, trVar);
        this.f22813u3 = new Paint(1);
    }

    @Override
    public final Integer X0(int i10) {
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        float e = this.f22806n3.e(canScrollHorizontally(-1));
        float e7 = this.f22807o3.e(canScrollHorizontally(1));
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
        float f13 = 0.0f;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof i31) {
                i31 i31Var = (i31) childAt;
                if (i31Var.f25008s) {
                    if (width > i31Var.getX()) {
                        width = i31Var.getX();
                        RecyclerView.R(i31Var);
                    }
                    if (f13 < i31Var.getX() + i31Var.getWidth()) {
                        f13 = i31Var.getX() + i31Var.getWidth();
                        RecyclerView.R(i31Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f31015p2;
        if (f13 > width) {
            int l1 = org.telegram.ui.ActionBar.h6.l1(0.06f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
            Paint paint = this.f22813u3;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            f7 = 14.0f;
            f10 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f13 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.f22811s3 == null) {
                this.f22811s3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19042b9, d6Var);
            if (this.f22812t3 != v02) {
                Drawable drawable = this.f22811s3;
                this.f22812t3 = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            this.f22811s3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f13), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f13 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.f22811s3.draw(canvas2);
        } else {
            f7 = 14.0f;
            f10 = 1.0f;
        }
        super.dispatchDraw(canvas);
        n31 n31Var = this.f22814v3;
        long j3 = n31Var.H;
        long j10 = n31Var.V;
        e6 e6Var = this.f22810r3;
        if (j3 != j10) {
            n31Var.I = j3;
            e6Var.d(0.0f, true);
        }
        n31Var.H = n31Var.V;
        i31 i31Var2 = null;
        i31 i31Var3 = null;
        int i13 = 0;
        while (i13 < getChildCount()) {
            View childAt2 = getChildAt(i13);
            if (childAt2 instanceof i31) {
                i31 i31Var4 = (i31) childAt2;
                if (!i31Var4.f25010x) {
                    i10 = i11;
                    if (i31Var4.getTopicId() == n31Var.V) {
                        i31Var2 = i31Var4;
                    }
                    f12 = e7;
                    if (i31Var4.getTopicId() == n31Var.I) {
                        i31Var3 = i31Var4;
                    }
                    i13++;
                    i11 = i10;
                    e7 = f12;
                }
            }
            f12 = e7;
            i10 = i11;
            i13++;
            i11 = i10;
            e7 = f12;
        }
        float f14 = e7;
        int i14 = i11;
        if (i31Var2 != null) {
            float x10 = i31Var2.getX() + AndroidUtilities.dp(f10);
            float y3 = i31Var2.getY() + AndroidUtilities.dp(4.0f);
            float x11 = (i31Var2.getX() + i31Var2.getWidth()) - AndroidUtilities.dp(f10);
            float y10 = (i31Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.f22808p3;
            rectF2.set(x10, y3, x11, y10);
            if (i31Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(i31Var3.getX() + AndroidUtilities.dp(f10), i31Var3.getY() + AndroidUtilities.dp(4.0f), (i31Var3.getX() + i31Var3.getWidth()) - AndroidUtilities.dp(f10), (i31Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, e6Var.d(1.0f, false), rectF2);
            }
            int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var), 31);
            Paint paint2 = this.f22809q3;
            paint2.setColor(k10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), paint2);
        }
        if (z10) {
            canvas2.save();
            org.telegram.ui.g20 g20Var = this.f22805m3;
            if (i14 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f11 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                g20Var.b(canvas2, rectF4, 0, e);
            } else {
                f11 = 0.0f;
            }
            if (f14 > f11) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f11, getWidth(), getHeight());
                g20Var.b(canvas2, rectF5, 2, f14);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
