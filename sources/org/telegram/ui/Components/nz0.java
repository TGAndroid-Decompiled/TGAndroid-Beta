package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class nz0 {
    public final View f38015a;
    public final ArrayList f38016b;
    public final Runnable f38017c;
    public Runnable d;
    public final Bitmap f38018e;
    public final Matrix f38019f;
    public float f38020g;

    public nz0(View view, Runnable runnable) {
        this.f38020g = 1.0f;
        this.f38015a = view;
        this.f38016b = null;
        this.f38017c = null;
        this.d = runnable;
        this.f38018e = null;
        this.f38019f = null;
    }

    public nz0(ArrayList arrayList, es0 es0Var) {
        this.f38020g = 1.0f;
        this.f38015a = null;
        this.f38016b = arrayList;
        this.f38017c = null;
        this.d = es0Var;
        this.f38018e = null;
        this.f38019f = null;
    }

    public nz0(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f38020g = 1.0f;
        this.f38015a = null;
        this.f38016b = null;
        this.f38017c = runnable;
        this.d = runnable2;
        this.f38019f = matrix;
        this.f38018e = bitmap;
    }
}
