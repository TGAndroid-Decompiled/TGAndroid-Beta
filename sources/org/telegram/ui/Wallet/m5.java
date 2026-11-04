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
public final class m5 extends View {
    public ValueAnimator E;
    public final Paint f42833a;
    public final Path f42834b;
    public final PathMeasure f42835c;
    public final String d;
    public final RectF f42836e;
    public final float[] f42837f;
    public final float[] h;
    public String f42838n;
    public float[] f42839r;
    public float f42840s;
    public float f42841w;
    public float f42842x;
    public float f42843y;

    public m5(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.f42833a = paint;
        this.f42834b = new Path();
        this.f42835c = new PathMeasure();
        this.f42836e = new RectF();
        this.f42837f = new float[2];
        this.h = new float[2];
        this.d = a1.g.s(new StringBuilder(), w5.v0(str.toUpperCase().replace('_', ' ').replace('-', ' ')), "   ·   ");
        paint.setColor(-16747826);
        paint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        paint.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
    }

    public final void a() {
        if (isAttachedToWindow() && this.f42842x > 0.0f) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f42842x);
            this.E = ofFloat;
            ofFloat.setDuration(Math.max(1L, (this.f42842x / org.telegram.messenger.g0.L(24.0f)) * 1000.0f));
            this.E.setInterpolator(new LinearInterpolator());
            this.E.setRepeatCount(-1);
            this.E.addUpdateListener(new p3(this, 1));
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
        if (this.f42839r != null && this.f42841w > 0.0f && this.f42842x > 0.0f) {
            int i3 = 0;
            float f10 = 0.0f;
            while (i3 < this.f42838n.length()) {
                float f11 = this.f42839r[i3] * this.f42840s;
                float f12 = ((f11 / 2.0f) + f10) - this.f42843y;
                float f13 = this.f42841w;
                float f14 = f12 % f13;
                if (f14 < 0.0f) {
                    f14 += f13;
                }
                if (this.f42838n.charAt(i3) != ' ') {
                    PathMeasure pathMeasure = this.f42835c;
                    float[] fArr2 = this.f42837f;
                    if (pathMeasure.getPosTan(f14, fArr2, this.h)) {
                        canvas.save();
                        canvas.translate(fArr2[0], fArr2[1]);
                        canvas.rotate((float) Math.toDegrees(Math.atan2(fArr[1], fArr[0])));
                        canvas2 = canvas;
                        canvas2.drawText(this.f42838n, i3, i3 + 1, (-this.f42839r[i3]) / 2.0f, org.telegram.messenger.g0.L(3.0f), this.f42833a);
                        canvas2.restore();
                        f10 += f11;
                        i3++;
                        canvas = canvas2;
                    }
                }
                canvas2 = canvas;
                f10 += f11;
                i3++;
                canvas = canvas2;
            }
        }
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        float L = org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(266.0f);
        RectF rectF = this.f42836e;
        rectF.set(((i3 - org.telegram.messenger.g0.L(212.0f)) / 2.0f) - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(22.0f) - org.telegram.messenger.g0.L(12.0f), ((org.telegram.messenger.g0.L(212.0f) + i3) / 2.0f) + org.telegram.messenger.g0.L(12.0f), L);
        Path path = this.f42834b;
        path.reset();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), Path.Direction.CW);
        PathMeasure pathMeasure = this.f42835c;
        pathMeasure.setPath(path, true);
        this.f42841w = pathMeasure.getLength();
        Paint paint = this.f42833a;
        String str = this.d;
        int max = Math.max(1, Math.round(this.f42841w / paint.measureText(str)));
        StringBuilder sb2 = new StringBuilder(str.length() * max);
        int i13 = 0;
        for (int i14 = 0; i14 < max; i14++) {
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        this.f42838n = sb3;
        this.f42839r = new float[sb3.length()];
        float f10 = 0.0f;
        while (i13 < this.f42838n.length()) {
            int i15 = i13 + 1;
            this.f42839r[i13] = paint.measureText(this.f42838n, i13, i15);
            f10 += this.f42839r[i13];
            i13 = i15;
        }
        float f11 = this.f42841w;
        this.f42840s = f11 / f10;
        this.f42842x = f11 / max;
        a();
    }
}
