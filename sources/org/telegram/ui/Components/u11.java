package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class u11 {
    public final View f30817a;
    public final ArrayList f30818b;
    public final Runnable f30819c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f30820f;
    public float f30821g;

    public u11(View view, Runnable runnable) {
        this.f30821g = 1.0f;
        this.f30817a = view;
        this.f30818b = null;
        this.f30819c = null;
        this.d = runnable;
        this.e = null;
        this.f30820f = null;
    }

    public u11(ArrayList arrayList, ig.e2 e2Var) {
        this.f30821g = 1.0f;
        this.f30817a = null;
        this.f30818b = arrayList;
        this.f30819c = null;
        this.d = e2Var;
        this.e = null;
        this.f30820f = null;
    }

    public u11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f30821g = 1.0f;
        this.f30817a = null;
        this.f30818b = null;
        this.f30819c = runnable;
        this.d = runnable2;
        this.f30820f = matrix;
        this.e = bitmap;
    }
}
