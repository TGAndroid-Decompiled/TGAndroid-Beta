package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
public final class b0 extends ReplacementSpan {
    public static final int d = 0;
    public final int f26926a;
    public final Object f26927b;
    public final Object f26928c;

    public b0(View[] viewArr) {
        this.f26926a = 2;
        this.f26927b = new jr(0.33d, 0.0d, 0.67d, 1.0d);
        this.f26928c = viewArr;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f9, int i12, int i13, int i14, Paint paint) {
        float interpolation;
        switch (this.f26926a) {
            case 0:
                float f10 = (i12 + i14) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f9, f10 - AndroidUtilities.dp(7.66f), ((zz0) this.f26928c).f35462c + f9 + AndroidUtilities.dp(6.66f), AndroidUtilities.dp(7.66f) + f10);
                canvas.saveLayerAlpha(rectF, 255, 31);
                Paint paint2 = (Paint) this.f26927b;
                paint2.setColor(paint.getColor());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
                ((zz0) this.f26928c).c(AndroidUtilities.dp(3.33f) + f9, f10, 1.0f, -1, canvas);
                canvas.restore();
                return;
            case 1:
                float dpf2 = AndroidUtilities.dpf2(14.66f);
                float f11 = (i12 + i14) / 2.0f;
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f12 = dpf2 / 2.0f;
                rectF2.set(f9, f11 - f12, ((int) (((zz0) this.f26928c).f35462c + AndroidUtilities.dp(10.0f))) + f9, f12 + f11);
                Paint paint3 = (Paint) this.f26927b;
                int i15 = org.telegram.ui.ActionBar.g6.f23450z6;
                paint3.setColor(org.telegram.ui.ActionBar.g6.l1(0.15f, org.telegram.ui.ActionBar.g6.w0(null, i15, false)));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                ((zz0) this.f26928c).c(f9 + AndroidUtilities.dp(5.0f), f11, Utilities.clamp((paint.getAlpha() * 2) / 255.0f, 1.0f, 0.0f), org.telegram.ui.ActionBar.g6.w0(null, i15, false), canvas);
                return;
            default:
                jr jrVar = (jr) this.f26927b;
                canvas.save();
                canvas.translate(f9 + AndroidUtilities.dp(4.0f), i13 / 2.0f);
                long uptimeMillis = (SystemClock.uptimeMillis() % 250) + 500;
                for (int i16 = 0; i16 < 3; i16++) {
                    float min = Math.min(1.0f, ((float) (((i16 * 250) + uptimeMillis) % 750)) / 667.0f);
                    if (min <= 0.425f) {
                        interpolation = jrVar.getInterpolation(min / 0.425f);
                    } else {
                        interpolation = 1.0f - jrVar.getInterpolation((min - 0.425f) / 0.575f);
                    }
                    canvas.drawCircle(AndroidUtilities.dpf2((jrVar.getInterpolation(min) * 16.0f) + 1.667f), AndroidUtilities.dp(3.0f), AndroidUtilities.dpf2(interpolation * 2.0f), paint);
                }
                canvas.restore();
                for (View view : (View[]) this.f26928c) {
                    view.invalidate();
                }
                return;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f26926a) {
            case 0:
                return (int) (((zz0) this.f26928c).f35462c + AndroidUtilities.dp(6.66f));
            case 1:
                return (int) (((zz0) this.f26928c).f35462c + AndroidUtilities.dp(10.0f));
            default:
                return AndroidUtilities.dp(20.0f);
        }
    }

    public b0(int i10) {
        this.f26926a = 1;
        this.f26927b = new Paint(1);
        this.f26928c = new zz0(LocaleController.formatPluralString("BusinessRepliesMore", i10, new Object[0]), 9.33f, AndroidUtilities.bold());
    }

    public b0() {
        this.f26926a = 0;
        this.f26927b = new Paint(1);
        zz0 zz0Var = new zz0("x50", 13.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f26928c = zz0Var;
        zz0Var.f35460a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
