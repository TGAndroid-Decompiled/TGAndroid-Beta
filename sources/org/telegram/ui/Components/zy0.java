package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
public final class zy0 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final az0 E;
    public final ArrayList f41112a;
    public long f41113b;
    public float f41114c;
    public boolean d;
    public final Runnable f41115e;
    public Runnable f41116f;
    public float f41117g;
    public float h;
    public final float f41118i;
    public final float f41119j;
    public final float f41120k;
    public final float f41121l;
    public final float f41122m;
    public boolean f41123n;
    public final boolean f41124o;
    public final float[] f41125p;
    public final float[] f41126q;
    public final Matrix f41127r;
    public int f41128s;
    public final int f41129t;
    public final int f41130u;
    public int v;
    public int f41131w;
    public float f41132x;
    public final float f41133y;
    public int f41134z;

    public zy0(az0 az0Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = az0Var;
        this.f41112a = new ArrayList();
        this.f41113b = -1L;
        this.f41114c = 0.0f;
        this.d = true;
        this.f41117g = 0.0f;
        this.h = 0.0f;
        this.f41118i = 0.0f;
        this.f41119j = 0.0f;
        this.f41120k = org.telegram.messenger.g0.f22536p;
        this.f41121l = 1.5f;
        this.f41122m = 1.15f;
        this.f41123n = true;
        this.f41124o = false;
        this.f41125p = new float[9];
        this.f41126q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f41127r = matrix2;
        this.f41133y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f41118i = fArr[0];
        this.f41119j = fArr[1];
        this.f41129t = (int) a8.r9.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f41130u = (int) a8.r9.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f41124o = true;
        matrix2.set(matrix);
        c();
        this.f41115e = runnable;
        this.f41116f = runnable2;
        this.f41121l = 4.0f;
        this.f41114c = -0.1f;
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
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f21451l & 1) != 0) {
                z9 = false;
            }
            q1Var.Q0(f12, canvas, z9);
        } else if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f21451l & 1) != 0) {
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
        az0 az0Var = this.E;
        int i7 = az0Var.f31952x;
        if (i7 != 0) {
            try {
                GLES20.glDeleteProgram(i7);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            az0Var.f31952x = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
        Runnable runnable = this.f41116f;
        if (runnable != null) {
            cz0.b(runnable);
            this.f41116f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f41127r;
        float[] fArr = this.f41126q;
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.f41125p;
        fArr2[0] = f10;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f41123n = false;
    }

    public zy0(org.telegram.ui.Components.az0 r32, java.util.ArrayList r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zy0.<init>(org.telegram.ui.Components.az0, java.util.ArrayList, java.lang.Runnable):void");
    }

    public zy0(org.telegram.ui.Components.az0 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zy0.<init>(org.telegram.ui.Components.az0, android.view.View, float, java.lang.Runnable):void");
    }
}
