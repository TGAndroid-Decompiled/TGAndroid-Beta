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
public final class n5 extends View {
    public ValueAnimator D;
    public final Paint f42866a;
    public final Path f42867b;
    public final PathMeasure f42868c;
    public final String d;
    public final RectF f42869e;
    public final float[] f42870f;
    public final float[] h;
    public String f42871n;
    public float[] f42872r;
    public float f42873s;
    public float f42874w;
    public float f42875x;
    public float f42876y;

    public n5(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.f42866a = paint;
        this.f42867b = new Path();
        this.f42868c = new PathMeasure();
        this.f42869e = new RectF();
        this.f42870f = new float[2];
        this.h = new float[2];
        this.d = a8.p0.s(new StringBuilder(), x5.v0(str.toUpperCase().replace('_', ' ').replace('-', ' ')), "   ·   ");
        paint.setColor(-16747826);
        paint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        paint.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
    }

    public final void a() {
        if (isAttachedToWindow() && this.f42875x > 0.0f) {
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f42875x);
            this.D = ofFloat;
            ofFloat.setDuration(Math.max(1L, (this.f42875x / org.telegram.messenger.g0.L(24.0f)) * 1000.0f));
            this.D.setInterpolator(new LinearInterpolator());
            this.D.setRepeatCount(-1);
            this.D.addUpdateListener(new q3(this, 1));
            this.D.start();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.D = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float[] fArr;
        super.onDraw(canvas);
        if (this.f42872r != null && this.f42874w > 0.0f && this.f42875x > 0.0f) {
            int i7 = 0;
            float f10 = 0.0f;
            while (i7 < this.f42871n.length()) {
                float f11 = this.f42872r[i7] * this.f42873s;
                float f12 = ((f11 / 2.0f) + f10) - this.f42876y;
                float f13 = this.f42874w;
                float f14 = f12 % f13;
                if (f14 < 0.0f) {
                    f14 += f13;
                }
                if (this.f42871n.charAt(i7) != ' ') {
                    PathMeasure pathMeasure = this.f42868c;
                    float[] fArr2 = this.f42870f;
                    if (pathMeasure.getPosTan(f14, fArr2, this.h)) {
                        canvas.save();
                        canvas.translate(fArr2[0], fArr2[1]);
                        canvas.rotate((float) Math.toDegrees(Math.atan2(fArr[1], fArr[0])));
                        canvas2 = canvas;
                        canvas2.drawText(this.f42871n, i7, i7 + 1, (-this.f42872r[i7]) / 2.0f, org.telegram.messenger.g0.L(3.0f), this.f42866a);
                        canvas2.restore();
                        f10 += f11;
                        i7++;
                        canvas = canvas2;
                    }
                }
                canvas2 = canvas;
                f10 += f11;
                i7++;
                canvas = canvas2;
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(266.0f);
        RectF rectF = this.f42869e;
        rectF.set(((i7 - org.telegram.messenger.g0.L(212.0f)) / 2.0f) - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f) - org.telegram.messenger.g0.L(12.0f), ((org.telegram.messenger.g0.L(212.0f) + i7) / 2.0f) + org.telegram.messenger.g0.L(12.0f), L);
        Path path = this.f42867b;
        path.reset();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), Path.Direction.CW);
        PathMeasure pathMeasure = this.f42868c;
        pathMeasure.setPath(path, true);
        this.f42874w = pathMeasure.getLength();
        Paint paint = this.f42866a;
        String str = this.d;
        int max = Math.max(1, Math.round(this.f42874w / paint.measureText(str)));
        StringBuilder sb2 = new StringBuilder(str.length() * max);
        int i13 = 0;
        for (int i14 = 0; i14 < max; i14++) {
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        this.f42871n = sb3;
        this.f42872r = new float[sb3.length()];
        float f10 = 0.0f;
        while (i13 < this.f42871n.length()) {
            int i15 = i13 + 1;
            this.f42872r[i13] = paint.measureText(this.f42871n, i13, i15);
            f10 += this.f42872r[i13];
            i13 = i15;
        }
        float f11 = this.f42874w;
        this.f42873s = f11 / f10;
        this.f42875x = f11 / max;
        a();
    }
}
