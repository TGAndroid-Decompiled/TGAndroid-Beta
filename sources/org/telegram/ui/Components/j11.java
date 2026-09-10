package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class j11 {
    public final View f24185a;
    public final ArrayList f24186b;
    public final Runnable f24187c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f24188f;
    public float f24189g;

    public j11(View view, Runnable runnable) {
        this.f24189g = 1.0f;
        this.f24185a = view;
        this.f24186b = null;
        this.f24187c = null;
        this.d = runnable;
        this.e = null;
        this.f24188f = null;
    }

    public j11(ArrayList arrayList, gg.a0 a0Var) {
        this.f24189g = 1.0f;
        this.f24185a = null;
        this.f24186b = arrayList;
        this.f24187c = null;
        this.d = a0Var;
        this.e = null;
        this.f24188f = null;
    }

    public j11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f24189g = 1.0f;
        this.f24185a = null;
        this.f24186b = null;
        this.f24187c = runnable;
        this.d = runnable2;
        this.f24188f = matrix;
        this.e = bitmap;
    }
}
