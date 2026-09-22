package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class u01 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final v01 E;
    public final ArrayList f28223a;
    public long f28224b;
    public float f28225c;
    public boolean d;
    public final Runnable e;
    public Runnable f28226f;
    public float f28227g;
    public float h;
    public final float f28228i;
    public final float f28229j;
    public final float f28230k;
    public final float f28231l;
    public final float f28232m;
    public boolean f28233n;
    public final boolean f28234o;
    public final float[] f28235p;
    public final float[] f28236q;
    public final Matrix f28237r;
    public int f28238s;
    public final int f28239t;
    public final int f28240u;
    public int v;
    public int f28241w;
    public float f28242x;
    public final float f28243y;
    public int f28244z;

    public u01(v01 v01Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = v01Var;
        this.f28223a = new ArrayList();
        this.f28224b = -1L;
        this.f28225c = 0.0f;
        this.d = true;
        this.f28227g = 0.0f;
        this.h = 0.0f;
        this.f28228i = 0.0f;
        this.f28229j = 0.0f;
        this.f28230k = AndroidUtilities.density;
        this.f28231l = 1.5f;
        this.f28232m = 1.15f;
        this.f28233n = true;
        this.f28234o = false;
        this.f28235p = new float[9];
        this.f28236q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f28237r = matrix2;
        this.f28243y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f28228i = fArr[0];
        this.f28229j = fArr[1];
        this.f28239t = (int) v7.z6.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f28240u = (int) v7.z6.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f28234o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f28226f = runnable2;
        this.f28231l = 4.0f;
        this.f28225c = -0.1f;
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        v01 v01Var = this.E;
        int i10 = v01Var.f28548w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            v01Var.f28548w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f28226f;
        if (runnable != null) {
            x01.b(runnable);
            this.f28226f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f28237r;
        float[] fArr = this.f28236q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f28235p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f28233n = false;
    }

    public u01(org.telegram.ui.Components.v01 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u01.<init>(org.telegram.ui.Components.v01, java.util.ArrayList, java.lang.Runnable):void");
    }

    public u01(org.telegram.ui.Components.v01 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u01.<init>(org.telegram.ui.Components.v01, android.view.View, float, java.lang.Runnable):void");
    }
}
