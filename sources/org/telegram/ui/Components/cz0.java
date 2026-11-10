package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class cz0 {
    public final View f32827a;
    public final ArrayList f32828b;
    public final Runnable f32829c;
    public Runnable d;
    public final Bitmap f32830e;
    public final Matrix f32831f;
    public float f32832g;

    public cz0(View view, Runnable runnable) {
        this.f32832g = 1.0f;
        this.f32827a = view;
        this.f32828b = null;
        this.f32829c = null;
        this.d = runnable;
        this.f32830e = null;
        this.f32831f = null;
    }

    public cz0(ArrayList arrayList, l2.z0 z0Var) {
        this.f32832g = 1.0f;
        this.f32827a = null;
        this.f32828b = arrayList;
        this.f32829c = null;
        this.d = z0Var;
        this.f32830e = null;
        this.f32831f = null;
    }

    public cz0(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f32832g = 1.0f;
        this.f32827a = null;
        this.f32828b = null;
        this.f32829c = runnable;
        this.d = runnable2;
        this.f32831f = matrix;
        this.f32830e = bitmap;
    }
}
