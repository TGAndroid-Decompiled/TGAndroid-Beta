package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class d21 {
    public final View f25411a;
    public final ArrayList f25412b;
    public final Runnable f25413c;
    public Runnable d;
    public final Bitmap f25414e;
    public final Matrix f25415f;
    public float f25416g;

    public d21(View view, Runnable runnable) {
        this.f25416g = 1.0f;
        this.f25411a = view;
        this.f25412b = null;
        this.f25413c = null;
        this.d = runnable;
        this.f25414e = null;
        this.f25415f = null;
    }

    public d21(ArrayList arrayList, gg.t tVar) {
        this.f25416g = 1.0f;
        this.f25411a = null;
        this.f25412b = arrayList;
        this.f25413c = null;
        this.d = tVar;
        this.f25414e = null;
        this.f25415f = null;
    }

    public d21(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f25416g = 1.0f;
        this.f25411a = null;
        this.f25412b = null;
        this.f25413c = runnable;
        this.d = runnable2;
        this.f25415f = matrix;
        this.f25414e = bitmap;
    }
}
