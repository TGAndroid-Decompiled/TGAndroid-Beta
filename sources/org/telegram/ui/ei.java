package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ei implements m2.f {
    public final AtomicBoolean f36503a;
    public final LinearLayout f36504b;
    public final int f36505c;
    public final HorizontalScrollView d;
    public final SparseIntArray f36506e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f36507f;
    public final int[] f36508g;

    public ei(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f36503a = atomicBoolean;
        this.f36504b = linearLayout;
        this.f36505c = i10;
        this.d = horizontalScrollView;
        this.f36506e = sparseIntArray;
        this.f36507f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f36508g = iArr;
    }

    @Override
    public final void a(int i10) {
        this.f36507f.getSwipeBack().f(this.f36508g[0], this.f36506e.get(i10), true);
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        float f11;
        if (!this.f36503a.get()) {
            int i12 = 0;
            float f12 = -1.0f;
            float f13 = -1.0f;
            while (true) {
                LinearLayout linearLayout = this.f36504b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i12 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.ak0 ak0Var = (org.telegram.ui.Components.ak0) linearLayout.getChildAt(i12);
                if (i12 == i10) {
                    f11 = 1.0f - f10;
                } else if (i12 == (i10 + 1) % this.f36505c) {
                    f11 = f10;
                } else {
                    f11 = 0.0f;
                }
                ak0Var.setOutlineProgress(f11);
                if (i12 == i10) {
                    f12 = ak0Var.getX() - ((horizontalScrollView.getWidth() - ak0Var.getWidth()) / 2.0f);
                }
                if (i12 == i10 + 1) {
                    f13 = ak0Var.getX() - ((horizontalScrollView.getWidth() - ak0Var.getWidth()) / 2.0f);
                }
                i12++;
            }
            if (f12 != -1.0f && f13 != -1.0f) {
                horizontalScrollView.setScrollX((int) e2.c.w(f13, f12, f10, f12));
            }
            SparseIntArray sparseIntArray = this.f36506e;
            int i13 = sparseIntArray.get(i10, 0);
            float f14 = sparseIntArray.get(i10 + 1, 0) * f10;
            this.f36507f.getSwipeBack().f(this.f36508g[0], (int) (f14 + ((1.0f - f10) * i13)), false);
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            this.f36503a.set(false);
        }
    }
}
