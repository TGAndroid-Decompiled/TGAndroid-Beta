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
    public final ArrayList f27340a;
    public long f27341b;
    public float f27342c;
    public boolean d;
    public final Runnable e;
    public Runnable f27343f;
    public float f27344g;
    public float h;
    public final float f27345i;
    public final float f27346j;
    public final float f27347k;
    public final float f27348l;
    public final float f27349m;
    public boolean f27350n;
    public final boolean f27351o;
    public final float[] f27352p;
    public final float[] f27353q;
    public final Matrix f27354r;
    public int f27355s;
    public final int f27356t;
    public final int f27357u;
    public int v;
    public int f27358w;
    public float f27359x;
    public final float f27360y;
    public int f27361z;

    public d21(e21 e21Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = e21Var;
        this.f27340a = new ArrayList();
        this.f27341b = -1L;
        this.f27342c = 0.0f;
        this.d = true;
        this.f27344g = 0.0f;
        this.h = 0.0f;
        this.f27345i = 0.0f;
        this.f27346j = 0.0f;
        this.f27347k = AndroidUtilities.density;
        this.f27348l = 1.5f;
        this.f27349m = 1.15f;
        this.f27350n = true;
        this.f27351o = false;
        this.f27352p = new float[9];
        this.f27353q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f27354r = matrix2;
        this.f27360y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f27345i = fArr[0];
        this.f27346j = fArr[1];
        this.f27356t = (int) a8.ic.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f27357u = (int) a8.ic.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f27351o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f27343f = runnable2;
        this.f27348l = 4.0f;
        this.f27342c = -0.1f;
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
        int i10 = e21Var.f27696w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            e21Var.f27696w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        Runnable runnable = this.f27343f;
        if (runnable != null) {
            g21.b(runnable);
            this.f27343f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f27354r;
        float[] fArr = this.f27353q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f27352p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f27350n = false;
    }

    public d21(org.telegram.ui.Components.e21 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d21.<init>(org.telegram.ui.Components.e21, java.util.ArrayList, java.lang.Runnable):void");
    }

    public d21(org.telegram.ui.Components.e21 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d21.<init>(org.telegram.ui.Components.e21, android.view.View, float, java.lang.Runnable):void");
    }
}
