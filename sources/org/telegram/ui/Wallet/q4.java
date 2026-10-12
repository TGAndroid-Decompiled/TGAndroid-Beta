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
    public final Paint f35278a;
    public final Path f35279b;
    public final PathMeasure f35280c;
    public final String d;
    public final RectF f35281e;
    public final float[] f35282f;
    public final float[] h;
    public String f35283n;
    public float[] f35284r;
    public float f35285s;
    public float v;
    public float f35286w;
    public float f35287x;
    public ValueAnimator f35288y;

    public q4(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.f35278a = paint;
        this.f35279b = new Path();
        this.f35280c = new PathMeasure();
        this.f35281e = new RectF();
        this.f35282f = new float[2];
        this.h = new float[2];
        this.d = a1.g.t(new StringBuilder(), c5.k0(str.toUpperCase().replace('_', ' ').replace('-', ' ')), "   ·   ");
        paint.setColor(-16747826);
        paint.setTextSize(AndroidUtilities.dp(12.0f));
        paint.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
    }

    public final void a() {
        if (isAttachedToWindow() && this.f35286w > 0.0f) {
            ValueAnimator valueAnimator = this.f35288y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f35286w);
            this.f35288y = ofFloat;
            ofFloat.setDuration(Math.max(1L, (this.f35286w / AndroidUtilities.dp(24.0f)) * 1000.0f));
            this.f35288y.setInterpolator(new LinearInterpolator());
            this.f35288y.setRepeatCount(-1);
            this.f35288y.addUpdateListener(new u2(this, 2));
            this.f35288y.start();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f35288y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f35288y = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float[] fArr;
        super.onDraw(canvas);
        if (this.f35284r != null && this.v > 0.0f && this.f35286w > 0.0f) {
            int i10 = 0;
            float f7 = 0.0f;
            while (i10 < this.f35283n.length()) {
                float f10 = this.f35284r[i10] * this.f35285s;
                float f11 = ((f10 / 2.0f) + f7) - this.f35287x;
                float f12 = this.v;
                float f13 = f11 % f12;
                if (f13 < 0.0f) {
                    f13 += f12;
                }
                if (this.f35283n.charAt(i10) != ' ') {
                    PathMeasure pathMeasure = this.f35280c;
                    float[] fArr2 = this.f35282f;
                    if (pathMeasure.getPosTan(f13, fArr2, this.h)) {
                        canvas.save();
                        canvas.translate(fArr2[0], fArr2[1]);
                        canvas.rotate((float) Math.toDegrees(Math.atan2(fArr[1], fArr[0])));
                        canvas2 = canvas;
                        canvas2.drawText(this.f35283n, i10, i10 + 1, (-this.f35284r[i10]) / 2.0f, AndroidUtilities.dp(3.0f), this.f35278a);
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
        RectF rectF = this.f35281e;
        rectF.set(((i10 - AndroidUtilities.dp(212.0f)) / 2.0f) - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(22.0f) - AndroidUtilities.dp(12.0f), ((AndroidUtilities.dp(212.0f) + i10) / 2.0f) + AndroidUtilities.dp(12.0f), dp);
        Path path = this.f35279b;
        path.reset();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        PathMeasure pathMeasure = this.f35280c;
        pathMeasure.setPath(path, true);
        this.v = pathMeasure.getLength();
        Paint paint = this.f35278a;
        String str = this.d;
        int max = Math.max(1, Math.round(this.v / paint.measureText(str)));
        StringBuilder sb2 = new StringBuilder(str.length() * max);
        int i14 = 0;
        for (int i15 = 0; i15 < max; i15++) {
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        this.f35283n = sb3;
        this.f35284r = new float[sb3.length()];
        float f7 = 0.0f;
        while (i14 < this.f35283n.length()) {
            int i16 = i14 + 1;
            this.f35284r[i14] = paint.measureText(this.f35283n, i14, i16);
            f7 += this.f35284r[i14];
            i14 = i16;
        }
        float f10 = this.v;
        this.f35285s = f10 / f7;
        this.f35286w = f10 / max;
        a();
    }
}
