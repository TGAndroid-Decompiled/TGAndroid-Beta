package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class u11 {
    public final View f31238a;
    public final ArrayList f31239b;
    public final Runnable f31240c;
    public Runnable d;
    public final Bitmap f31241e;
    public final Matrix f31242f;
    public float f31243g;

    public u11(View view, Runnable runnable) {
        this.f31243g = 1.0f;
        this.f31238a = view;
        this.f31239b = null;
        this.f31240c = null;
        this.d = runnable;
        this.f31241e = null;
        this.f31242f = null;
    }

    public u11(ArrayList arrayList, gg.t tVar) {
        this.f31243g = 1.0f;
        this.f31238a = null;
        this.f31239b = arrayList;
        this.f31240c = null;
        this.d = tVar;
        this.f31241e = null;
        this.f31242f = null;
    }

    public u11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f31243g = 1.0f;
        this.f31238a = null;
        this.f31239b = null;
        this.f31240c = runnable;
        this.d = runnable2;
        this.f31242f = matrix;
        this.f31241e = bitmap;
    }
}
