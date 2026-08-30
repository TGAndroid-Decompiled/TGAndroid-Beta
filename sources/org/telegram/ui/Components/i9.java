package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class i9 implements Runnable {
    public final int f25628a = 0;
    public final o9 f25629b;
    public final Runnable[] f25630c;
    public final z50 d;
    public final int e;
    public final k7.y5[] f25631f;

    public i9(o9 o9Var, z50 z50Var, Runnable[] runnableArr, int i10, k7.y5[] y5VarArr) {
        this.f25629b = o9Var;
        this.d = z50Var;
        this.f25630c = runnableArr;
        this.e = i10;
        this.f25631f = y5VarArr;
    }

    @Override
    public final void run() {
        switch (this.f25628a) {
            case 0:
                o9 o9Var = this.f25629b;
                z50 z50Var = this.d;
                Runnable[] runnableArr = this.f25630c;
                int i10 = this.e;
                k7.y5[] y5VarArr = this.f25631f;
                try {
                    GradientDrawable.Orientation orientation = o9Var.getOrientation();
                    int[] iArr = o9Var.f27519a;
                    int i11 = z50Var.f31247a;
                    int i12 = z50Var.f31248b;
                    Rect e = o9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new lf.j0(o9Var, runnableArr, createBitmap, z50Var, i10, y5VarArr));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new i9(o9Var, runnableArr, z50Var, i10, y5VarArr));
                    throw th2;
                }
            default:
                o9.a(this.f25629b, this.f25630c, null, this.d, this.e, this.f25631f);
                return;
        }
    }

    public i9(o9 o9Var, Runnable[] runnableArr, z50 z50Var, int i10, k7.y5[] y5VarArr) {
        this.f25629b = o9Var;
        this.f25630c = runnableArr;
        this.d = z50Var;
        this.e = i10;
        this.f25631f = y5VarArr;
    }
}
