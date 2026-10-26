package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class f21 {
    public final View f28043a;
    public final ArrayList f28044b;
    public final Runnable f28045c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f28046f;
    public float f28047g;

    public f21(View view, Runnable runnable) {
        this.f28047g = 1.0f;
        this.f28043a = view;
        this.f28044b = null;
        this.f28045c = null;
        this.d = runnable;
        this.e = null;
        this.f28046f = null;
    }

    public f21(ArrayList arrayList, jg.f1 f1Var) {
        this.f28047g = 1.0f;
        this.f28043a = null;
        this.f28044b = arrayList;
        this.f28045c = null;
        this.d = f1Var;
        this.e = null;
        this.f28046f = null;
    }

    public f21(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f28047g = 1.0f;
        this.f28043a = null;
        this.f28044b = null;
        this.f28045c = runnable;
        this.d = runnable2;
        this.f28046f = matrix;
        this.e = bitmap;
    }
}
