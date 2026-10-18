package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class s11 {
    public final View f30142a;
    public final ArrayList f30143b;
    public final Runnable f30144c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f30145f;
    public float f30146g;

    public s11(View view, Runnable runnable) {
        this.f30146g = 1.0f;
        this.f30142a = view;
        this.f30143b = null;
        this.f30144c = null;
        this.d = runnable;
        this.e = null;
        this.f30145f = null;
    }

    public s11(ArrayList arrayList, ig.e2 e2Var) {
        this.f30146g = 1.0f;
        this.f30142a = null;
        this.f30143b = arrayList;
        this.f30144c = null;
        this.d = e2Var;
        this.e = null;
        this.f30145f = null;
    }

    public s11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f30146g = 1.0f;
        this.f30142a = null;
        this.f30143b = null;
        this.f30144c = runnable;
        this.d = runnable2;
        this.f30145f = matrix;
        this.e = bitmap;
    }
}
