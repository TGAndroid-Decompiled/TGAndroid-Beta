package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class u11 {
    public final View f31239a;
    public final ArrayList f31240b;
    public final Runnable f31241c;
    public Runnable d;
    public final Bitmap f31242e;
    public final Matrix f31243f;
    public float f31244g;

    public u11(View view, Runnable runnable) {
        this.f31244g = 1.0f;
        this.f31239a = view;
        this.f31240b = null;
        this.f31241c = null;
        this.d = runnable;
        this.f31242e = null;
        this.f31243f = null;
    }

    public u11(ArrayList arrayList, gg.t tVar) {
        this.f31244g = 1.0f;
        this.f31239a = null;
        this.f31240b = arrayList;
        this.f31241c = null;
        this.d = tVar;
        this.f31242e = null;
        this.f31243f = null;
    }

    public u11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f31244g = 1.0f;
        this.f31239a = null;
        this.f31240b = null;
        this.f31241c = runnable;
        this.d = runnable2;
        this.f31243f = matrix;
        this.f31242e = bitmap;
    }
}
