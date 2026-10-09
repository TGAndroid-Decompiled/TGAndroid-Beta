package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class b21 {
    public final View f24853a;
    public final ArrayList f24854b;
    public final Runnable f24855c;
    public Runnable d;
    public final Bitmap f24856e;
    public final Matrix f24857f;
    public float f24858g;

    public b21(View view, Runnable runnable) {
        this.f24858g = 1.0f;
        this.f24853a = view;
        this.f24854b = null;
        this.f24855c = null;
        this.d = runnable;
        this.f24856e = null;
        this.f24857f = null;
    }

    public b21(ArrayList arrayList, gg.t tVar) {
        this.f24858g = 1.0f;
        this.f24853a = null;
        this.f24854b = arrayList;
        this.f24855c = null;
        this.d = tVar;
        this.f24856e = null;
        this.f24857f = null;
    }

    public b21(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f24858g = 1.0f;
        this.f24853a = null;
        this.f24854b = null;
        this.f24855c = runnable;
        this.d = runnable2;
        this.f24857f = matrix;
        this.f24856e = bitmap;
    }
}
