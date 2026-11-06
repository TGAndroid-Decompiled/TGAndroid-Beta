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
    public final ArrayList f41137a;
    public long f41138b;
    public float f41139c;
    public boolean d;
    public final Runnable f41140e;
    public Runnable f41141f;
    public float f41142g;
    public float h;
    public final float f41143i;
    public final float f41144j;
    public final float f41145k;
    public final float f41146l;
    public final float f41147m;
    public boolean f41148n;
    public final boolean f41149o;
    public final float[] f41150p;
    public final float[] f41151q;
    public final Matrix f41152r;
    public int f41153s;
    public final int f41154t;
    public final int f41155u;
    public int v;
    public int f41156w;
    public float f41157x;
    public final float f41158y;
    public int f41159z;

    public zy0(az0 az0Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = az0Var;
        this.f41137a = new ArrayList();
        this.f41138b = -1L;
        this.f41139c = 0.0f;
        this.d = true;
        this.f41142g = 0.0f;
        this.h = 0.0f;
        this.f41143i = 0.0f;
        this.f41144j = 0.0f;
        this.f41145k = org.telegram.messenger.g0.f22536p;
        this.f41146l = 1.5f;
        this.f41147m = 1.15f;
        this.f41148n = true;
        this.f41149o = false;
        this.f41150p = new float[9];
        this.f41151q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f41152r = matrix2;
        this.f41158y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f41143i = fArr[0];
        this.f41144j = fArr[1];
        this.f41154t = (int) a8.r9.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f41155u = (int) a8.r9.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f41149o = true;
        matrix2.set(matrix);
        c();
        this.f41140e = runnable;
        this.f41141f = runnable2;
        this.f41146l = 4.0f;
        this.f41139c = -0.1f;
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
        int i7 = az0Var.f31964x;
        if (i7 != 0) {
            try {
                GLES20.glDeleteProgram(i7);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            az0Var.f31964x = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
        Runnable runnable = this.f41141f;
        if (runnable != null) {
            cz0.b(runnable);
            this.f41141f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f41152r;
        float[] fArr = this.f41151q;
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.f41150p;
        fArr2[0] = f10;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f41148n = false;
    }

    public zy0(org.telegram.ui.Components.az0 r32, java.util.ArrayList r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zy0.<init>(org.telegram.ui.Components.az0, java.util.ArrayList, java.lang.Runnable):void");
    }

    public zy0(org.telegram.ui.Components.az0 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zy0.<init>(org.telegram.ui.Components.az0, android.view.View, float, java.lang.Runnable):void");
    }
}
