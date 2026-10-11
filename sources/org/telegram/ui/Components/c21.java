package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class c21 {
    public final View f25175a;
    public final ArrayList f25176b;
    public final Runnable f25177c;
    public Runnable d;
    public final Bitmap f25178e;
    public final Matrix f25179f;
    public float f25180g;

    public c21(View view, Runnable runnable) {
        this.f25180g = 1.0f;
        this.f25175a = view;
        this.f25176b = null;
        this.f25177c = null;
        this.d = runnable;
        this.f25178e = null;
        this.f25179f = null;
    }

    public c21(ArrayList arrayList, gg.t tVar) {
        this.f25180g = 1.0f;
        this.f25175a = null;
        this.f25176b = arrayList;
        this.f25177c = null;
        this.d = tVar;
        this.f25178e = null;
        this.f25179f = null;
    }

    public c21(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f25180g = 1.0f;
        this.f25175a = null;
        this.f25176b = null;
        this.f25177c = runnable;
        this.d = runnable2;
        this.f25179f = matrix;
        this.f25178e = bitmap;
    }
}
