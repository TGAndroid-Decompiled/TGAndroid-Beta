package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class v01 {
    public final View f28610a;
    public final ArrayList f28611b;
    public final Runnable f28612c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f28613f;
    public float f28614g;

    public v01(View view, Runnable runnable) {
        this.f28614g = 1.0f;
        this.f28610a = view;
        this.f28611b = null;
        this.f28612c = null;
        this.d = runnable;
        this.e = null;
        this.f28613f = null;
    }

    public v01(ArrayList arrayList, gg.t tVar) {
        this.f28614g = 1.0f;
        this.f28610a = null;
        this.f28611b = arrayList;
        this.f28612c = null;
        this.d = tVar;
        this.e = null;
        this.f28613f = null;
    }

    public v01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f28614g = 1.0f;
        this.f28610a = null;
        this.f28611b = null;
        this.f28612c = runnable;
        this.d = runnable2;
        this.f28613f = matrix;
        this.e = bitmap;
    }
}
