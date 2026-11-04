package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
public final class bz0 {
    public final View f32478a;
    public final ArrayList f32479b;
    public final Runnable f32480c;
    public Runnable d;
    public final Bitmap f32481e;
    public final Matrix f32482f;
    public float f32483g;

    public bz0(View view, Runnable runnable) {
        this.f32483g = 1.0f;
        this.f32478a = view;
        this.f32479b = null;
        this.f32480c = null;
        this.d = runnable;
        this.f32481e = null;
        this.f32482f = null;
    }

    public bz0(ArrayList arrayList, lg.y yVar) {
        this.f32483g = 1.0f;
        this.f32478a = null;
        this.f32479b = arrayList;
        this.f32480c = null;
        this.d = yVar;
        this.f32481e = null;
        this.f32482f = null;
    }

    public bz0(Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.f32483g = 1.0f;
        this.f32478a = null;
        this.f32479b = null;
        this.f32480c = runnable;
        this.d = runnable2;
        this.f32482f = matrix;
        this.f32481e = bitmap;
    }
}
