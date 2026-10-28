package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r9 implements Runnable {
    public final int f32182a = 0;
    public final x9 f32183b;
    public final Runnable[] f32184c;
    public final w60 d;
    public final int e;
    public final kb1[] f32185f;

    public r9(x9 x9Var, w60 w60Var, Runnable[] runnableArr, int i10, kb1[] kb1VarArr) {
        this.f32183b = x9Var;
        this.d = w60Var;
        this.f32184c = runnableArr;
        this.e = i10;
        this.f32185f = kb1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f32182a) {
            case 0:
                x9 x9Var = this.f32183b;
                w60 w60Var = this.d;
                Runnable[] runnableArr = this.f32184c;
                int i10 = this.e;
                kb1[] kb1VarArr = this.f32185f;
                try {
                    GradientDrawable.Orientation orientation = x9Var.getOrientation();
                    int[] iArr = x9Var.f34702a;
                    int i11 = w60Var.f34460a;
                    int i12 = w60Var.f34461b;
                    Rect e = x9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ag.q0(x9Var, runnableArr, createBitmap, w60Var, i10, kb1VarArr, 10));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new r9(x9Var, runnableArr, w60Var, i10, kb1VarArr));
                    throw th2;
                }
            default:
                x9.a(this.f32183b, this.f32184c, null, this.d, this.e, this.f32185f);
                return;
        }
    }

    public r9(x9 x9Var, Runnable[] runnableArr, w60 w60Var, int i10, kb1[] kb1VarArr) {
        this.f32183b = x9Var;
        this.f32184c = runnableArr;
        this.d = w60Var;
        this.e = i10;
        this.f32185f = kb1VarArr;
    }
}
