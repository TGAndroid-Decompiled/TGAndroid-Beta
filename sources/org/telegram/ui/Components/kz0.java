package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
public final class kz0 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final lz0 E;
    public final ArrayList f36930a;
    public long f36931b;
    public float f36932c;
    public boolean d;
    public final Runnable f36933e;
    public Runnable f36934f;
    public float f36935g;
    public float h;
    public final float f36936i;
    public final float f36937j;
    public final float f36938k;
    public final float f36939l;
    public final float f36940m;
    public boolean f36941n;
    public final boolean f36942o;
    public final float[] f36943p;
    public final float[] f36944q;
    public final Matrix f36945r;
    public int f36946s;
    public final int f36947t;
    public final int f36948u;
    public int v;
    public int f36949w;
    public float f36950x;
    public final float f36951y;
    public int f36952z;

    public kz0(lz0 lz0Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = lz0Var;
        this.f36930a = new ArrayList();
        this.f36931b = -1L;
        this.f36932c = 0.0f;
        this.d = true;
        this.f36935g = 0.0f;
        this.h = 0.0f;
        this.f36936i = 0.0f;
        this.f36937j = 0.0f;
        this.f36938k = org.telegram.messenger.g0.f24225p;
        this.f36939l = 1.5f;
        this.f36940m = 1.15f;
        this.f36941n = true;
        this.f36942o = false;
        this.f36943p = new float[9];
        this.f36944q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f36945r = matrix2;
        this.f36951y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f36936i = fArr[0];
        this.f36937j = fArr[1];
        this.f36947t = (int) a8.x9.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f36948u = (int) a8.x9.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f36942o = true;
        matrix2.set(matrix);
        c();
        this.f36933e = runnable;
        this.f36934f = runnable2;
        this.f36939l = 4.0f;
        this.f36932c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.r1 r1Var, int i7, float f10, float f11) {
        float f12;
        canvas.save();
        if (r1Var.a()) {
            f12 = r1Var.getAlpha();
        } else {
            f12 = 1.0f;
        }
        canvas.translate(f10, f11);
        boolean z10 = true;
        r1Var.setInvalidatesParent(true);
        if (i7 == 0) {
            r1Var.y1(f12, canvas, true);
        } else if (i7 == 1) {
            r1Var.h1(canvas, f12);
        } else if (i7 == 2) {
            if (r1Var.getCurrentPosition() == null || (r1Var.getCurrentPosition().f28005l & 1) != 0) {
                z10 = false;
            }
            r1Var.Q0(f12, canvas, z10);
        } else if (r1Var.getCurrentPosition() == null || (r1Var.getCurrentPosition().f28005l & 1) != 0) {
            r1Var.o1(canvas, f12, null);
            r1Var.V0(canvas, f12);
        }
        r1Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        lz0 lz0Var = this.E;
        int i7 = lz0Var.f37276x;
        if (i7 != 0) {
            try {
                GLES20.glDeleteProgram(i7);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            lz0Var.f37276x = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
        Runnable runnable = this.f36934f;
        if (runnable != null) {
            nz0.b(runnable);
            this.f36934f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f36945r;
        float[] fArr = this.f36944q;
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.f36943p;
        fArr2[0] = f10;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f36941n = false;
    }

    public kz0(org.telegram.ui.Components.lz0 r32, java.util.ArrayList r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kz0.<init>(org.telegram.ui.Components.lz0, java.util.ArrayList, java.lang.Runnable):void");
    }

    public kz0(org.telegram.ui.Components.lz0 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kz0.<init>(org.telegram.ui.Components.lz0, android.view.View, float, java.lang.Runnable):void");
    }
}
