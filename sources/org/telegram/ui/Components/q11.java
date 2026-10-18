package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class q11 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final r11 E;
    public final ArrayList f29525a;
    public long f29526b;
    public float f29527c;
    public boolean d;
    public final Runnable e;
    public Runnable f29528f;
    public float f29529g;
    public float h;
    public final float f29530i;
    public final float f29531j;
    public final float f29532k;
    public final float f29533l;
    public final float f29534m;
    public boolean f29535n;
    public final boolean f29536o;
    public final float[] f29537p;
    public final float[] f29538q;
    public final Matrix f29539r;
    public int f29540s;
    public final int f29541t;
    public final int f29542u;
    public int v;
    public int f29543w;
    public float f29544x;
    public final float f29545y;
    public int f29546z;

    public q11(r11 r11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = r11Var;
        this.f29525a = new ArrayList();
        this.f29526b = -1L;
        this.f29527c = 0.0f;
        this.d = true;
        this.f29529g = 0.0f;
        this.h = 0.0f;
        this.f29530i = 0.0f;
        this.f29531j = 0.0f;
        this.f29532k = AndroidUtilities.density;
        this.f29533l = 1.5f;
        this.f29534m = 1.15f;
        this.f29535n = true;
        this.f29536o = false;
        this.f29537p = new float[9];
        this.f29538q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f29539r = matrix2;
        this.f29545y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f29530i = fArr[0];
        this.f29531j = fArr[1];
        this.f29541t = (int) v7.f7.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f29542u = (int) v7.f7.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f29536o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f29528f = runnable2;
        this.f29533l = 4.0f;
        this.f29527c = -0.1f;
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
        r11 r11Var = this.E;
        int i10 = r11Var.f29803w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            r11Var.f29803w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f29528f;
        if (runnable != null) {
            t11.b(runnable);
            this.f29528f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f29539r;
        float[] fArr = this.f29538q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f29537p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f29535n = false;
    }

    public q11(org.telegram.ui.Components.r11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q11.<init>(org.telegram.ui.Components.r11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public q11(org.telegram.ui.Components.r11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q11.<init>(org.telegram.ui.Components.r11, android.view.View, float, java.lang.Runnable):void");
    }
}
