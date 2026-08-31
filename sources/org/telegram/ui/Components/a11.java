package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class a11 {
    public final View f25113a;
    public final ArrayList f25114b;
    public final Runnable f25115c;
    public Runnable d;
    public final Bitmap f25116e;
    public final Matrix f25117f;
    public float f25118g;

    public a11(View view, Runnable runnable) {
        this.f25118g = 1.0f;
        this.f25113a = view;
        this.f25114b = null;
        this.f25115c = null;
        this.d = runnable;
        this.f25116e = null;
        this.f25117f = null;
    }

    public a11(ArrayList arrayList, uf.h1 h1Var) {
        this.f25118g = 1.0f;
        this.f25113a = null;
        this.f25114b = arrayList;
        this.f25115c = null;
        this.d = h1Var;
        this.f25116e = null;
        this.f25117f = null;
    }

    public a11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f25118g = 1.0f;
        this.f25113a = null;
        this.f25114b = null;
        this.f25115c = runnable;
        this.d = runnable2;
        this.f25117f = matrix;
        this.f25116e = bitmap;
    }
}
