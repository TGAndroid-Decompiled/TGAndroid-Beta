package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class t11 {
    public final View f30384a;
    public final ArrayList f30385b;
    public final Runnable f30386c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f30387f;
    public float f30388g;

    public t11(View view, Runnable runnable) {
        this.f30388g = 1.0f;
        this.f30384a = view;
        this.f30385b = null;
        this.f30386c = null;
        this.d = runnable;
        this.e = null;
        this.f30387f = null;
    }

    public t11(ArrayList arrayList, ig.e2 e2Var) {
        this.f30388g = 1.0f;
        this.f30384a = null;
        this.f30385b = arrayList;
        this.f30386c = null;
        this.d = e2Var;
        this.e = null;
        this.f30387f = null;
    }

    public t11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f30388g = 1.0f;
        this.f30384a = null;
        this.f30385b = null;
        this.f30386c = runnable;
        this.d = runnable2;
        this.f30387f = matrix;
        this.e = bitmap;
    }
}
