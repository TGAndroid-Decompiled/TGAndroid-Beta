package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class t01 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final u01 E;
    public final ArrayList f30496a;
    public long f30497b;
    public float f30498c;
    public boolean d;
    public final Runnable f30499e;
    public Runnable f30500f;
    public float f30501g;
    public float h;
    public final float f30502i;
    public final float f30503j;
    public final float f30504k;
    public final float f30505l;
    public final float f30506m;
    public boolean f30507n;
    public final boolean f30508o;
    public final float[] f30509p;
    public final float[] f30510q;
    public final Matrix f30511r;
    public int f30512s;
    public final int f30513t;
    public final int f30514u;
    public int v;
    public int f30515w;
    public float f30516x;
    public final float f30517y;
    public int f30518z;

    public t01(u01 u01Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = u01Var;
        this.f30496a = new ArrayList();
        this.f30497b = -1L;
        this.f30498c = 0.0f;
        this.d = true;
        this.f30501g = 0.0f;
        this.h = 0.0f;
        this.f30502i = 0.0f;
        this.f30503j = 0.0f;
        this.f30504k = AndroidUtilities.density;
        this.f30505l = 1.5f;
        this.f30506m = 1.15f;
        this.f30507n = true;
        this.f30508o = false;
        this.f30509p = new float[9];
        this.f30510q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f30511r = matrix2;
        this.f30517y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f30502i = fArr[0];
        this.f30503j = fArr[1];
        this.f30513t = (int) v7.z6.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f30514u = (int) v7.z6.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f30508o = true;
        matrix2.set(matrix);
        c();
        this.f30499e = runnable;
        this.f30500f = runnable2;
        this.f30505l = 4.0f;
        this.f30498c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10) {
        float f11;
        canvas.save();
        if (t1Var.a()) {
            f11 = t1Var.getAlpha();
        } else {
            f11 = 1.0f;
        }
        canvas.translate(f7, f10);
        boolean z10 = true;
        t1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            t1Var.m2(f11, canvas, true);
        } else if (i10 == 1) {
            t1Var.W1(canvas, f11);
        } else if (i10 == 2) {
            t1Var.I1(f11, canvas, (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) ? false : false);
        } else if (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) {
            t1Var.d2(canvas, f11, null);
            t1Var.N1(canvas, f11);
        }
        t1Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        u01 u01Var = this.E;
        int i10 = u01Var.f30790w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            u01Var.f30790w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        Runnable runnable = this.f30500f;
        if (runnable != null) {
            w01.b(runnable);
            this.f30500f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f30511r;
        float[] fArr = this.f30510q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f30509p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f30507n = false;
    }

    public t01(org.telegram.ui.Components.u01 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t01.<init>(org.telegram.ui.Components.u01, java.util.ArrayList, java.lang.Runnable):void");
    }

    public t01(org.telegram.ui.Components.u01 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t01.<init>(org.telegram.ui.Components.u01, android.view.View, float, java.lang.Runnable):void");
    }
}
