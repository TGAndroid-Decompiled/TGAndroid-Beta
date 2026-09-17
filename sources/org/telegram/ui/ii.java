package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ii implements z4.e {
    public final AtomicBoolean f37378a;
    public final LinearLayout f37379b;
    public final int f37380c;
    public final HorizontalScrollView d;
    public final SparseIntArray f37381e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f37382f;
    public final int[] f37383g;

    public ii(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f37378a = atomicBoolean;
        this.f37379b = linearLayout;
        this.f37380c = i10;
        this.d = horizontalScrollView;
        this.f37381e = sparseIntArray;
        this.f37382f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f37383g = iArr;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        float f10;
        if (!this.f37378a.get()) {
            int i12 = 0;
            float f11 = -1.0f;
            float f12 = -1.0f;
            while (true) {
                LinearLayout linearLayout = this.f37379b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i12 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.qj0 qj0Var = (org.telegram.ui.Components.qj0) linearLayout.getChildAt(i12);
                if (i12 == i10) {
                    f10 = 1.0f - f7;
                } else if (i12 == (i10 + 1) % this.f37380c) {
                    f10 = f7;
                } else {
                    f10 = 0.0f;
                }
                qj0Var.setOutlineProgress(f10);
                if (i12 == i10) {
                    f11 = qj0Var.getX() - ((horizontalScrollView.getWidth() - qj0Var.getWidth()) / 2.0f);
                }
                if (i12 == i10 + 1) {
                    f12 = qj0Var.getX() - ((horizontalScrollView.getWidth() - qj0Var.getWidth()) / 2.0f);
                }
                i12++;
            }
            if (f11 != -1.0f && f12 != -1.0f) {
                horizontalScrollView.setScrollX((int) com.google.android.gms.internal.vision.e2.z(f12, f11, f7, f11));
            }
            SparseIntArray sparseIntArray = this.f37381e;
            int i13 = sparseIntArray.get(i10, 0);
            float f13 = sparseIntArray.get(i10 + 1, 0) * f7;
            this.f37382f.getSwipeBack().f(this.f37383g[0], (int) (f13 + ((1.0f - f7) * i13)), false);
        }
    }

    @Override
    public final void b(int i10) {
        this.f37382f.getSwipeBack().f(this.f37383g[0], this.f37381e.get(i10), true);
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            this.f37378a.set(false);
        }
    }
}
