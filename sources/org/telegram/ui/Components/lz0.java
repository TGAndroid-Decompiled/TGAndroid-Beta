package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
public final class lz0 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final mz0 E;
    public final ArrayList f37325a;
    public long f37326b;
    public float f37327c;
    public boolean d;
    public final Runnable f37328e;
    public Runnable f37329f;
    public float f37330g;
    public float h;
    public final float f37331i;
    public final float f37332j;
    public final float f37333k;
    public final float f37334l;
    public final float f37335m;
    public boolean f37336n;
    public final boolean f37337o;
    public final float[] f37338p;
    public final float[] f37339q;
    public final Matrix f37340r;
    public int f37341s;
    public final int f37342t;
    public final int f37343u;
    public int v;
    public int f37344w;
    public float f37345x;
    public final float f37346y;
    public int f37347z;

    public lz0(mz0 mz0Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = mz0Var;
        this.f37325a = new ArrayList();
        this.f37326b = -1L;
        this.f37327c = 0.0f;
        this.d = true;
        this.f37330g = 0.0f;
        this.h = 0.0f;
        this.f37331i = 0.0f;
        this.f37332j = 0.0f;
        this.f37333k = org.telegram.messenger.g0.f24145p;
        this.f37334l = 1.5f;
        this.f37335m = 1.15f;
        this.f37336n = true;
        this.f37337o = false;
        this.f37338p = new float[9];
        this.f37339q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f37340r = matrix2;
        this.f37346y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f37331i = fArr[0];
        this.f37332j = fArr[1];
        this.f37342t = (int) a8.w9.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f37343u = (int) a8.w9.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f37337o = true;
        matrix2.set(matrix);
        c();
        this.f37328e = runnable;
        this.f37329f = runnable2;
        this.f37334l = 4.0f;
        this.f37327c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.r1 r1Var, int i7, float f10, float f11) {
        float f12;
        canvas.save();
        if (r1Var.b()) {
            f12 = r1Var.getAlpha();
        } else {
            f12 = 1.0f;
        }
        canvas.translate(f10, f11);
        boolean z10 = true;
        r1Var.setInvalidatesParent(true);
        if (i7 == 0) {
            r1Var.y1(f12, canvas, true);
        } else if (i7 == 1) {
            r1Var.h1(canvas, f12);
        } else if (i7 == 2) {
            if (r1Var.getCurrentPosition() == null || (r1Var.getCurrentPosition().f27917l & 1) != 0) {
                z10 = false;
            }
            r1Var.Q0(f12, canvas, z10);
        } else if (r1Var.getCurrentPosition() == null || (r1Var.getCurrentPosition().f27917l & 1) != 0) {
            r1Var.o1(canvas, f12, null);
            r1Var.V0(canvas, f12);
        }
        r1Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        mz0 mz0Var = this.E;
        int i7 = mz0Var.f37679x;
        if (i7 != 0) {
            try {
                GLES20.glDeleteProgram(i7);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            mz0Var.f37679x = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
        Runnable runnable = this.f37329f;
        if (runnable != null) {
            oz0.b(runnable);
            this.f37329f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f37340r;
        float[] fArr = this.f37339q;
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.f37338p;
        fArr2[0] = f10;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f37336n = false;
    }

    public lz0(org.telegram.ui.Components.mz0 r32, java.util.ArrayList r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lz0.<init>(org.telegram.ui.Components.mz0, java.util.ArrayList, java.lang.Runnable):void");
    }

    public lz0(org.telegram.ui.Components.mz0 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lz0.<init>(org.telegram.ui.Components.mz0, android.view.View, float, java.lang.Runnable):void");
    }
}
