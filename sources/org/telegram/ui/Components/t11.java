package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class t11 {
    public final View f30382a;
    public final ArrayList f30383b;
    public final Runnable f30384c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f30385f;
    public float f30386g;

    public t11(View view, Runnable runnable) {
        this.f30386g = 1.0f;
        this.f30382a = view;
        this.f30383b = null;
        this.f30384c = null;
        this.d = runnable;
        this.e = null;
        this.f30385f = null;
    }

    public t11(ArrayList arrayList, ig.e2 e2Var) {
        this.f30386g = 1.0f;
        this.f30382a = null;
        this.f30383b = arrayList;
        this.f30384c = null;
        this.d = e2Var;
        this.e = null;
        this.f30385f = null;
    }

    public t11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f30386g = 1.0f;
        this.f30382a = null;
        this.f30383b = null;
        this.f30384c = runnable;
        this.d = runnable2;
        this.f30385f = matrix;
        this.e = bitmap;
    }
}
