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

public final class z extends ReplacementSpan {
    public static final int d = 0;

    public final int f35102a;

    public final Object f35103b;

    public final Object f35104c;

    public z(View[] viewArr) {
        this.f35102a = 2;
        this.f35103b = new er(0.33d, 0.0d, 0.67d, 1.0d);
        this.f35104c = viewArr;
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        switch (this.f35102a) {
            case 0:
                float f11 = (i12 + i14) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, f11 - AndroidUtilities.dp(7.66f), ((pz0) this.f35104c).f31697c + f10 + AndroidUtilities.dp(6.66f), AndroidUtilities.dp(7.66f) + f11);
                canvas.saveLayerAlpha(rectF, 255, 31);
                Paint paint2 = (Paint) this.f35103b;
                paint2.setColor(paint.getColor());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
                ((pz0) this.f35104c).c(AndroidUtilities.dp(3.33f) + f10, f11, 1.0f, -1, canvas);
                canvas.restore();
                break;
            case 1:
                float fDpf2 = AndroidUtilities.dpf2(14.66f);
                float f12 = (i12 + i14) / 2.0f;
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f13 = fDpf2 / 2.0f;
                rectF2.set(f10, f12 - f13, ((int) (((pz0) this.f35104c).f31697c + AndroidUtilities.dp(10.0f))) + f10, f13 + f12);
                Paint paint3 = (Paint) this.f35103b;
                int i15 = org.telegram.ui.ActionBar.g6.f23441z6;
                paint3.setColor(org.telegram.ui.ActionBar.g6.l1(0.15f, org.telegram.ui.ActionBar.g6.w0(null, i15, false)));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint3);
                ((pz0) this.f35104c).c(f10 + AndroidUtilities.dp(5.0f), f12, Utilities.clamp((paint.getAlpha() * 2) / 255.0f, 1.0f, 0.0f), org.telegram.ui.ActionBar.g6.w0(null, i15, false), canvas);
                break;
            default:
                er erVar = (er) this.f35103b;
                canvas.save();
                canvas.translate(f10 + AndroidUtilities.dp(4.0f), i13 / 2.0f);
                long jUptimeMillis = (SystemClock.uptimeMillis() % 250) + 500;
                for (int i16 = 0; i16 < 3; i16++) {
                    float fMin = Math.min(1.0f, (((((long) i16) * 250) + jUptimeMillis) % 750) / 667.0f);
                    canvas.drawCircle(AndroidUtilities.dpf2((erVar.getInterpolation(fMin) * 16.0f) + 1.667f), AndroidUtilities.dp(3.0f), AndroidUtilities.dpf2((fMin <= 0.425f ? erVar.getInterpolation(fMin / 0.425f) : 1.0f - erVar.getInterpolation((fMin - 0.425f) / 0.575f)) * 2.0f), paint);
                }
                canvas.restore();
                for (View view : (View[]) this.f35104c) {
                    view.invalidate();
                }
                break;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.f35102a) {
            case 0:
                return (int) (((pz0) this.f35104c).f31697c + AndroidUtilities.dp(6.66f));
            case 1:
                return (int) (((pz0) this.f35104c).f31697c + AndroidUtilities.dp(10.0f));
            default:
                return AndroidUtilities.dp(20.0f);
        }
    }

    public z(int i10) {
        this.f35102a = 1;
        this.f35103b = new Paint(1);
        this.f35104c = new pz0(LocaleController.formatPluralString("BusinessRepliesMore", i10, new Object[0]), 9.33f, AndroidUtilities.bold());
    }

    public z() {
        this.f35102a = 0;
        this.f35103b = new Paint(1);
        pz0 pz0Var = new pz0("x50", 13.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.f35104c = pz0Var;
        pz0Var.f31695a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
