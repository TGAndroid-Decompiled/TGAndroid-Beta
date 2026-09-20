package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class o9 implements Runnable {
    public final int f26838a = 0;
    public final u9 f26839b;
    public final Runnable[] f26840c;
    public final g60 d;
    public final int e;
    public final w7.j0[] f26841f;

    public o9(u9 u9Var, g60 g60Var, Runnable[] runnableArr, int i10, w7.j0[] j0VarArr) {
        this.f26839b = u9Var;
        this.d = g60Var;
        this.f26840c = runnableArr;
        this.e = i10;
        this.f26841f = j0VarArr;
    }

    @Override
    public final void run() {
        switch (this.f26838a) {
            case 0:
                u9 u9Var = this.f26839b;
                g60 g60Var = this.d;
                Runnable[] runnableArr = this.f26840c;
                int i10 = this.e;
                w7.j0[] j0VarArr = this.f26841f;
                try {
                    GradientDrawable.Orientation orientation = u9Var.getOrientation();
                    int[] iArr = u9Var.f28628a;
                    int i11 = g60Var.f24266a;
                    int i12 = g60Var.f24267b;
                    Rect e = u9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.cb(u9Var, runnableArr, createBitmap, g60Var, i10, j0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new o9(u9Var, runnableArr, g60Var, i10, j0VarArr));
                    throw th2;
                }
            default:
                u9.a(this.f26839b, this.f26840c, null, this.d, this.e, this.f26841f);
                return;
        }
    }

    public o9(u9 u9Var, Runnable[] runnableArr, g60 g60Var, int i10, w7.j0[] j0VarArr) {
        this.f26839b = u9Var;
        this.f26840c = runnableArr;
        this.d = g60Var;
        this.e = i10;
        this.f26841f = j0VarArr;
    }
}
