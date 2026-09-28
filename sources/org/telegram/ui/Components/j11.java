package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class j11 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final k11 E;
    public final ArrayList f25266a;
    public long f25267b;
    public float f25268c;
    public boolean d;
    public final Runnable e;
    public Runnable f25269f;
    public float f25270g;
    public float h;
    public final float f25271i;
    public final float f25272j;
    public final float f25273k;
    public final float f25274l;
    public final float f25275m;
    public boolean f25276n;
    public final boolean f25277o;
    public final float[] f25278p;
    public final float[] f25279q;
    public final Matrix f25280r;
    public int f25281s;
    public final int f25282t;
    public final int f25283u;
    public int v;
    public int f25284w;
    public float f25285x;
    public final float f25286y;
    public int f25287z;

    public j11(k11 k11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = k11Var;
        this.f25266a = new ArrayList();
        this.f25267b = -1L;
        this.f25268c = 0.0f;
        this.d = true;
        this.f25270g = 0.0f;
        this.h = 0.0f;
        this.f25271i = 0.0f;
        this.f25272j = 0.0f;
        this.f25273k = AndroidUtilities.density;
        this.f25274l = 1.5f;
        this.f25275m = 1.15f;
        this.f25276n = true;
        this.f25277o = false;
        this.f25278p = new float[9];
        this.f25279q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f25280r = matrix2;
        this.f25286y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f25271i = fArr[0];
        this.f25272j = fArr[1];
        this.f25282t = (int) v7.a7.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f25283u = (int) v7.a7.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f25277o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f25269f = runnable2;
        this.f25274l = 4.0f;
        this.f25268c = -0.1f;
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        k11 k11Var = this.E;
        int i10 = k11Var.f25575w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            k11Var.f25575w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f25269f;
        if (runnable != null) {
            m11.b(runnable);
            this.f25269f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f25280r;
        float[] fArr = this.f25279q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f25278p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f25276n = false;
    }

    public j11(org.telegram.ui.Components.k11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j11.<init>(org.telegram.ui.Components.k11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public j11(org.telegram.ui.Components.k11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j11.<init>(org.telegram.ui.Components.k11, android.view.View, float, java.lang.Runnable):void");
    }
}
