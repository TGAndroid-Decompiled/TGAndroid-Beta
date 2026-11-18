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
public final class d6 extends View {
    public ValueAnimator E;
    public final Paint f44036a;
    public final Path f44037b;
    public final PathMeasure f44038c;
    public final String d;
    public final RectF f44039e;
    public final float[] f44040f;
    public final float[] h;
    public String f44041n;
    public float[] f44042r;
    public float f44043s;
    public float f44044w;
    public float f44045x;
    public float f44046y;

    public d6(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.f44036a = paint;
        this.f44037b = new Path();
        this.f44038c = new PathMeasure();
        this.f44039e = new RectF();
        this.f44040f = new float[2];
        this.h = new float[2];
        this.d = a8.p0.s(new StringBuilder(), n6.x0(str.toUpperCase().replace('_', ' ').replace('-', ' ')), "   ·   ");
        paint.setColor(-16747826);
        paint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        paint.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
    }

    public final void a() {
        if (isAttachedToWindow() && this.f44045x > 0.0f) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f44045x);
            this.E = ofFloat;
            ofFloat.setDuration(Math.max(1L, (this.f44045x / org.telegram.messenger.g0.L(24.0f)) * 1000.0f));
            this.E.setInterpolator(new LinearInterpolator());
            this.E.setRepeatCount(-1);
            this.E.addUpdateListener(new z3(this, 1));
            this.E.start();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float[] fArr;
        super.onDraw(canvas);
        if (this.f44042r != null && this.f44044w > 0.0f && this.f44045x > 0.0f) {
            int i7 = 0;
            float f10 = 0.0f;
            while (i7 < this.f44041n.length()) {
                float f11 = this.f44042r[i7] * this.f44043s;
                float f12 = ((f11 / 2.0f) + f10) - this.f44046y;
                float f13 = this.f44044w;
                float f14 = f12 % f13;
                if (f14 < 0.0f) {
                    f14 += f13;
                }
                if (this.f44041n.charAt(i7) != ' ') {
                    PathMeasure pathMeasure = this.f44038c;
                    float[] fArr2 = this.f44040f;
                    if (pathMeasure.getPosTan(f14, fArr2, this.h)) {
                        canvas.save();
                        canvas.translate(fArr2[0], fArr2[1]);
                        canvas.rotate((float) Math.toDegrees(Math.atan2(fArr[1], fArr[0])));
                        canvas2 = canvas;
                        canvas2.drawText(this.f44041n, i7, i7 + 1, (-this.f44042r[i7]) / 2.0f, org.telegram.messenger.g0.L(3.0f), this.f44036a);
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
        RectF rectF = this.f44039e;
        rectF.set(((i7 - org.telegram.messenger.g0.L(212.0f)) / 2.0f) - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f) - org.telegram.messenger.g0.L(12.0f), ((org.telegram.messenger.g0.L(212.0f) + i7) / 2.0f) + org.telegram.messenger.g0.L(12.0f), L);
        Path path = this.f44037b;
        path.reset();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), Path.Direction.CW);
        PathMeasure pathMeasure = this.f44038c;
        pathMeasure.setPath(path, true);
        this.f44044w = pathMeasure.getLength();
        Paint paint = this.f44036a;
        String str = this.d;
        int max = Math.max(1, Math.round(this.f44044w / paint.measureText(str)));
        StringBuilder sb2 = new StringBuilder(str.length() * max);
        int i13 = 0;
        for (int i14 = 0; i14 < max; i14++) {
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        this.f44041n = sb3;
        this.f44042r = new float[sb3.length()];
        float f10 = 0.0f;
        while (i13 < this.f44041n.length()) {
            int i15 = i13 + 1;
            this.f44042r[i13] = paint.measureText(this.f44041n, i13, i15);
            f10 += this.f44042r[i13];
            i13 = i15;
        }
        float f11 = this.f44044w;
        this.f44043s = f11 / f10;
        this.f44045x = f11 / max;
        a();
    }
}
