package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class a01 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final b01 E;
    public final ArrayList f26593a;
    public long f26594b;
    public float f26595c;
    public boolean d;
    public final Runnable f26596e;
    public Runnable f26597f;
    public float f26598g;
    public float h;
    public final float f26599i;
    public final float f26600j;
    public final float f26601k;
    public final float f26602l;
    public final float f26603m;
    public boolean f26604n;
    public final boolean f26605o;
    public final float[] f26606p;
    public final float[] f26607q;
    public final Matrix f26608r;
    public int f26609s;
    public final int f26610t;
    public final int f26611u;
    public int v;
    public int f26612w;
    public float f26613x;
    public final float f26614y;
    public int f26615z;

    public a01(b01 b01Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = b01Var;
        this.f26593a = new ArrayList();
        this.f26594b = -1L;
        this.f26595c = 0.0f;
        this.d = true;
        this.f26598g = 0.0f;
        this.h = 0.0f;
        this.f26599i = 0.0f;
        this.f26600j = 0.0f;
        this.f26601k = AndroidUtilities.density;
        this.f26602l = 1.5f;
        this.f26603m = 1.15f;
        this.f26604n = true;
        this.f26605o = false;
        this.f26606p = new float[9];
        this.f26607q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f26608r = matrix2;
        this.f26614y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f26599i = fArr[0];
        this.f26600j = fArr[1];
        this.f26610t = (int) g7.w.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f26611u = (int) g7.w.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f26605o = true;
        matrix2.set(matrix);
        c();
        this.f26596e = runnable;
        this.f26597f = runnable2;
        this.f26602l = 4.0f;
        this.f26595c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.t1 t1Var, int i9, float f10, float f11) {
        float f12;
        canvas.save();
        if (t1Var.a()) {
            f12 = t1Var.getAlpha();
        } else {
            f12 = 1.0f;
        }
        canvas.translate(f10, f11);
        boolean z10 = true;
        t1Var.setInvalidatesParent(true);
        if (i9 == 0) {
            t1Var.m2(f12, canvas, true);
        } else if (i9 == 1) {
            t1Var.W1(canvas, f12);
        } else if (i9 == 2) {
            t1Var.I1(f12, canvas, (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) ? false : false);
        } else if (t1Var.getCurrentPosition() == null || (t1Var.getCurrentPosition().flags & 1) != 0) {
            t1Var.d2(canvas, f12, null);
            t1Var.N1(canvas, f12);
        }
        t1Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        b01 b01Var = this.E;
        int i9 = b01Var.f26962w;
        if (i9 != 0) {
            try {
                GLES20.glDeleteProgram(i9);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            b01Var.f26962w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        Runnable runnable = this.f26597f;
        if (runnable != null) {
            d01.b(runnable);
            this.f26597f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f26608r;
        float[] fArr = this.f26607q;
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.f26606p;
        fArr2[0] = f10;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f26604n = false;
    }

    public a01(org.telegram.ui.Components.b01 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a01.<init>(org.telegram.ui.Components.b01, java.util.ArrayList, java.lang.Runnable):void");
    }

    public a01(org.telegram.ui.Components.b01 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a01.<init>(org.telegram.ui.Components.b01, android.view.View, float, java.lang.Runnable):void");
    }
}
