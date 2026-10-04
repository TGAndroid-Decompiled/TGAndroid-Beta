package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class u11 {
    public final View f31245a;
    public final ArrayList f31246b;
    public final Runnable f31247c;
    public Runnable d;
    public final Bitmap f31248e;
    public final Matrix f31249f;
    public float f31250g;

    public u11(View view, Runnable runnable) {
        this.f31250g = 1.0f;
        this.f31245a = view;
        this.f31246b = null;
        this.f31247c = null;
        this.d = runnable;
        this.f31248e = null;
        this.f31249f = null;
    }

    public u11(ArrayList arrayList, gg.t tVar) {
        this.f31250g = 1.0f;
        this.f31245a = null;
        this.f31246b = arrayList;
        this.f31247c = null;
        this.d = tVar;
        this.f31248e = null;
        this.f31249f = null;
    }

    public u11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f31250g = 1.0f;
        this.f31245a = null;
        this.f31246b = null;
        this.f31247c = runnable;
        this.d = runnable2;
        this.f31249f = matrix;
        this.f31248e = bitmap;
    }
}
