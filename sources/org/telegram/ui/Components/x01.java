package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class x01 {
    public final View f29799a;
    public final ArrayList f29800b;
    public final Runnable f29801c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f29802f;
    public float f29803g;

    public x01(View view, Runnable runnable) {
        this.f29803g = 1.0f;
        this.f29799a = view;
        this.f29800b = null;
        this.f29801c = null;
        this.d = runnable;
        this.e = null;
        this.f29802f = null;
    }

    public x01(ArrayList arrayList, gg.t tVar) {
        this.f29803g = 1.0f;
        this.f29799a = null;
        this.f29800b = arrayList;
        this.f29801c = null;
        this.d = tVar;
        this.e = null;
        this.f29802f = null;
    }

    public x01(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f29803g = 1.0f;
        this.f29799a = null;
        this.f29800b = null;
        this.f29801c = runnable;
        this.d = runnable2;
        this.f29802f = matrix;
        this.e = bitmap;
    }
}
