package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class v01 {
    public final View f31059a;
    public final ArrayList f31060b;
    public final Runnable f31061c;
    public Runnable d;
    public final Bitmap f31062e;
    public final Matrix f31063f;
    public float f31064g;

    public v01(View view, Runnable runnable) {
        this.f31064g = 1.0f;
        this.f31059a = view;
        this.f31060b = null;
        this.f31061c = null;
        this.d = runnable;
        this.f31062e = null;
        this.f31063f = null;
    }

    public v01(ArrayList arrayList, hg.t tVar) {
        this.f31064g = 1.0f;
        this.f31059a = null;
        this.f31060b = arrayList;
        this.f31061c = null;
        this.d = tVar;
        this.f31062e = null;
        this.f31063f = null;
    }

    public v01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f31064g = 1.0f;
        this.f31059a = null;
        this.f31060b = null;
        this.f31061c = runnable;
        this.d = runnable2;
        this.f31063f = matrix;
        this.f31062e = bitmap;
    }
}
