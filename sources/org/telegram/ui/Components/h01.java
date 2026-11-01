package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class h01 {
    public final View f26619a;
    public final ArrayList f26620b;
    public final Runnable f26621c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f26622f;
    public float f26623g;

    public h01(View view, Runnable runnable) {
        this.f26623g = 1.0f;
        this.f26619a = view;
        this.f26620b = null;
        this.f26621c = null;
        this.d = runnable;
        this.e = null;
        this.f26622f = null;
    }

    public h01(ArrayList arrayList, a3.l0 l0Var) {
        this.f26623g = 1.0f;
        this.f26619a = null;
        this.f26620b = arrayList;
        this.f26621c = null;
        this.d = l0Var;
        this.e = null;
        this.f26622f = null;
    }

    public h01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f26623g = 1.0f;
        this.f26619a = null;
        this.f26620b = null;
        this.f26621c = runnable;
        this.d = runnable2;
        this.f26622f = matrix;
        this.e = bitmap;
    }
}
