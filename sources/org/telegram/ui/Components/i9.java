package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;
public final class i9 implements Runnable {
    public final int f35963a = 0;
    public final o9 f35964b;
    public final Runnable[] f35965c;
    public final f50 d;
    public final int f35966e;
    public final c8.ja[] f35967f;

    public i9(o9 o9Var, f50 f50Var, Runnable[] runnableArr, int i7, c8.ja[] jaVarArr) {
        this.f35964b = o9Var;
        this.d = f50Var;
        this.f35965c = runnableArr;
        this.f35966e = i7;
        this.f35967f = jaVarArr;
    }

    @Override
    public final void run() {
        switch (this.f35963a) {
            case 0:
                o9 o9Var = this.f35964b;
                f50 f50Var = this.d;
                Runnable[] runnableArr = this.f35965c;
                int i7 = this.f35966e;
                c8.ja[] jaVarArr = this.f35967f;
                try {
                    GradientDrawable.Orientation orientation = o9Var.getOrientation();
                    int[] iArr = o9Var.f38069a;
                    int i10 = f50Var.f35010a;
                    int i11 = f50Var.f35011b;
                    Rect e10 = o9.e(orientation, i10, i11);
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    org.telegram.messenger.g0.g3(new bg.m0(o9Var, runnableArr, createBitmap, f50Var, i7, jaVarArr, 8));
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.g3(new i9(o9Var, runnableArr, f50Var, i7, jaVarArr));
                    throw th2;
                }
            default:
                o9.a(this.f35964b, this.f35965c, null, this.d, this.f35966e, this.f35967f);
                return;
        }
    }

    public i9(o9 o9Var, Runnable[] runnableArr, f50 f50Var, int i7, c8.ja[] jaVarArr) {
        this.f35964b = o9Var;
        this.f35965c = runnableArr;
        this.d = f50Var;
        this.f35966e = i7;
        this.f35967f = jaVarArr;
    }
}
