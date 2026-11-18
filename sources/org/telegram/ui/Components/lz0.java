package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class lz0 {
    public final View f37272a;
    public final ArrayList f37273b;
    public final Runnable f37274c;
    public Runnable d;
    public final Bitmap f37275e;
    public final Matrix f37276f;
    public float f37277g;

    public lz0(View view, Runnable runnable) {
        this.f37277g = 1.0f;
        this.f37272a = view;
        this.f37273b = null;
        this.f37274c = null;
        this.d = runnable;
        this.f37275e = null;
        this.f37276f = null;
    }

    public lz0(ArrayList arrayList, sv0 sv0Var) {
        this.f37277g = 1.0f;
        this.f37272a = null;
        this.f37273b = arrayList;
        this.f37274c = null;
        this.d = sv0Var;
        this.f37275e = null;
        this.f37276f = null;
    }

    public lz0(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f37277g = 1.0f;
        this.f37272a = null;
        this.f37273b = null;
        this.f37274c = runnable;
        this.d = runnable2;
        this.f37276f = matrix;
        this.f37275e = bitmap;
    }
}
