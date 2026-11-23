package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class nz0 {
    public final View f38020a;
    public final ArrayList f38021b;
    public final Runnable f38022c;
    public Runnable d;
    public final Bitmap f38023e;
    public final Matrix f38024f;
    public float f38025g;

    public nz0(View view, Runnable runnable) {
        this.f38025g = 1.0f;
        this.f38020a = view;
        this.f38021b = null;
        this.f38022c = null;
        this.d = runnable;
        this.f38023e = null;
        this.f38024f = null;
    }

    public nz0(ArrayList arrayList, es0 es0Var) {
        this.f38025g = 1.0f;
        this.f38020a = null;
        this.f38021b = arrayList;
        this.f38022c = null;
        this.d = es0Var;
        this.f38023e = null;
        this.f38024f = null;
    }

    public nz0(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f38025g = 1.0f;
        this.f38020a = null;
        this.f38021b = null;
        this.f38022c = runnable;
        this.d = runnable2;
        this.f38024f = matrix;
        this.f38023e = bitmap;
    }
}
