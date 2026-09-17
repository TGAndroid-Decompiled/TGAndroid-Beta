package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class v01 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final w01 E;
    public final ArrayList f28535a;
    public long f28536b;
    public float f28537c;
    public boolean d;
    public final Runnable e;
    public Runnable f28538f;
    public float f28539g;
    public float h;
    public final float f28540i;
    public final float f28541j;
    public final float f28542k;
    public final float f28543l;
    public final float f28544m;
    public boolean f28545n;
    public final boolean f28546o;
    public final float[] f28547p;
    public final float[] f28548q;
    public final Matrix f28549r;
    public int f28550s;
    public final int f28551t;
    public final int f28552u;
    public int v;
    public int f28553w;
    public float f28554x;
    public final float f28555y;
    public int f28556z;

    public v01(w01 w01Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = w01Var;
        this.f28535a = new ArrayList();
        this.f28536b = -1L;
        this.f28537c = 0.0f;
        this.d = true;
        this.f28539g = 0.0f;
        this.h = 0.0f;
        this.f28540i = 0.0f;
        this.f28541j = 0.0f;
        this.f28542k = AndroidUtilities.density;
        this.f28543l = 1.5f;
        this.f28544m = 1.15f;
        this.f28545n = true;
        this.f28546o = false;
        this.f28547p = new float[9];
        this.f28548q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f28549r = matrix2;
        this.f28555y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f28540i = fArr[0];
        this.f28541j = fArr[1];
        this.f28551t = (int) v7.z6.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f28552u = (int) v7.z6.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f28546o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f28538f = runnable2;
        this.f28543l = 4.0f;
        this.f28537c = -0.1f;
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
        w01 w01Var = this.E;
        int i10 = w01Var.f29463w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            w01Var.f29463w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f28538f;
        if (runnable != null) {
            y01.b(runnable);
            this.f28538f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f28549r;
        float[] fArr = this.f28548q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f28547p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f28545n = false;
    }

    public v01(org.telegram.ui.Components.w01 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v01.<init>(org.telegram.ui.Components.w01, java.util.ArrayList, java.lang.Runnable):void");
    }

    public v01(org.telegram.ui.Components.w01 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v01.<init>(org.telegram.ui.Components.w01, android.view.View, float, java.lang.Runnable):void");
    }
}
