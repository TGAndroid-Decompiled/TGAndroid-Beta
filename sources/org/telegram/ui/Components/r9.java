package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r9 implements Runnable {
    public final int f32166a = 0;
    public final x9 f32167b;
    public final Runnable[] f32168c;
    public final v60 d;
    public final int e;
    public final gb1[] f32169f;

    public r9(x9 x9Var, v60 v60Var, Runnable[] runnableArr, int i10, gb1[] gb1VarArr) {
        this.f32167b = x9Var;
        this.d = v60Var;
        this.f32168c = runnableArr;
        this.e = i10;
        this.f32169f = gb1VarArr;
    }

    @Override
    public final void run() {
        switch (this.f32166a) {
            case 0:
                x9 x9Var = this.f32167b;
                v60 v60Var = this.d;
                Runnable[] runnableArr = this.f32168c;
                int i10 = this.e;
                gb1[] gb1VarArr = this.f32169f;
                try {
                    GradientDrawable.Orientation orientation = x9Var.getOrientation();
                    int[] iArr = x9Var.f34667a;
                    int i11 = v60Var.f33584a;
                    int i12 = v60Var.f33585b;
                    Rect e = x9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ag.q0(x9Var, runnableArr, createBitmap, v60Var, i10, gb1VarArr, 10));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new r9(x9Var, runnableArr, v60Var, i10, gb1VarArr));
                    throw th2;
                }
            default:
                x9.a(this.f32167b, this.f32168c, null, this.d, this.e, this.f32169f);
                return;
        }
    }

    public r9(x9 x9Var, Runnable[] runnableArr, v60 v60Var, int i10, gb1[] gb1VarArr) {
        this.f32167b = x9Var;
        this.f32168c = runnableArr;
        this.d = v60Var;
        this.e = i10;
        this.f32169f = gb1VarArr;
    }
}
