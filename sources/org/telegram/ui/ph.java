package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ph implements c5.g {
    public final AtomicBoolean f48830a;
    public final LinearLayout f48831b;
    public final int f48832c;
    public final HorizontalScrollView d;
    public final SparseIntArray f48833e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f48834f;
    public final int[] f48835g;

    public ph(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i7, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f48830a = atomicBoolean;
        this.f48831b = linearLayout;
        this.f48832c = i7;
        this.d = horizontalScrollView;
        this.f48833e = sparseIntArray;
        this.f48834f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f48835g = iArr;
    }

    @Override
    public final void a(int i7) {
        this.f48834f.getSwipeBack().f(this.f48835g[0], this.f48833e.get(i7), true);
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        HorizontalScrollView horizontalScrollView;
        SparseIntArray sparseIntArray;
        float f11;
        if (!this.f48830a.get()) {
            float f12 = -1.0f;
            float f13 = -1.0f;
            int i11 = 0;
            while (true) {
                LinearLayout linearLayout = this.f48831b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i11 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.sh0 sh0Var = (org.telegram.ui.Components.sh0) linearLayout.getChildAt(i11);
                if (i11 == i7) {
                    f11 = 1.0f - f10;
                } else if (i11 == (i7 + 1) % this.f48832c) {
                    f11 = f10;
                } else {
                    f11 = 0.0f;
                }
                sh0Var.setOutlineProgress(f11);
                if (i11 == i7) {
                    f12 = sh0Var.getX() - ((horizontalScrollView.getWidth() - sh0Var.getWidth()) / 2.0f);
                }
                if (i11 == i7 + 1) {
                    f13 = sh0Var.getX() - ((horizontalScrollView.getWidth() - sh0Var.getWidth()) / 2.0f);
                }
                i11++;
            }
            if (f12 != -1.0f && f13 != -1.0f) {
                horizontalScrollView.setScrollX((int) com.google.android.recaptcha.internal.a.z(f13, f12, f10, f12));
            }
            int i12 = this.f48833e.get(i7, 0);
            this.f48834f.getSwipeBack().f(this.f48835g[0], (int) ((sparseIntArray.get(i7 + 1, 0) * f10) + ((1.0f - f10) * i12)), false);
        }
    }

    @Override
    public final void c(int i7) {
        if (i7 == 0) {
            this.f48830a.set(false);
        }
    }
}
