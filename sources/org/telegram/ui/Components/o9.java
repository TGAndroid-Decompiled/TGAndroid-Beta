package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class o9 implements Runnable {
    public final int f27012a = 0;
    public final u9 f27013b;
    public final Runnable[] f27014c;
    public final j60 d;
    public final int e;
    public final w7.j0[] f27015f;

    public o9(u9 u9Var, j60 j60Var, Runnable[] runnableArr, int i10, w7.j0[] j0VarArr) {
        this.f27013b = u9Var;
        this.d = j60Var;
        this.f27014c = runnableArr;
        this.e = i10;
        this.f27015f = j0VarArr;
    }

    @Override
    public final void run() {
        switch (this.f27012a) {
            case 0:
                u9 u9Var = this.f27013b;
                j60 j60Var = this.d;
                Runnable[] runnableArr = this.f27014c;
                int i10 = this.e;
                w7.j0[] j0VarArr = this.f27015f;
                try {
                    GradientDrawable.Orientation orientation = u9Var.getOrientation();
                    int[] iArr = u9Var.f28698a;
                    int i11 = j60Var.f25293a;
                    int i12 = j60Var.f25294b;
                    Rect e = u9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.cb(u9Var, runnableArr, createBitmap, j60Var, i10, j0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new o9(u9Var, runnableArr, j60Var, i10, j0VarArr));
                    throw th2;
                }
            default:
                u9.a(this.f27013b, this.f27014c, null, this.d, this.e, this.f27015f);
                return;
        }
    }

    public o9(u9 u9Var, Runnable[] runnableArr, j60 j60Var, int i10, w7.j0[] j0VarArr) {
        this.f27013b = u9Var;
        this.f27014c = runnableArr;
        this.d = j60Var;
        this.e = i10;
        this.f27015f = j0VarArr;
    }
}
