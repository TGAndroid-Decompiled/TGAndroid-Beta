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
public final class q4 extends View {
    public final Paint f35496a;
    public final Path f35497b;
    public final PathMeasure f35498c;
    public final String d;
    public final RectF f35499e;
    public final float[] f35500f;
    public final float[] h;
    public String f35501n;
    public float[] f35502r;
    public float f35503s;
    public float v;
    public float f35504w;
    public float f35505x;
    public ValueAnimator f35506y;

    public q4(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.f35496a = paint;
        this.f35497b = new Path();
        this.f35498c = new PathMeasure();
        this.f35499e = new RectF();
        this.f35500f = new float[2];
        this.h = new float[2];
        this.d = a1.g.t(new StringBuilder(), c5.k0(str.toUpperCase().replace('_', ' ').replace('-', ' ')), "   ·   ");
        paint.setColor(-16747826);
        paint.setTextSize(AndroidUtilities.dp(12.0f));
        paint.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
    }

    public final void a() {
        if (isAttachedToWindow() && this.f35504w > 0.0f) {
            ValueAnimator valueAnimator = this.f35506y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f35504w);
            this.f35506y = ofFloat;
            ofFloat.setDuration(Math.max(1L, (this.f35504w / AndroidUtilities.dp(24.0f)) * 1000.0f));
            this.f35506y.setInterpolator(new LinearInterpolator());
            this.f35506y.setRepeatCount(-1);
            this.f35506y.addUpdateListener(new u2(this, 2));
            this.f35506y.start();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f35506y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f35506y = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float[] fArr;
        super.onDraw(canvas);
        if (this.f35502r != null && this.v > 0.0f && this.f35504w > 0.0f) {
            int i10 = 0;
            float f7 = 0.0f;
            while (i10 < this.f35501n.length()) {
                float f10 = this.f35502r[i10] * this.f35503s;
                float f11 = ((f10 / 2.0f) + f7) - this.f35505x;
                float f12 = this.v;
                float f13 = f11 % f12;
                if (f13 < 0.0f) {
                    f13 += f12;
                }
                if (this.f35501n.charAt(i10) != ' ') {
                    PathMeasure pathMeasure = this.f35498c;
                    float[] fArr2 = this.f35500f;
                    if (pathMeasure.getPosTan(f13, fArr2, this.h)) {
                        canvas.save();
                        canvas.translate(fArr2[0], fArr2[1]);
                        canvas.rotate((float) Math.toDegrees(Math.atan2(fArr[1], fArr[0])));
                        canvas2 = canvas;
                        canvas2.drawText(this.f35501n, i10, i10 + 1, (-this.f35502r[i10]) / 2.0f, AndroidUtilities.dp(3.0f), this.f35496a);
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
        RectF rectF = this.f35499e;
        rectF.set(((i10 - AndroidUtilities.dp(212.0f)) / 2.0f) - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f) - AndroidUtilities.dp(12.0f), ((AndroidUtilities.dp(212.0f) + i10) / 2.0f) + AndroidUtilities.dp(12.0f), dp);
        Path path = this.f35497b;
        path.reset();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        PathMeasure pathMeasure = this.f35498c;
        pathMeasure.setPath(path, true);
        this.v = pathMeasure.getLength();
        Paint paint = this.f35496a;
        String str = this.d;
        int max = Math.max(1, Math.round(this.v / paint.measureText(str)));
        StringBuilder sb2 = new StringBuilder(str.length() * max);
        int i14 = 0;
        for (int i15 = 0; i15 < max; i15++) {
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        this.f35501n = sb3;
        this.f35502r = new float[sb3.length()];
        float f7 = 0.0f;
        while (i14 < this.f35501n.length()) {
            int i16 = i14 + 1;
            this.f35502r[i14] = paint.measureText(this.f35501n, i14, i16);
            f7 += this.f35502r[i14];
            i14 = i16;
        }
        float f10 = this.v;
        this.f35503s = f10 / f7;
        this.f35504w = f10 / max;
        a();
    }
}
