package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class g01 {
    public final View f26206a;
    public final ArrayList f26207b;
    public final Runnable f26208c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f26209f;
    public float f26210g;

    public g01(View view, Runnable runnable) {
        this.f26210g = 1.0f;
        this.f26206a = view;
        this.f26207b = null;
        this.f26208c = null;
        this.d = runnable;
        this.e = null;
        this.f26209f = null;
    }

    public g01(ArrayList arrayList, a3.l0 l0Var) {
        this.f26210g = 1.0f;
        this.f26206a = null;
        this.f26207b = arrayList;
        this.f26208c = null;
        this.d = l0Var;
        this.e = null;
        this.f26209f = null;
    }

    public g01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f26210g = 1.0f;
        this.f26206a = null;
        this.f26207b = null;
        this.f26208c = runnable;
        this.d = runnable2;
        this.f26209f = matrix;
        this.e = bitmap;
    }
}
