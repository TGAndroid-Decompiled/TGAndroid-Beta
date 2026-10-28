package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class e21 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final f21 E;
    public final ArrayList f27659a;
    public long f27660b;
    public float f27661c;
    public boolean d;
    public final Runnable e;
    public Runnable f27662f;
    public float f27663g;
    public float h;
    public final float f27664i;
    public final float f27665j;
    public final float f27666k;
    public final float f27667l;
    public final float f27668m;
    public boolean f27669n;
    public final boolean f27670o;
    public final float[] f27671p;
    public final float[] f27672q;
    public final Matrix f27673r;
    public int f27674s;
    public final int f27675t;
    public final int f27676u;
    public int v;
    public int f27677w;
    public float f27678x;
    public final float f27679y;
    public int f27680z;

    public e21(f21 f21Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = f21Var;
        this.f27659a = new ArrayList();
        this.f27660b = -1L;
        this.f27661c = 0.0f;
        this.d = true;
        this.f27663g = 0.0f;
        this.h = 0.0f;
        this.f27664i = 0.0f;
        this.f27665j = 0.0f;
        this.f27666k = AndroidUtilities.density;
        this.f27667l = 1.5f;
        this.f27668m = 1.15f;
        this.f27669n = true;
        this.f27670o = false;
        this.f27671p = new float[9];
        this.f27672q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f27673r = matrix2;
        this.f27679y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f27664i = fArr[0];
        this.f27665j = fArr[1];
        this.f27675t = (int) a8.ic.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f27676u = (int) a8.ic.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f27670o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f27662f = runnable2;
        this.f27667l = 4.0f;
        this.f27661c = -0.1f;
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
        f21 f21Var = this.E;
        int i10 = f21Var.f27991w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            f21Var.f27991w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        Runnable runnable = this.f27662f;
        if (runnable != null) {
            h21.b(runnable);
            this.f27662f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f27673r;
        float[] fArr = this.f27672q;
        matrix.getValues(fArr);
        float f7 = fArr[0];
        float[] fArr2 = this.f27671p;
        fArr2[0] = f7;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f27669n = false;
    }

    public e21(org.telegram.ui.Components.f21 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e21.<init>(org.telegram.ui.Components.f21, java.util.ArrayList, java.lang.Runnable):void");
    }

    public e21(org.telegram.ui.Components.f21 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e21.<init>(org.telegram.ui.Components.f21, android.view.View, float, java.lang.Runnable):void");
    }
}
