package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class li implements z4.e {
    public final AtomicBoolean f39243a;
    public final LinearLayout f39244b;
    public final int f39245c;
    public final HorizontalScrollView d;
    public final SparseIntArray e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f39246f;
    public final int[] f39247g;

    public li(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f39243a = atomicBoolean;
        this.f39244b = linearLayout;
        this.f39245c = i10;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f39246f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f39247g = iArr;
    }

    @Override
    public final void a(int i10) {
        this.f39246f.getSwipeBack().f(this.f39247g[0], this.e.get(i10), true);
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        SparseIntArray sparseIntArray;
        float f10;
        if (!this.f39243a.get()) {
            float f11 = -1.0f;
            float f12 = -1.0f;
            int i12 = 0;
            while (true) {
                LinearLayout linearLayout = this.f39244b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i12 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.wi0 wi0Var = (org.telegram.ui.Components.wi0) linearLayout.getChildAt(i12);
                if (i12 == i10) {
                    f10 = 1.0f - f7;
                } else if (i12 == (i10 + 1) % this.f39245c) {
                    f10 = f7;
                } else {
                    f10 = 0.0f;
                }
                wi0Var.setOutlineProgress(f10);
                if (i12 == i10) {
                    f11 = wi0Var.getX() - ((horizontalScrollView.getWidth() - wi0Var.getWidth()) / 2.0f);
                }
                if (i12 == i10 + 1) {
                    f12 = wi0Var.getX() - ((horizontalScrollView.getWidth() - wi0Var.getWidth()) / 2.0f);
                }
                i12++;
            }
            if (f11 != -1.0f && f12 != -1.0f) {
                horizontalScrollView.setScrollX((int) c3.i0.z(f12, f11, f7, f11));
            }
            int i13 = this.e.get(i10, 0);
            this.f39246f.getSwipeBack().f(this.f39247g[0], (int) ((sparseIntArray.get(i10 + 1, 0) * f7) + ((1.0f - f7) * i13)), false);
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            this.f39243a.set(false);
        }
    }
}
