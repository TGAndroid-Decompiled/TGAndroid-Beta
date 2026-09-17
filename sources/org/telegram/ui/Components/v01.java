package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class v01 {
    public final View f31060a;
    public final ArrayList f31061b;
    public final Runnable f31062c;
    public Runnable d;
    public final Bitmap f31063e;
    public final Matrix f31064f;
    public float f31065g;

    public v01(View view, Runnable runnable) {
        this.f31065g = 1.0f;
        this.f31060a = view;
        this.f31061b = null;
        this.f31062c = null;
        this.d = runnable;
        this.f31063e = null;
        this.f31064f = null;
    }

    public v01(ArrayList arrayList, hg.t tVar) {
        this.f31065g = 1.0f;
        this.f31060a = null;
        this.f31061b = arrayList;
        this.f31062c = null;
        this.d = tVar;
        this.f31063e = null;
        this.f31064f = null;
    }

    public v01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f31065g = 1.0f;
        this.f31060a = null;
        this.f31061b = null;
        this.f31062c = runnable;
        this.d = runnable2;
        this.f31064f = matrix;
        this.f31063e = bitmap;
    }
}
