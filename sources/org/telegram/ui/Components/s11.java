package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class s11 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final t11 E;
    public final ArrayList f30114a;
    public long f30115b;
    public float f30116c;
    public boolean d;
    public final Runnable e;
    public Runnable f30117f;
    public float f30118g;
    public float h;
    public final float f30119i;
    public final float f30120j;
    public final float f30121k;
    public final float f30122l;
    public final float f30123m;
    public boolean f30124n;
    public final boolean f30125o;
    public final float[] f30126p;
    public final float[] f30127q;
    public final Matrix f30128r;
    public int f30129s;
    public final int f30130t;
    public final int f30131u;
    public int v;
    public int f30132w;
    public float f30133x;
    public final float f30134y;
    public int f30135z;

    public s11(t11 t11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = t11Var;
        this.f30114a = new ArrayList();
        this.f30115b = -1L;
        this.f30116c = 0.0f;
        this.d = true;
        this.f30118g = 0.0f;
        this.h = 0.0f;
        this.f30119i = 0.0f;
        this.f30120j = 0.0f;
        this.f30121k = AndroidUtilities.density;
        this.f30122l = 1.5f;
        this.f30123m = 1.15f;
        this.f30124n = true;
        this.f30125o = false;
        this.f30126p = new float[9];
        this.f30127q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f30128r = matrix2;
        this.f30134y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f30119i = fArr[0];
        this.f30120j = fArr[1];
        this.f30130t = (int) v7.f7.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f30131u = (int) v7.f7.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f30125o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f30117f = runnable2;
        this.f30122l = 4.0f;
        this.f30116c = -0.1f;
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
        t11 t11Var = this.E;
        int i10 = t11Var.f30397w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            t11Var.f30397w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f30117f;
        if (runnable != null) {
            v11.b(runnable);
            this.f30117f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f30128r;
        float[] fArr = this.f30127q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f30126p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f30124n = false;
    }

    public s11(org.telegram.ui.Components.t11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s11.<init>(org.telegram.ui.Components.t11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public s11(org.telegram.ui.Components.t11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s11.<init>(org.telegram.ui.Components.t11, android.view.View, float, java.lang.Runnable):void");
    }
}
