package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
public final class zy0 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final az0 E;
    public final ArrayList f41170a;
    public long f41171b;
    public float f41172c;
    public boolean d;
    public final Runnable f41173e;
    public Runnable f41174f;
    public float f41175g;
    public float h;
    public final float f41176i;
    public final float f41177j;
    public final float f41178k;
    public final float f41179l;
    public final float f41180m;
    public boolean f41181n;
    public final boolean f41182o;
    public final float[] f41183p;
    public final float[] f41184q;
    public final Matrix f41185r;
    public int f41186s;
    public final int f41187t;
    public final int f41188u;
    public int v;
    public int f41189w;
    public float f41190x;
    public final float f41191y;
    public int f41192z;

    public zy0(az0 az0Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = az0Var;
        this.f41170a = new ArrayList();
        this.f41171b = -1L;
        this.f41172c = 0.0f;
        this.d = true;
        this.f41175g = 0.0f;
        this.h = 0.0f;
        this.f41176i = 0.0f;
        this.f41177j = 0.0f;
        this.f41178k = org.telegram.messenger.g0.f22607p;
        this.f41179l = 1.5f;
        this.f41180m = 1.15f;
        this.f41181n = true;
        this.f41182o = false;
        this.f41183p = new float[9];
        this.f41184q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f41185r = matrix2;
        this.f41191y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f41176i = fArr[0];
        this.f41177j = fArr[1];
        this.f41187t = (int) a7.h.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f41188u = (int) a7.h.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f41182o = true;
        matrix2.set(matrix);
        c();
        this.f41173e = runnable;
        this.f41174f = runnable2;
        this.f41179l = 4.0f;
        this.f41172c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.q1 q1Var, int i3, float f10, float f11) {
        float f12;
        canvas.save();
        if (q1Var.a()) {
            f12 = q1Var.getAlpha();
        } else {
            f12 = 1.0f;
        }
        canvas.translate(f10, f11);
        boolean z10 = true;
        q1Var.setInvalidatesParent(true);
        if (i3 == 0) {
            q1Var.x1(f12, canvas, true);
        } else if (i3 == 1) {
            q1Var.h1(canvas, f12);
        } else if (i3 == 2) {
            if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f25149l & 1) != 0) {
                z10 = false;
            }
            q1Var.Q0(f12, canvas, z10);
        } else if (q1Var.getCurrentPosition() == null || (q1Var.getCurrentPosition().f25149l & 1) != 0) {
            q1Var.o1(canvas, f12, null);
            q1Var.V0(canvas, f12);
        }
        q1Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        az0 az0Var = this.E;
        int i3 = az0Var.f32016x;
        if (i3 != 0) {
            try {
                GLES20.glDeleteProgram(i3);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            az0Var.f32016x = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
        Runnable runnable = this.f41174f;
        if (runnable != null) {
            cz0.b(runnable);
            this.f41174f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f41185r;
        float[] fArr = this.f41184q;
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.f41183p;
        fArr2[0] = f10;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f41181n = false;
    }

    public zy0(org.telegram.ui.Components.az0 r32, java.util.ArrayList r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zy0.<init>(org.telegram.ui.Components.az0, java.util.ArrayList, java.lang.Runnable):void");
    }

    public zy0(org.telegram.ui.Components.az0 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zy0.<init>(org.telegram.ui.Components.az0, android.view.View, float, java.lang.Runnable):void");
    }
}
