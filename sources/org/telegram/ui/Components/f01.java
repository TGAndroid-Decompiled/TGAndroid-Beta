package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
public final class f01 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final g01 E;
    public final ArrayList f25996a;
    public long f25997b;
    public float f25998c;
    public boolean d;
    public final Runnable e;
    public Runnable f25999f;
    public float f26000g;
    public float h;
    public final float f26001i;
    public final float f26002j;
    public final float f26003k;
    public final float f26004l;
    public final float f26005m;
    public boolean f26006n;
    public final boolean f26007o;
    public final float[] f26008p;
    public final float[] f26009q;
    public final Matrix f26010r;
    public int f26011s;
    public final int f26012t;
    public final int f26013u;
    public int v;
    public int f26014w;
    public float f26015x;
    public final float f26016y;
    public int f26017z;

    public f01(g01 g01Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = g01Var;
        this.f25996a = new ArrayList();
        this.f25997b = -1L;
        this.f25998c = 0.0f;
        this.d = true;
        this.f26000g = 0.0f;
        this.h = 0.0f;
        this.f26001i = 0.0f;
        this.f26002j = 0.0f;
        this.f26003k = org.telegram.messenger.i0.f16171p;
        this.f26004l = 1.5f;
        this.f26005m = 1.15f;
        this.f26006n = true;
        this.f26007o = false;
        this.f26008p = new float[9];
        this.f26009q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f26010r = matrix2;
        this.f26016y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f26001i = fArr[0];
        this.f26002j = fArr[1];
        this.f26012t = (int) w7.z8.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f26013u = (int) w7.z8.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f26007o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f25999f = runnable2;
        this.f26004l = 4.0f;
        this.f25998c = -0.1f;
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
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f15166l & 1) != 0) {
                z10 = false;
            }
            q1Var.O0(f11, canvas, z10);
        } else if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f15166l & 1) != 0) {
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
        g01 g01Var = this.E;
        int i10 = g01Var.f26275x;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
            g01Var.f26275x = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            org.telegram.messenger.f8.g(e10, true);
        }
        Runnable runnable = this.f25999f;
        if (runnable != null) {
            i01.b(runnable);
            this.f25999f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f26010r;
        float[] fArr = this.f26009q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f26008p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f26006n = false;
    }

    public f01(org.telegram.ui.Components.g01 r32, java.util.ArrayList r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f01.<init>(org.telegram.ui.Components.g01, java.util.ArrayList, java.lang.Runnable):void");
    }

    public f01(org.telegram.ui.Components.g01 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f01.<init>(org.telegram.ui.Components.g01, android.view.View, float, java.lang.Runnable):void");
    }
}
