package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class gi implements m2.f {
    public final AtomicBoolean f34458a;
    public final LinearLayout f34459b;
    public final int f34460c;
    public final HorizontalScrollView d;
    public final SparseIntArray e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f34461f;
    public final int[] f34462g;

    public gi(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f34458a = atomicBoolean;
        this.f34459b = linearLayout;
        this.f34460c = i10;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f34461f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f34462g = iArr;
    }

    @Override
    public final void a(int i10) {
        this.f34461f.getSwipeBack().f(this.f34462g[0], this.e.get(i10), true);
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        float f11;
        if (!this.f34458a.get()) {
            int i12 = 0;
            float f12 = -1.0f;
            float f13 = -1.0f;
            while (true) {
                LinearLayout linearLayout = this.f34459b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i12 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.zj0 zj0Var = (org.telegram.ui.Components.zj0) linearLayout.getChildAt(i12);
                if (i12 == i10) {
                    f11 = 1.0f - f10;
                } else if (i12 == (i10 + 1) % this.f34460c) {
                    f11 = f10;
                } else {
                    f11 = 0.0f;
                }
                zj0Var.setOutlineProgress(f11);
                if (i12 == i10) {
                    f12 = zj0Var.getX() - ((horizontalScrollView.getWidth() - zj0Var.getWidth()) / 2.0f);
                }
                if (i12 == i10 + 1) {
                    f13 = zj0Var.getX() - ((horizontalScrollView.getWidth() - zj0Var.getWidth()) / 2.0f);
                }
                i12++;
            }
            if (f12 != -1.0f && f13 != -1.0f) {
                horizontalScrollView.setScrollX((int) e2.c.w(f13, f12, f10, f12));
            }
            SparseIntArray sparseIntArray = this.e;
            int i13 = sparseIntArray.get(i10, 0);
            float f14 = sparseIntArray.get(i10 + 1, 0) * f10;
            this.f34461f.getSwipeBack().f(this.f34462g[0], (int) (f14 + ((1.0f - f10) * i13)), false);
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            this.f34458a.set(false);
        }
    }
}
