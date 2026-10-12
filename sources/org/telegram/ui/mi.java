package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class mi implements z4.e {
    public final AtomicBoolean f40048a;
    public final LinearLayout f40049b;
    public final int f40050c;
    public final HorizontalScrollView d;
    public final SparseIntArray f40051e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f40052f;
    public final int[] f40053g;

    public mi(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f40048a = atomicBoolean;
        this.f40049b = linearLayout;
        this.f40050c = i10;
        this.d = horizontalScrollView;
        this.f40051e = sparseIntArray;
        this.f40052f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f40053g = iArr;
    }

    @Override
    public final void a(int i10) {
        this.f40052f.getSwipeBack().f(this.f40053g[0], this.f40051e.get(i10), true);
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        SparseIntArray sparseIntArray;
        float f10;
        if (!this.f40048a.get()) {
            float f11 = -1.0f;
            float f12 = -1.0f;
            int i12 = 0;
            while (true) {
                LinearLayout linearLayout = this.f40049b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i12 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.yk0 yk0Var = (org.telegram.ui.Components.yk0) linearLayout.getChildAt(i12);
                if (i12 == i10) {
                    f10 = 1.0f - f7;
                } else if (i12 == (i10 + 1) % this.f40050c) {
                    f10 = f7;
                } else {
                    f10 = 0.0f;
                }
                yk0Var.setOutlineProgress(f10);
                if (i12 == i10) {
                    f11 = yk0Var.getX() - ((horizontalScrollView.getWidth() - yk0Var.getWidth()) / 2.0f);
                }
                if (i12 == i10 + 1) {
                    f12 = yk0Var.getX() - ((horizontalScrollView.getWidth() - yk0Var.getWidth()) / 2.0f);
                }
                i12++;
            }
            if (f11 != -1.0f && f12 != -1.0f) {
                horizontalScrollView.setScrollX((int) com.google.android.gms.internal.vision.e2.y(f12, f11, f7, f11));
            }
            int i13 = this.f40051e.get(i10, 0);
            this.f40052f.getSwipeBack().f(this.f40053g[0], (int) ((sparseIntArray.get(i10 + 1, 0) * f7) + ((1.0f - f7) * i13)), false);
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            this.f40048a.set(false);
        }
    }
}
