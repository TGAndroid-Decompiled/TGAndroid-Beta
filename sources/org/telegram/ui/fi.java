package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class fi implements z4.e {
    public final AtomicBoolean f33684a;
    public final LinearLayout f33685b;
    public final int f33686c;
    public final HorizontalScrollView d;
    public final SparseIntArray e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f33687f;
    public final int[] f33688g;

    public fi(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f33684a = atomicBoolean;
        this.f33685b = linearLayout;
        this.f33686c = i10;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f33687f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f33688g = iArr;
    }

    @Override
    public final void a(int i10) {
        this.f33687f.getSwipeBack().f(this.f33688g[0], this.e.get(i10), true);
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        float f10;
        if (!this.f33684a.get()) {
            int i12 = 0;
            float f11 = -1.0f;
            float f12 = -1.0f;
            while (true) {
                LinearLayout linearLayout = this.f33685b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i12 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) linearLayout.getChildAt(i12);
                if (i12 == i10) {
                    f10 = 1.0f - f7;
                } else if (i12 == (i10 + 1) % this.f33686c) {
                    f10 = f7;
                } else {
                    f10 = 0.0f;
                }
                ck0Var.setOutlineProgress(f10);
                if (i12 == i10) {
                    f11 = ck0Var.getX() - ((horizontalScrollView.getWidth() - ck0Var.getWidth()) / 2.0f);
                }
                if (i12 == i10 + 1) {
                    f12 = ck0Var.getX() - ((horizontalScrollView.getWidth() - ck0Var.getWidth()) / 2.0f);
                }
                i12++;
            }
            if (f11 != -1.0f && f12 != -1.0f) {
                horizontalScrollView.setScrollX((int) com.google.android.gms.internal.vision.e2.z(f12, f11, f7, f11));
            }
            SparseIntArray sparseIntArray = this.e;
            int i13 = sparseIntArray.get(i10, 0);
            float f13 = sparseIntArray.get(i10 + 1, 0) * f7;
            this.f33687f.getSwipeBack().f(this.f33688g[0], (int) (f13 + ((1.0f - f7) * i13)), false);
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            this.f33684a.set(false);
        }
    }
}
