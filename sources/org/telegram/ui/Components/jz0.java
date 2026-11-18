package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
public final class jz0 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final kz0 E;
    public final ArrayList f36562a;
    public long f36563b;
    public float f36564c;
    public boolean d;
    public final Runnable f36565e;
    public Runnable f36566f;
    public float f36567g;
    public float h;
    public final float f36568i;
    public final float f36569j;
    public final float f36570k;
    public final float f36571l;
    public final float f36572m;
    public boolean f36573n;
    public final boolean f36574o;
    public final float[] f36575p;
    public final float[] f36576q;
    public final Matrix f36577r;
    public int f36578s;
    public final int f36579t;
    public final int f36580u;
    public int v;
    public int f36581w;
    public float f36582x;
    public final float f36583y;
    public int f36584z;

    public jz0(kz0 kz0Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = kz0Var;
        this.f36562a = new ArrayList();
        this.f36563b = -1L;
        this.f36564c = 0.0f;
        this.d = true;
        this.f36567g = 0.0f;
        this.h = 0.0f;
        this.f36568i = 0.0f;
        this.f36569j = 0.0f;
        this.f36570k = org.telegram.messenger.g0.f24120p;
        this.f36571l = 1.5f;
        this.f36572m = 1.15f;
        this.f36573n = true;
        this.f36574o = false;
        this.f36575p = new float[9];
        this.f36576q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f36577r = matrix2;
        this.f36583y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f36568i = fArr[0];
        this.f36569j = fArr[1];
        this.f36579t = (int) a8.w9.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f36580u = (int) a8.w9.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f36574o = true;
        matrix2.set(matrix);
        c();
        this.f36565e = runnable;
        this.f36566f = runnable2;
        this.f36571l = 4.0f;
        this.f36564c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11) {
        float f12;
        canvas.save();
        if (q1Var.b()) {
            f12 = q1Var.getAlpha();
        } else {
            f12 = 1.0f;
        }
        canvas.translate(f10, f11);
        boolean z10 = true;
        q1Var.setInvalidatesParent(true);
        if (i7 == 0) {
            q1Var.y1(f12, canvas, true);
        } else if (i7 == 1) {
            q1Var.h1(canvas, f12);
        } else if (i7 == 2) {
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f27891l & 1) != 0) {
                z10 = false;
            }
            q1Var.Q0(f12, canvas, z10);
        } else if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f27891l & 1) != 0) {
            q1Var.o1(canvas, f12, null);
            q1Var.V0(canvas, f12);
        }
        q1Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        kz0 kz0Var = this.E;
        int i7 = kz0Var.f36930x;
        if (i7 != 0) {
            try {
                GLES20.glDeleteProgram(i7);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            kz0Var.f36930x = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
        Runnable runnable = this.f36566f;
        if (runnable != null) {
            mz0.b(runnable);
            this.f36566f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f36577r;
        float[] fArr = this.f36576q;
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.f36575p;
        fArr2[0] = f10;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f36573n = false;
    }

    public jz0(org.telegram.ui.Components.kz0 r32, java.util.ArrayList r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jz0.<init>(org.telegram.ui.Components.kz0, java.util.ArrayList, java.lang.Runnable):void");
    }

    public jz0(org.telegram.ui.Components.kz0 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jz0.<init>(org.telegram.ui.Components.kz0, android.view.View, float, java.lang.Runnable):void");
    }
}
