package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class l11 {
    public final View f25907a;
    public final ArrayList f25908b;
    public final Runnable f25909c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f25910f;
    public float f25911g;

    public l11(View view, Runnable runnable) {
        this.f25911g = 1.0f;
        this.f25907a = view;
        this.f25908b = null;
        this.f25909c = null;
        this.d = runnable;
        this.e = null;
        this.f25910f = null;
    }

    public l11(ArrayList arrayList, gg.t tVar) {
        this.f25911g = 1.0f;
        this.f25907a = null;
        this.f25908b = arrayList;
        this.f25909c = null;
        this.d = tVar;
        this.e = null;
        this.f25910f = null;
    }

    public l11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f25911g = 1.0f;
        this.f25907a = null;
        this.f25908b = null;
        this.f25909c = runnable;
        this.d = runnable2;
        this.f25910f = matrix;
        this.e = bitmap;
    }
}
