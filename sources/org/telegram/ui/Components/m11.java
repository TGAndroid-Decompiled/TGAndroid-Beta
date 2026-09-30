package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class m11 {
    public final View f26171a;
    public final ArrayList f26172b;
    public final Runnable f26173c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f26174f;
    public float f26175g;

    public m11(View view, Runnable runnable) {
        this.f26175g = 1.0f;
        this.f26171a = view;
        this.f26172b = null;
        this.f26173c = null;
        this.d = runnable;
        this.e = null;
        this.f26174f = null;
    }

    public m11(ArrayList arrayList, gg.t tVar) {
        this.f26175g = 1.0f;
        this.f26171a = null;
        this.f26172b = arrayList;
        this.f26173c = null;
        this.d = tVar;
        this.e = null;
        this.f26174f = null;
    }

    public m11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f26175g = 1.0f;
        this.f26171a = null;
        this.f26172b = null;
        this.f26173c = runnable;
        this.d = runnable2;
        this.f26174f = matrix;
        this.e = bitmap;
    }
}
