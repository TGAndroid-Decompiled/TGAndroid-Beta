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
    public final ArrayList f24833a;
    public long f24834b;
    public float f24835c;
    public boolean d;
    public final Runnable e;
    public Runnable f24836f;
    public float f24837g;
    public float h;
    public final float f24838i;
    public final float f24839j;
    public final float f24840k;
    public final float f24841l;
    public final float f24842m;
    public boolean f24843n;
    public final boolean f24844o;
    public final float[] f24845p;
    public final float[] f24846q;
    public final Matrix f24847r;
    public int f24848s;
    public final int f24849t;
    public final int f24850u;
    public int v;
    public int f24851w;
    public float f24852x;
    public final float f24853y;
    public int f24854z;

    public i11(j11 j11Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = j11Var;
        this.f24833a = new ArrayList();
        this.f24834b = -1L;
        this.f24835c = 0.0f;
        this.d = true;
        this.f24837g = 0.0f;
        this.h = 0.0f;
        this.f24838i = 0.0f;
        this.f24839j = 0.0f;
        this.f24840k = AndroidUtilities.density;
        this.f24841l = 1.5f;
        this.f24842m = 1.15f;
        this.f24843n = true;
        this.f24844o = false;
        this.f24845p = new float[9];
        this.f24846q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f24847r = matrix2;
        this.f24853y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f24838i = fArr[0];
        this.f24839j = fArr[1];
        this.f24849t = (int) v7.a7.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f24850u = (int) v7.a7.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f24844o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f24836f = runnable2;
        this.f24841l = 4.0f;
        this.f24835c = -0.1f;
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
        int i10 = j11Var.f25174w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            j11Var.f25174w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f24836f;
        if (runnable != null) {
            l11.b(runnable);
            this.f24836f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f24847r;
        float[] fArr = this.f24846q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f24845p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f24843n = false;
    }

    public i11(org.telegram.ui.Components.j11 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i11.<init>(org.telegram.ui.Components.j11, java.util.ArrayList, java.lang.Runnable):void");
    }

    public i11(org.telegram.ui.Components.j11 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i11.<init>(org.telegram.ui.Components.j11, android.view.View, float, java.lang.Runnable):void");
    }
}
