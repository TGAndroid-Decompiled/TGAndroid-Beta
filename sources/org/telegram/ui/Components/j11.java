package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class j11 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final k11 E;
    public final ArrayList f25100a;
    public long f25101b;
    public float f25102c;
    public boolean d;
    public final Runnable e;
    public Runnable f25103f;
    public float f25104g;
    public float h;
    public final float f25105i;
    public final float f25106j;
    public final float f25107k;
    public final float f25108l;
    public final float f25109m;
    public boolean f25110n;
    public final boolean f25111o;
    public final float[] f25112p;
    public final float[] f25113q;
    public final Matrix f25114r;
    public int f25115s;
    public final int f25116t;
    public final int f25117u;
    public int v;
    public int f25118w;
    public float f25119x;
    public final float f25120y;
    public int f25121z;

    public j11(k11 k11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = k11Var;
        this.f25100a = new ArrayList();
        this.f25101b = -1L;
        this.f25102c = 0.0f;
        this.d = true;
        this.f25104g = 0.0f;
        this.h = 0.0f;
        this.f25105i = 0.0f;
        this.f25106j = 0.0f;
        this.f25107k = AndroidUtilities.density;
        this.f25108l = 1.5f;
        this.f25109m = 1.15f;
        this.f25110n = true;
        this.f25111o = false;
        this.f25112p = new float[9];
        this.f25113q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f25114r = matrix2;
        this.f25120y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f25105i = fArr[0];
        this.f25106j = fArr[1];
        this.f25116t = (int) v7.z6.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f25117u = (int) v7.z6.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f25111o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f25103f = runnable2;
        this.f25108l = 4.0f;
        this.f25102c = -0.1f;
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
            u1Var.I1(f11, canvas, (u1Var.getCurrentPosition() == null || (u1Var.getCurrentPosition().flags & 1) != 0) ? false : false);
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        k11 k11Var = this.E;
        int i10 = k11Var.f25537w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            k11Var.f25537w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f25103f;
        if (runnable != null) {
            m11.b(runnable);
            this.f25103f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f25114r;
        float[] fArr = this.f25113q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f25112p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f25110n = false;
    }

    public j11(org.telegram.ui.Components.k11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j11.<init>(org.telegram.ui.Components.k11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public j11(org.telegram.ui.Components.k11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j11.<init>(org.telegram.ui.Components.k11, android.view.View, float, java.lang.Runnable):void");
    }
}
