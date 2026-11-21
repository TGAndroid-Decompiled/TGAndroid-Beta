package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;
public final class j9 implements Runnable {
    public final int f36451a = 0;
    public final p9 f36452b;
    public final Runnable[] f36453c;
    public final i50 d;
    public final int f36454e;
    public final c8.ia[] f36455f;

    public j9(p9 p9Var, i50 i50Var, Runnable[] runnableArr, int i7, c8.ia[] iaVarArr) {
        this.f36452b = p9Var;
        this.d = i50Var;
        this.f36453c = runnableArr;
        this.f36454e = i7;
        this.f36455f = iaVarArr;
    }

    @Override
    public final void run() {
        switch (this.f36451a) {
            case 0:
                p9 p9Var = this.f36452b;
                i50 i50Var = this.d;
                Runnable[] runnableArr = this.f36453c;
                int i7 = this.f36454e;
                c8.ia[] iaVarArr = this.f36455f;
                try {
                    GradientDrawable.Orientation orientation = p9Var.getOrientation();
                    int[] iArr = p9Var.f38535a;
                    int i10 = i50Var.f36150a;
                    int i11 = i50Var.f36151b;
                    Rect e10 = p9.e(orientation, i10, i11);
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    org.telegram.messenger.g0.g3(new bg.m0(p9Var, runnableArr, createBitmap, i50Var, i7, iaVarArr, 8));
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.g3(new j9(p9Var, runnableArr, i50Var, i7, iaVarArr));
                    throw th2;
                }
            default:
                p9.a(this.f36452b, this.f36453c, null, this.d, this.f36454e, this.f36455f);
                return;
        }
    }

    public j9(p9 p9Var, Runnable[] runnableArr, i50 i50Var, int i7, c8.ia[] iaVarArr) {
        this.f36452b = p9Var;
        this.f36453c = runnableArr;
        this.d = i50Var;
        this.f36454e = i7;
        this.f36455f = iaVarArr;
    }
}
