package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class i11 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final j11 E;
    public final ArrayList f24931a;
    public long f24932b;
    public float f24933c;
    public boolean d;
    public final Runnable e;
    public Runnable f24934f;
    public float f24935g;
    public float h;
    public final float f24936i;
    public final float f24937j;
    public final float f24938k;
    public final float f24939l;
    public final float f24940m;
    public boolean f24941n;
    public final boolean f24942o;
    public final float[] f24943p;
    public final float[] f24944q;
    public final Matrix f24945r;
    public int f24946s;
    public final int f24947t;
    public final int f24948u;
    public int v;
    public int f24949w;
    public float f24950x;
    public final float f24951y;
    public int f24952z;

    public i11(j11 j11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = j11Var;
        this.f24931a = new ArrayList();
        this.f24932b = -1L;
        this.f24933c = 0.0f;
        this.d = true;
        this.f24935g = 0.0f;
        this.h = 0.0f;
        this.f24936i = 0.0f;
        this.f24937j = 0.0f;
        this.f24938k = AndroidUtilities.density;
        this.f24939l = 1.5f;
        this.f24940m = 1.15f;
        this.f24941n = true;
        this.f24942o = false;
        this.f24943p = new float[9];
        this.f24944q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f24945r = matrix2;
        this.f24951y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f24936i = fArr[0];
        this.f24937j = fArr[1];
        this.f24947t = (int) v7.a7.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f24948u = (int) v7.a7.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f24942o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f24934f = runnable2;
        this.f24939l = 4.0f;
        this.f24933c = -0.1f;
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
        j11 j11Var = this.E;
        int i10 = j11Var.f25232w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            j11Var.f25232w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f24934f;
        if (runnable != null) {
            l11.b(runnable);
            this.f24934f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f24945r;
        float[] fArr = this.f24944q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f24943p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f24941n = false;
    }

    public i11(org.telegram.ui.Components.j11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i11.<init>(org.telegram.ui.Components.j11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public i11(org.telegram.ui.Components.j11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i11.<init>(org.telegram.ui.Components.j11, android.view.View, float, java.lang.Runnable):void");
    }
}
