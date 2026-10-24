package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class u11 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final v11 E;
    public final ArrayList f30967a;
    public long f30968b;
    public float f30969c;
    public boolean d;
    public final Runnable e;
    public Runnable f30970f;
    public float f30971g;
    public float h;
    public final float f30972i;
    public final float f30973j;
    public final float f30974k;
    public final float f30975l;
    public final float f30976m;
    public boolean f30977n;
    public final boolean f30978o;
    public final float[] f30979p;
    public final float[] f30980q;
    public final Matrix f30981r;
    public int f30982s;
    public final int f30983t;
    public final int f30984u;
    public int v;
    public int f30985w;
    public float f30986x;
    public final float f30987y;
    public int f30988z;

    public u11(v11 v11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = v11Var;
        this.f30967a = new ArrayList();
        this.f30968b = -1L;
        this.f30969c = 0.0f;
        this.d = true;
        this.f30971g = 0.0f;
        this.h = 0.0f;
        this.f30972i = 0.0f;
        this.f30973j = 0.0f;
        this.f30974k = AndroidUtilities.density;
        this.f30975l = 1.5f;
        this.f30976m = 1.15f;
        this.f30977n = true;
        this.f30978o = false;
        this.f30979p = new float[9];
        this.f30980q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f30981r = matrix2;
        this.f30987y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f30972i = fArr[0];
        this.f30973j = fArr[1];
        this.f30983t = (int) v7.f7.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f30984u = (int) v7.f7.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f30978o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f30970f = runnable2;
        this.f30975l = 4.0f;
        this.f30969c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10) {
        float f11;
        canvas.save();
        if (t1Var.c()) {
            f11 = t1Var.getAlpha();
        } else {
            f11 = 1.0f;
        }
        canvas.translate(f7, f10);
        boolean z10 = true;
        t1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            t1Var.l2(f11, canvas, true);
        } else if (i10 == 1) {
            t1Var.V1(canvas, f11);
        } else if (i10 == 2) {
            if (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) {
                z10 = false;
            }
            t1Var.H1(f11, canvas, z10);
        } else if (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) {
            t1Var.c2(canvas, f11, null);
            t1Var.M1(canvas, f11);
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
        v11 v11Var = this.E;
        int i10 = v11Var.f31261w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            v11Var.f31261w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f30970f;
        if (runnable != null) {
            x11.b(runnable);
            this.f30970f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f30981r;
        float[] fArr = this.f30980q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f30979p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f30977n = false;
    }

    public u11(org.telegram.ui.Components.v11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u11.<init>(org.telegram.ui.Components.v11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public u11(org.telegram.ui.Components.v11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u11.<init>(org.telegram.ui.Components.v11, android.view.View, float, java.lang.Runnable):void");
    }
}
