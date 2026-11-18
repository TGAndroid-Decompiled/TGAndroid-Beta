package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;
public final class j9 implements Runnable {
    public final int f36387a = 0;
    public final p9 f36388b;
    public final Runnable[] f36389c;
    public final f50 d;
    public final int f36390e;
    public final c8.ia[] f36391f;

    public j9(p9 p9Var, f50 f50Var, Runnable[] runnableArr, int i7, c8.ia[] iaVarArr) {
        this.f36388b = p9Var;
        this.d = f50Var;
        this.f36389c = runnableArr;
        this.f36390e = i7;
        this.f36391f = iaVarArr;
    }

    @Override
    public final void run() {
        switch (this.f36387a) {
            case 0:
                p9 p9Var = this.f36388b;
                f50 f50Var = this.d;
                Runnable[] runnableArr = this.f36389c;
                int i7 = this.f36390e;
                c8.ia[] iaVarArr = this.f36391f;
                try {
                    GradientDrawable.Orientation orientation = p9Var.getOrientation();
                    int[] iArr = p9Var.f38322a;
                    int i10 = f50Var.f34946a;
                    int i11 = f50Var.f34947b;
                    Rect e10 = p9.e(orientation, i10, i11);
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    org.telegram.messenger.g0.g3(new bg.m0(p9Var, runnableArr, createBitmap, f50Var, i7, iaVarArr, 8));
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.g3(new j9(p9Var, runnableArr, f50Var, i7, iaVarArr));
                    throw th2;
                }
            default:
                p9.a(this.f36388b, this.f36389c, null, this.d, this.f36390e, this.f36391f);
                return;
        }
    }

    public j9(p9 p9Var, Runnable[] runnableArr, f50 f50Var, int i7, c8.ia[] iaVarArr) {
        this.f36388b = p9Var;
        this.f36389c = runnableArr;
        this.d = f50Var;
        this.f36390e = i7;
        this.f36391f = iaVarArr;
    }
}
