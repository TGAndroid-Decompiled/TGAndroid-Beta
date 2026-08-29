package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class m01 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final n01 E;
    public final ArrayList f30498a;
    public long f30499b;
    public float f30500c;
    public boolean d;
    public final Runnable f30501e;
    public Runnable f30502f;
    public float f30503g;
    public float h;
    public final float f30504i;
    public final float f30505j;
    public final float f30506k;
    public final float f30507l;
    public final float f30508m;
    public boolean f30509n;
    public final boolean f30510o;
    public final float[] f30511p;
    public final float[] f30512q;
    public final Matrix f30513r;
    public int f30514s;
    public final int f30515t;
    public final int f30516u;
    public int v;
    public int f30517w;
    public float f30518x;
    public final float f30519y;
    public int f30520z;

    public m01(n01 n01Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = n01Var;
        this.f30498a = new ArrayList();
        this.f30499b = -1L;
        this.f30500c = 0.0f;
        this.d = true;
        this.f30503g = 0.0f;
        this.h = 0.0f;
        this.f30504i = 0.0f;
        this.f30505j = 0.0f;
        this.f30506k = AndroidUtilities.density;
        this.f30507l = 1.5f;
        this.f30508m = 1.15f;
        this.f30509n = true;
        this.f30510o = false;
        this.f30511p = new float[9];
        this.f30512q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f30513r = matrix2;
        this.f30519y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f30504i = fArr[0];
        this.f30505j = fArr[1];
        this.f30515t = (int) i7.z5.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f30516u = (int) i7.z5.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f30510o = true;
        matrix2.set(matrix);
        c();
        this.f30501e = runnable;
        this.f30502f = runnable2;
        this.f30507l = 4.0f;
        this.f30500c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.s1 s1Var, int i10, float f9, float f10) {
        float f11;
        canvas.save();
        if (s1Var.a()) {
            f11 = s1Var.getAlpha();
        } else {
            f11 = 1.0f;
        }
        canvas.translate(f9, f10);
        boolean z10 = true;
        s1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            s1Var.m2(f11, canvas, true);
        } else if (i10 == 1) {
            s1Var.W1(canvas, f11);
        } else if (i10 == 2) {
            s1Var.I1(f11, canvas, (s1Var.getCurrentPosition() == null || (s1Var.getCurrentPosition().flags & 1) != 0) ? false : false);
        } else if (s1Var.getCurrentPosition() == null || (s1Var.getCurrentPosition().flags & 1) != 0) {
            s1Var.d2(canvas, f11, null);
            s1Var.N1(canvas, f11);
        }
        s1Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        n01 n01Var = this.E;
        int i10 = n01Var.f30808w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            n01Var.f30808w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        Runnable runnable = this.f30502f;
        if (runnable != null) {
            p01.b(runnable);
            this.f30502f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f30513r;
        float[] fArr = this.f30512q;
        matrix.getValues(fArr);
        float f9 = fArr[0];
        float[] fArr2 = this.f30511p;
        fArr2[0] = f9;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f30509n = false;
    }

    public m01(org.telegram.ui.Components.n01 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m01.<init>(org.telegram.ui.Components.n01, java.util.ArrayList, java.lang.Runnable):void");
    }

    public m01(org.telegram.ui.Components.n01 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m01.<init>(org.telegram.ui.Components.n01, android.view.View, float, java.lang.Runnable):void");
    }
}
