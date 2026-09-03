package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class z01 {
    public final View f31216a;
    public final ArrayList f31217b;
    public final Runnable f31218c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f31219f;
    public float f31220g;

    public z01(View view, Runnable runnable) {
        this.f31220g = 1.0f;
        this.f31216a = view;
        this.f31217b = null;
        this.f31218c = null;
        this.d = runnable;
        this.e = null;
        this.f31219f = null;
    }

    public z01(ArrayList arrayList, tf.k1 k1Var) {
        this.f31220g = 1.0f;
        this.f31216a = null;
        this.f31217b = arrayList;
        this.f31218c = null;
        this.d = k1Var;
        this.e = null;
        this.f31219f = null;
    }

    public z01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f31220g = 1.0f;
        this.f31216a = null;
        this.f31217b = null;
        this.f31218c = runnable;
        this.d = runnable2;
        this.f31219f = matrix;
        this.e = bitmap;
    }
}
