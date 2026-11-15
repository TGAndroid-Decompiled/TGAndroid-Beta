package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
public final class ip extends hi.l3 {
    public final int X0 = 0;
    public final Object Y0;
    public final Object Z0;

    public ip(Activity activity, int i7, org.telegram.ui.Components.voip.m1 m1Var, boolean z10) {
        super(activity, i7);
        Paint paint = new Paint(1);
        this.Y0 = paint;
        this.Z0 = m1Var;
        m1Var.a(this);
        paint.setPathEffect(new CornerPathEffect(this.f14576w));
        if (z10) {
            k(true);
        }
    }

    @Override
    public void c(Canvas canvas, float f10) {
        switch (this.X0) {
            case 1:
                Paint paint = (Paint) this.Y0;
                org.telegram.ui.Components.voip.m1 m1Var = (org.telegram.ui.Components.voip.m1) this.Z0;
                paint.setShader(m1Var.b().getShader());
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.G.getAlpha(), m1Var.b().getAlpha()) * f10), 31);
                Path path = this.F0;
                canvas.drawPath(path, paint);
                if (m1Var.f40778e) {
                    paint.setShader(((Paint) m1Var.d.f341a).getShader());
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
                ((org.telegram.ui.Components.voip.m1) this.Z0).d(getX(), getY());
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
                ch0[] ch0VarArr = (ch0[]) this.Y0;
                if ((ch0VarArr != null && (drawable == ch0VarArr[0] || drawable == ch0VarArr[1])) || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public ip(Activity activity) {
        super(activity, 3);
        int i7 = 0;
        this.Y0 = new ch0[2];
        this.Z0 = new int[2];
        r(true);
        this.L = Layout.Alignment.ALIGN_NORMAL;
        this.d = 3200L;
        this.U = true;
        this.f14554e = true;
        n(8.0f, 6.0f, 10.0f, 6.0f);
        this.f14575v0 = 0.0f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        while (i7 < 2) {
            ((ch0[]) this.Y0)[i7] = new ch0(i7 == 0 ? 2131624291 : 2131624290, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            ((ch0[]) this.Y0)[i7].setCallback(this);
            if (i7 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "x");
            spannableStringBuilder.setSpan(new hp(((ch0[]) this.Y0)[i7]), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(i7 == 0 ? 2131749298 : 2131749299, null));
            i7++;
        }
        u(spannableStringBuilder);
    }
}
