package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class r11 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final s11 E;
    public final ArrayList f29774a;
    public long f29775b;
    public float f29776c;
    public boolean d;
    public final Runnable e;
    public Runnable f29777f;
    public float f29778g;
    public float h;
    public final float f29779i;
    public final float f29780j;
    public final float f29781k;
    public final float f29782l;
    public final float f29783m;
    public boolean f29784n;
    public final boolean f29785o;
    public final float[] f29786p;
    public final float[] f29787q;
    public final Matrix f29788r;
    public int f29789s;
    public final int f29790t;
    public final int f29791u;
    public int v;
    public int f29792w;
    public float f29793x;
    public final float f29794y;
    public int f29795z;

    public r11(s11 s11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = s11Var;
        this.f29774a = new ArrayList();
        this.f29775b = -1L;
        this.f29776c = 0.0f;
        this.d = true;
        this.f29778g = 0.0f;
        this.h = 0.0f;
        this.f29779i = 0.0f;
        this.f29780j = 0.0f;
        this.f29781k = AndroidUtilities.density;
        this.f29782l = 1.5f;
        this.f29783m = 1.15f;
        this.f29784n = true;
        this.f29785o = false;
        this.f29786p = new float[9];
        this.f29787q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f29788r = matrix2;
        this.f29794y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f29779i = fArr[0];
        this.f29780j = fArr[1];
        this.f29790t = (int) v7.f7.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f29791u = (int) v7.f7.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f29785o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f29777f = runnable2;
        this.f29782l = 4.0f;
        this.f29776c = -0.1f;
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        s11 s11Var = this.E;
        int i10 = s11Var.f30128w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            s11Var.f30128w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f29777f;
        if (runnable != null) {
            u11.b(runnable);
            this.f29777f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f29788r;
        float[] fArr = this.f29787q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f29786p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f29784n = false;
    }

    public r11(org.telegram.ui.Components.s11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r11.<init>(org.telegram.ui.Components.s11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public r11(org.telegram.ui.Components.s11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r11.<init>(org.telegram.ui.Components.s11, android.view.View, float, java.lang.Runnable):void");
    }
}
