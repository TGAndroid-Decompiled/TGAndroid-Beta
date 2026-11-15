package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class ez0 {
    public final View f34455a;
    public final ArrayList f34456b;
    public final Runnable f34457c;
    public Runnable d;
    public final Bitmap f34458e;
    public final Matrix f34459f;
    public float f34460g;

    public ez0(View view, Runnable runnable) {
        this.f34460g = 1.0f;
        this.f34455a = view;
        this.f34456b = null;
        this.f34457c = null;
        this.d = runnable;
        this.f34458e = null;
        this.f34459f = null;
    }

    public ez0(ArrayList arrayList, lv0 lv0Var) {
        this.f34460g = 1.0f;
        this.f34455a = null;
        this.f34456b = arrayList;
        this.f34457c = null;
        this.d = lv0Var;
        this.f34458e = null;
        this.f34459f = null;
    }

    public ez0(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f34460g = 1.0f;
        this.f34455a = null;
        this.f34456b = null;
        this.f34457c = runnable;
        this.d = runnable2;
        this.f34459f = matrix;
        this.f34458e = bitmap;
    }
}
