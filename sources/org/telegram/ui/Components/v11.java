package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class v11 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final w11 E;
    public final ArrayList f29833a;
    public long f29834b;
    public float f29835c;
    public boolean d;
    public final Runnable e;
    public Runnable f29836f;
    public float f29837g;
    public float h;
    public final float f29838i;
    public final float f29839j;
    public final float f29840k;
    public final float f29841l;
    public final float f29842m;
    public boolean f29843n;
    public final boolean f29844o;
    public final float[] f29845p;
    public final float[] f29846q;
    public final Matrix f29847r;
    public int f29848s;
    public final int f29849t;
    public final int f29850u;
    public int v;
    public int f29851w;
    public float f29852x;
    public final float f29853y;
    public int f29854z;

    public v11(w11 w11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = w11Var;
        this.f29833a = new ArrayList();
        this.f29834b = -1L;
        this.f29835c = 0.0f;
        this.d = true;
        this.f29837g = 0.0f;
        this.h = 0.0f;
        this.f29838i = 0.0f;
        this.f29839j = 0.0f;
        this.f29840k = AndroidUtilities.density;
        this.f29841l = 1.5f;
        this.f29842m = 1.15f;
        this.f29843n = true;
        this.f29844o = false;
        this.f29845p = new float[9];
        this.f29846q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f29847r = matrix2;
        this.f29853y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f29838i = fArr[0];
        this.f29839j = fArr[1];
        this.f29849t = (int) v7.f7.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f29850u = (int) v7.f7.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f29844o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f29836f = runnable2;
        this.f29841l = 4.0f;
        this.f29835c = -0.1f;
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
        w11 w11Var = this.E;
        int i10 = w11Var.f30745w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            w11Var.f30745w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f29836f;
        if (runnable != null) {
            y11.b(runnable);
            this.f29836f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f29847r;
        float[] fArr = this.f29846q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f29845p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f29843n = false;
    }

    public v11(org.telegram.ui.Components.w11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v11.<init>(org.telegram.ui.Components.w11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public v11(org.telegram.ui.Components.w11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v11.<init>(org.telegram.ui.Components.w11, android.view.View, float, java.lang.Runnable):void");
    }
}
