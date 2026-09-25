package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class j11 {
    public final View f25240a;
    public final ArrayList f25241b;
    public final Runnable f25242c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f25243f;
    public float f25244g;

    public j11(View view, Runnable runnable) {
        this.f25244g = 1.0f;
        this.f25240a = view;
        this.f25241b = null;
        this.f25242c = null;
        this.d = runnable;
        this.e = null;
        this.f25243f = null;
    }

    public j11(ArrayList arrayList, gg.t tVar) {
        this.f25244g = 1.0f;
        this.f25240a = null;
        this.f25241b = arrayList;
        this.f25242c = null;
        this.d = tVar;
        this.e = null;
        this.f25243f = null;
    }

    public j11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f25244g = 1.0f;
        this.f25240a = null;
        this.f25241b = null;
        this.f25242c = runnable;
        this.d = runnable2;
        this.f25243f = matrix;
        this.e = bitmap;
    }
}
