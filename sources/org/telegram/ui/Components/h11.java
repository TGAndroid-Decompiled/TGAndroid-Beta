package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class h11 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final i11 E;
    public final ArrayList f24591a;
    public long f24592b;
    public float f24593c;
    public boolean d;
    public final Runnable e;
    public Runnable f24594f;
    public float f24595g;
    public float h;
    public final float f24596i;
    public final float f24597j;
    public final float f24598k;
    public final float f24599l;
    public final float f24600m;
    public boolean f24601n;
    public final boolean f24602o;
    public final float[] f24603p;
    public final float[] f24604q;
    public final Matrix f24605r;
    public int f24606s;
    public final int f24607t;
    public final int f24608u;
    public int v;
    public int f24609w;
    public float f24610x;
    public final float f24611y;
    public int f24612z;

    public h11(i11 i11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = i11Var;
        this.f24591a = new ArrayList();
        this.f24592b = -1L;
        this.f24593c = 0.0f;
        this.d = true;
        this.f24595g = 0.0f;
        this.h = 0.0f;
        this.f24596i = 0.0f;
        this.f24597j = 0.0f;
        this.f24598k = AndroidUtilities.density;
        this.f24599l = 1.5f;
        this.f24600m = 1.15f;
        this.f24601n = true;
        this.f24602o = false;
        this.f24603p = new float[9];
        this.f24604q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f24605r = matrix2;
        this.f24611y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f24596i = fArr[0];
        this.f24597j = fArr[1];
        this.f24607t = (int) v7.a7.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f24608u = (int) v7.a7.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f24602o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f24594f = runnable2;
        this.f24599l = 4.0f;
        this.f24593c = -0.1f;
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
        i11 i11Var = this.E;
        int i10 = i11Var.f24915w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            i11Var.f24915w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f24594f;
        if (runnable != null) {
            k11.b(runnable);
            this.f24594f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f24605r;
        float[] fArr = this.f24604q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f24603p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f24601n = false;
    }

    public h11(org.telegram.ui.Components.i11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h11.<init>(org.telegram.ui.Components.i11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public h11(org.telegram.ui.Components.i11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h11.<init>(org.telegram.ui.Components.i11, android.view.View, float, java.lang.Runnable):void");
    }
}
