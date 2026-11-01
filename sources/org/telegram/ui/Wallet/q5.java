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
public final class q5 extends View {
    public ValueAnimator D;
    public final Paint f35079a;
    public final Path f35080b;
    public final PathMeasure f35081c;
    public final String d;
    public final RectF e;
    public final float[] f35082f;
    public final float[] h;
    public String f35083n;
    public float[] f35084r;
    public float f35085s;
    public float f35086w;
    public float f35087x;
    public float f35088y;

    public q5(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.f35079a = paint;
        this.f35080b = new Path();
        this.f35081c = new PathMeasure();
        this.e = new RectF();
        this.f35082f = new float[2];
        this.h = new float[2];
        this.d = a1.g.r(new StringBuilder(), b6.v0(str.toUpperCase().replace('_', ' ').replace('-', ' ')), "   ·   ");
        paint.setColor(-16747826);
        paint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        paint.setTypeface(org.telegram.messenger.i0.o1("fonts/rmono.ttf"));
    }

    public final void a() {
        if (isAttachedToWindow() && this.f35087x > 0.0f) {
            ValueAnimator valueAnimator = this.D;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f35087x);
            this.D = ofFloat;
            ofFloat.setDuration(Math.max(1L, (this.f35087x / org.telegram.messenger.i0.L(24.0f)) * 1000.0f));
            this.D.setInterpolator(new LinearInterpolator());
            this.D.setRepeatCount(-1);
            this.D.addUpdateListener(new r3(this, 1));
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
        if (this.f35084r != null && this.f35086w > 0.0f && this.f35087x > 0.0f) {
            int i10 = 0;
            float f7 = 0.0f;
            while (i10 < this.f35083n.length()) {
                float f10 = this.f35084r[i10] * this.f35085s;
                float f11 = ((f10 / 2.0f) + f7) - this.f35088y;
                float f12 = this.f35086w;
                float f13 = f11 % f12;
                if (f13 < 0.0f) {
                    f13 += f12;
                }
                if (this.f35083n.charAt(i10) != ' ') {
                    PathMeasure pathMeasure = this.f35081c;
                    float[] fArr2 = this.f35082f;
                    if (pathMeasure.getPosTan(f13, fArr2, this.h)) {
                        canvas.save();
                        canvas.translate(fArr2[0], fArr2[1]);
                        canvas.rotate((float) Math.toDegrees(Math.atan2(fArr[1], fArr[0])));
                        canvas2 = canvas;
                        canvas2.drawText(this.f35083n, i10, i10 + 1, (-this.f35084r[i10]) / 2.0f, org.telegram.messenger.i0.L(3.0f), this.f35079a);
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
        float L = org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.L(266.0f);
        RectF rectF = this.e;
        rectF.set(((i10 - org.telegram.messenger.i0.L(212.0f)) / 2.0f) - org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(22.0f) - org.telegram.messenger.i0.L(12.0f), ((org.telegram.messenger.i0.L(212.0f) + i10) / 2.0f) + org.telegram.messenger.i0.L(12.0f), L);
        Path path = this.f35080b;
        path.reset();
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(32.0f), org.telegram.messenger.i0.L(32.0f), Path.Direction.CW);
        PathMeasure pathMeasure = this.f35081c;
        pathMeasure.setPath(path, true);
        this.f35086w = pathMeasure.getLength();
        Paint paint = this.f35079a;
        String str = this.d;
        int max = Math.max(1, Math.round(this.f35086w / paint.measureText(str)));
        StringBuilder sb2 = new StringBuilder(str.length() * max);
        int i14 = 0;
        for (int i15 = 0; i15 < max; i15++) {
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        this.f35083n = sb3;
        this.f35084r = new float[sb3.length()];
        float f7 = 0.0f;
        while (i14 < this.f35083n.length()) {
            int i16 = i14 + 1;
            this.f35084r[i14] = paint.measureText(this.f35083n, i14, i16);
            f7 += this.f35084r[i14];
            i14 = i16;
        }
        float f10 = this.f35086w;
        this.f35085s = f10 / f7;
        this.f35087x = f10 / max;
        a();
    }
}
