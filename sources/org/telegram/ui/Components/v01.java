package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class v01 {
    public final View f31032a;
    public final ArrayList f31033b;
    public final Runnable f31034c;
    public Runnable d;
    public final Bitmap f31035e;
    public final Matrix f31036f;
    public float f31037g;

    public v01(View view, Runnable runnable) {
        this.f31037g = 1.0f;
        this.f31032a = view;
        this.f31033b = null;
        this.f31034c = null;
        this.d = runnable;
        this.f31035e = null;
        this.f31036f = null;
    }

    public v01(ArrayList arrayList, hg.t tVar) {
        this.f31037g = 1.0f;
        this.f31032a = null;
        this.f31033b = arrayList;
        this.f31034c = null;
        this.d = tVar;
        this.f31035e = null;
        this.f31036f = null;
    }

    public v01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f31037g = 1.0f;
        this.f31032a = null;
        this.f31033b = null;
        this.f31034c = runnable;
        this.d = runnable2;
        this.f31036f = matrix;
        this.f31035e = bitmap;
    }
}
