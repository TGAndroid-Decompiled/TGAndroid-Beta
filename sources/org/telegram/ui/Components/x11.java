package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class x11 {
    public final View f32397a;
    public final ArrayList f32398b;
    public final Runnable f32399c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f32400f;
    public float f32401g;

    public x11(View view, Runnable runnable) {
        this.f32401g = 1.0f;
        this.f32397a = view;
        this.f32398b = null;
        this.f32399c = null;
        this.d = runnable;
        this.e = null;
        this.f32400f = null;
    }

    public x11(ArrayList arrayList, ig.d2 d2Var) {
        this.f32401g = 1.0f;
        this.f32397a = null;
        this.f32398b = arrayList;
        this.f32399c = null;
        this.d = d2Var;
        this.e = null;
        this.f32400f = null;
    }

    public x11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f32401g = 1.0f;
        this.f32397a = null;
        this.f32398b = null;
        this.f32399c = runnable;
        this.d = runnable2;
        this.f32400f = matrix;
        this.e = bitmap;
    }
}
