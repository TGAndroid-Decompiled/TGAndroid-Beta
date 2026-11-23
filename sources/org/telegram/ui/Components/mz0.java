package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class mz0 {
    public final View f37596a;
    public final ArrayList f37597b;
    public final Runnable f37598c;
    public Runnable d;
    public final Bitmap f37599e;
    public final Matrix f37600f;
    public float f37601g;

    public mz0(View view, Runnable runnable) {
        this.f37601g = 1.0f;
        this.f37596a = view;
        this.f37597b = null;
        this.f37598c = null;
        this.d = runnable;
        this.f37599e = null;
        this.f37600f = null;
    }

    public mz0(ArrayList arrayList, as0 as0Var) {
        this.f37601g = 1.0f;
        this.f37596a = null;
        this.f37597b = arrayList;
        this.f37598c = null;
        this.d = as0Var;
        this.f37599e = null;
        this.f37600f = null;
    }

    public mz0(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f37601g = 1.0f;
        this.f37596a = null;
        this.f37597b = null;
        this.f37598c = runnable;
        this.d = runnable2;
        this.f37600f = matrix;
        this.f37599e = bitmap;
    }
}
