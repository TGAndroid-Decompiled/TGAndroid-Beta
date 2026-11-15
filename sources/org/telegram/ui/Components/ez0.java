package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class ez0 {
    public final View f34454a;
    public final ArrayList f34455b;
    public final Runnable f34456c;
    public Runnable d;
    public final Bitmap f34457e;
    public final Matrix f34458f;
    public float f34459g;

    public ez0(View view, Runnable runnable) {
        this.f34459g = 1.0f;
        this.f34454a = view;
        this.f34455b = null;
        this.f34456c = null;
        this.d = runnable;
        this.f34457e = null;
        this.f34458f = null;
    }

    public ez0(ArrayList arrayList, lv0 lv0Var) {
        this.f34459g = 1.0f;
        this.f34454a = null;
        this.f34455b = arrayList;
        this.f34456c = null;
        this.d = lv0Var;
        this.f34457e = null;
        this.f34458f = null;
    }

    public ez0(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f34459g = 1.0f;
        this.f34454a = null;
        this.f34455b = null;
        this.f34456c = runnable;
        this.d = runnable2;
        this.f34458f = matrix;
        this.f34457e = bitmap;
    }
}
