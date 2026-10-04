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
public final class j31 extends c71 {
    public final org.telegram.ui.k20 f27579m3;
    public final e6 f27580n3;
    public final e6 f27581o3;
    public final RectF f27582p3;
    public final Paint f27583q3;
    public final e6 f27584r3;
    public Drawable f27585s3;
    public int f27586t3;
    public final Paint f27587u3;
    public final v31 f27588v3;

    public j31(v31 v31Var, Context context, int i10, i31 i31Var, a31 a31Var, a31 a31Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, i31Var, a31Var, a31Var2, d6Var);
        this.f27588v3 = v31Var;
        this.f27579m3 = new org.telegram.ui.k20();
        tr trVar = tr.h;
        this.f27580n3 = new e6(this, 320L, trVar);
        this.f27581o3 = new e6(this, 320L, trVar);
        this.f27582p3 = new RectF();
        this.f27583q3 = new Paint(1);
        this.f27584r3 = new e6(this, 420L, trVar);
        this.f27587u3 = new Paint(1);
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
        float e7 = this.f27580n3.e(canScrollHorizontally(-1));
        float e10 = this.f27581o3.e(canScrollHorizontally(1));
        int i11 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
        if (i11 <= 0 && e10 <= 0.0f) {
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
            if (childAt instanceof q31) {
                q31 q31Var = (q31) childAt;
                if (q31Var.f29888s) {
                    if (width > q31Var.getX()) {
                        width = q31Var.getX();
                        RecyclerView.R(q31Var);
                    }
                    if (f13 < q31Var.getX() + q31Var.getWidth()) {
                        f13 = q31Var.getX() + q31Var.getWidth();
                        RecyclerView.R(q31Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f33546p2;
        if (f13 > width) {
            int l1 = org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var));
            Paint paint = this.f27587u3;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            f7 = 14.0f;
            f10 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f13 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.f27585s3 == null) {
                this.f27585s3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20784b9, d6Var);
            if (this.f27586t3 != v02) {
                Drawable drawable = this.f27585s3;
                this.f27586t3 = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            this.f27585s3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f13), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f13 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.f27585s3.draw(canvas2);
        } else {
            f7 = 14.0f;
            f10 = 1.0f;
        }
        super.dispatchDraw(canvas);
        v31 v31Var = this.f27588v3;
        long j3 = v31Var.H;
        long j10 = v31Var.V;
        e6 e6Var = this.f27584r3;
        if (j3 != j10) {
            v31Var.I = j3;
            e6Var.d(0.0f, true);
        }
        v31Var.H = v31Var.V;
        q31 q31Var2 = null;
        q31 q31Var3 = null;
        int i13 = 0;
        while (i13 < getChildCount()) {
            View childAt2 = getChildAt(i13);
            if (childAt2 instanceof q31) {
                q31 q31Var4 = (q31) childAt2;
                if (!q31Var4.f29890x) {
                    i10 = i11;
                    if (q31Var4.getTopicId() == v31Var.V) {
                        q31Var2 = q31Var4;
                    }
                    f12 = e10;
                    if (q31Var4.getTopicId() == v31Var.I) {
                        q31Var3 = q31Var4;
                    }
                    i13++;
                    i11 = i10;
                    e10 = f12;
                }
            }
            f12 = e10;
            i10 = i11;
            i13++;
            i11 = i10;
            e10 = f12;
        }
        float f14 = e10;
        int i14 = i11;
        if (q31Var2 != null) {
            float x10 = q31Var2.getX() + AndroidUtilities.dp(f10);
            float y3 = q31Var2.getY() + AndroidUtilities.dp(4.0f);
            float x11 = (q31Var2.getX() + q31Var2.getWidth()) - AndroidUtilities.dp(f10);
            float y10 = (q31Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.f27582p3;
            rectF2.set(x10, y3, x11, y10);
            if (q31Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(q31Var3.getX() + AndroidUtilities.dp(f10), q31Var3.getY() + AndroidUtilities.dp(4.0f), (q31Var3.getX() + q31Var3.getWidth()) - AndroidUtilities.dp(f10), (q31Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, e6Var.d(1.0f, false), rectF2);
            }
            int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var), 31);
            Paint paint2 = this.f27583q3;
            paint2.setColor(k10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), paint2);
        }
        if (z10) {
            canvas2.save();
            org.telegram.ui.k20 k20Var = this.f27579m3;
            if (i14 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f11 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                k20Var.b(canvas2, rectF4, 0, e7);
            } else {
                f11 = 0.0f;
            }
            if (f14 > f11) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f11, getWidth(), getHeight());
                k20Var.b(canvas2, rectF5, 2, f14);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
