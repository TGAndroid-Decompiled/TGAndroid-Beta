package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class a21 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final b21 E;
    public final ArrayList f24453a;
    public long f24454b;
    public float f24455c;
    public boolean d;
    public final Runnable f24456e;
    public Runnable f24457f;
    public float f24458g;
    public float h;
    public final float f24459i;
    public final float f24460j;
    public final float f24461k;
    public final float f24462l;
    public final float f24463m;
    public boolean f24464n;
    public final boolean f24465o;
    public final float[] f24466p;
    public final float[] f24467q;
    public final Matrix f24468r;
    public int f24469s;
    public final int f24470t;
    public final int f24471u;
    public int v;
    public int f24472w;
    public float f24473x;
    public final float f24474y;
    public int f24475z;

    public a21(b21 b21Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = b21Var;
        this.f24453a = new ArrayList();
        this.f24454b = -1L;
        this.f24455c = 0.0f;
        this.d = true;
        this.f24458g = 0.0f;
        this.h = 0.0f;
        this.f24459i = 0.0f;
        this.f24460j = 0.0f;
        this.f24461k = AndroidUtilities.density;
        this.f24462l = 1.5f;
        this.f24463m = 1.15f;
        this.f24464n = true;
        this.f24465o = false;
        this.f24466p = new float[9];
        this.f24467q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f24468r = matrix2;
        this.f24474y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f24459i = fArr[0];
        this.f24460j = fArr[1];
        this.f24470t = (int) v7.z6.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f24471u = (int) v7.z6.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f24465o = true;
        matrix2.set(matrix);
        c();
        this.f24456e = runnable;
        this.f24457f = runnable2;
        this.f24462l = 4.0f;
        this.f24455c = -0.1f;
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
        b21 b21Var = this.E;
        int i10 = b21Var.f24863w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            b21Var.f24863w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        Runnable runnable = this.f24457f;
        if (runnable != null) {
            d21.b(runnable);
            this.f24457f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f24468r;
        float[] fArr = this.f24467q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f24466p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f24464n = false;
    }

    public a21(org.telegram.ui.Components.b21 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a21.<init>(org.telegram.ui.Components.b21, java.util.ArrayList, java.lang.Runnable):void");
    }

    public a21(org.telegram.ui.Components.b21 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a21.<init>(org.telegram.ui.Components.b21, android.view.View, float, java.lang.Runnable):void");
    }
}
