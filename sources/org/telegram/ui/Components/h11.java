package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class h11 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final i11 E;
    public final ArrayList f23470a;
    public long f23471b;
    public float f23472c;
    public boolean d;
    public final Runnable e;
    public Runnable f23473f;
    public float f23474g;
    public float h;
    public final float f23475i;
    public final float f23476j;
    public final float f23477k;
    public final float f23478l;
    public final float f23479m;
    public boolean f23480n;
    public final boolean f23481o;
    public final float[] f23482p;
    public final float[] f23483q;
    public final Matrix f23484r;
    public int f23485s;
    public final int f23486t;
    public final int f23487u;
    public int v;
    public int f23488w;
    public float f23489x;
    public final float f23490y;
    public int f23491z;

    public h11(i11 i11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = i11Var;
        this.f23470a = new ArrayList();
        this.f23471b = -1L;
        this.f23472c = 0.0f;
        this.d = true;
        this.f23474g = 0.0f;
        this.h = 0.0f;
        this.f23475i = 0.0f;
        this.f23476j = 0.0f;
        this.f23477k = AndroidUtilities.density;
        this.f23478l = 1.5f;
        this.f23479m = 1.15f;
        this.f23480n = true;
        this.f23481o = false;
        this.f23482p = new float[9];
        this.f23483q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f23484r = matrix2;
        this.f23490y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f23475i = fArr[0];
        this.f23476j = fArr[1];
        this.f23486t = (int) v7.a7.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f23487u = (int) v7.a7.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f23481o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f23473f = runnable2;
        this.f23478l = 4.0f;
        this.f23472c = -0.1f;
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
        i11 i11Var = this.E;
        int i10 = i11Var.f23868w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            i11Var.f23868w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f23473f;
        if (runnable != null) {
            k11.b(runnable);
            this.f23473f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f23484r;
        float[] fArr = this.f23483q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f23482p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f23480n = false;
    }

    public h11(org.telegram.ui.Components.i11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h11.<init>(org.telegram.ui.Components.i11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public h11(org.telegram.ui.Components.i11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h11.<init>(org.telegram.ui.Components.i11, android.view.View, float, java.lang.Runnable):void");
    }
}
