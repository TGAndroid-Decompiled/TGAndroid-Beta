package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class a5 extends View {
    public final Paint f33977a;
    public final Path f33978b;
    public final PathMeasure f33979c;
    public final String d;
    public final RectF e;
    public final float[] f33980f;
    public final float[] h;
    public String f33981n;
    public float[] f33982r;
    public float f33983s;
    public float v;
    public float f33984w;
    public float f33985x;
    public ValueAnimator f33986y;

    public a5(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.f33977a = paint;
        this.f33978b = new Path();
        this.f33979c = new PathMeasure();
        this.e = new RectF();
        this.f33980f = new float[2];
        this.h = new float[2];
        this.d = a1.g.s(new StringBuilder(), l5.q0(str.toUpperCase().replace('_', ' ').replace('-', ' ')), "   ·   ");
        paint.setColor(-16747826);
        paint.setTextSize(AndroidUtilities.dp(12.0f));
        paint.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
    }

    public final void a() {
        if (isAttachedToWindow() && this.f33984w > 0.0f) {
            ValueAnimator valueAnimator = this.f33986y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f33984w);
            this.f33986y = ofFloat;
            ofFloat.setDuration(Math.max(1L, (this.f33984w / AndroidUtilities.dp(24.0f)) * 1000.0f));
            this.f33986y.setInterpolator(new LinearInterpolator());
            this.f33986y.setRepeatCount(-1);
            this.f33986y.addUpdateListener(new u2(this, 2));
            this.f33986y.start();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f33986y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f33986y = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float[] fArr;
        super.onDraw(canvas);
        if (this.f33982r != null && this.v > 0.0f && this.f33984w > 0.0f) {
            int i10 = 0;
            float f7 = 0.0f;
            while (i10 < this.f33981n.length()) {
                float f10 = this.f33982r[i10] * this.f33983s;
                float f11 = ((f10 / 2.0f) + f7) - this.f33985x;
                float f12 = this.v;
                float f13 = f11 % f12;
                if (f13 < 0.0f) {
                    f13 += f12;
                }
                if (this.f33981n.charAt(i10) != ' ') {
                    PathMeasure pathMeasure = this.f33979c;
                    float[] fArr2 = this.f33980f;
                    if (pathMeasure.getPosTan(f13, fArr2, this.h)) {
                        canvas.save();
                        canvas.translate(fArr2[0], fArr2[1]);
                        canvas.rotate((float) Math.toDegrees(Math.atan2(fArr[1], fArr[0])));
                        canvas2 = canvas;
                        canvas2.drawText(this.f33981n, i10, i10 + 1, (-this.f33982r[i10]) / 2.0f, AndroidUtilities.dp(3.0f), this.f33977a);
                        canvas2.restore();
                        f7 += f10;
                        i10++;
                        canvas = canvas2;
                    }
                }
                canvas2 = canvas;
                f7 += f10;
                i10++;
                canvas = canvas2;
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(266.0f);
        RectF rectF = this.e;
        rectF.set(((i10 - AndroidUtilities.dp(212.0f)) / 2.0f) - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f) - AndroidUtilities.dp(12.0f), ((AndroidUtilities.dp(212.0f) + i10) / 2.0f) + AndroidUtilities.dp(12.0f), dp);
        Path path = this.f33978b;
        path.reset();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        PathMeasure pathMeasure = this.f33979c;
        pathMeasure.setPath(path, true);
        this.v = pathMeasure.getLength();
        Paint paint = this.f33977a;
        String str = this.d;
        int max = Math.max(1, Math.round(this.v / paint.measureText(str)));
        StringBuilder sb2 = new StringBuilder(str.length() * max);
        int i14 = 0;
        for (int i15 = 0; i15 < max; i15++) {
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        this.f33981n = sb3;
        this.f33982r = new float[sb3.length()];
        float f7 = 0.0f;
        while (i14 < this.f33981n.length()) {
            int i16 = i14 + 1;
            this.f33982r[i14] = paint.measureText(this.f33981n, i14, i16);
            f7 += this.f33982r[i14];
            i14 = i16;
        }
        float f10 = this.v;
        this.f33983s = f10 / f7;
        this.f33984w = f10 / max;
        a();
    }
}
