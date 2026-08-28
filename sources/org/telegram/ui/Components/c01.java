package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class c01 {
    public final View f27327a;
    public final ArrayList f27328b;
    public final Runnable f27329c;
    public Runnable d;
    public final Bitmap f27330e;
    public final Matrix f27331f;
    public float f27332g;

    public c01(View view, Runnable runnable) {
        this.f27332g = 1.0f;
        this.f27327a = view;
        this.f27328b = null;
        this.f27329c = null;
        this.d = runnable;
        this.f27330e = null;
        this.f27331f = null;
    }

    public c01(ArrayList arrayList, pf.a aVar) {
        this.f27332g = 1.0f;
        this.f27327a = null;
        this.f27328b = arrayList;
        this.f27329c = null;
        this.d = aVar;
        this.f27330e = null;
        this.f27331f = null;
    }

    public c01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f27332g = 1.0f;
        this.f27327a = null;
        this.f27328b = null;
        this.f27329c = runnable;
        this.d = runnable2;
        this.f27331f = matrix;
        this.f27330e = bitmap;
    }
}
