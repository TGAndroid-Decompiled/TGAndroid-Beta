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
public final class q0 {
    public float[] D;
    public float[] E;
    public float[] F;
    public int G;
    public long I;
    public final View f38718a;
    public boolean f38719b;
    public boolean f38720c;
    public boolean d;
    public final d6 f38721e;
    public final d6 f38722f;
    public long f38723g;
    public LinearGradient f38733r;
    public SweepGradient f38734s;
    public int f38736u;
    public final Paint h = new Paint(1);
    public final Path f38724i = new Path();
    public final Paint f38725j = new Paint(1);
    public final Paint f38726k = new Paint(1);
    public final Paint f38727l = new Paint(1);
    public final Paint f38728m = new Paint(1);
    public final Paint f38729n = new Paint(1);
    public final Path f38730o = new Path();
    public final RectF f38731p = new RectF();
    public final Matrix f38732q = new Matrix();
    public float f38735t = -1.0f;
    public final float[] v = new float[3];
    public final float[] f38737w = new float[3];
    public final float[] f38738x = new float[3];
    public final float[] f38739y = new float[3];
    public final long[] f38740z = new long[3];
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

    public q0(re reVar) {
        this.f38718a = reVar;
        Random random = new Random(31249L);
        float[] fArr = {-1.0f, 1.0f, -0.6f, 0.7f, -0.85f};
        for (int i7 = 0; i7 < 5; i7++) {
            this.L[i7] = random.nextFloat() * 2.0f;
            this.M[i7] = org.telegram.ui.Cells.c0.h(random, 0.55f, 0.75f);
            this.N[i7] = fArr[i7] * org.telegram.messenger.g0.L(random.nextInt(5) + 9);
            this.O[i7] = org.telegram.messenger.g0.L((random.nextFloat() * 1.4f) + 1.6f);
            this.P[i7] = org.telegram.messenger.g0.L(random.nextInt(6) + 6);
        }
        this.f38721e = new d6(reVar, 0L, 420L, nr.h);
        this.f38722f = new d6(reVar, 0L, 360L, nr.f37962g);
        this.f38724i.moveTo(0.0f, -1.0f);
        this.f38724i.quadTo(0.2f, -0.2f, 1.0f, 0.0f);
        this.f38724i.quadTo(0.2f, 0.2f, 0.0f, 1.0f);
        this.f38724i.quadTo(-0.2f, 0.2f, -1.0f, 0.0f);
        this.f38724i.quadTo(-0.2f, -0.2f, 0.0f, -1.0f);
        this.f38724i.close();
        Paint paint = this.f38726k;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f38726k;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.f38728m.setStyle(style);
        this.f38728m.setStrokeCap(cap);
    }

    public final void a(float f10, int i7) {
        if (this.f38735t == f10 && this.f38736u == i7) {
            return;
        }
        this.f38735t = f10;
        this.f38736u = i7;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f10 * 2.2f, 0.0f, new int[]{16777215, 16777215, 956301311, 16777215, 16777215}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.REPEAT);
        this.f38733r = linearGradient;
        this.f38725j.setShader(linearGradient);
        SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, new int[]{9497855, 9497855, -1935871745, -421988097, -1}, new float[]{0.0f, 0.55f, 0.8f, 0.95f, 1.0f});
        this.f38734s = sweepGradient;
        this.f38726k.setShader(sweepGradient);
        int f11 = i0.a.f(0.55f, i7, -6297345) & 16777215;
        this.f38729n.setShader(new RadialGradient(0.0f, 0.0f, f10 + org.telegram.messenger.g0.L(4.0f), new int[]{f11, Integer.MIN_VALUE | f11, f11}, new float[]{(f10 - org.telegram.messenger.g0.L(1.0f)) / (org.telegram.messenger.g0.L(4.0f) + f10), (org.telegram.messenger.g0.L(0.5f) + f10) / (f10 + org.telegram.messenger.g0.L(4.0f)), 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(android.graphics.Canvas r56, android.graphics.RectF r57, int r58, int r59) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q0.b(android.graphics.Canvas, android.graphics.RectF, int, int):void");
    }

    public final void c(boolean z10) {
        long j3;
        if (this.f38720c == z10) {
            return;
        }
        this.f38720c = z10;
        if (z10) {
            this.f38723g = SystemClock.uptimeMillis();
        }
        if (z10) {
            j3 = 300;
        } else {
            j3 = 560;
        }
        this.f38722f.f34389g = j3;
        this.f38718a.invalidate();
    }

    public final float d() {
        return ((float) (SystemClock.uptimeMillis() - this.f38723g)) / 1000.0f;
    }
}
