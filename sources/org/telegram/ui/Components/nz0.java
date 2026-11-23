package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class nz0 {
    public final View f37986a;
    public final ArrayList f37987b;
    public final Runnable f37988c;
    public Runnable d;
    public final Bitmap f37989e;
    public final Matrix f37990f;
    public float f37991g;

    public nz0(View view, Runnable runnable) {
        this.f37991g = 1.0f;
        this.f37986a = view;
        this.f37987b = null;
        this.f37988c = null;
        this.d = runnable;
        this.f37989e = null;
        this.f37990f = null;
    }

    public nz0(ArrayList arrayList, es0 es0Var) {
        this.f37991g = 1.0f;
        this.f37986a = null;
        this.f37987b = arrayList;
        this.f37988c = null;
        this.d = es0Var;
        this.f37989e = null;
        this.f37990f = null;
    }

    public nz0(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f37991g = 1.0f;
        this.f37986a = null;
        this.f37987b = null;
        this.f37988c = runnable;
        this.d = runnable2;
        this.f37990f = matrix;
        this.f37989e = bitmap;
    }
}
