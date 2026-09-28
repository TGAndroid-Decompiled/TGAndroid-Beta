package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class l11 {
    public final View f25884a;
    public final ArrayList f25885b;
    public final Runnable f25886c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f25887f;
    public float f25888g;

    public l11(View view, Runnable runnable) {
        this.f25888g = 1.0f;
        this.f25884a = view;
        this.f25885b = null;
        this.f25886c = null;
        this.d = runnable;
        this.e = null;
        this.f25887f = null;
    }

    public l11(ArrayList arrayList, gg.t tVar) {
        this.f25888g = 1.0f;
        this.f25884a = null;
        this.f25885b = arrayList;
        this.f25886c = null;
        this.d = tVar;
        this.e = null;
        this.f25887f = null;
    }

    public l11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f25888g = 1.0f;
        this.f25884a = null;
        this.f25885b = null;
        this.f25886c = runnable;
        this.d = runnable2;
        this.f25887f = matrix;
        this.e = bitmap;
    }
}
