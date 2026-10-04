package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class s11 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final t11 E;
    public final ArrayList f30566a;
    public long f30567b;
    public float f30568c;
    public boolean d;
    public final Runnable f30569e;
    public Runnable f30570f;
    public float f30571g;
    public float h;
    public final float f30572i;
    public final float f30573j;
    public final float f30574k;
    public final float f30575l;
    public final float f30576m;
    public boolean f30577n;
    public final boolean f30578o;
    public final float[] f30579p;
    public final float[] f30580q;
    public final Matrix f30581r;
    public int f30582s;
    public final int f30583t;
    public final int f30584u;
    public int v;
    public int f30585w;
    public float f30586x;
    public final float f30587y;
    public int f30588z;

    public s11(t11 t11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = t11Var;
        this.f30566a = new ArrayList();
        this.f30567b = -1L;
        this.f30568c = 0.0f;
        this.d = true;
        this.f30571g = 0.0f;
        this.h = 0.0f;
        this.f30572i = 0.0f;
        this.f30573j = 0.0f;
        this.f30574k = AndroidUtilities.density;
        this.f30575l = 1.5f;
        this.f30576m = 1.15f;
        this.f30577n = true;
        this.f30578o = false;
        this.f30579p = new float[9];
        this.f30580q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f30581r = matrix2;
        this.f30587y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f30572i = fArr[0];
        this.f30573j = fArr[1];
        this.f30583t = (int) v7.z6.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f30584u = (int) v7.z6.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f30578o = true;
        matrix2.set(matrix);
        c();
        this.f30569e = runnable;
        this.f30570f = runnable2;
        this.f30575l = 4.0f;
        this.f30568c = -0.1f;
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        t11 t11Var = this.E;
        int i10 = t11Var.f30936w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            t11Var.f30936w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        Runnable runnable = this.f30570f;
        if (runnable != null) {
            v11.b(runnable);
            this.f30570f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f30581r;
        float[] fArr = this.f30580q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f30579p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f30577n = false;
    }

    public s11(org.telegram.ui.Components.t11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s11.<init>(org.telegram.ui.Components.t11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public s11(org.telegram.ui.Components.t11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s11.<init>(org.telegram.ui.Components.t11, android.view.View, float, java.lang.Runnable):void");
    }
}
