package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class h9 implements Runnable {
    public final int f28995a = 0;
    public final n9 f28996b;
    public final Runnable[] f28997c;
    public final h50 d;
    public final int f28998e;
    public final g7.b6[] f28999f;

    public h9(n9 n9Var, h50 h50Var, Runnable[] runnableArr, int i9, g7.b6[] b6VarArr) {
        this.f28996b = n9Var;
        this.d = h50Var;
        this.f28997c = runnableArr;
        this.f28998e = i9;
        this.f28999f = b6VarArr;
    }

    @Override
    public final void run() {
        switch (this.f28995a) {
            case 0:
                n9 n9Var = this.f28996b;
                h50 h50Var = this.d;
                Runnable[] runnableArr = this.f28997c;
                int i9 = this.f28998e;
                g7.b6[] b6VarArr = this.f28999f;
                try {
                    GradientDrawable.Orientation orientation = n9Var.getOrientation();
                    int[] iArr = n9Var.f31049a;
                    int i10 = h50Var.f28978a;
                    int i11 = h50Var.f28979b;
                    Rect e10 = n9.e(orientation, i10, i11);
                    Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e10.left, e10.top, e10.right, e10.bottom);
                    AndroidUtilities.runOnUIThread(new ff.k0(n9Var, runnableArr, createBitmap, h50Var, i9, b6VarArr));
                    return;
                } catch (Throwable th) {
                    AndroidUtilities.runOnUIThread(new h9(n9Var, runnableArr, h50Var, i9, b6VarArr));
                    throw th;
                }
            default:
                n9.a(this.f28996b, this.f28997c, null, this.d, this.f28998e, this.f28999f);
                return;
        }
    }

    public h9(n9 n9Var, Runnable[] runnableArr, h50 h50Var, int i9, g7.b6[] b6VarArr) {
        this.f28996b = n9Var;
        this.f28997c = runnableArr;
        this.d = h50Var;
        this.f28998e = i9;
        this.f28999f = b6VarArr;
    }
}
