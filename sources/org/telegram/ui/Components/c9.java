package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.Utilities;
public final class c9 implements Runnable {
    public final int f32605a = 0;
    public final j9 f32606b;
    public final Runnable[] f32607c;
    public final q40 d;
    public final int f32608e;
    public final b8.jf[] f32609f;

    public c9(j9 j9Var, q40 q40Var, Runnable[] runnableArr, int i3, b8.jf[] jfVarArr) {
        this.f32606b = j9Var;
        this.d = q40Var;
        this.f32607c = runnableArr;
        this.f32608e = i3;
        this.f32609f = jfVarArr;
    }

    @Override
    public final void run() {
        switch (this.f32605a) {
            case 0:
                j9 j9Var = this.f32606b;
                q40 q40Var = this.d;
                Runnable[] runnableArr = this.f32607c;
                int i3 = this.f32608e;
                b8.jf[] jfVarArr = this.f32609f;
                try {
                    GradientDrawable.Orientation orientation = j9Var.getOrientation();
                    int[] iArr = j9Var.f34998a;
                    int i10 = q40Var.f37341a;
                    int i11 = q40Var.f37342b;
                    Rect e10 = j9.e(orientation, i10, i11);
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    org.telegram.messenger.g0.h3(new cg.k0(j9Var, runnableArr, createBitmap, q40Var, i3, jfVarArr, 9));
                    return;
                } catch (Throwable th2) {
                    org.telegram.messenger.g0.h3(new c9(j9Var, runnableArr, q40Var, i3, jfVarArr));
                    throw th2;
                }
            default:
                j9.a(this.f32606b, this.f32607c, null, this.d, this.f32608e, this.f32609f);
                return;
        }
    }

    public c9(j9 j9Var, Runnable[] runnableArr, q40 q40Var, int i3, b8.jf[] jfVarArr) {
        this.f32606b = j9Var;
        this.f32607c = runnableArr;
        this.d = q40Var;
        this.f32608e = i3;
        this.f32609f = jfVarArr;
    }
}
