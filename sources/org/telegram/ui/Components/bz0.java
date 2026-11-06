package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class bz0 {
    public final View f32333a;
    public final ArrayList f32334b;
    public final Runnable f32335c;
    public Runnable d;
    public final Bitmap f32336e;
    public final Matrix f32337f;
    public float f32338g;

    public bz0(View view, Runnable runnable) {
        this.f32338g = 1.0f;
        this.f32333a = view;
        this.f32334b = null;
        this.f32335c = null;
        this.d = runnable;
        this.f32336e = null;
        this.f32337f = null;
    }

    public bz0(ArrayList arrayList, l2.z0 z0Var) {
        this.f32338g = 1.0f;
        this.f32333a = null;
        this.f32334b = arrayList;
        this.f32335c = null;
        this.d = z0Var;
        this.f32336e = null;
        this.f32337f = null;
    }

    public bz0(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f32338g = 1.0f;
        this.f32333a = null;
        this.f32334b = null;
        this.f32335c = runnable;
        this.d = runnable2;
        this.f32337f = matrix;
        this.f32336e = bitmap;
    }
}
