package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class k11 {
    public final View f25596a;
    public final ArrayList f25597b;
    public final Runnable f25598c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f25599f;
    public float f25600g;

    public k11(View view, Runnable runnable) {
        this.f25600g = 1.0f;
        this.f25596a = view;
        this.f25597b = null;
        this.f25598c = null;
        this.d = runnable;
        this.e = null;
        this.f25599f = null;
    }

    public k11(ArrayList arrayList, gg.t tVar) {
        this.f25600g = 1.0f;
        this.f25596a = null;
        this.f25597b = arrayList;
        this.f25598c = null;
        this.d = tVar;
        this.e = null;
        this.f25599f = null;
    }

    public k11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f25600g = 1.0f;
        this.f25596a = null;
        this.f25597b = null;
        this.f25598c = runnable;
        this.d = runnable2;
        this.f25599f = matrix;
        this.e = bitmap;
    }
}
