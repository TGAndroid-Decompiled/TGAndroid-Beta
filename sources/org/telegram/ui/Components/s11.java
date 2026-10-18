package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class s11 {
    public final View f30148a;
    public final ArrayList f30149b;
    public final Runnable f30150c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f30151f;
    public float f30152g;

    public s11(View view, Runnable runnable) {
        this.f30152g = 1.0f;
        this.f30148a = view;
        this.f30149b = null;
        this.f30150c = null;
        this.d = runnable;
        this.e = null;
        this.f30151f = null;
    }

    public s11(ArrayList arrayList, ig.e2 e2Var) {
        this.f30152g = 1.0f;
        this.f30148a = null;
        this.f30149b = arrayList;
        this.f30150c = null;
        this.d = e2Var;
        this.e = null;
        this.f30151f = null;
    }

    public s11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f30152g = 1.0f;
        this.f30148a = null;
        this.f30149b = null;
        this.f30150c = runnable;
        this.d = runnable2;
        this.f30151f = matrix;
        this.e = bitmap;
    }
}
