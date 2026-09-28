package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class l11 {
    public final View f25885a;
    public final ArrayList f25886b;
    public final Runnable f25887c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f25888f;
    public float f25889g;

    public l11(View view, Runnable runnable) {
        this.f25889g = 1.0f;
        this.f25885a = view;
        this.f25886b = null;
        this.f25887c = null;
        this.d = runnable;
        this.e = null;
        this.f25888f = null;
    }

    public l11(ArrayList arrayList, gg.t tVar) {
        this.f25889g = 1.0f;
        this.f25885a = null;
        this.f25886b = arrayList;
        this.f25887c = null;
        this.d = tVar;
        this.e = null;
        this.f25888f = null;
    }

    public l11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f25889g = 1.0f;
        this.f25885a = null;
        this.f25886b = null;
        this.f25887c = runnable;
        this.d = runnable2;
        this.f25888f = matrix;
        this.e = bitmap;
    }
}
