package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class v01 {
    public final View f31033a;
    public final ArrayList f31034b;
    public final Runnable f31035c;
    public Runnable d;
    public final Bitmap f31036e;
    public final Matrix f31037f;
    public float f31038g;

    public v01(View view, Runnable runnable) {
        this.f31038g = 1.0f;
        this.f31033a = view;
        this.f31034b = null;
        this.f31035c = null;
        this.d = runnable;
        this.f31036e = null;
        this.f31037f = null;
    }

    public v01(ArrayList arrayList, hg.t tVar) {
        this.f31038g = 1.0f;
        this.f31033a = null;
        this.f31034b = arrayList;
        this.f31035c = null;
        this.d = tVar;
        this.f31036e = null;
        this.f31037f = null;
    }

    public v01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f31038g = 1.0f;
        this.f31033a = null;
        this.f31034b = null;
        this.f31035c = runnable;
        this.d = runnable2;
        this.f31037f = matrix;
        this.f31036e = bitmap;
    }
}
