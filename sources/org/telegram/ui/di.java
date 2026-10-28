package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class di implements a5.i {
    public final AtomicBoolean f38617a;
    public final LinearLayout f38618b;
    public final int f38619c;
    public final HorizontalScrollView d;
    public final SparseIntArray e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f38620f;
    public final int[] f38621g;

    public di(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f38617a = atomicBoolean;
        this.f38618b = linearLayout;
        this.f38619c = i10;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f38620f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f38621g = iArr;
    }

    @Override
    public final void a(int i10) {
        this.f38620f.getSwipeBack().f(this.f38621g[0], this.e.get(i10), true);
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        SparseIntArray sparseIntArray;
        float f10;
        if (!this.f38617a.get()) {
            float f11 = -1.0f;
            float f12 = -1.0f;
            int i12 = 0;
            while (true) {
                LinearLayout linearLayout = this.f38618b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i12 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.rk0 rk0Var = (org.telegram.ui.Components.rk0) linearLayout.getChildAt(i12);
                if (i12 == i10) {
                    f10 = 1.0f - f7;
                } else if (i12 == (i10 + 1) % this.f38619c) {
                    f10 = f7;
                } else {
                    f10 = 0.0f;
                }
                rk0Var.setOutlineProgress(f10);
                if (i12 == i10) {
                    f11 = rk0Var.getX() - ((horizontalScrollView.getWidth() - rk0Var.getWidth()) / 2.0f);
                }
                if (i12 == i10 + 1) {
                    f12 = rk0Var.getX() - ((horizontalScrollView.getWidth() - rk0Var.getWidth()) / 2.0f);
                }
                i12++;
            }
            if (f11 != -1.0f && f12 != -1.0f) {
                horizontalScrollView.setScrollX((int) c3.h0.z(f12, f11, f7, f11));
            }
            int i13 = this.e.get(i10, 0);
            this.f38620f.getSwipeBack().f(this.f38621g[0], (int) ((sparseIntArray.get(i10 + 1, 0) * f7) + ((1.0f - f7) * i13)), false);
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            this.f38617a.set(false);
        }
    }
}
