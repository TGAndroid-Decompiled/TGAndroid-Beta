package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class q9 implements Runnable {
    public final int f29655a = 0;
    public final w9 f29656b;
    public final Runnable[] f29657c;
    public final y50 d;
    public final int f29658e;
    public final w7.i0[] f29659f;

    public q9(w9 w9Var, y50 y50Var, Runnable[] runnableArr, int i10, w7.i0[] i0VarArr) {
        this.f29656b = w9Var;
        this.d = y50Var;
        this.f29657c = runnableArr;
        this.f29658e = i10;
        this.f29659f = i0VarArr;
    }

    @Override
    public final void run() {
        switch (this.f29655a) {
            case 0:
                w9 w9Var = this.f29656b;
                y50 y50Var = this.d;
                Runnable[] runnableArr = this.f29657c;
                int i10 = this.f29658e;
                w7.i0[] i0VarArr = this.f29659f;
                try {
                    GradientDrawable.Orientation orientation = w9Var.getOrientation();
                    int[] iArr = w9Var.f32240a;
                    int i11 = y50Var.f32875a;
                    int i12 = y50Var.f32876b;
                    Rect e7 = w9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e7.left, e7.top, e7.right, e7.bottom);
                    AndroidUtilities.runOnUIThread(new bi.ia(w9Var, runnableArr, createBitmap, y50Var, i10, i0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new q9(w9Var, runnableArr, y50Var, i10, i0VarArr));
                    throw th2;
                }
            default:
                w9.a(this.f29656b, this.f29657c, null, this.d, this.f29658e, this.f29659f);
                return;
        }
    }

    public q9(w9 w9Var, Runnable[] runnableArr, y50 y50Var, int i10, w7.i0[] i0VarArr) {
        this.f29656b = w9Var;
        this.f29657c = runnableArr;
        this.d = y50Var;
        this.f29658e = i10;
        this.f29659f = i0VarArr;
    }
}
