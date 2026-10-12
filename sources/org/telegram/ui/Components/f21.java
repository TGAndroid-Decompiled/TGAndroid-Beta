package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class f21 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final g21 E;
    public final ArrayList f25848a;
    public long f25849b;
    public float f25850c;
    public boolean d;
    public final Runnable f25851e;
    public Runnable f25852f;
    public float f25853g;
    public float h;
    public final float f25854i;
    public final float f25855j;
    public final float f25856k;
    public final float f25857l;
    public final float f25858m;
    public boolean f25859n;
    public final boolean f25860o;
    public final float[] f25861p;
    public final float[] f25862q;
    public final Matrix f25863r;
    public int f25864s;
    public final int f25865t;
    public final int f25866u;
    public int v;
    public int f25867w;
    public float f25868x;
    public final float f25869y;
    public int f25870z;

    public f21(g21 g21Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = g21Var;
        this.f25848a = new ArrayList();
        this.f25849b = -1L;
        this.f25850c = 0.0f;
        this.d = true;
        this.f25853g = 0.0f;
        this.h = 0.0f;
        this.f25854i = 0.0f;
        this.f25855j = 0.0f;
        this.f25856k = AndroidUtilities.density;
        this.f25857l = 1.5f;
        this.f25858m = 1.15f;
        this.f25859n = true;
        this.f25860o = false;
        this.f25861p = new float[9];
        this.f25862q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f25863r = matrix2;
        this.f25869y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f25854i = fArr[0];
        this.f25855j = fArr[1];
        this.f25865t = (int) v7.z6.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f25866u = (int) v7.z6.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f25860o = true;
        matrix2.set(matrix);
        c();
        this.f25851e = runnable;
        this.f25852f = runnable2;
        this.f25857l = 4.0f;
        this.f25850c = -0.1f;
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
        g21 g21Var = this.E;
        int i10 = g21Var.f26237w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            g21Var.f26237w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        Runnable runnable = this.f25852f;
        if (runnable != null) {
            i21.b(runnable);
            this.f25852f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f25863r;
        float[] fArr = this.f25862q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f25861p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f25859n = false;
    }

    public f21(org.telegram.ui.Components.g21 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f21.<init>(org.telegram.ui.Components.g21, java.util.ArrayList, java.lang.Runnable):void");
    }

    public f21(org.telegram.ui.Components.g21 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f21.<init>(org.telegram.ui.Components.g21, android.view.View, float, java.lang.Runnable):void");
    }
}
