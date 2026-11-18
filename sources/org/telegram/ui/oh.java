package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class oh implements c5.h {
    public final AtomicBoolean f50611a;
    public final LinearLayout f50612b;
    public final int f50613c;
    public final HorizontalScrollView d;
    public final SparseIntArray f50614e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f50615f;
    public final int[] f50616g;

    public oh(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i7, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f50611a = atomicBoolean;
        this.f50612b = linearLayout;
        this.f50613c = i7;
        this.d = horizontalScrollView;
        this.f50614e = sparseIntArray;
        this.f50615f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f50616g = iArr;
    }

    @Override
    public final void a(int i7) {
        this.f50615f.getSwipeBack().f(this.f50616g[0], this.f50614e.get(i7), true);
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        HorizontalScrollView horizontalScrollView;
        SparseIntArray sparseIntArray;
        float f11;
        if (!this.f50611a.get()) {
            float f12 = -1.0f;
            float f13 = -1.0f;
            int i11 = 0;
            while (true) {
                LinearLayout linearLayout = this.f50612b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i11 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.fi0 fi0Var = (org.telegram.ui.Components.fi0) linearLayout.getChildAt(i11);
                if (i11 == i7) {
                    f11 = 1.0f - f10;
                } else if (i11 == (i7 + 1) % this.f50613c) {
                    f11 = f10;
                } else {
                    f11 = 0.0f;
                }
                fi0Var.setOutlineProgress(f11);
                if (i11 == i7) {
                    f12 = fi0Var.getX() - ((horizontalScrollView.getWidth() - fi0Var.getWidth()) / 2.0f);
                }
                if (i11 == i7 + 1) {
                    f13 = fi0Var.getX() - ((horizontalScrollView.getWidth() - fi0Var.getWidth()) / 2.0f);
                }
                i11++;
            }
            if (f12 != -1.0f && f13 != -1.0f) {
                horizontalScrollView.setScrollX((int) com.google.android.gms.internal.vision.e2.z(f13, f12, f10, f12));
            }
            int i12 = this.f50614e.get(i7, 0);
            this.f50615f.getSwipeBack().f(this.f50616g[0], (int) ((sparseIntArray.get(i7 + 1, 0) * f10) + ((1.0f - f10) * i12)), false);
        }
    }

    @Override
    public final void c(int i7) {
        if (i7 == 0) {
            this.f50611a.set(false);
        }
    }
}
