package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class w11 {
    public final View f32107a;
    public final ArrayList f32108b;
    public final Runnable f32109c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f32110f;
    public float f32111g;

    public w11(View view, Runnable runnable) {
        this.f32111g = 1.0f;
        this.f32107a = view;
        this.f32108b = null;
        this.f32109c = null;
        this.d = runnable;
        this.e = null;
        this.f32110f = null;
    }

    public w11(ArrayList arrayList, ig.d2 d2Var) {
        this.f32111g = 1.0f;
        this.f32107a = null;
        this.f32108b = arrayList;
        this.f32109c = null;
        this.d = d2Var;
        this.e = null;
        this.f32110f = null;
    }

    public w11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f32111g = 1.0f;
        this.f32107a = null;
        this.f32108b = null;
        this.f32109c = runnable;
        this.d = runnable2;
        this.f32110f = matrix;
        this.e = bitmap;
    }
}
