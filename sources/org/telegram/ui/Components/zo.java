package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
public final class zo extends fi.m3 {
    public final int W0 = 0;
    public final Object X0;
    public final Object Y0;

    public zo(Activity activity, int i7, org.telegram.ui.Components.voip.i1 i1Var, boolean z9) {
        super(activity, i7);
        Paint paint = new Paint(1);
        this.X0 = paint;
        this.Y0 = i1Var;
        i1Var.a(this);
        paint.setPathEffect(new CornerPathEffect(this.f12444w));
        if (z9) {
            k(true);
        }
    }

    @Override
    public void c(Canvas canvas, float f10) {
        switch (this.W0) {
            case 1:
                Paint paint = (Paint) this.X0;
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.Y0;
                paint.setShader(i1Var.b().getShader());
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.F.getAlpha(), i1Var.b().getAlpha()) * f10), 31);
                Path path = this.E0;
                canvas.drawPath(path, paint);
                if (i1Var.f39202e) {
                    paint.setShader(((Paint) i1Var.d.f335a).getShader());
                    canvas.drawPath(path, paint);
                }
                canvas.restore();
                return;
            default:
                super.c(canvas, f10);
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.W0) {
            case 1:
                ((org.telegram.ui.Components.voip.i1) this.Y0).d(getX(), getY());
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.W0) {
            case 0:
                zg0[] zg0VarArr = (zg0[]) this.X0;
                if ((zg0VarArr != null && (drawable == zg0VarArr[0] || drawable == zg0VarArr[1])) || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public zo(Activity activity) {
        super(activity, 3);
        int i7 = 0;
        this.X0 = new zg0[2];
        this.Y0 = new int[2];
        r(true);
        this.K = Layout.Alignment.ALIGN_NORMAL;
        this.d = 3200L;
        this.T = true;
        this.f12422e = true;
        n(8.0f, 6.0f, 10.0f, 6.0f);
        this.f12442u0 = 0.0f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        while (i7 < 2) {
            ((zg0[]) this.X0)[i7] = new zg0(i7 == 0 ? 2131624290 : 2131624289, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            ((zg0[]) this.X0)[i7].setCallback(this);
            if (i7 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "x");
            spannableStringBuilder.setSpan(new yo(((zg0[]) this.X0)[i7]), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(i7 == 0 ? 2131749297 : 2131749298, null));
            i7++;
        }
        u(spannableStringBuilder);
    }
}
