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
    public final ArrayList f30559a;
    public long f30560b;
    public float f30561c;
    public boolean d;
    public final Runnable f30562e;
    public Runnable f30563f;
    public float f30564g;
    public float h;
    public final float f30565i;
    public final float f30566j;
    public final float f30567k;
    public final float f30568l;
    public final float f30569m;
    public boolean f30570n;
    public final boolean f30571o;
    public final float[] f30572p;
    public final float[] f30573q;
    public final Matrix f30574r;
    public int f30575s;
    public final int f30576t;
    public final int f30577u;
    public int v;
    public int f30578w;
    public float f30579x;
    public final float f30580y;
    public int f30581z;

    public s11(t11 t11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = t11Var;
        this.f30559a = new ArrayList();
        this.f30560b = -1L;
        this.f30561c = 0.0f;
        this.d = true;
        this.f30564g = 0.0f;
        this.h = 0.0f;
        this.f30565i = 0.0f;
        this.f30566j = 0.0f;
        this.f30567k = AndroidUtilities.density;
        this.f30568l = 1.5f;
        this.f30569m = 1.15f;
        this.f30570n = true;
        this.f30571o = false;
        this.f30572p = new float[9];
        this.f30573q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f30574r = matrix2;
        this.f30580y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f30565i = fArr[0];
        this.f30566j = fArr[1];
        this.f30576t = (int) v7.z6.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f30577u = (int) v7.z6.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f30571o = true;
        matrix2.set(matrix);
        c();
        this.f30562e = runnable;
        this.f30563f = runnable2;
        this.f30568l = 4.0f;
        this.f30561c = -0.1f;
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
            u1Var.I1(f11, canvas, (u1Var.getCurrentPosition() == null || (u1Var.getCurrentPosition().flags & 1) != 0) ? false : false);
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
        t11 t11Var = this.E;
        int i10 = t11Var.f30929w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            t11Var.f30929w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        Runnable runnable = this.f30563f;
        if (runnable != null) {
            v11.b(runnable);
            this.f30563f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f30574r;
        float[] fArr = this.f30573q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f30572p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f30570n = false;
    }

    public s11(org.telegram.ui.Components.t11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s11.<init>(org.telegram.ui.Components.t11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public s11(org.telegram.ui.Components.t11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s11.<init>(org.telegram.ui.Components.t11, android.view.View, float, java.lang.Runnable):void");
    }
}
