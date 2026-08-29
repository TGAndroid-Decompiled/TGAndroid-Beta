package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class o01 {
    public final View f31216a;
    public final ArrayList f31217b;
    public final Runnable f31218c;
    public Runnable d;
    public final Bitmap f31219e;
    public final Matrix f31220f;
    public float f31221g;

    public o01(View view, Runnable runnable) {
        this.f31221g = 1.0f;
        this.f31216a = view;
        this.f31217b = null;
        this.f31218c = null;
        this.d = runnable;
        this.f31219e = null;
        this.f31220f = null;
    }

    public o01(ArrayList arrayList, sf.a aVar) {
        this.f31221g = 1.0f;
        this.f31216a = null;
        this.f31217b = arrayList;
        this.f31218c = null;
        this.d = aVar;
        this.f31219e = null;
        this.f31220f = null;
    }

    public o01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f31221g = 1.0f;
        this.f31216a = null;
        this.f31217b = null;
        this.f31218c = runnable;
        this.d = runnable2;
        this.f31220f = matrix;
        this.f31219e = bitmap;
    }
}
