package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class g21 {
    public final View f28361a;
    public final ArrayList f28362b;
    public final Runnable f28363c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f28364f;
    public float f28365g;

    public g21(View view, Runnable runnable) {
        this.f28365g = 1.0f;
        this.f28361a = view;
        this.f28362b = null;
        this.f28363c = null;
        this.d = runnable;
        this.e = null;
        this.f28364f = null;
    }

    public g21(ArrayList arrayList, jg.f1 f1Var) {
        this.f28365g = 1.0f;
        this.f28361a = null;
        this.f28362b = arrayList;
        this.f28363c = null;
        this.d = f1Var;
        this.e = null;
        this.f28364f = null;
    }

    public g21(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f28365g = 1.0f;
        this.f28361a = null;
        this.f28362b = null;
        this.f28363c = runnable;
        this.d = runnable2;
        this.f28364f = matrix;
        this.e = bitmap;
    }
}
