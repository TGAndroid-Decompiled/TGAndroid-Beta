package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r9 implements Runnable {
    public final int f30395a = 0;
    public final x9 f30396b;
    public final Runnable[] f30397c;
    public final b70 d;
    public final int f30398e;
    public final w7.i0[] f30399f;

    public r9(x9 x9Var, b70 b70Var, Runnable[] runnableArr, int i10, w7.i0[] i0VarArr) {
        this.f30396b = x9Var;
        this.d = b70Var;
        this.f30397c = runnableArr;
        this.f30398e = i10;
        this.f30399f = i0VarArr;
    }

    @Override
    public final void run() {
        switch (this.f30395a) {
            case 0:
                x9 x9Var = this.f30396b;
                b70 b70Var = this.d;
                Runnable[] runnableArr = this.f30397c;
                int i10 = this.f30398e;
                w7.i0[] i0VarArr = this.f30399f;
                try {
                    GradientDrawable.Orientation orientation = x9Var.getOrientation();
                    int[] iArr = x9Var.f32851a;
                    int i11 = b70Var.f24871a;
                    int i12 = b70Var.f24872b;
                    Rect e7 = x9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e7.left, e7.top, e7.right, e7.bottom);
                    AndroidUtilities.runOnUIThread(new ai.db(x9Var, runnableArr, createBitmap, b70Var, i10, i0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new r9(x9Var, runnableArr, b70Var, i10, i0VarArr));
                    throw th2;
                }
            default:
                x9.a(this.f30396b, this.f30397c, null, this.d, this.f30398e, this.f30399f);
                return;
        }
    }

    public r9(x9 x9Var, Runnable[] runnableArr, b70 b70Var, int i10, w7.i0[] i0VarArr) {
        this.f30396b = x9Var;
        this.f30397c = runnableArr;
        this.d = b70Var;
        this.f30398e = i10;
        this.f30399f = i0VarArr;
    }
}
