package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r9 implements Runnable {
    public final int f30427a = 0;
    public final x9 f30428b;
    public final Runnable[] f30429c;
    public final b70 d;
    public final int f30430e;
    public final w7.i0[] f30431f;

    public r9(x9 x9Var, b70 b70Var, Runnable[] runnableArr, int i10, w7.i0[] i0VarArr) {
        this.f30428b = x9Var;
        this.d = b70Var;
        this.f30429c = runnableArr;
        this.f30430e = i10;
        this.f30431f = i0VarArr;
    }

    @Override
    public final void run() {
        switch (this.f30427a) {
            case 0:
                x9 x9Var = this.f30428b;
                b70 b70Var = this.d;
                Runnable[] runnableArr = this.f30429c;
                int i10 = this.f30430e;
                w7.i0[] i0VarArr = this.f30431f;
                try {
                    GradientDrawable.Orientation orientation = x9Var.getOrientation();
                    int[] iArr = x9Var.f32874a;
                    int i11 = b70Var.f24881a;
                    int i12 = b70Var.f24882b;
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
                x9.a(this.f30428b, this.f30429c, null, this.d, this.f30430e, this.f30431f);
                return;
        }
    }

    public r9(x9 x9Var, Runnable[] runnableArr, b70 b70Var, int i10, w7.i0[] i0VarArr) {
        this.f30428b = x9Var;
        this.f30429c = runnableArr;
        this.d = b70Var;
        this.f30430e = i10;
        this.f30431f = i0VarArr;
    }
}
