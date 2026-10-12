package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class h21 {
    public final View f26615a;
    public final ArrayList f26616b;
    public final Runnable f26617c;
    public Runnable d;
    public final Bitmap f26618e;
    public final Matrix f26619f;
    public float f26620g;

    public h21(View view, Runnable runnable) {
        this.f26620g = 1.0f;
        this.f26615a = view;
        this.f26616b = null;
        this.f26617c = null;
        this.d = runnable;
        this.f26618e = null;
        this.f26619f = null;
    }

    public h21(ArrayList arrayList, gg.t tVar) {
        this.f26620g = 1.0f;
        this.f26615a = null;
        this.f26616b = arrayList;
        this.f26617c = null;
        this.d = tVar;
        this.f26618e = null;
        this.f26619f = null;
    }

    public h21(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f26620g = 1.0f;
        this.f26615a = null;
        this.f26616b = null;
        this.f26617c = runnable;
        this.d = runnable2;
        this.f26619f = matrix;
        this.f26618e = bitmap;
    }
}
