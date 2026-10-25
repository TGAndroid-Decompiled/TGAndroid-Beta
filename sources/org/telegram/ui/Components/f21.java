package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class f21 {
    public final View f28041a;
    public final ArrayList f28042b;
    public final Runnable f28043c;
    public Runnable d;
    public final Bitmap e;
    public final Matrix f28044f;
    public float f28045g;

    public f21(View view, Runnable runnable) {
        this.f28045g = 1.0f;
        this.f28041a = view;
        this.f28042b = null;
        this.f28043c = null;
        this.d = runnable;
        this.e = null;
        this.f28044f = null;
    }

    public f21(ArrayList arrayList, jg.f1 f1Var) {
        this.f28045g = 1.0f;
        this.f28041a = null;
        this.f28042b = arrayList;
        this.f28043c = null;
        this.d = f1Var;
        this.e = null;
        this.f28044f = null;
    }

    public f21(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f28045g = 1.0f;
        this.f28041a = null;
        this.f28042b = null;
        this.f28043c = runnable;
        this.d = runnable2;
        this.f28044f = matrix;
        this.e = bitmap;
    }
}
