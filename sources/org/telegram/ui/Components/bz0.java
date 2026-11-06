package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class bz0 {
    public final View f32339a;
    public final ArrayList f32340b;
    public final Runnable f32341c;
    public Runnable d;
    public final Bitmap f32342e;
    public final Matrix f32343f;
    public float f32344g;

    public bz0(View view, Runnable runnable) {
        this.f32344g = 1.0f;
        this.f32339a = view;
        this.f32340b = null;
        this.f32341c = null;
        this.d = runnable;
        this.f32342e = null;
        this.f32343f = null;
    }

    public bz0(ArrayList arrayList, l2.z0 z0Var) {
        this.f32344g = 1.0f;
        this.f32339a = null;
        this.f32340b = arrayList;
        this.f32341c = null;
        this.d = z0Var;
        this.f32342e = null;
        this.f32343f = null;
    }

    public bz0(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f32344g = 1.0f;
        this.f32339a = null;
        this.f32340b = null;
        this.f32341c = runnable;
        this.d = runnable2;
        this.f32343f = matrix;
        this.f32342e = bitmap;
    }
}
