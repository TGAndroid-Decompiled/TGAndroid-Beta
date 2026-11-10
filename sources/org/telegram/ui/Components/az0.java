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
    public final ArrayList f32038a;
    public long f32039b;
    public float f32040c;
    public boolean d;
    public final Runnable f32041e;
    public Runnable f32042f;
    public float f32043g;
    public float h;
    public final float f32044i;
    public final float f32045j;
    public final float f32046k;
    public final float f32047l;
    public final float f32048m;
    public boolean f32049n;
    public final boolean f32050o;
    public final float[] f32051p;
    public final float[] f32052q;
    public final Matrix f32053r;
    public int f32054s;
    public final int f32055t;
    public final int f32056u;
    public int v;
    public int f32057w;
    public float f32058x;
    public final float f32059y;
    public int f32060z;

    public az0(bz0 bz0Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = bz0Var;
        this.f32038a = new ArrayList();
        this.f32039b = -1L;
        this.f32040c = 0.0f;
        this.d = true;
        this.f32043g = 0.0f;
        this.h = 0.0f;
        this.f32044i = 0.0f;
        this.f32045j = 0.0f;
        this.f32046k = org.telegram.messenger.g0.f22566p;
        this.f32047l = 1.5f;
        this.f32048m = 1.15f;
        this.f32049n = true;
        this.f32050o = false;
        this.f32051p = new float[9];
        this.f32052q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f32053r = matrix2;
        this.f32059y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f32044i = fArr[0];
        this.f32045j = fArr[1];
        this.f32055t = (int) a8.r9.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f32056u = (int) a8.r9.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f32050o = true;
        matrix2.set(matrix);
        c();
        this.f32041e = runnable;
        this.f32042f = runnable2;
        this.f32047l = 4.0f;
        this.f32040c = -0.1f;
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
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f21455l & 1) != 0) {
                z9 = false;
            }
            q1Var.Q0(f12, canvas, z9);
        } else if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f21455l & 1) != 0) {
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
        int i7 = bz0Var.f32396x;
        if (i7 != 0) {
            try {
                GLES20.glDeleteProgram(i7);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            bz0Var.f32396x = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
        Runnable runnable = this.f32042f;
        if (runnable != null) {
            dz0.b(runnable);
            this.f32042f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f32053r;
        float[] fArr = this.f32052q;
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.f32051p;
        fArr2[0] = f10;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f32049n = false;
    }

    public az0(org.telegram.ui.Components.bz0 r32, java.util.ArrayList r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.az0.<init>(org.telegram.ui.Components.bz0, java.util.ArrayList, java.lang.Runnable):void");
    }

    public az0(org.telegram.ui.Components.bz0 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.az0.<init>(org.telegram.ui.Components.bz0, android.view.View, float, java.lang.Runnable):void");
    }
}
