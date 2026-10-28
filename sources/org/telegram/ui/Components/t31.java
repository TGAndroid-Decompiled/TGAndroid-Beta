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
public final class t31 extends s71 {
    public final org.telegram.ui.y10 f32824n3;
    public final h6 f32825o3;
    public final h6 f32826p3;
    public final RectF f32827q3;
    public final Paint f32828r3;
    public final h6 f32829s3;
    public Drawable f32830t3;
    public int f32831u3;
    public final Paint f32832v3;
    public final f41 f32833w3;

    public t31(f41 f41Var, Context context, int i10, s31 s31Var, n31 n31Var, n31 n31Var2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, 0, false, s31Var, n31Var, n31Var2, u6Var);
        this.f32833w3 = f41Var;
        this.f32824n3 = new org.telegram.ui.y10();
        ds dsVar = ds.h;
        this.f32825o3 = new h6(this, 320L, dsVar);
        this.f32826p3 = new h6(this, 320L, dsVar);
        this.f32827q3 = new RectF();
        this.f32828r3 = new Paint(1);
        this.f32829s3 = new h6(this, 420L, dsVar);
        this.f32832v3 = new Paint(1);
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
        float e = this.f32825o3.e(canScrollHorizontally(-1));
        float e10 = this.f32826p3.e(canScrollHorizontally(1));
        int i11 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
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
        float f12 = 0.0f;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof a41) {
                a41 a41Var = (a41) childAt;
                if (a41Var.f26433s) {
                    if (width > a41Var.getX()) {
                        width = a41Var.getX();
                        RecyclerView.R(a41Var);
                    }
                    if (f12 < a41Var.getX() + a41Var.getWidth()) {
                        f12 = a41Var.getX() + a41Var.getWidth();
                        RecyclerView.R(a41Var);
                    }
                }
            }
        }
        int i13 = (f12 > width ? 1 : (f12 == width ? 0 : -1));
        org.telegram.ui.ActionBar.u6 u6Var = this.f30988n2;
        if (i13 > 0) {
            int o12 = org.telegram.ui.ActionBar.y6.o1(0.06f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, u6Var));
            Paint paint = this.f32832v3;
            paint.setColor(o12);
            RectF rectF = AndroidUtilities.rectTmp;
            f10 = 14.0f;
            f7 = 1.0f;
            rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, f12 - AndroidUtilities.dp(1.0f), (AndroidUtilities.dp(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
            if (this.f32830t3 == null) {
                this.f32830t3 = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23321b9, u6Var);
            if (this.f32831u3 != w02) {
                Drawable drawable = this.f32830t3;
                this.f32831u3 = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            this.f32830t3.setBounds((int) (AndroidUtilities.dp(-17.0f) + f12), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (f12 + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
            this.f32830t3.draw(canvas2);
        } else {
            f7 = 1.0f;
            f10 = 14.0f;
        }
        super.dispatchDraw(canvas);
        f41 f41Var = this.f32833w3;
        long j10 = f41Var.H;
        int i14 = (j10 > f41Var.f28014b0 ? 1 : (j10 == f41Var.f28014b0 ? 0 : -1));
        h6 h6Var = this.f32829s3;
        if (i14 != 0) {
            f41Var.I = j10;
            h6Var.d(0.0f, true);
        }
        f41Var.H = f41Var.f28014b0;
        a41 a41Var2 = null;
        a41 a41Var3 = null;
        int i15 = 0;
        while (i15 < getChildCount()) {
            View childAt2 = getChildAt(i15);
            if (childAt2 instanceof a41) {
                a41 a41Var4 = (a41) childAt2;
                if (!a41Var4.f26435x) {
                    i10 = i11;
                    if (a41Var4.getTopicId() == f41Var.f28014b0) {
                        a41Var2 = a41Var4;
                    }
                    z11 = z10;
                    if (a41Var4.getTopicId() == f41Var.I) {
                        a41Var3 = a41Var4;
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
        if (a41Var2 != null) {
            float x9 = a41Var2.getX() + AndroidUtilities.dp(f7);
            float y3 = a41Var2.getY() + AndroidUtilities.dp(4.0f);
            float x10 = (a41Var2.getX() + a41Var2.getWidth()) - AndroidUtilities.dp(f7);
            float y10 = (a41Var2.getY() + getHeight()) - AndroidUtilities.dp(4.0f);
            RectF rectF2 = this.f32827q3;
            rectF2.set(x9, y3, x10, y10);
            if (a41Var3 != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(a41Var3.getX() + AndroidUtilities.dp(f7), a41Var3.getY() + AndroidUtilities.dp(4.0f), (a41Var3.getX() + a41Var3.getWidth()) - AndroidUtilities.dp(f7), (a41Var3.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                AndroidUtilities.lerp(rectF3, rectF2, h6Var.d(f7, false), rectF2);
            }
            int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var), 31);
            Paint paint2 = this.f32828r3;
            paint2.setColor(o10);
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint2);
        }
        if (z12) {
            canvas2.save();
            org.telegram.ui.y10 y10Var = this.f32824n3;
            if (i16 > 0) {
                RectF rectF4 = AndroidUtilities.rectTmp;
                f11 = 0.0f;
                rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                y10Var.b(canvas2, rectF4, 0, e);
            } else {
                f11 = 0.0f;
            }
            if (e10 > f11) {
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getWidth() - AndroidUtilities.dp(12.0f), f11, getWidth(), getHeight());
                y10Var.b(canvas2, rectF5, 2, e10);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
