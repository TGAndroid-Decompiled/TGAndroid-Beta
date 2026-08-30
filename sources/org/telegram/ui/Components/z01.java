package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class z01 {
    public final View f31197a;
    public final ArrayList f31198b;
    public final Runnable f31199c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f31200f;
    public float f31201g;

    public z01(View view, Runnable runnable) {
        this.f31201g = 1.0f;
        this.f31197a = view;
        this.f31198b = null;
        this.f31199c = null;
        this.d = runnable;
        this.e = null;
        this.f31200f = null;
    }

    public z01(ArrayList arrayList, tf.h1 h1Var) {
        this.f31201g = 1.0f;
        this.f31197a = null;
        this.f31198b = arrayList;
        this.f31199c = null;
        this.d = h1Var;
        this.e = null;
        this.f31200f = null;
    }

    public z01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f31201g = 1.0f;
        this.f31197a = null;
        this.f31198b = null;
        this.f31199c = runnable;
        this.d = runnable2;
        this.f31200f = matrix;
        this.e = bitmap;
    }
}
