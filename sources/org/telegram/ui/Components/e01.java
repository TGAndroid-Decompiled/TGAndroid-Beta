package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
public final class e01 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final f01 E;
    public final ArrayList f25583a;
    public long f25584b;
    public float f25585c;
    public boolean d;
    public final Runnable e;
    public Runnable f25586f;
    public float f25587g;
    public float h;
    public final float f25588i;
    public final float f25589j;
    public final float f25590k;
    public final float f25591l;
    public final float f25592m;
    public boolean f25593n;
    public final boolean f25594o;
    public final float[] f25595p;
    public final float[] f25596q;
    public final Matrix f25597r;
    public int f25598s;
    public final int f25599t;
    public final int f25600u;
    public int v;
    public int f25601w;
    public float f25602x;
    public final float f25603y;
    public int f25604z;

    public e01(f01 f01Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = f01Var;
        this.f25583a = new ArrayList();
        this.f25584b = -1L;
        this.f25585c = 0.0f;
        this.d = true;
        this.f25587g = 0.0f;
        this.h = 0.0f;
        this.f25588i = 0.0f;
        this.f25589j = 0.0f;
        this.f25590k = org.telegram.messenger.i0.f16025p;
        this.f25591l = 1.5f;
        this.f25592m = 1.15f;
        this.f25593n = true;
        this.f25594o = false;
        this.f25595p = new float[9];
        this.f25596q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f25597r = matrix2;
        this.f25603y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f25588i = fArr[0];
        this.f25589j = fArr[1];
        this.f25599t = (int) w7.z8.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f25600u = (int) w7.z8.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f25594o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f25586f = runnable2;
        this.f25591l = 4.0f;
        this.f25585c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.q1 q1Var, int i10, float f7, float f10) {
        float f11;
        canvas.save();
        if (q1Var.a()) {
            f11 = q1Var.getAlpha();
        } else {
            f11 = 1.0f;
        }
        canvas.translate(f7, f10);
        boolean z10 = true;
        q1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            q1Var.v1(f11, canvas, true);
        } else if (i10 == 1) {
            q1Var.f1(canvas, f11);
        } else if (i10 == 2) {
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f14783l & 1) != 0) {
                z10 = false;
            }
            q1Var.O0(f11, canvas, z10);
        } else if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f14783l & 1) != 0) {
            q1Var.m1(canvas, f11, null);
            q1Var.T0(canvas, f11);
        }
        q1Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        f01 f01Var = this.E;
        int i10 = f01Var.f25923x;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
            f01Var.f25923x = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            org.telegram.messenger.f8.g(e10, true);
        }
        Runnable runnable = this.f25586f;
        if (runnable != null) {
            h01.b(runnable);
            this.f25586f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f25597r;
        float[] fArr = this.f25596q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f25595p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f25593n = false;
    }

    public e01(org.telegram.ui.Components.f01 r32, java.util.ArrayList r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e01.<init>(org.telegram.ui.Components.f01, java.util.ArrayList, java.lang.Runnable):void");
    }

    public e01(org.telegram.ui.Components.f01 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e01.<init>(org.telegram.ui.Components.f01, android.view.View, float, java.lang.Runnable):void");
    }
}
