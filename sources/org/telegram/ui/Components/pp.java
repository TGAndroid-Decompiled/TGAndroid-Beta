package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
public final class pp extends hi.m3 {
    public final int X0 = 0;
    public final Object Y0;
    public final Object Z0;

    public pp(Activity activity, int i7, org.telegram.ui.Components.voip.l1 l1Var, boolean z10) {
        super(activity, i7);
        Paint paint = new Paint(1);
        this.Y0 = paint;
        this.Z0 = l1Var;
        l1Var.a(this);
        paint.setPathEffect(new CornerPathEffect(this.f15017w));
        if (z10) {
            k(true);
        }
    }

    @Override
    public void c(Canvas canvas, float f10) {
        switch (this.X0) {
            case 1:
                Paint paint = (Paint) this.Y0;
                org.telegram.ui.Components.voip.l1 l1Var = (org.telegram.ui.Components.voip.l1) this.Z0;
                paint.setShader(l1Var.b().getShader());
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.G.getAlpha(), l1Var.b().getAlpha()) * f10), 31);
                Path path = this.F0;
                canvas.drawPath(path, paint);
                if (l1Var.f41021e) {
                    paint.setShader(((Paint) l1Var.d.f341a).getShader());
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
        switch (this.X0) {
            case 1:
                ((org.telegram.ui.Components.voip.l1) this.Z0).d(getX(), getY());
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.X0) {
            case 0:
                mh0[] mh0VarArr = (mh0[]) this.Y0;
                if ((mh0VarArr != null && (drawable == mh0VarArr[0] || drawable == mh0VarArr[1])) || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public pp(Activity activity) {
        super(activity, 3);
        int i7 = 0;
        this.Y0 = new mh0[2];
        this.Z0 = new int[2];
        r(true);
        this.L = Layout.Alignment.ALIGN_NORMAL;
        this.d = 3200L;
        this.U = true;
        this.f14995e = true;
        n(8.0f, 6.0f, 10.0f, 6.0f);
        this.f15016v0 = 0.0f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        while (i7 < 2) {
            ((mh0[]) this.Y0)[i7] = new mh0(i7 == 0 ? 2131624291 : 2131624290, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            ((mh0[]) this.Y0)[i7].setCallback(this);
            if (i7 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "x");
            spannableStringBuilder.setSpan(new op(((mh0[]) this.Y0)[i7]), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.M0(i7 == 0 ? 2131749106 : 2131749107, null));
            i7++;
        }
        v(spannableStringBuilder);
    }
}
