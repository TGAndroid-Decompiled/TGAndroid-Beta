package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class b21 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final c21 E;
    public final ArrayList f24785a;
    public long f24786b;
    public float f24787c;
    public boolean d;
    public final Runnable f24788e;
    public Runnable f24789f;
    public float f24790g;
    public float h;
    public final float f24791i;
    public final float f24792j;
    public final float f24793k;
    public final float f24794l;
    public final float f24795m;
    public boolean f24796n;
    public final boolean f24797o;
    public final float[] f24798p;
    public final float[] f24799q;
    public final Matrix f24800r;
    public int f24801s;
    public final int f24802t;
    public final int f24803u;
    public int v;
    public int f24804w;
    public float f24805x;
    public final float f24806y;
    public int f24807z;

    public b21(c21 c21Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = c21Var;
        this.f24785a = new ArrayList();
        this.f24786b = -1L;
        this.f24787c = 0.0f;
        this.d = true;
        this.f24790g = 0.0f;
        this.h = 0.0f;
        this.f24791i = 0.0f;
        this.f24792j = 0.0f;
        this.f24793k = AndroidUtilities.density;
        this.f24794l = 1.5f;
        this.f24795m = 1.15f;
        this.f24796n = true;
        this.f24797o = false;
        this.f24798p = new float[9];
        this.f24799q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f24800r = matrix2;
        this.f24806y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f24791i = fArr[0];
        this.f24792j = fArr[1];
        this.f24802t = (int) v7.z6.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f24803u = (int) v7.z6.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f24797o = true;
        matrix2.set(matrix);
        c();
        this.f24788e = runnable;
        this.f24789f = runnable2;
        this.f24794l = 4.0f;
        this.f24787c = -0.1f;
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        c21 c21Var = this.E;
        int i10 = c21Var.f25075w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            c21Var.f25075w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        Runnable runnable = this.f24789f;
        if (runnable != null) {
            e21.b(runnable);
            this.f24789f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f24800r;
        float[] fArr = this.f24799q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f24798p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f24796n = false;
    }

    public b21(org.telegram.ui.Components.c21 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b21.<init>(org.telegram.ui.Components.c21, java.util.ArrayList, java.lang.Runnable):void");
    }

    public b21(org.telegram.ui.Components.c21 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b21.<init>(org.telegram.ui.Components.c21, android.view.View, float, java.lang.Runnable):void");
    }
}
