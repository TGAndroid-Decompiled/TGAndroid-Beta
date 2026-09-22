package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class w01 {
    public final View f29505a;
    public final ArrayList f29506b;
    public final Runnable f29507c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f29508f;
    public float f29509g;

    public w01(View view, Runnable runnable) {
        this.f29509g = 1.0f;
        this.f29505a = view;
        this.f29506b = null;
        this.f29507c = null;
        this.d = runnable;
        this.e = null;
        this.f29508f = null;
    }

    public w01(ArrayList arrayList, gg.t tVar) {
        this.f29509g = 1.0f;
        this.f29505a = null;
        this.f29506b = arrayList;
        this.f29507c = null;
        this.d = tVar;
        this.e = null;
        this.f29508f = null;
    }

    public w01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f29509g = 1.0f;
        this.f29505a = null;
        this.f29506b = null;
        this.f29507c = runnable;
        this.d = runnable2;
        this.f29508f = matrix;
        this.e = bitmap;
    }
}
