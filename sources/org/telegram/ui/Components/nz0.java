package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class nz0 {
    public final View f38019a;
    public final ArrayList f38020b;
    public final Runnable f38021c;
    public Runnable d;
    public final Bitmap f38022e;
    public final Matrix f38023f;
    public float f38024g;

    public nz0(View view, Runnable runnable) {
        this.f38024g = 1.0f;
        this.f38019a = view;
        this.f38020b = null;
        this.f38021c = null;
        this.d = runnable;
        this.f38022e = null;
        this.f38023f = null;
    }

    public nz0(ArrayList arrayList, es0 es0Var) {
        this.f38024g = 1.0f;
        this.f38019a = null;
        this.f38020b = arrayList;
        this.f38021c = null;
        this.d = es0Var;
        this.f38022e = null;
        this.f38023f = null;
    }

    public nz0(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f38024g = 1.0f;
        this.f38019a = null;
        this.f38020b = null;
        this.f38021c = runnable;
        this.d = runnable2;
        this.f38023f = matrix;
        this.f38022e = bitmap;
    }
}
