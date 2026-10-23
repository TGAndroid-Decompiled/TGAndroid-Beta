package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class u11 {
    public final View f30818a;
    public final ArrayList f30819b;
    public final Runnable f30820c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f30821f;
    public float f30822g;

    public u11(View view, Runnable runnable) {
        this.f30822g = 1.0f;
        this.f30818a = view;
        this.f30819b = null;
        this.f30820c = null;
        this.d = runnable;
        this.e = null;
        this.f30821f = null;
    }

    public u11(ArrayList arrayList, ig.e2 e2Var) {
        this.f30822g = 1.0f;
        this.f30818a = null;
        this.f30819b = arrayList;
        this.f30820c = null;
        this.d = e2Var;
        this.e = null;
        this.f30821f = null;
    }

    public u11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f30822g = 1.0f;
        this.f30818a = null;
        this.f30819b = null;
        this.f30820c = runnable;
        this.d = runnable2;
        this.f30821f = matrix;
        this.e = bitmap;
    }
}
