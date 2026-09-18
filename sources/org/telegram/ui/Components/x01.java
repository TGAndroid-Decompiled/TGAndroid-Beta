package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class x01 {
    public final View f29802a;
    public final ArrayList f29803b;
    public final Runnable f29804c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f29805f;
    public float f29806g;

    public x01(View view, Runnable runnable) {
        this.f29806g = 1.0f;
        this.f29802a = view;
        this.f29803b = null;
        this.f29804c = null;
        this.d = runnable;
        this.e = null;
        this.f29805f = null;
    }

    public x01(ArrayList arrayList, gg.t tVar) {
        this.f29806g = 1.0f;
        this.f29802a = null;
        this.f29803b = arrayList;
        this.f29804c = null;
        this.d = tVar;
        this.e = null;
        this.f29805f = null;
    }

    public x01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f29806g = 1.0f;
        this.f29802a = null;
        this.f29803b = null;
        this.f29804c = runnable;
        this.d = runnable2;
        this.f29805f = matrix;
        this.e = bitmap;
    }
}
