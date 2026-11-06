package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class cz0 {
    public final View f32730a;
    public final ArrayList f32731b;
    public final Runnable f32732c;
    public Runnable d;
    public final Bitmap f32733e;
    public final Matrix f32734f;
    public float f32735g;

    public cz0(View view, Runnable runnable) {
        this.f32735g = 1.0f;
        this.f32730a = view;
        this.f32731b = null;
        this.f32732c = null;
        this.d = runnable;
        this.f32733e = null;
        this.f32734f = null;
    }

    public cz0(ArrayList arrayList, l2.z0 z0Var) {
        this.f32735g = 1.0f;
        this.f32730a = null;
        this.f32731b = arrayList;
        this.f32732c = null;
        this.d = z0Var;
        this.f32733e = null;
        this.f32734f = null;
    }

    public cz0(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f32735g = 1.0f;
        this.f32730a = null;
        this.f32731b = null;
        this.f32732c = runnable;
        this.d = runnable2;
        this.f32734f = matrix;
        this.f32733e = bitmap;
    }
}
