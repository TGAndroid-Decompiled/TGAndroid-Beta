package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class y01 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final z01 E;
    public final ArrayList f33236a;
    public long f33237b;
    public float f33238c;
    public boolean d;
    public final Runnable f33239e;
    public Runnable f33240f;
    public float f33241g;
    public float h;
    public final float f33242i;
    public final float f33243j;
    public final float f33244k;
    public final float f33245l;
    public final float f33246m;
    public boolean f33247n;
    public final boolean f33248o;
    public final float[] f33249p;
    public final float[] f33250q;
    public final Matrix f33251r;
    public int f33252s;
    public final int f33253t;
    public final int f33254u;
    public int v;
    public int f33255w;
    public float f33256x;
    public final float f33257y;
    public int f33258z;

    public y01(z01 z01Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = z01Var;
        this.f33236a = new ArrayList();
        this.f33237b = -1L;
        this.f33238c = 0.0f;
        this.d = true;
        this.f33241g = 0.0f;
        this.h = 0.0f;
        this.f33242i = 0.0f;
        this.f33243j = 0.0f;
        this.f33244k = AndroidUtilities.density;
        this.f33245l = 1.5f;
        this.f33246m = 1.15f;
        this.f33247n = true;
        this.f33248o = false;
        this.f33249p = new float[9];
        this.f33250q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f33251r = matrix2;
        this.f33257y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f33242i = fArr[0];
        this.f33243j = fArr[1];
        this.f33253t = (int) k7.o6.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f33254u = (int) k7.o6.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f33248o = true;
        matrix2.set(matrix);
        c();
        this.f33239e = runnable;
        this.f33240f = runnable2;
        this.f33245l = 4.0f;
        this.f33238c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.t1 t1Var, int i10, float f10, float f11) {
        float f12;
        canvas.save();
        if (t1Var.a()) {
            f12 = t1Var.getAlpha();
        } else {
            f12 = 1.0f;
        }
        canvas.translate(f10, f11);
        boolean z4 = true;
        t1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            t1Var.m2(f12, canvas, true);
        } else if (i10 == 1) {
            t1Var.W1(canvas, f12);
        } else if (i10 == 2) {
            t1Var.I1(f12, canvas, (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) ? false : false);
        } else if (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) {
            t1Var.d2(canvas, f12, null);
            t1Var.N1(canvas, f12);
        }
        t1Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        z01 z01Var = this.E;
        int i10 = z01Var.f33685w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            z01Var.f33685w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        Runnable runnable = this.f33240f;
        if (runnable != null) {
            b11.b(runnable);
            this.f33240f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f33251r;
        float[] fArr = this.f33250q;
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.f33249p;
        fArr2[0] = f10;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f33247n = false;
    }

    public y01(org.telegram.ui.Components.z01 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y01.<init>(org.telegram.ui.Components.z01, java.util.ArrayList, java.lang.Runnable):void");
    }

    public y01(org.telegram.ui.Components.z01 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y01.<init>(org.telegram.ui.Components.z01, android.view.View, float, java.lang.Runnable):void");
    }
}
