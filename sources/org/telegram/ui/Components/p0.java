package org.telegram.ui.Components;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.SystemClock;
import android.view.View;
import java.util.Random;
public final class p0 {
    public float[] D;
    public float[] E;
    public float[] F;
    public int G;
    public long I;
    public final View f38199a;
    public boolean f38200b;
    public boolean f38201c;
    public boolean d;
    public final c6 f38202e;
    public final c6 f38203f;
    public long f38204g;
    public LinearGradient f38214r;
    public SweepGradient f38215s;
    public int f38217u;
    public final Paint h = new Paint(1);
    public final Path f38205i = new Path();
    public final Paint f38206j = new Paint(1);
    public final Paint f38207k = new Paint(1);
    public final Paint f38208l = new Paint(1);
    public final Paint f38209m = new Paint(1);
    public final Paint f38210n = new Paint(1);
    public final Path f38211o = new Path();
    public final RectF f38212p = new RectF();
    public final Matrix f38213q = new Matrix();
    public float f38216t = -1.0f;
    public final float[] v = new float[3];
    public final float[] f38218w = new float[3];
    public final float[] f38219x = new float[3];
    public final float[] f38220y = new float[3];
    public final long[] f38221z = new long[3];
    public final int[] A = new int[3];
    public final boolean[] B = new boolean[3];
    public final Random C = new Random(5905022);
    public float H = -1.0f;
    public float J = Float.NaN;
    public float K = Float.NaN;
    public final float[] L = new float[5];
    public final float[] M = new float[5];
    public final float[] N = new float[5];
    public final float[] O = new float[5];
    public final float[] P = new float[5];

    public p0(re reVar) {
        this.f38199a = reVar;
        Random random = new Random(31249L);
        float[] fArr = {-1.0f, 1.0f, -0.6f, 0.7f, -0.85f};
        for (int i7 = 0; i7 < 5; i7++) {
            this.L[i7] = random.nextFloat() * 2.0f;
            this.M[i7] = org.telegram.ui.Cells.c0.h(random, 0.55f, 0.75f);
            this.N[i7] = fArr[i7] * org.telegram.messenger.g0.L(random.nextInt(5) + 9);
            this.O[i7] = org.telegram.messenger.g0.L((random.nextFloat() * 1.4f) + 1.6f);
            this.P[i7] = org.telegram.messenger.g0.L(random.nextInt(6) + 6);
        }
        this.f38202e = new c6(reVar, 0L, 420L, lr.h);
        this.f38203f = new c6(reVar, 0L, 360L, lr.f37209g);
        this.f38205i.moveTo(0.0f, -1.0f);
        this.f38205i.quadTo(0.2f, -0.2f, 1.0f, 0.0f);
        this.f38205i.quadTo(0.2f, 0.2f, 0.0f, 1.0f);
        this.f38205i.quadTo(-0.2f, 0.2f, -1.0f, 0.0f);
        this.f38205i.quadTo(-0.2f, -0.2f, 0.0f, -1.0f);
        this.f38205i.close();
        Paint paint = this.f38207k;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f38207k;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.f38209m.setStyle(style);
        this.f38209m.setStrokeCap(cap);
    }

    public final void a(float f10, int i7) {
        if (this.f38216t == f10 && this.f38217u == i7) {
            return;
        }
        this.f38216t = f10;
        this.f38217u = i7;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f10 * 2.2f, 0.0f, new int[]{16777215, 16777215, 956301311, 16777215, 16777215}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.REPEAT);
        this.f38214r = linearGradient;
        this.f38206j.setShader(linearGradient);
        SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, new int[]{9497855, 9497855, -1935871745, -421988097, -1}, new float[]{0.0f, 0.55f, 0.8f, 0.95f, 1.0f});
        this.f38215s = sweepGradient;
        this.f38207k.setShader(sweepGradient);
        int f11 = i0.a.f(0.55f, i7, -6297345) & 16777215;
        this.f38210n.setShader(new RadialGradient(0.0f, 0.0f, f10 + org.telegram.messenger.g0.L(4.0f), new int[]{f11, Integer.MIN_VALUE | f11, f11}, new float[]{(f10 - org.telegram.messenger.g0.L(1.0f)) / (org.telegram.messenger.g0.L(4.0f) + f10), (org.telegram.messenger.g0.L(0.5f) + f10) / (f10 + org.telegram.messenger.g0.L(4.0f)), 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(android.graphics.Canvas r56, android.graphics.RectF r57, int r58, int r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p0.b(android.graphics.Canvas, android.graphics.RectF, int, int):void");
    }

    public final void c(boolean z10) {
        long j3;
        if (this.f38201c == z10) {
            return;
        }
        this.f38201c = z10;
        if (z10) {
            this.f38204g = SystemClock.uptimeMillis();
        }
        if (z10) {
            j3 = 300;
        } else {
            j3 = 560;
        }
        this.f38203f.f33895g = j3;
        this.f38199a.invalidate();
    }

    public final float d() {
        return ((float) (SystemClock.uptimeMillis() - this.f38204g)) / 1000.0f;
    }
}
