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
    public final ArrayList f30469a;
    public long f30470b;
    public float f30471c;
    public boolean d;
    public final Runnable f30472e;
    public Runnable f30473f;
    public float f30474g;
    public float h;
    public final float f30475i;
    public final float f30476j;
    public final float f30477k;
    public final float f30478l;
    public final float f30479m;
    public boolean f30480n;
    public final boolean f30481o;
    public final float[] f30482p;
    public final float[] f30483q;
    public final Matrix f30484r;
    public int f30485s;
    public final int f30486t;
    public final int f30487u;
    public int v;
    public int f30488w;
    public float f30489x;
    public final float f30490y;
    public int f30491z;

    public t01(u01 u01Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = u01Var;
        this.f30469a = new ArrayList();
        this.f30470b = -1L;
        this.f30471c = 0.0f;
        this.d = true;
        this.f30474g = 0.0f;
        this.h = 0.0f;
        this.f30475i = 0.0f;
        this.f30476j = 0.0f;
        this.f30477k = AndroidUtilities.density;
        this.f30478l = 1.5f;
        this.f30479m = 1.15f;
        this.f30480n = true;
        this.f30481o = false;
        this.f30482p = new float[9];
        this.f30483q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f30484r = matrix2;
        this.f30490y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f30475i = fArr[0];
        this.f30476j = fArr[1];
        this.f30486t = (int) v7.z6.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f30487u = (int) v7.z6.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f30481o = true;
        matrix2.set(matrix);
        c();
        this.f30472e = runnable;
        this.f30473f = runnable2;
        this.f30478l = 4.0f;
        this.f30471c = -0.1f;
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
        int i10 = u01Var.f30763w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            u01Var.f30763w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        Runnable runnable = this.f30473f;
        if (runnable != null) {
            w01.b(runnable);
            this.f30473f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f30484r;
        float[] fArr = this.f30483q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f30482p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f30480n = false;
    }

    public t01(org.telegram.ui.Components.u01 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t01.<init>(org.telegram.ui.Components.u01, java.util.ArrayList, java.lang.Runnable):void");
    }

    public t01(org.telegram.ui.Components.u01 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t01.<init>(org.telegram.ui.Components.u01, android.view.View, float, java.lang.Runnable):void");
    }
}
