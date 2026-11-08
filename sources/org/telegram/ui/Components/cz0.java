package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class cz0 {
    public final View f32737a;
    public final ArrayList f32738b;
    public final Runnable f32739c;
    public Runnable d;
    public final Bitmap f32740e;
    public final Matrix f32741f;
    public float f32742g;

    public cz0(View view, Runnable runnable) {
        this.f32742g = 1.0f;
        this.f32737a = view;
        this.f32738b = null;
        this.f32739c = null;
        this.d = runnable;
        this.f32740e = null;
        this.f32741f = null;
    }

    public cz0(ArrayList arrayList, l2.z0 z0Var) {
        this.f32742g = 1.0f;
        this.f32737a = null;
        this.f32738b = arrayList;
        this.f32739c = null;
        this.d = z0Var;
        this.f32740e = null;
        this.f32741f = null;
    }

    public cz0(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f32742g = 1.0f;
        this.f32737a = null;
        this.f32738b = null;
        this.f32739c = runnable;
        this.d = runnable2;
        this.f32741f = matrix;
        this.f32740e = bitmap;
    }
}
