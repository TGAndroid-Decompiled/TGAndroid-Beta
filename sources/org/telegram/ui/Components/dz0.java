package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class dz0 {
    public final View f33230a;
    public final ArrayList f33231b;
    public final Runnable f33232c;
    public Runnable d;
    public final Bitmap f33233e;
    public final Matrix f33234f;
    public float f33235g;

    public dz0(View view, Runnable runnable) {
        this.f33235g = 1.0f;
        this.f33230a = view;
        this.f33231b = null;
        this.f33232c = null;
        this.d = runnable;
        this.f33233e = null;
        this.f33234f = null;
    }

    public dz0(ArrayList arrayList, l2.z0 z0Var) {
        this.f33235g = 1.0f;
        this.f33230a = null;
        this.f33231b = arrayList;
        this.f33232c = null;
        this.d = z0Var;
        this.f33233e = null;
        this.f33234f = null;
    }

    public dz0(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f33235g = 1.0f;
        this.f33230a = null;
        this.f33231b = null;
        this.f33232c = runnable;
        this.d = runnable2;
        this.f33234f = matrix;
        this.f33233e = bitmap;
    }
}
