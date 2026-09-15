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
    public final ArrayList f28226a;
    public long f28227b;
    public float f28228c;
    public boolean d;
    public final Runnable e;
    public Runnable f28229f;
    public float f28230g;
    public float h;
    public final float f28231i;
    public final float f28232j;
    public final float f28233k;
    public final float f28234l;
    public final float f28235m;
    public boolean f28236n;
    public final boolean f28237o;
    public final float[] f28238p;
    public final float[] f28239q;
    public final Matrix f28240r;
    public int f28241s;
    public final int f28242t;
    public final int f28243u;
    public int v;
    public int f28244w;
    public float f28245x;
    public final float f28246y;
    public int f28247z;

    public u01(v01 v01Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = v01Var;
        this.f28226a = new ArrayList();
        this.f28227b = -1L;
        this.f28228c = 0.0f;
        this.d = true;
        this.f28230g = 0.0f;
        this.h = 0.0f;
        this.f28231i = 0.0f;
        this.f28232j = 0.0f;
        this.f28233k = AndroidUtilities.density;
        this.f28234l = 1.5f;
        this.f28235m = 1.15f;
        this.f28236n = true;
        this.f28237o = false;
        this.f28238p = new float[9];
        this.f28239q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f28240r = matrix2;
        this.f28246y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f28231i = fArr[0];
        this.f28232j = fArr[1];
        this.f28242t = (int) v7.z6.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f28243u = (int) v7.z6.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f28237o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f28229f = runnable2;
        this.f28234l = 4.0f;
        this.f28228c = -0.1f;
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
        int i10 = v01Var.f28551w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            v01Var.f28551w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f28229f;
        if (runnable != null) {
            x01.b(runnable);
            this.f28229f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f28240r;
        float[] fArr = this.f28239q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f28238p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f28236n = false;
    }

    public u01(org.telegram.ui.Components.v01 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u01.<init>(org.telegram.ui.Components.v01, java.util.ArrayList, java.lang.Runnable):void");
    }

    public u01(org.telegram.ui.Components.v01 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u01.<init>(org.telegram.ui.Components.v01, android.view.View, float, java.lang.Runnable):void");
    }
}
