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
public final class k31 extends e71 {
    public final org.telegram.ui.k20 f28042m3;
    public final e6 f28043n3;
    public final e6 f28044o3;
    public final RectF f28045p3;
    public final Paint f28046q3;
    public final e6 f28047r3;
    public Drawable f28048s3;
    public int f28049t3;
    public final Paint f28050u3;
    public final w31 f28051v3;

    public k31(w31 w31Var, Context context, int i10, j31 j31Var, b31 b31Var, b31 b31Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, 0, false, j31Var, b31Var, b31Var2, d6Var);
        this.f28051v3 = w31Var;
        this.f28042m3 = new org.telegram.ui.k20();
        tr trVar = tr.h;
        this.f28043n3 = new e6(this, 320L, trVar);
        this.f28044o3 = new e6(this, 320L, trVar);
        this.f28045p3 = new RectF();
        this.f28046q3 = new Paint(1);
        this.f28047r3 = new e6(this, 420L, trVar);
        this.f28050u3 = new Paint(1);
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
        float f12;
        int i10;
        float e7 = this.f28043n3.e(canScrollHorizontally(-1));
        float e10 = this.f28044o3.e(canScrollHorizontally(1));
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
            if (childAt instanceof r31) {
                r31 r31Var = (r31) childAt;
                if (r31Var.f30348s) {
                    if (width > r31Var.getX()) {
                        width = r31Var.getX();
                        RecyclerView.R(r31Var);
                    }
                    if (f13 < r31Var.getX() + r31Var.getWidth()) {
                        f13 = r31Var.getX() + r31Var.getWidth();
                        RecyclerView.R(r31Var);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f33560p2;
        if (f13 > width) {
            int l1 = org.telegram.ui.ActionBar.i6.l1(0.06f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var));
            Paint paint = this.f28050u3;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            f7 = 14.0f;
            f10 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f13 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.f28048s3 == null) {
                this.f28048s3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20793b9, d6Var);
            if (this.f28049t3 != v02) {
                Drawable drawable = this.f28048s3;
                this.f28049t3 = v02;
                drawable.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
            }
            this.f28048s3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f13), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f13 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.f28048s3.draw(canvas2);
        } else {
            f7 = 14.0f;
            f10 = 1.0f;
        }
        super.dispatchDraw(canvas);
        w31 w31Var = this.f28051v3;
        long j3 = w31Var.H;
        long j10 = w31Var.V;
        e6 e6Var = this.f28047r3;
        if (j3 != j10) {
            w31Var.I = j3;
            e6Var.d(0.0f, true);
        }
        w31Var.H = w31Var.V;
        r31 r31Var2 = null;
        r31 r31Var3 = null;
        int i13 = 0;
        while (i13 < getChildCount()) {
            View childAt2 = getChildAt(i13);
            if (childAt2 instanceof r31) {
                r31 r31Var4 = (r31) childAt2;
                if (!r31Var4.f30350x) {
                    i10 = i11;
                    if (r31Var4.getTopicId() == w31Var.V) {
                        r31Var2 = r31Var4;
                    }
                    f12 = e10;
                    if (r31Var4.getTopicId() == w31Var.I) {
                        r31Var3 = r31Var4;
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
        if (r31Var2 != null) {
            float x10 = r31Var2.getX() + AndroidUtilities.dp(f10);
            float y3 = r31Var2.getY() + AndroidUtilities.dp(4.0f);
            float x11 = (r31Var2.getX() + r31Var2.getWidth()) - AndroidUtilities.dp(f10);
            float y10 = (r31Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.f28045p3;
            rectF2.set(x10, y3, x11, y10);
            if (r31Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(r31Var3.getX() + AndroidUtilities.dp(f10), r31Var3.getY() + AndroidUtilities.dp(4.0f), (r31Var3.getX() + r31Var3.getWidth()) - AndroidUtilities.dp(f10), (r31Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, e6Var.d(1.0f, false), rectF2);
            }
            int k10 = i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var), 31);
            Paint paint2 = this.f28046q3;
            paint2.setColor(k10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), paint2);
        }
        if (z10) {
            canvas2.save();
            org.telegram.ui.k20 k20Var = this.f28042m3;
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
