package org.telegram.ui.Components.voip;

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
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Text;

public final class VoIPEllipsizeSpan extends ReplacementSpan {
    public static final int $r8$clinit = 0;
    public final int $r8$classId;
    public final Object interpolator;
    public final Object parents;

    public VoIPEllipsizeSpan() {
        this.$r8$classId = 2;
        this.interpolator = new Paint(1);
        Text text = new Text("x50", 13.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.parents = text;
        text.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        switch (this.$r8$classId) {
            case 0:
                canvas.save();
                canvas.translate(f + AndroidUtilities.dp(4.0f), i4 / 2.0f);
                long jUptimeMillis = (SystemClock.uptimeMillis() % 250) + 500;
                for (int i6 = 0; i6 < 3; i6++) {
                    float fMin = Math.min(1.0f, (((((long) i6) * 250) + jUptimeMillis) % 750) / 667.0f);
                    CubicBezierInterpolator cubicBezierInterpolator = (CubicBezierInterpolator) this.interpolator;
                    canvas.drawCircle(AndroidUtilities.dpf2((cubicBezierInterpolator.getInterpolation(fMin) * 16.0f) + 1.667f), AndroidUtilities.dp(3.0f), AndroidUtilities.dpf2((fMin <= 0.425f ? cubicBezierInterpolator.getInterpolation(fMin / 0.425f) : 1.0f - cubicBezierInterpolator.getInterpolation((fMin - 0.425f) / 0.575f)) * 2.0f), paint);
                }
                canvas.restore();
                for (View view : (View[]) this.parents) {
                    view.invalidate();
                }
                break;
            case 1:
                float fDpf2 = AndroidUtilities.dpf2(14.66f);
                float f2 = (i3 + i5) / 2.0f;
                RectF rectF = AndroidUtilities.rectTmp;
                float f3 = fDpf2 / 2.0f;
                rectF.set(f, f2 - f3, ((int) (((Text) this.parents).width + AndroidUtilities.dp(10.0f))) + f, f3 + f2);
                Paint paint2 = (Paint) this.interpolator;
                int i7 = Theme.key_windowBackgroundWhiteGrayText2;
                paint2.setColor(Theme.multAlpha(0.15f, Theme.getColor(null, i7, false)));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
                ((Text) this.parents).draw(f + AndroidUtilities.dp(5.0f), f2, Utilities.clamp((paint.getAlpha() * 2) / 255.0f, 1.0f, 0.0f), Theme.getColor(null, i7, false), canvas);
                break;
            default:
                float f4 = (i3 + i5) / 2.0f;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(f, f4 - AndroidUtilities.dp(7.66f), ((Text) this.parents).width + f + AndroidUtilities.dp(6.66f), AndroidUtilities.dp(7.66f) + f4);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                Paint paint3 = (Paint) this.interpolator;
                paint3.setColor(paint.getColor());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint3);
                ((Text) this.parents).draw(f + AndroidUtilities.dp(3.33f), f4, 1.0f, -1, canvas);
                canvas.restore();
                break;
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.$r8$classId) {
            case 0:
                return AndroidUtilities.dp(20.0f);
            case 1:
                return (int) (((Text) this.parents).width + AndroidUtilities.dp(10.0f));
            default:
                return (int) (((Text) this.parents).width + AndroidUtilities.dp(6.66f));
        }
    }

    public VoIPEllipsizeSpan(int i) {
        this.$r8$classId = 1;
        this.interpolator = new Paint(1);
        this.parents = new Text(LocaleController.formatPluralString("BusinessRepliesMore", i, new Object[0]), 9.33f, AndroidUtilities.bold());
    }

    public VoIPEllipsizeSpan(View[] viewArr) {
        this.$r8$classId = 0;
        this.interpolator = new CubicBezierInterpolator(0.33d, 0.0d, 0.67d, 1.0d);
        this.parents = viewArr;
    }
}
