package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

public final class e01 {

    public final View f27913a;

    public final ArrayList f27914b;

    public final Runnable f27915c;
    public Runnable d;

    public final Bitmap f27916e;

    public final Matrix f27917f;

    public float f27918g;

    public e01(View view, Runnable runnable) {
        this.f27918g = 1.0f;
        this.f27913a = view;
        this.f27914b = null;
        this.f27915c = null;
        this.d = runnable;
        this.f27916e = null;
        this.f27917f = null;
    }

    public e01(ArrayList arrayList, qf.a aVar) {
        this.f27918g = 1.0f;
        this.f27913a = null;
        this.f27914b = arrayList;
        this.f27915c = null;
        this.d = aVar;
        this.f27916e = null;
        this.f27917f = null;
    }

    public e01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f27918g = 1.0f;
        this.f27913a = null;
        this.f27914b = null;
        this.f27915c = runnable;
        this.d = runnable2;
        this.f27917f = matrix;
        this.f27916e = bitmap;
    }
}
