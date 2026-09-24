package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class j11 {
    public final View f25214a;
    public final ArrayList f25215b;
    public final Runnable f25216c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f25217f;
    public float f25218g;

    public j11(View view, Runnable runnable) {
        this.f25218g = 1.0f;
        this.f25214a = view;
        this.f25215b = null;
        this.f25216c = null;
        this.d = runnable;
        this.e = null;
        this.f25217f = null;
    }

    public j11(ArrayList arrayList, gg.t tVar) {
        this.f25218g = 1.0f;
        this.f25214a = null;
        this.f25215b = arrayList;
        this.f25216c = null;
        this.d = tVar;
        this.e = null;
        this.f25217f = null;
    }

    public j11(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f25218g = 1.0f;
        this.f25214a = null;
        this.f25215b = null;
        this.f25216c = runnable;
        this.d = runnable2;
        this.f25217f = matrix;
        this.e = bitmap;
    }
}
