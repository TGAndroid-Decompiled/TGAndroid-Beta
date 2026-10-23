package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class v11 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final w11 E;
    public final ArrayList f31282a;
    public long f31283b;
    public float f31284c;
    public boolean d;
    public final Runnable e;
    public Runnable f31285f;
    public float f31286g;
    public float h;
    public final float f31287i;
    public final float f31288j;
    public final float f31289k;
    public final float f31290l;
    public final float f31291m;
    public boolean f31292n;
    public final boolean f31293o;
    public final float[] f31294p;
    public final float[] f31295q;
    public final Matrix f31296r;
    public int f31297s;
    public final int f31298t;
    public final int f31299u;
    public int v;
    public int f31300w;
    public float f31301x;
    public final float f31302y;
    public int f31303z;

    public v11(w11 w11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = w11Var;
        this.f31282a = new ArrayList();
        this.f31283b = -1L;
        this.f31284c = 0.0f;
        this.d = true;
        this.f31286g = 0.0f;
        this.h = 0.0f;
        this.f31287i = 0.0f;
        this.f31288j = 0.0f;
        this.f31289k = AndroidUtilities.density;
        this.f31290l = 1.5f;
        this.f31291m = 1.15f;
        this.f31292n = true;
        this.f31293o = false;
        this.f31294p = new float[9];
        this.f31295q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f31296r = matrix2;
        this.f31302y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f31287i = fArr[0];
        this.f31288j = fArr[1];
        this.f31298t = (int) v7.f7.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f31299u = (int) v7.f7.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f31293o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f31285f = runnable2;
        this.f31290l = 4.0f;
        this.f31284c = -0.1f;
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
        w11 w11Var = this.E;
        int i10 = w11Var.f32107w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            w11Var.f32107w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f31285f;
        if (runnable != null) {
            y11.b(runnable);
            this.f31285f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f31296r;
        float[] fArr = this.f31295q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f31294p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f31292n = false;
    }

    public v11(org.telegram.ui.Components.w11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v11.<init>(org.telegram.ui.Components.w11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public v11(org.telegram.ui.Components.w11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v11.<init>(org.telegram.ui.Components.w11, android.view.View, float, java.lang.Runnable):void");
    }
}
