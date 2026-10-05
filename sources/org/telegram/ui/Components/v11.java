package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class v11 {
    public final View f31600a;
    public final ArrayList f31601b;
    public final Runnable f31602c;
    public Runnable d;
    public final Bitmap f31603e;
    public final Matrix f31604f;
    public float f31605g;

    public v11(View view, Runnable runnable) {
        this.f31605g = 1.0f;
        this.f31600a = view;
        this.f31601b = null;
        this.f31602c = null;
        this.d = runnable;
        this.f31603e = null;
        this.f31604f = null;
    }

    public v11(ArrayList arrayList, gg.t tVar) {
        this.f31605g = 1.0f;
        this.f31600a = null;
        this.f31601b = arrayList;
        this.f31602c = null;
        this.d = tVar;
        this.f31603e = null;
        this.f31604f = null;
    }

    public v11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f31605g = 1.0f;
        this.f31600a = null;
        this.f31601b = null;
        this.f31602c = runnable;
        this.d = runnable2;
        this.f31604f = matrix;
        this.f31603e = bitmap;
    }
}
