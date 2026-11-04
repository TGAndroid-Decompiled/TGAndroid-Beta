package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class lh implements b5.h {
    public final AtomicBoolean f47331a;
    public final LinearLayout f47332b;
    public final int f47333c;
    public final HorizontalScrollView d;
    public final SparseIntArray f47334e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f47335f;
    public final int[] f47336g;

    public lh(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i3, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f47331a = atomicBoolean;
        this.f47332b = linearLayout;
        this.f47333c = i3;
        this.d = horizontalScrollView;
        this.f47334e = sparseIntArray;
        this.f47335f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f47336g = iArr;
    }

    @Override
    public final void a(int i3) {
        this.f47335f.getSwipeBack().f(this.f47336g[0], this.f47334e.get(i3), true);
    }

    @Override
    public final void b(float f10, int i3, int i10) {
        HorizontalScrollView horizontalScrollView;
        SparseIntArray sparseIntArray;
        float f11;
        if (!this.f47331a.get()) {
            float f12 = -1.0f;
            float f13 = -1.0f;
            int i11 = 0;
            while (true) {
                LinearLayout linearLayout = this.f47332b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i11 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.vh0 vh0Var = (org.telegram.ui.Components.vh0) linearLayout.getChildAt(i11);
                if (i11 == i3) {
                    f11 = 1.0f - f10;
                } else if (i11 == (i3 + 1) % this.f47333c) {
                    f11 = f10;
                } else {
                    f11 = 0.0f;
                }
                vh0Var.setOutlineProgress(f11);
                if (i11 == i3) {
                    f12 = vh0Var.getX() - ((horizontalScrollView.getWidth() - vh0Var.getWidth()) / 2.0f);
                }
                if (i11 == i3 + 1) {
                    f13 = vh0Var.getX() - ((horizontalScrollView.getWidth() - vh0Var.getWidth()) / 2.0f);
                }
                i11++;
            }
            if (f12 != -1.0f && f13 != -1.0f) {
                horizontalScrollView.setScrollX((int) com.google.android.recaptcha.internal.a.y(f13, f12, f10, f12));
            }
            int i12 = this.f47334e.get(i3, 0);
            this.f47335f.getSwipeBack().f(this.f47336g[0], (int) ((sparseIntArray.get(i3 + 1, 0) * f10) + ((1.0f - f10) * i12)), false);
        }
    }

    @Override
    public final void c(int i3) {
        if (i3 == 0) {
            this.f47331a.set(false);
        }
    }
}
