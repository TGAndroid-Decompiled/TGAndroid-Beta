package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class d21 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final e21 E;
    public final ArrayList f27342a;
    public long f27343b;
    public float f27344c;
    public boolean d;
    public final Runnable e;
    public Runnable f27345f;
    public float f27346g;
    public float h;
    public final float f27347i;
    public final float f27348j;
    public final float f27349k;
    public final float f27350l;
    public final float f27351m;
    public boolean f27352n;
    public final boolean f27353o;
    public final float[] f27354p;
    public final float[] f27355q;
    public final Matrix f27356r;
    public int f27357s;
    public final int f27358t;
    public final int f27359u;
    public int v;
    public int f27360w;
    public float f27361x;
    public final float f27362y;
    public int f27363z;

    public d21(e21 e21Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = e21Var;
        this.f27342a = new ArrayList();
        this.f27343b = -1L;
        this.f27344c = 0.0f;
        this.d = true;
        this.f27346g = 0.0f;
        this.h = 0.0f;
        this.f27347i = 0.0f;
        this.f27348j = 0.0f;
        this.f27349k = AndroidUtilities.density;
        this.f27350l = 1.5f;
        this.f27351m = 1.15f;
        this.f27352n = true;
        this.f27353o = false;
        this.f27354p = new float[9];
        this.f27355q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f27356r = matrix2;
        this.f27362y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f27347i = fArr[0];
        this.f27348j = fArr[1];
        this.f27358t = (int) a8.ic.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f27359u = (int) a8.ic.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f27353o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f27345f = runnable2;
        this.f27350l = 4.0f;
        this.f27344c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.s1 s1Var, int i10, float f7, float f10) {
        float f11;
        canvas.save();
        if (s1Var.a()) {
            f11 = s1Var.getAlpha();
        } else {
            f11 = 1.0f;
        }
        canvas.translate(f7, f10);
        boolean z10 = true;
        s1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            s1Var.m2(f11, canvas, true);
        } else if (i10 == 1) {
            s1Var.W1(canvas, f11);
        } else if (i10 == 2) {
            if (s1Var.getCurrentPosition() == null || (s1Var.getCurrentPosition().flags & 1) != 0) {
                z10 = false;
            }
            s1Var.I1(f11, canvas, z10);
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        e21 e21Var = this.E;
        int i10 = e21Var.f27698w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            e21Var.f27698w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        Runnable runnable = this.f27345f;
        if (runnable != null) {
            g21.b(runnable);
            this.f27345f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f27356r;
        float[] fArr = this.f27355q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f27354p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f27352n = false;
    }

    public d21(org.telegram.ui.Components.e21 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d21.<init>(org.telegram.ui.Components.e21, java.util.ArrayList, java.lang.Runnable):void");
    }

    public d21(org.telegram.ui.Components.e21 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d21.<init>(org.telegram.ui.Components.e21, android.view.View, float, java.lang.Runnable):void");
    }
}
