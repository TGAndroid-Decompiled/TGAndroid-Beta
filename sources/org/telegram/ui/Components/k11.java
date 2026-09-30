package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class k11 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final l11 E;
    public final ArrayList f25604a;
    public long f25605b;
    public float f25606c;
    public boolean d;
    public final Runnable e;
    public Runnable f25607f;
    public float f25608g;
    public float h;
    public final float f25609i;
    public final float f25610j;
    public final float f25611k;
    public final float f25612l;
    public final float f25613m;
    public boolean f25614n;
    public final boolean f25615o;
    public final float[] f25616p;
    public final float[] f25617q;
    public final Matrix f25618r;
    public int f25619s;
    public final int f25620t;
    public final int f25621u;
    public int v;
    public int f25622w;
    public float f25623x;
    public final float f25624y;
    public int f25625z;

    public k11(l11 l11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = l11Var;
        this.f25604a = new ArrayList();
        this.f25605b = -1L;
        this.f25606c = 0.0f;
        this.d = true;
        this.f25608g = 0.0f;
        this.h = 0.0f;
        this.f25609i = 0.0f;
        this.f25610j = 0.0f;
        this.f25611k = AndroidUtilities.density;
        this.f25612l = 1.5f;
        this.f25613m = 1.15f;
        this.f25614n = true;
        this.f25615o = false;
        this.f25616p = new float[9];
        this.f25617q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f25618r = matrix2;
        this.f25624y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f25609i = fArr[0];
        this.f25610j = fArr[1];
        this.f25620t = (int) v7.a7.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f25621u = (int) v7.a7.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f25615o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f25607f = runnable2;
        this.f25612l = 4.0f;
        this.f25606c = -0.1f;
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
        l11 l11Var = this.E;
        int i10 = l11Var.f25884w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            l11Var.f25884w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f25607f;
        if (runnable != null) {
            n11.b(runnable);
            this.f25607f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f25618r;
        float[] fArr = this.f25617q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f25616p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f25614n = false;
    }

    public k11(org.telegram.ui.Components.l11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k11.<init>(org.telegram.ui.Components.l11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public k11(org.telegram.ui.Components.l11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k11.<init>(org.telegram.ui.Components.l11, android.view.View, float, java.lang.Runnable):void");
    }
}
