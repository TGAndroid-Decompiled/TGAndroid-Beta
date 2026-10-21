package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class u11 {
    public final View f30814a;
    public final ArrayList f30815b;
    public final Runnable f30816c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f30817f;
    public float f30818g;

    public u11(View view, Runnable runnable) {
        this.f30818g = 1.0f;
        this.f30814a = view;
        this.f30815b = null;
        this.f30816c = null;
        this.d = runnable;
        this.e = null;
        this.f30817f = null;
    }

    public u11(ArrayList arrayList, ig.e2 e2Var) {
        this.f30818g = 1.0f;
        this.f30814a = null;
        this.f30815b = arrayList;
        this.f30816c = null;
        this.d = e2Var;
        this.e = null;
        this.f30817f = null;
    }

    public u11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f30818g = 1.0f;
        this.f30814a = null;
        this.f30815b = null;
        this.f30816c = runnable;
        this.d = runnable2;
        this.f30817f = matrix;
        this.e = bitmap;
    }
}
