package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class s11 {
    public final View f30140a;
    public final ArrayList f30141b;
    public final Runnable f30142c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f30143f;
    public float f30144g;

    public s11(View view, Runnable runnable) {
        this.f30144g = 1.0f;
        this.f30140a = view;
        this.f30141b = null;
        this.f30142c = null;
        this.d = runnable;
        this.e = null;
        this.f30143f = null;
    }

    public s11(ArrayList arrayList, ig.c2 c2Var) {
        this.f30144g = 1.0f;
        this.f30140a = null;
        this.f30141b = arrayList;
        this.f30142c = null;
        this.d = c2Var;
        this.e = null;
        this.f30143f = null;
    }

    public s11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f30144g = 1.0f;
        this.f30140a = null;
        this.f30141b = null;
        this.f30142c = runnable;
        this.d = runnable2;
        this.f30143f = matrix;
        this.e = bitmap;
    }
}
