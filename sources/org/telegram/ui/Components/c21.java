package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class c21 {
    public final View f25137a;
    public final ArrayList f25138b;
    public final Runnable f25139c;
    public Runnable d;
    public final Bitmap f25140e;
    public final Matrix f25141f;
    public float f25142g;

    public c21(View view, Runnable runnable) {
        this.f25142g = 1.0f;
        this.f25137a = view;
        this.f25138b = null;
        this.f25139c = null;
        this.d = runnable;
        this.f25140e = null;
        this.f25141f = null;
    }

    public c21(ArrayList arrayList, gg.t tVar) {
        this.f25142g = 1.0f;
        this.f25137a = null;
        this.f25138b = arrayList;
        this.f25139c = null;
        this.d = tVar;
        this.f25140e = null;
        this.f25141f = null;
    }

    public c21(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f25142g = 1.0f;
        this.f25137a = null;
        this.f25138b = null;
        this.f25139c = runnable;
        this.d = runnable2;
        this.f25141f = matrix;
        this.f25140e = bitmap;
    }
}
