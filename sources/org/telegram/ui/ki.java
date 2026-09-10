package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ki implements z4.e {
    public final AtomicBoolean f34375a;
    public final LinearLayout f34376b;
    public final int f34377c;
    public final HorizontalScrollView d;
    public final SparseIntArray e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f34378f;
    public final int[] f34379g;

    public ki(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f34375a = atomicBoolean;
        this.f34376b = linearLayout;
        this.f34377c = i10;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f34378f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f34379g = iArr;
    }

    @Override
    public final void a(int i10) {
        this.f34378f.getSwipeBack().f(this.f34379g[0], this.e.get(i10), true);
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        float f10;
        if (!this.f34375a.get()) {
            int i12 = 0;
            float f11 = -1.0f;
            float f12 = -1.0f;
            while (true) {
                LinearLayout linearLayout = this.f34376b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i12 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.ak0 ak0Var = (org.telegram.ui.Components.ak0) linearLayout.getChildAt(i12);
                if (i12 == i10) {
                    f10 = 1.0f - f7;
                } else if (i12 == (i10 + 1) % this.f34377c) {
                    f10 = f7;
                } else {
                    f10 = 0.0f;
                }
                ak0Var.setOutlineProgress(f10);
                if (i12 == i10) {
                    f11 = ak0Var.getX() - ((horizontalScrollView.getWidth() - ak0Var.getWidth()) / 2.0f);
                }
                if (i12 == i10 + 1) {
                    f12 = ak0Var.getX() - ((horizontalScrollView.getWidth() - ak0Var.getWidth()) / 2.0f);
                }
                i12++;
            }
            if (f11 != -1.0f && f12 != -1.0f) {
                horizontalScrollView.setScrollX((int) com.google.android.gms.internal.vision.e2.z(f12, f11, f7, f11));
            }
            SparseIntArray sparseIntArray = this.e;
            int i13 = sparseIntArray.get(i10, 0);
            float f13 = sparseIntArray.get(i10 + 1, 0) * f7;
            this.f34378f.getSwipeBack().f(this.f34379g[0], (int) (f13 + ((1.0f - f7) * i13)), false);
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            this.f34375a.set(false);
        }
    }
}
