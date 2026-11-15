package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ph implements c5.h {
    public final AtomicBoolean f50260a;
    public final LinearLayout f50261b;
    public final int f50262c;
    public final HorizontalScrollView d;
    public final SparseIntArray f50263e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f50264f;
    public final int[] f50265g;

    public ph(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i7, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f50260a = atomicBoolean;
        this.f50261b = linearLayout;
        this.f50262c = i7;
        this.d = horizontalScrollView;
        this.f50263e = sparseIntArray;
        this.f50264f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f50265g = iArr;
    }

    @Override
    public final void a(int i7) {
        this.f50264f.getSwipeBack().f(this.f50265g[0], this.f50263e.get(i7), true);
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        HorizontalScrollView horizontalScrollView;
        SparseIntArray sparseIntArray;
        float f11;
        if (!this.f50260a.get()) {
            float f12 = -1.0f;
            float f13 = -1.0f;
            int i11 = 0;
            while (true) {
                LinearLayout linearLayout = this.f50261b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i11 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.wh0 wh0Var = (org.telegram.ui.Components.wh0) linearLayout.getChildAt(i11);
                if (i11 == i7) {
                    f11 = 1.0f - f10;
                } else if (i11 == (i7 + 1) % this.f50262c) {
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
            int i12 = this.f50263e.get(i7, 0);
            this.f50264f.getSwipeBack().f(this.f50265g[0], (int) ((sparseIntArray.get(i7 + 1, 0) * f10) + ((1.0f - f10) * i12)), false);
        }
    }

    @Override
    public final void c(int i7) {
        if (i7 == 0) {
            this.f50260a.set(false);
        }
    }
}
