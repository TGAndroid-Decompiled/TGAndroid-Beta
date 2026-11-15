package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
public final class cz0 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final dz0 E;
    public final ArrayList f33724a;
    public long f33725b;
    public float f33726c;
    public boolean d;
    public final Runnable f33727e;
    public Runnable f33728f;
    public float f33729g;
    public float h;
    public final float f33730i;
    public final float f33731j;
    public final float f33732k;
    public final float f33733l;
    public final float f33734m;
    public boolean f33735n;
    public final boolean f33736o;
    public final float[] f33737p;
    public final float[] f33738q;
    public final Matrix f33739r;
    public int f33740s;
    public final int f33741t;
    public final int f33742u;
    public int v;
    public int f33743w;
    public float f33744x;
    public final float f33745y;
    public int f33746z;

    public cz0(dz0 dz0Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = dz0Var;
        this.f33724a = new ArrayList();
        this.f33725b = -1L;
        this.f33726c = 0.0f;
        this.d = true;
        this.f33729g = 0.0f;
        this.h = 0.0f;
        this.f33730i = 0.0f;
        this.f33731j = 0.0f;
        this.f33732k = org.telegram.messenger.g0.f23610p;
        this.f33733l = 1.5f;
        this.f33734m = 1.15f;
        this.f33735n = true;
        this.f33736o = false;
        this.f33737p = new float[9];
        this.f33738q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f33739r = matrix2;
        this.f33745y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f33730i = fArr[0];
        this.f33731j = fArr[1];
        this.f33741t = (int) a8.t9.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f33742u = (int) a8.t9.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f33736o = true;
        matrix2.set(matrix);
        c();
        this.f33727e = runnable;
        this.f33728f = runnable2;
        this.f33733l = 4.0f;
        this.f33726c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11) {
        float f12;
        canvas.save();
        if (q1Var.a()) {
            f12 = q1Var.getAlpha();
        } else {
            f12 = 1.0f;
        }
        canvas.translate(f10, f11);
        boolean z10 = true;
        q1Var.setInvalidatesParent(true);
        if (i7 == 0) {
            q1Var.y1(f12, canvas, true);
        } else if (i7 == 1) {
            q1Var.h1(canvas, f12);
        } else if (i7 == 2) {
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f27755l & 1) != 0) {
                z10 = false;
            }
            q1Var.Q0(f12, canvas, z10);
        } else if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f27755l & 1) != 0) {
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
        dz0 dz0Var = this.E;
        int i7 = dz0Var.f34105x;
        if (i7 != 0) {
            try {
                GLES20.glDeleteProgram(i7);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            dz0Var.f34105x = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
        Runnable runnable = this.f33728f;
        if (runnable != null) {
            fz0.b(runnable);
            this.f33728f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f33739r;
        float[] fArr = this.f33738q;
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.f33737p;
        fArr2[0] = f10;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f33735n = false;
    }

    public cz0(org.telegram.ui.Components.dz0 r32, java.util.ArrayList r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cz0.<init>(org.telegram.ui.Components.dz0, java.util.ArrayList, java.lang.Runnable):void");
    }

    public cz0(org.telegram.ui.Components.dz0 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cz0.<init>(org.telegram.ui.Components.dz0, android.view.View, float, java.lang.Runnable):void");
    }
}
