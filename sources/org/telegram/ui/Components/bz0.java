package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
public final class bz0 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final cz0 E;
    public final ArrayList f32446a;
    public long f32447b;
    public float f32448c;
    public boolean d;
    public final Runnable f32449e;
    public Runnable f32450f;
    public float f32451g;
    public float h;
    public final float f32452i;
    public final float f32453j;
    public final float f32454k;
    public final float f32455l;
    public final float f32456m;
    public boolean f32457n;
    public final boolean f32458o;
    public final float[] f32459p;
    public final float[] f32460q;
    public final Matrix f32461r;
    public int f32462s;
    public final int f32463t;
    public final int f32464u;
    public int v;
    public int f32465w;
    public float f32466x;
    public final float f32467y;
    public int f32468z;

    public bz0(cz0 cz0Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = cz0Var;
        this.f32446a = new ArrayList();
        this.f32447b = -1L;
        this.f32448c = 0.0f;
        this.d = true;
        this.f32451g = 0.0f;
        this.h = 0.0f;
        this.f32452i = 0.0f;
        this.f32453j = 0.0f;
        this.f32454k = org.telegram.messenger.g0.f22562p;
        this.f32455l = 1.5f;
        this.f32456m = 1.15f;
        this.f32457n = true;
        this.f32458o = false;
        this.f32459p = new float[9];
        this.f32460q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f32461r = matrix2;
        this.f32467y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f32452i = fArr[0];
        this.f32453j = fArr[1];
        this.f32463t = (int) a8.r9.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f32464u = (int) a8.r9.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f32458o = true;
        matrix2.set(matrix);
        c();
        this.f32449e = runnable;
        this.f32450f = runnable2;
        this.f32455l = 4.0f;
        this.f32448c = -0.1f;
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
        cz0 cz0Var = this.E;
        int i7 = cz0Var.f32805x;
        if (i7 != 0) {
            try {
                GLES20.glDeleteProgram(i7);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            cz0Var.f32805x = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
        Runnable runnable = this.f32450f;
        if (runnable != null) {
            ez0.b(runnable);
            this.f32450f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f32461r;
        float[] fArr = this.f32460q;
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.f32459p;
        fArr2[0] = f10;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f32457n = false;
    }

    public bz0(org.telegram.ui.Components.cz0 r32, java.util.ArrayList r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bz0.<init>(org.telegram.ui.Components.cz0, java.util.ArrayList, java.lang.Runnable):void");
    }

    public bz0(org.telegram.ui.Components.cz0 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bz0.<init>(org.telegram.ui.Components.cz0, android.view.View, float, java.lang.Runnable):void");
    }
}
