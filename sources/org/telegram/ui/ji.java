package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ji implements z4.e {
    public final AtomicBoolean f34891a;
    public final LinearLayout f34892b;
    public final int f34893c;
    public final HorizontalScrollView d;
    public final SparseIntArray e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f34894f;
    public final int[] f34895g;

    public ji(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f34891a = atomicBoolean;
        this.f34892b = linearLayout;
        this.f34893c = i10;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f34894f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f34895g = iArr;
    }

    @Override
    public final void a(int i10) {
        this.f34894f.getSwipeBack().f(this.f34895g[0], this.e.get(i10), true);
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        float f10;
        if (!this.f34891a.get()) {
            int i12 = 0;
            float f11 = -1.0f;
            float f12 = -1.0f;
            while (true) {
                LinearLayout linearLayout = this.f34892b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i12 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.rj0 rj0Var = (org.telegram.ui.Components.rj0) linearLayout.getChildAt(i12);
                if (i12 == i10) {
                    f10 = 1.0f - f7;
                } else if (i12 == (i10 + 1) % this.f34893c) {
                    f10 = f7;
                } else {
                    f10 = 0.0f;
                }
                rj0Var.setOutlineProgress(f10);
                if (i12 == i10) {
                    f11 = rj0Var.getX() - ((horizontalScrollView.getWidth() - rj0Var.getWidth()) / 2.0f);
                }
                if (i12 == i10 + 1) {
                    f12 = rj0Var.getX() - ((horizontalScrollView.getWidth() - rj0Var.getWidth()) / 2.0f);
                }
                i12++;
            }
            if (f11 != -1.0f && f12 != -1.0f) {
                horizontalScrollView.setScrollX((int) com.google.android.gms.internal.vision.e2.z(f12, f11, f7, f11));
            }
            SparseIntArray sparseIntArray = this.e;
            int i13 = sparseIntArray.get(i10, 0);
            float f13 = sparseIntArray.get(i10 + 1, 0) * f7;
            this.f34894f.getSwipeBack().f(this.f34895g[0], (int) (f13 + ((1.0f - f7) * i13)), false);
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            this.f34891a.set(false);
        }
    }
}
