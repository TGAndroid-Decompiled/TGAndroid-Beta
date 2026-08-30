package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class x01 {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final y01 E;
    public final ArrayList f30468a;
    public long f30469b;
    public float f30470c;
    public boolean d;
    public final Runnable e;
    public Runnable f30471f;
    public float f30472g;
    public float h;
    public final float f30473i;
    public final float f30474j;
    public final float f30475k;
    public final float f30476l;
    public final float f30477m;
    public boolean f30478n;
    public final boolean f30479o;
    public final float[] f30480p;
    public final float[] f30481q;
    public final Matrix f30482r;
    public int f30483s;
    public final int f30484t;
    public final int f30485u;
    public int v;
    public int f30486w;
    public float f30487x;
    public final float f30488y;
    public int f30489z;

    public x01(y01 y01Var, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = y01Var;
        this.f30468a = new ArrayList();
        this.f30469b = -1L;
        this.f30470c = 0.0f;
        this.d = true;
        this.f30472g = 0.0f;
        this.h = 0.0f;
        this.f30473i = 0.0f;
        this.f30474j = 0.0f;
        this.f30475k = AndroidUtilities.density;
        this.f30476l = 1.5f;
        this.f30477m = 1.15f;
        this.f30478n = true;
        this.f30479o = false;
        this.f30480p = new float[9];
        this.f30481q = new float[9];
        Matrix matrix2 = new Matrix();
        this.f30482r = matrix2;
        this.f30488y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.f30473i = fArr[0];
        this.f30474j = fArr[1];
        this.f30484t = (int) k7.n6.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.f30485u = (int) k7.n6.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.f30479o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f30471f = runnable2;
        this.f30476l = 4.0f;
        this.f30470c = -0.1f;
        this.C = bitmap;
    }

    public static void b(Canvas canvas, org.telegram.ui.Cells.t1 t1Var, int i10, float f10, float f11) {
        float f12;
        canvas.save();
        if (t1Var.a()) {
            f12 = t1Var.getAlpha();
        } else {
            f12 = 1.0f;
        }
        canvas.translate(f10, f11);
        boolean z4 = true;
        t1Var.setInvalidatesParent(true);
        if (i10 == 0) {
            t1Var.m2(f12, canvas, true);
        } else if (i10 == 1) {
            t1Var.W1(canvas, f12);
        } else if (i10 == 2) {
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        y01 y01Var = this.E;
        int i10 = y01Var.f30817w;
        if (i10 != 0) {
            try {
                GLES20.glDeleteProgram(i10);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            y01Var.f30817w = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        Runnable runnable = this.f30471f;
        if (runnable != null) {
            a11.b(runnable);
            this.f30471f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.f30482r;
        float[] fArr = this.f30481q;
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float[] fArr2 = this.f30480p;
        fArr2[0] = f10;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.f30478n = false;
    }

    public x01(org.telegram.ui.Components.y01 r31, java.util.ArrayList r32, java.lang.Runnable r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x01.<init>(org.telegram.ui.Components.y01, java.util.ArrayList, java.lang.Runnable):void");
    }

    public x01(org.telegram.ui.Components.y01 r10, android.view.View r11, float r12, java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x01.<init>(org.telegram.ui.Components.y01, android.view.View, float, java.lang.Runnable):void");
    }
}
