package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class k11 {
    public final View f25613a;
    public final ArrayList f25614b;
    public final Runnable f25615c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f25616f;
    public float f25617g;

    public k11(View view, Runnable runnable) {
        this.f25617g = 1.0f;
        this.f25613a = view;
        this.f25614b = null;
        this.f25615c = null;
        this.d = runnable;
        this.e = null;
        this.f25616f = null;
    }

    public k11(ArrayList arrayList, gg.t tVar) {
        this.f25617g = 1.0f;
        this.f25613a = null;
        this.f25614b = arrayList;
        this.f25615c = null;
        this.d = tVar;
        this.e = null;
        this.f25616f = null;
    }

    public k11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f25617g = 1.0f;
        this.f25613a = null;
        this.f25614b = null;
        this.f25615c = runnable;
        this.d = runnable2;
        this.f25616f = matrix;
        this.e = bitmap;
    }
}
