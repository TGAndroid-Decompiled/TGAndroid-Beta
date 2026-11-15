package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ph implements c5.h {
    public final AtomicBoolean f50283a;
    public final LinearLayout f50284b;
    public final int f50285c;
    public final HorizontalScrollView d;
    public final SparseIntArray f50286e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f50287f;
    public final int[] f50288g;

    public ph(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i7, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f50283a = atomicBoolean;
        this.f50284b = linearLayout;
        this.f50285c = i7;
        this.d = horizontalScrollView;
        this.f50286e = sparseIntArray;
        this.f50287f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f50288g = iArr;
    }

    @Override
    public final void a(int i7) {
        this.f50287f.getSwipeBack().f(this.f50288g[0], this.f50286e.get(i7), true);
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        HorizontalScrollView horizontalScrollView;
        SparseIntArray sparseIntArray;
        float f11;
        if (!this.f50283a.get()) {
            float f12 = -1.0f;
            float f13 = -1.0f;
            int i11 = 0;
            while (true) {
                LinearLayout linearLayout = this.f50284b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i11 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.wh0 wh0Var = (org.telegram.ui.Components.wh0) linearLayout.getChildAt(i11);
                if (i11 == i7) {
                    f11 = 1.0f - f10;
                } else if (i11 == (i7 + 1) % this.f50285c) {
                    f11 = f10;
                } else {
                    f11 = 0.0f;
                }
                wh0Var.setOutlineProgress(f11);
                if (i11 == i7) {
                    f12 = wh0Var.getX() - ((horizontalScrollView.getWidth() - wh0Var.getWidth()) / 2.0f);
                }
                if (i11 == i7 + 1) {
                    f13 = wh0Var.getX() - ((horizontalScrollView.getWidth() - wh0Var.getWidth()) / 2.0f);
                }
                i11++;
            }
            if (f12 != -1.0f && f13 != -1.0f) {
                horizontalScrollView.setScrollX((int) com.google.android.gms.internal.vision.e2.z(f13, f12, f10, f12));
            }
            int i12 = this.f50286e.get(i7, 0);
            this.f50287f.getSwipeBack().f(this.f50288g[0], (int) ((sparseIntArray.get(i7 + 1, 0) * f10) + ((1.0f - f10) * i12)), false);
        }
    }

    @Override
    public final void c(int i7) {
        if (i7 == 0) {
            this.f50283a.set(false);
        }
    }
}
