package org.telegram.ui.Components.voip;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.CubicBezierInterpolator;

public class VoIPEllipsizeSpan extends ReplacementSpan {
    private final CubicBezierInterpolator interpolator = new CubicBezierInterpolator(0.33d, 0.0d, 0.67d, 1.0d);
    private final View[] parents;

    public VoIPEllipsizeSpan(View... viewArr) {
        this.parents = viewArr;
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        canvas.translate(f + AndroidUtilities.dp(4.0f), i4 / 2.0f);
        long uptimeMillis = (SystemClock.uptimeMillis() % 250) + 500;
        for (int i6 = 0; i6 < 3; i6++) {
            float min = Math.min(1.0f, ((float) (((i6 * 250) + uptimeMillis) % 750)) / 667.0f);
            canvas.drawCircle(AndroidUtilities.dpf2((this.interpolator.getInterpolation(min) * 16.0f) + 1.667f), AndroidUtilities.dp(3.0f), AndroidUtilities.dpf2((min <= 0.425f ? this.interpolator.getInterpolation(min / 0.425f) : 1.0f - this.interpolator.getInterpolation((min - 0.425f) / 0.575f)) * 2.0f), paint);
        }
        canvas.restore();
        for (View view : this.parents) {
            view.invalidate();
        }
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return AndroidUtilities.dp(20.0f);
    }
}
