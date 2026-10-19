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
    public final ArrayList f29772a;
    public long f29773b;
    public float f29774c;
    public boolean d;
    public final Runnable e;
    public Runnable f29775f;
    public float f29776g;
    public float h;
    public final float f29777i;
    public final float f29778j;
    public final float f29779k;
    public final float f29780l;
    public final float f29781m;
    public boolean f29782n;
    public final boolean f29783o;
    public final float[] f29784p;
    public final float[] f29785q;
    public final Matrix f29786r;
    public int f29787s;
    public final int f29788t;
    public final int f29789u;
    public int v;
    public int f29790w;
    public float f29791x;
    public final float f29792y;
    public int f29793z;

    public r11(s11 s11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = s11Var;
        this.f29772a = new ArrayList();
        this.f29773b = -1L;
        this.f29774c = 0.0f;
        this.d = true;
        this.f29776g = 0.0f;
        this.h = 0.0f;
        this.f29777i = 0.0f;
        this.f29778j = 0.0f;
        this.f29779k = AndroidUtilities.density;
        this.f29780l = 1.5f;
        this.f29781m = 1.15f;
        this.f29782n = true;
        this.f29783o = false;
        this.f29784p = new float[9];
        this.f29785q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f29786r = matrix2;
        this.f29792y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f29777i = fArr[0];
        this.f29778j = fArr[1];
        this.f29788t = (int) v7.f7.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f29789u = (int) v7.f7.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f29783o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f29775f = runnable2;
        this.f29780l = 4.0f;
        this.f29774c = -0.1f;
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
        int i10 = s11Var.f30125w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            s11Var.f30125w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f29775f;
        if (runnable != null) {
            u11.b(runnable);
            this.f29775f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f29786r;
        float[] fArr = this.f29785q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f29784p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f29782n = false;
    }

    public r11(org.telegram.ui.Components.s11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r11.<init>(org.telegram.ui.Components.s11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public r11(org.telegram.ui.Components.s11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r11.<init>(org.telegram.ui.Components.s11, android.view.View, float, java.lang.Runnable):void");
    }
}
