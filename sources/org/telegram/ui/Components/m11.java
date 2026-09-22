package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class m11 {
    public final View f26278a;
    public final ArrayList f26279b;
    public final Runnable f26280c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f26281f;
    public float f26282g;

    public m11(View view, Runnable runnable) {
        this.f26282g = 1.0f;
        this.f26278a = view;
        this.f26279b = null;
        this.f26280c = null;
        this.d = runnable;
        this.e = null;
        this.f26281f = null;
    }

    public m11(ArrayList arrayList, gg.t tVar) {
        this.f26282g = 1.0f;
        this.f26278a = null;
        this.f26279b = arrayList;
        this.f26280c = null;
        this.d = tVar;
        this.e = null;
        this.f26281f = null;
    }

    public m11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f26282g = 1.0f;
        this.f26278a = null;
        this.f26279b = null;
        this.f26280c = runnable;
        this.d = runnable2;
        this.f26281f = matrix;
        this.e = bitmap;
    }
}
