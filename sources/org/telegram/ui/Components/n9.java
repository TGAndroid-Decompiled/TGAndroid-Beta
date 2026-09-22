package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n9 implements Runnable {
    public final int f26396a = 0;
    public final t9 f26397b;
    public final Runnable[] f26398c;
    public final y50 d;
    public final int e;
    public final w7.i0[] f26399f;

    public n9(t9 t9Var, y50 y50Var, Runnable[] runnableArr, int i10, w7.i0[] i0VarArr) {
        this.f26397b = t9Var;
        this.d = y50Var;
        this.f26398c = runnableArr;
        this.e = i10;
        this.f26399f = i0VarArr;
    }

    @Override
    public final void run() {
        switch (this.f26396a) {
            case 0:
                t9 t9Var = this.f26397b;
                y50 y50Var = this.d;
                Runnable[] runnableArr = this.f26398c;
                int i10 = this.e;
                w7.i0[] i0VarArr = this.f26399f;
                try {
                    GradientDrawable.Orientation orientation = t9Var.getOrientation();
                    int[] iArr = t9Var.f28068a;
                    int i11 = y50Var.f30158a;
                    int i12 = y50Var.f30159b;
                    Rect e = t9.e(orientation, i11, i12);
                    Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(createBitmap, iArr, e.left, e.top, e.right, e.bottom);
                    AndroidUtilities.runOnUIThread(new ai.cb(t9Var, runnableArr, createBitmap, y50Var, i10, i0VarArr, 7));
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.runOnUIThread(new n9(t9Var, runnableArr, y50Var, i10, i0VarArr));
                    throw th2;
                }
            default:
                t9.a(this.f26397b, this.f26398c, null, this.d, this.e, this.f26399f);
                return;
        }
    }

    public n9(t9 t9Var, Runnable[] runnableArr, y50 y50Var, int i10, w7.i0[] i0VarArr) {
        this.f26397b = t9Var;
        this.f26398c = runnableArr;
        this.d = y50Var;
        this.e = i10;
        this.f26399f = i0VarArr;
    }
}
