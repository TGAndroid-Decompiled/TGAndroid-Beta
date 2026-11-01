package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;
public final class z8 implements Runnable {
    public final int f33066a = 0;
    public final f9 f33067b;
    public final Runnable[] f33068c;
    public final k50 d;
    public final int e;
    public final w7.y5[] f33069f;

    public z8(f9 f9Var, k50 k50Var, Runnable[] runnableArr, int i10, w7.y5[] y5VarArr) {
        this.f33067b = f9Var;
        this.d = k50Var;
        this.f33068c = runnableArr;
        this.e = i10;
        this.f33069f = y5VarArr;
    }

    @Override
    public final void run() {
        switch (this.f33066a) {
            case 0:
                f9 f9Var = this.f33067b;
                k50 k50Var = this.d;
                Runnable[] runnableArr = this.f33068c;
                int i10 = this.e;
                w7.y5[] y5VarArr = this.f33069f;
                try {
                    GradientDrawable.Orientation orientation = f9Var.getOrientation();
                    int[] iArr = f9Var.f26113a;
                    int i11 = k50Var.f27731a;
                    int i12 = k50Var.f27732b;
                    Rect e = f9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    org.telegram.messenger.i0.g3(new m4.a1(f9Var, runnableArr, createBitmap, k50Var, i10, y5VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.i0.g3(new z8(f9Var, runnableArr, k50Var, i10, y5VarArr));
                    throw th2;
                }
            default:
                f9.a(this.f33067b, this.f33068c, null, this.d, this.e, this.f33069f);
                return;
        }
    }

    public z8(f9 f9Var, Runnable[] runnableArr, k50 k50Var, int i10, w7.y5[] y5VarArr) {
        this.f33067b = f9Var;
        this.f33068c = runnableArr;
        this.d = k50Var;
        this.e = i10;
        this.f33069f = y5VarArr;
    }
}
