package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s9 implements Runnable {
    public final int f29063a = 0;
    public final y9 f29064b;
    public final Runnable[] f29065c;
    public final w60 d;
    public final int e;
    public final w7.x5[] f29066f;

    public s9(y9 y9Var, w60 w60Var, Runnable[] runnableArr, int i10, w7.x5[] x5VarArr) {
        this.f29064b = y9Var;
        this.d = w60Var;
        this.f29065c = runnableArr;
        this.e = i10;
        this.f29066f = x5VarArr;
    }

    @Override
    public final void run() {
        switch (this.f29063a) {
            case 0:
                y9 y9Var = this.f29064b;
                w60 w60Var = this.d;
                Runnable[] runnableArr = this.f29065c;
                int i10 = this.e;
                w7.x5[] x5VarArr = this.f29066f;
                try {
                    GradientDrawable.Orientation orientation = y9Var.getOrientation();
                    int[] iArr = y9Var.f31514a;
                    int i11 = w60Var.f30805a;
                    int i12 = w60Var.f30806b;
                    Rect e = y9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new bi.ma(y9Var, runnableArr, createBitmap, w60Var, i10, x5VarArr, 8));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new s9(y9Var, runnableArr, w60Var, i10, x5VarArr));
                    throw th2;
                }
            default:
                y9.a(this.f29064b, this.f29065c, null, this.d, this.e, this.f29066f);
                return;
        }
    }

    public s9(y9 y9Var, Runnable[] runnableArr, w60 w60Var, int i10, w7.x5[] x5VarArr) {
        this.f29064b = y9Var;
        this.f29065c = runnableArr;
        this.d = w60Var;
        this.e = i10;
        this.f29066f = x5VarArr;
    }
}
