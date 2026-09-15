package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class w01 {
    public final View f29508a;
    public final ArrayList f29509b;
    public final Runnable f29510c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f29511f;
    public float f29512g;

    public w01(View view, Runnable runnable) {
        this.f29512g = 1.0f;
        this.f29508a = view;
        this.f29509b = null;
        this.f29510c = null;
        this.d = runnable;
        this.e = null;
        this.f29511f = null;
    }

    public w01(ArrayList arrayList, gg.t tVar) {
        this.f29512g = 1.0f;
        this.f29508a = null;
        this.f29509b = arrayList;
        this.f29510c = null;
        this.d = tVar;
        this.e = null;
        this.f29511f = null;
    }

    public w01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f29512g = 1.0f;
        this.f29508a = null;
        this.f29509b = null;
        this.f29510c = runnable;
        this.d = runnable2;
        this.f29511f = matrix;
        this.e = bitmap;
    }
}
