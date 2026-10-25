package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ai implements a5.i {
    public final AtomicBoolean f37803a;
    public final LinearLayout f37804b;
    public final int f37805c;
    public final HorizontalScrollView d;
    public final SparseIntArray e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f37806f;
    public final int[] f37807g;

    public ai(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f37803a = atomicBoolean;
        this.f37804b = linearLayout;
        this.f37805c = i10;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f37806f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f37807g = iArr;
    }

    @Override
    public final void a(int i10) {
        this.f37806f.getSwipeBack().f(this.f37807g[0], this.e.get(i10), true);
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        SparseIntArray sparseIntArray;
        float f10;
        if (!this.f37803a.get()) {
            float f11 = -1.0f;
            float f12 = -1.0f;
            int i12 = 0;
            while (true) {
                LinearLayout linearLayout = this.f37804b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i12 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.qk0 qk0Var = (org.telegram.ui.Components.qk0) linearLayout.getChildAt(i12);
                if (i12 == i10) {
                    f10 = 1.0f - f7;
                } else if (i12 == (i10 + 1) % this.f37805c) {
                    f10 = f7;
                } else {
                    f10 = 0.0f;
                }
                qk0Var.setOutlineProgress(f10);
                if (i12 == i10) {
                    f11 = qk0Var.getX() - ((horizontalScrollView.getWidth() - qk0Var.getWidth()) / 2.0f);
                }
                if (i12 == i10 + 1) {
                    f12 = qk0Var.getX() - ((horizontalScrollView.getWidth() - qk0Var.getWidth()) / 2.0f);
                }
                i12++;
            }
            if (f11 != -1.0f && f12 != -1.0f) {
                horizontalScrollView.setScrollX((int) c3.h0.z(f12, f11, f7, f11));
            }
            int i13 = this.e.get(i10, 0);
            this.f37806f.getSwipeBack().f(this.f37807g[0], (int) ((sparseIntArray.get(i10 + 1, 0) * f7) + ((1.0f - f7) * i13)), false);
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            this.f37803a.set(false);
        }
    }
}
