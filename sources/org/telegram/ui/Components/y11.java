package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class y11 {
    public final View f31111a;
    public final ArrayList f31112b;
    public final Runnable f31113c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f31114f;
    public float f31115g;

    public y11(View view, Runnable runnable) {
        this.f31115g = 1.0f;
        this.f31111a = view;
        this.f31112b = null;
        this.f31113c = null;
        this.d = runnable;
        this.e = null;
        this.f31114f = null;
    }

    public y11(ArrayList arrayList, hg.t tVar) {
        this.f31115g = 1.0f;
        this.f31111a = null;
        this.f31112b = arrayList;
        this.f31113c = null;
        this.d = tVar;
        this.e = null;
        this.f31114f = null;
    }

    public y11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f31115g = 1.0f;
        this.f31111a = null;
        this.f31112b = null;
        this.f31113c = runnable;
        this.d = runnable2;
        this.f31114f = matrix;
        this.e = bitmap;
    }
}
