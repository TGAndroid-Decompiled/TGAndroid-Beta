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
    public final Paint f36354a;
    public final Path f36355b;
    public final PathMeasure f36356c;
    public final String d;
    public final RectF e;
    public final float[] f36357f;
    public final float[] h;
    public String f36358n;
    public float[] f36359r;
    public float f36360s;
    public float v;
    public float f36361w;
    public float f36362x;
    public ValueAnimator f36363y;

    public a5(Context context, String str) {
        super(context);
        Paint paint = new Paint(1);
        this.f36354a = paint;
        this.f36355b = new Path();
        this.f36356c = new PathMeasure();
        this.e = new RectF();
        this.f36357f = new float[2];
        this.h = new float[2];
        this.d = a1.g.s(new StringBuilder(), m5.r0(str.toUpperCase().replace('_', ' ').replace('-', ' ')), "   ·   ");
        paint.setColor(-16747826);
        paint.setTextSize(AndroidUtilities.dp(12.0f));
        paint.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
    }

    public final void a() {
        if (isAttachedToWindow() && this.f36361w > 0.0f) {
            ValueAnimator valueAnimator = this.f36363y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f36361w);
            this.f36363y = ofFloat;
            ofFloat.setDuration(Math.max(1L, (this.f36361w / AndroidUtilities.dp(24.0f)) * 1000.0f));
            this.f36363y.setInterpolator(new LinearInterpolator());
            this.f36363y.setRepeatCount(-1);
            this.f36363y.addUpdateListener(new a3(this, 1));
            this.f36363y.start();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f36363y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36363y = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float[] fArr;
        super.onDraw(canvas);
        if (this.f36359r != null && this.v > 0.0f && this.f36361w > 0.0f) {
            int i10 = 0;
            float f7 = 0.0f;
            while (i10 < this.f36358n.length()) {
                float f10 = this.f36359r[i10] * this.f36360s;
                float f11 = ((f10 / 2.0f) + f7) - this.f36362x;
                float f12 = this.v;
                float f13 = f11 % f12;
                if (f13 < 0.0f) {
                    f13 += f12;
                }
                if (this.f36358n.charAt(i10) != ' ') {
                    PathMeasure pathMeasure = this.f36356c;
                    float[] fArr2 = this.f36357f;
                    if (pathMeasure.getPosTan(f13, fArr2, this.h)) {
                        canvas.save();
                        canvas.translate(fArr2[0], fArr2[1]);
                        canvas.rotate((float) Math.toDegrees(Math.atan2(fArr[1], fArr[0])));
                        canvas2 = canvas;
                        canvas2.drawText(this.f36358n, i10, i10 + 1, (-this.f36359r[i10]) / 2.0f, AndroidUtilities.dp(3.0f), this.f36354a);
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
        Path path = this.f36355b;
        path.reset();
        path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
        PathMeasure pathMeasure = this.f36356c;
        pathMeasure.setPath(path, true);
        this.v = pathMeasure.getLength();
        Paint paint = this.f36354a;
        String str = this.d;
        int max = Math.max(1, Math.round(this.v / paint.measureText(str)));
        StringBuilder sb2 = new StringBuilder(str.length() * max);
        int i14 = 0;
        for (int i15 = 0; i15 < max; i15++) {
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        this.f36358n = sb3;
        this.f36359r = new float[sb3.length()];
        float f7 = 0.0f;
        while (i14 < this.f36358n.length()) {
            int i16 = i14 + 1;
            this.f36359r[i14] = paint.measureText(this.f36358n, i14, i16);
            f7 += this.f36359r[i14];
            i14 = i16;
        }
        float f10 = this.v;
        this.f36360s = f10 / f7;
        this.f36361w = f10 / max;
        a();
    }
}
