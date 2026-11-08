package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
public final class az0 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final bz0 E;
    public final ArrayList f31952a;
    public long f31953b;
    public float f31954c;
    public boolean d;
    public final Runnable f31955e;
    public Runnable f31956f;
    public float f31957g;
    public float h;
    public final float f31958i;
    public final float f31959j;
    public final float f31960k;
    public final float f31961l;
    public final float f31962m;
    public boolean f31963n;
    public final boolean f31964o;
    public final float[] f31965p;
    public final float[] f31966q;
    public final Matrix f31967r;
    public int f31968s;
    public final int f31969t;
    public final int f31970u;
    public int v;
    public int f31971w;
    public float f31972x;
    public final float f31973y;
    public int f31974z;

    public az0(bz0 bz0Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = bz0Var;
        this.f31952a = new ArrayList();
        this.f31953b = -1L;
        this.f31954c = 0.0f;
        this.d = true;
        this.f31957g = 0.0f;
        this.h = 0.0f;
        this.f31958i = 0.0f;
        this.f31959j = 0.0f;
        this.f31960k = org.telegram.messenger.g0.f22562p;
        this.f31961l = 1.5f;
        this.f31962m = 1.15f;
        this.f31963n = true;
        this.f31964o = false;
        this.f31965p = new float[9];
        this.f31966q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f31967r = matrix2;
        this.f31973y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f31958i = fArr[0];
        this.f31959j = fArr[1];
        this.f31969t = (int) a8.r9.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f31970u = (int) a8.r9.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f31964o = true;
        matrix2.set(matrix);
        c();
        this.f31955e = runnable;
        this.f31956f = runnable2;
        this.f31961l = 4.0f;
        this.f31954c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11) {
        float f12;
        canvas.save();
        if (q1Var.b()) {
            f12 = q1Var.getAlpha();
        } else {
            f12 = 1.0f;
        }
        canvas.translate(f10, f11);
        boolean z9 = true;
        q1Var.setInvalidatesParent(true);
        if (i7 == 0) {
            q1Var.x1(f12, canvas, true);
        } else if (i7 == 1) {
            q1Var.h1(canvas, f12);
        } else if (i7 == 2) {
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f21450l & 1) != 0) {
                z9 = false;
            }
            q1Var.Q0(f12, canvas, z9);
        } else if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f21450l & 1) != 0) {
            q1Var.o1(canvas, f12, null);
            q1Var.V0(canvas, f12);
        }
        q1Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        bz0 bz0Var = this.E;
        int i7 = bz0Var.f32389x;
        if (i7 != 0) {
            try {
                GLES20.glDeleteProgram(i7);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            bz0Var.f32389x = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
        Runnable runnable = this.f31956f;
        if (runnable != null) {
            dz0.b(runnable);
            this.f31956f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f31967r;
        float[] fArr = this.f31966q;
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.f31965p;
        fArr2[0] = f10;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f31963n = false;
    }

    public az0(org.telegram.ui.Components.bz0 r32, java.util.ArrayList r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.az0.<init>(org.telegram.ui.Components.bz0, java.util.ArrayList, java.lang.Runnable):void");
    }

    public az0(org.telegram.ui.Components.bz0 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.az0.<init>(org.telegram.ui.Components.bz0, android.view.View, float, java.lang.Runnable):void");
    }
}
