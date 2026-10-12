package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class x11 {
    public final View f31108a;
    public final ArrayList f31109b;
    public final Runnable f31110c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f31111f;
    public float f31112g;

    public x11(View view, Runnable runnable) {
        this.f31112g = 1.0f;
        this.f31108a = view;
        this.f31109b = null;
        this.f31110c = null;
        this.d = runnable;
        this.e = null;
        this.f31111f = null;
    }

    public x11(ArrayList arrayList, hg.t tVar) {
        this.f31112g = 1.0f;
        this.f31108a = null;
        this.f31109b = arrayList;
        this.f31110c = null;
        this.d = tVar;
        this.e = null;
        this.f31111f = null;
    }

    public x11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f31112g = 1.0f;
        this.f31108a = null;
        this.f31109b = null;
        this.f31110c = runnable;
        this.d = runnable2;
        this.f31111f = matrix;
        this.e = bitmap;
    }
}
