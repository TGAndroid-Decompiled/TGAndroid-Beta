package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class gi implements z4.e {
    public final AtomicBoolean f36680a;
    public final LinearLayout f36681b;
    public final int f36682c;
    public final HorizontalScrollView d;
    public final SparseIntArray f36683e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f36684f;
    public final int[] f36685g;

    public gi(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f36680a = atomicBoolean;
        this.f36681b = linearLayout;
        this.f36682c = i10;
        this.d = horizontalScrollView;
        this.f36683e = sparseIntArray;
        this.f36684f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f36685g = iArr;
    }

    @Override
    public final void a(int i10) {
        this.f36684f.getSwipeBack().f(this.f36685g[0], this.f36683e.get(i10), true);
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        float f10;
        if (!this.f36680a.get()) {
            int i12 = 0;
            float f11 = -1.0f;
            float f12 = -1.0f;
            while (true) {
                LinearLayout linearLayout = this.f36681b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i12 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.dk0 dk0Var = (org.telegram.ui.Components.dk0) linearLayout.getChildAt(i12);
                if (i12 == i10) {
                    f10 = 1.0f - f7;
                } else if (i12 == (i10 + 1) % this.f36682c) {
                    f10 = f7;
                } else {
                    f10 = 0.0f;
                }
                dk0Var.setOutlineProgress(f10);
                if (i12 == i10) {
                    f11 = dk0Var.getX() - ((horizontalScrollView.getWidth() - dk0Var.getWidth()) / 2.0f);
                }
                if (i12 == i10 + 1) {
                    f12 = dk0Var.getX() - ((horizontalScrollView.getWidth() - dk0Var.getWidth()) / 2.0f);
                }
                i12++;
            }
            if (f11 != -1.0f && f12 != -1.0f) {
                horizontalScrollView.setScrollX((int) com.google.android.gms.internal.vision.e2.z(f12, f11, f7, f11));
            }
            SparseIntArray sparseIntArray = this.f36683e;
            int i13 = sparseIntArray.get(i10, 0);
            float f13 = sparseIntArray.get(i10 + 1, 0) * f7;
            this.f36684f.getSwipeBack().f(this.f36685g[0], (int) (f13 + ((1.0f - f7) * i13)), false);
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            this.f36680a.set(false);
        }
    }
}
