package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class l11 {
    public final View f25987a;
    public final ArrayList f25988b;
    public final Runnable f25989c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f25990f;
    public float f25991g;

    public l11(View view, Runnable runnable) {
        this.f25991g = 1.0f;
        this.f25987a = view;
        this.f25988b = null;
        this.f25989c = null;
        this.d = runnable;
        this.e = null;
        this.f25990f = null;
    }

    public l11(ArrayList arrayList, gg.t tVar) {
        this.f25991g = 1.0f;
        this.f25987a = null;
        this.f25988b = arrayList;
        this.f25989c = null;
        this.d = tVar;
        this.e = null;
        this.f25990f = null;
    }

    public l11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f25991g = 1.0f;
        this.f25987a = null;
        this.f25988b = null;
        this.f25989c = runnable;
        this.d = runnable2;
        this.f25990f = matrix;
        this.e = bitmap;
    }
}
