package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class h21 {
    public final View f26619a;
    public final ArrayList f26620b;
    public final Runnable f26621c;
    public Runnable d;
    public final Bitmap f26622e;
    public final Matrix f26623f;
    public float f26624g;

    public h21(View view, Runnable runnable) {
        this.f26624g = 1.0f;
        this.f26619a = view;
        this.f26620b = null;
        this.f26621c = null;
        this.d = runnable;
        this.f26622e = null;
        this.f26623f = null;
    }

    public h21(ArrayList arrayList, gg.t tVar) {
        this.f26624g = 1.0f;
        this.f26619a = null;
        this.f26620b = arrayList;
        this.f26621c = null;
        this.d = tVar;
        this.f26622e = null;
        this.f26623f = null;
    }

    public h21(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f26624g = 1.0f;
        this.f26619a = null;
        this.f26620b = null;
        this.f26621c = runnable;
        this.d = runnable2;
        this.f26623f = matrix;
        this.f26622e = bitmap;
    }
}
