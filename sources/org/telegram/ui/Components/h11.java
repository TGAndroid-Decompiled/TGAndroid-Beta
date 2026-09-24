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
    public final ArrayList f24584a;
    public long f24585b;
    public float f24586c;
    public boolean d;
    public final Runnable e;
    public Runnable f24587f;
    public float f24588g;
    public float h;
    public final float f24589i;
    public final float f24590j;
    public final float f24591k;
    public final float f24592l;
    public final float f24593m;
    public boolean f24594n;
    public final boolean f24595o;
    public final float[] f24596p;
    public final float[] f24597q;
    public final Matrix f24598r;
    public int f24599s;
    public final int f24600t;
    public final int f24601u;
    public int v;
    public int f24602w;
    public float f24603x;
    public final float f24604y;
    public int f24605z;

    public h11(i11 i11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = i11Var;
        this.f24584a = new ArrayList();
        this.f24585b = -1L;
        this.f24586c = 0.0f;
        this.d = true;
        this.f24588g = 0.0f;
        this.h = 0.0f;
        this.f24589i = 0.0f;
        this.f24590j = 0.0f;
        this.f24591k = AndroidUtilities.density;
        this.f24592l = 1.5f;
        this.f24593m = 1.15f;
        this.f24594n = true;
        this.f24595o = false;
        this.f24596p = new float[9];
        this.f24597q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f24598r = matrix2;
        this.f24604y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f24589i = fArr[0];
        this.f24590j = fArr[1];
        this.f24600t = (int) v7.a7.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f24601u = (int) v7.a7.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f24595o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f24587f = runnable2;
        this.f24592l = 4.0f;
        this.f24586c = -0.1f;
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
        int i10 = i11Var.f24889w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            i11Var.f24889w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f24587f;
        if (runnable != null) {
            k11.b(runnable);
            this.f24587f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f24598r;
        float[] fArr = this.f24597q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f24596p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f24594n = false;
    }

    public h11(org.telegram.ui.Components.i11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h11.<init>(org.telegram.ui.Components.i11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public h11(org.telegram.ui.Components.i11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h11.<init>(org.telegram.ui.Components.i11, android.view.View, float, java.lang.Runnable):void");
    }
}
