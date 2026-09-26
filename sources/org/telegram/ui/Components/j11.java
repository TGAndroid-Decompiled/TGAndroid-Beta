package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class j11 {
    public final View f25239a;
    public final ArrayList f25240b;
    public final Runnable f25241c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f25242f;
    public float f25243g;

    public j11(View view, Runnable runnable) {
        this.f25243g = 1.0f;
        this.f25239a = view;
        this.f25240b = null;
        this.f25241c = null;
        this.d = runnable;
        this.e = null;
        this.f25242f = null;
    }

    public j11(ArrayList arrayList, gg.t tVar) {
        this.f25243g = 1.0f;
        this.f25239a = null;
        this.f25240b = arrayList;
        this.f25241c = null;
        this.d = tVar;
        this.e = null;
        this.f25242f = null;
    }

    public j11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f25243g = 1.0f;
        this.f25239a = null;
        this.f25240b = null;
        this.f25241c = runnable;
        this.d = runnable2;
        this.f25242f = matrix;
        this.e = bitmap;
    }
}
