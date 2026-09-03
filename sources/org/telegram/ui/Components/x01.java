package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class x01 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final y01 E;
    public final ArrayList f30398a;
    public long f30399b;
    public float f30400c;
    public boolean d;
    public final Runnable e;
    public Runnable f30401f;
    public float f30402g;
    public float h;
    public final float f30403i;
    public final float f30404j;
    public final float f30405k;
    public final float f30406l;
    public final float f30407m;
    public boolean f30408n;
    public final boolean f30409o;
    public final float[] f30410p;
    public final float[] f30411q;
    public final Matrix f30412r;
    public int f30413s;
    public final int f30414t;
    public final int f30415u;
    public int v;
    public int f30416w;
    public float f30417x;
    public final float f30418y;
    public int f30419z;

    public x01(y01 y01Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = y01Var;
        this.f30398a = new ArrayList();
        this.f30399b = -1L;
        this.f30400c = 0.0f;
        this.d = true;
        this.f30402g = 0.0f;
        this.h = 0.0f;
        this.f30403i = 0.0f;
        this.f30404j = 0.0f;
        this.f30405k = AndroidUtilities.density;
        this.f30406l = 1.5f;
        this.f30407m = 1.15f;
        this.f30408n = true;
        this.f30409o = false;
        this.f30410p = new float[9];
        this.f30411q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f30412r = matrix2;
        this.f30418y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f30403i = fArr[0];
        this.f30404j = fArr[1];
        this.f30414t = (int) k7.n6.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f30415u = (int) k7.n6.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f30409o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f30401f = runnable2;
        this.f30406l = 4.0f;
        this.f30400c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11) {
        float f12;
        canvas.save();
        if (s1Var.a()) {
            f12 = s1Var.getAlpha();
        } else {
            f12 = 1.0f;
        }
        canvas.translate(f10, f11);
        boolean z4 = true;
        s1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            s1Var.m2(f12, canvas, true);
        } else if (i10 == 1) {
            s1Var.W1(canvas, f12);
        } else if (i10 == 2) {
            s1Var.I1(f12, canvas, (s1Var.getCurrentPosition() == null || (s1Var.getCurrentPosition().flags & 1) != 0) ? false : false);
        } else if (s1Var.getCurrentPosition() == null || (s1Var.getCurrentPosition().flags & 1) != 0) {
            s1Var.d2(canvas, f12, null);
            s1Var.N1(canvas, f12);
        }
        s1Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e) {
            FileLog.e(e);
        }
        y01 y01Var = this.E;
        int i10 = y01Var.f30791w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            y01Var.f30791w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f30401f;
        if (runnable != null) {
            a11.b(runnable);
            this.f30401f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f30412r;
        float[] fArr = this.f30411q;
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.f30410p;
        fArr2[0] = f10;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f30408n = false;
    }

    public x01(org.telegram.ui.Components.y01 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x01.<init>(org.telegram.ui.Components.y01, java.util.ArrayList, java.lang.Runnable):void");
    }

    public x01(org.telegram.ui.Components.y01 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x01.<init>(org.telegram.ui.Components.y01, android.view.View, float, java.lang.Runnable):void");
    }
}
