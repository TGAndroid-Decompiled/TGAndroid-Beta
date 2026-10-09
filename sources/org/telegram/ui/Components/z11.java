package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class z11 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final a21 E;
    public final ArrayList f33413a;
    public long f33414b;
    public float f33415c;
    public boolean d;
    public final Runnable f33416e;
    public Runnable f33417f;
    public float f33418g;
    public float h;
    public final float f33419i;
    public final float f33420j;
    public final float f33421k;
    public final float f33422l;
    public final float f33423m;
    public boolean f33424n;
    public final boolean f33425o;
    public final float[] f33426p;
    public final float[] f33427q;
    public final Matrix f33428r;
    public int f33429s;
    public final int f33430t;
    public final int f33431u;
    public int v;
    public int f33432w;
    public float f33433x;
    public final float f33434y;
    public int f33435z;

    public z11(a21 a21Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = a21Var;
        this.f33413a = new ArrayList();
        this.f33414b = -1L;
        this.f33415c = 0.0f;
        this.d = true;
        this.f33418g = 0.0f;
        this.h = 0.0f;
        this.f33419i = 0.0f;
        this.f33420j = 0.0f;
        this.f33421k = AndroidUtilities.density;
        this.f33422l = 1.5f;
        this.f33423m = 1.15f;
        this.f33424n = true;
        this.f33425o = false;
        this.f33426p = new float[9];
        this.f33427q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f33428r = matrix2;
        this.f33434y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f33419i = fArr[0];
        this.f33420j = fArr[1];
        this.f33430t = (int) v7.z6.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f33431u = (int) v7.z6.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f33425o = true;
        matrix2.set(matrix);
        c();
        this.f33416e = runnable;
        this.f33417f = runnable2;
        this.f33422l = 4.0f;
        this.f33415c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10) {
        float f11;
        canvas.save();
        if (u1Var.a()) {
            f11 = u1Var.getAlpha();
        } else {
            f11 = 1.0f;
        }
        canvas.translate(f7, f10);
        boolean z10 = true;
        u1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            u1Var.m2(f11, canvas, true);
        } else if (i10 == 1) {
            u1Var.W1(canvas, f11);
        } else if (i10 == 2) {
            if (u1Var.getCurrentPosition() == null || (u1Var.getCurrentPosition().flags & 1) != 0) {
                z10 = false;
            }
            u1Var.I1(f11, canvas, z10);
        } else if (u1Var.getCurrentPosition() == null || (u1Var.getCurrentPosition().flags & 1) != 0) {
            u1Var.d2(canvas, f11, null);
            u1Var.N1(canvas, f11);
        }
        u1Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        a21 a21Var = this.E;
        int i10 = a21Var.f24553w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            a21Var.f24553w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        Runnable runnable = this.f33417f;
        if (runnable != null) {
            c21.b(runnable);
            this.f33417f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f33428r;
        float[] fArr = this.f33427q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f33426p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f33424n = false;
    }

    public z11(org.telegram.ui.Components.a21 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z11.<init>(org.telegram.ui.Components.a21, java.util.ArrayList, java.lang.Runnable):void");
    }

    public z11(org.telegram.ui.Components.a21 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z11.<init>(org.telegram.ui.Components.a21, android.view.View, float, java.lang.Runnable):void");
    }
}
