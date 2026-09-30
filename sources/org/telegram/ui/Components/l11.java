package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class l11 {
    public final View f25872a;
    public final ArrayList f25873b;
    public final Runnable f25874c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f25875f;
    public float f25876g;

    public l11(View view, Runnable runnable) {
        this.f25876g = 1.0f;
        this.f25872a = view;
        this.f25873b = null;
        this.f25874c = null;
        this.d = runnable;
        this.e = null;
        this.f25875f = null;
    }

    public l11(ArrayList arrayList, gg.t tVar) {
        this.f25876g = 1.0f;
        this.f25872a = null;
        this.f25873b = arrayList;
        this.f25874c = null;
        this.d = tVar;
        this.e = null;
        this.f25875f = null;
    }

    public l11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f25876g = 1.0f;
        this.f25872a = null;
        this.f25873b = null;
        this.f25874c = runnable;
        this.d = runnable2;
        this.f25875f = matrix;
        this.e = bitmap;
    }
}
