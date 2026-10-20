package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class u11 {
    public final View f30813a;
    public final ArrayList f30814b;
    public final Runnable f30815c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f30816f;
    public float f30817g;

    public u11(View view, Runnable runnable) {
        this.f30817g = 1.0f;
        this.f30813a = view;
        this.f30814b = null;
        this.f30815c = null;
        this.d = runnable;
        this.e = null;
        this.f30816f = null;
    }

    public u11(ArrayList arrayList, ig.e2 e2Var) {
        this.f30817g = 1.0f;
        this.f30813a = null;
        this.f30814b = arrayList;
        this.f30815c = null;
        this.d = e2Var;
        this.e = null;
        this.f30816f = null;
    }

    public u11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f30817g = 1.0f;
        this.f30813a = null;
        this.f30814b = null;
        this.f30815c = runnable;
        this.d = runnable2;
        this.f30816f = matrix;
        this.e = bitmap;
    }
}
