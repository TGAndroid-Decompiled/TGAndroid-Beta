package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ii implements z4.e {
    public final AtomicBoolean f38686a;
    public final LinearLayout f38687b;
    public final int f38688c;
    public final HorizontalScrollView d;
    public final SparseIntArray f38689e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38690f;
    public final int[] f38691g;

    public ii(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f38686a = atomicBoolean;
        this.f38687b = linearLayout;
        this.f38688c = i10;
        this.d = horizontalScrollView;
        this.f38689e = sparseIntArray;
        this.f38690f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f38691g = iArr;
    }

    @Override
    public final void a(int i10) {
        this.f38690f.getSwipeBack().f(this.f38691g[0], this.f38689e.get(i10), true);
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        SparseIntArray sparseIntArray;
        float f10;
        if (!this.f38686a.get()) {
            float f11 = -1.0f;
            float f12 = -1.0f;
            int i12 = 0;
            while (true) {
                LinearLayout linearLayout = this.f38687b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i12 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.xk0 xk0Var = (org.telegram.ui.Components.xk0) linearLayout.getChildAt(i12);
                if (i12 == i10) {
                    f10 = 1.0f - f7;
                } else if (i12 == (i10 + 1) % this.f38688c) {
                    f10 = f7;
                } else {
                    f10 = 0.0f;
                }
                xk0Var.setOutlineProgress(f10);
                if (i12 == i10) {
                    f11 = xk0Var.getX() - ((horizontalScrollView.getWidth() - xk0Var.getWidth()) / 2.0f);
                }
                if (i12 == i10 + 1) {
                    f12 = xk0Var.getX() - ((horizontalScrollView.getWidth() - xk0Var.getWidth()) / 2.0f);
                }
                i12++;
            }
            if (f11 != -1.0f && f12 != -1.0f) {
                horizontalScrollView.setScrollX((int) com.google.android.gms.internal.vision.e2.y(f12, f11, f7, f11));
            }
            int i13 = this.f38689e.get(i10, 0);
            this.f38690f.getSwipeBack().f(this.f38691g[0], (int) ((sparseIntArray.get(i10 + 1, 0) * f7) + ((1.0f - f7) * i13)), false);
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            this.f38686a.set(false);
        }
    }
}
