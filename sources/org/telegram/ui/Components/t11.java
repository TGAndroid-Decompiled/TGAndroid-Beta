package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class t11 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final u11 E;
    public final ArrayList f31008a;
    public long f31009b;
    public float f31010c;
    public boolean d;
    public final Runnable f31011e;
    public Runnable f31012f;
    public float f31013g;
    public float h;
    public final float f31014i;
    public final float f31015j;
    public final float f31016k;
    public final float f31017l;
    public final float f31018m;
    public boolean f31019n;
    public final boolean f31020o;
    public final float[] f31021p;
    public final float[] f31022q;
    public final Matrix f31023r;
    public int f31024s;
    public final int f31025t;
    public final int f31026u;
    public int v;
    public int f31027w;
    public float f31028x;
    public final float f31029y;
    public int f31030z;

    public t11(u11 u11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = u11Var;
        this.f31008a = new ArrayList();
        this.f31009b = -1L;
        this.f31010c = 0.0f;
        this.d = true;
        this.f31013g = 0.0f;
        this.h = 0.0f;
        this.f31014i = 0.0f;
        this.f31015j = 0.0f;
        this.f31016k = AndroidUtilities.density;
        this.f31017l = 1.5f;
        this.f31018m = 1.15f;
        this.f31019n = true;
        this.f31020o = false;
        this.f31021p = new float[9];
        this.f31022q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f31023r = matrix2;
        this.f31029y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f31014i = fArr[0];
        this.f31015j = fArr[1];
        this.f31025t = (int) v7.z6.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f31026u = (int) v7.z6.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f31020o = true;
        matrix2.set(matrix);
        c();
        this.f31011e = runnable;
        this.f31012f = runnable2;
        this.f31017l = 4.0f;
        this.f31010c = -0.1f;
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
        u11 u11Var = this.E;
        int i10 = u11Var.f31297w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            u11Var.f31297w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        Runnable runnable = this.f31012f;
        if (runnable != null) {
            w11.b(runnable);
            this.f31012f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f31023r;
        float[] fArr = this.f31022q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f31021p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f31019n = false;
    }

    public t11(org.telegram.ui.Components.u11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t11.<init>(org.telegram.ui.Components.u11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public t11(org.telegram.ui.Components.u11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t11.<init>(org.telegram.ui.Components.u11, android.view.View, float, java.lang.Runnable):void");
    }
}
