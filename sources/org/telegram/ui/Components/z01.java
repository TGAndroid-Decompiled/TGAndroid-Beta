package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class z01 {
    public final View f33719a;
    public final ArrayList f33720b;
    public final Runnable f33721c;
    public Runnable d;
    public final Bitmap f33722e;
    public final Matrix f33723f;
    public float f33724g;

    public z01(View view, Runnable runnable) {
        this.f33724g = 1.0f;
        this.f33719a = view;
        this.f33720b = null;
        this.f33721c = null;
        this.d = runnable;
        this.f33722e = null;
        this.f33723f = null;
    }

    public z01(ArrayList arrayList, uf.h1 h1Var) {
        this.f33724g = 1.0f;
        this.f33719a = null;
        this.f33720b = arrayList;
        this.f33721c = null;
        this.d = h1Var;
        this.f33722e = null;
        this.f33723f = null;
    }

    public z01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f33724g = 1.0f;
        this.f33719a = null;
        this.f33720b = null;
        this.f33721c = runnable;
        this.d = runnable2;
        this.f33723f = matrix;
        this.f33722e = bitmap;
    }
}
