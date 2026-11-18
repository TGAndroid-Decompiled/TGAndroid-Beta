package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class d5 extends FrameLayout {
    public boolean f34278a;
    public int f34279b;
    public n6 f34280c;
    public n6 d;

    public n6 getSubtitleTextView() {
        return this.d;
    }

    public n6 getTitle() {
        return this.f34280c;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        n6 n6Var = this.d;
        n6 n6Var2 = this.f34280c;
        int z11 = org.telegram.messenger.n10.z(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
        if (this.f34278a) {
            i13 = org.telegram.messenger.g0.f24112m;
        } else {
            i13 = 0;
        }
        int i14 = z11 + i13;
        int i15 = this.f34279b;
        if (n6Var.getVisibility() != 8) {
            n6Var2.layout(i15, (org.telegram.messenger.g0.L(1.0f) + i14) - n6Var2.getPaddingTop(), n6Var2.getMeasuredWidth() + i15, n6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.3f) + (n6Var2.getTextHeight() + i14)) - n6Var2.getPaddingTop()));
        } else {
            n6Var2.layout(i15, (org.telegram.messenger.g0.L(11.0f) + i14) - n6Var2.getPaddingTop(), n6Var2.getMeasuredWidth() + i15, n6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (n6Var2.getTextHeight() + i14)) - n6Var2.getPaddingTop()));
        }
        n6Var.layout(i15, org.telegram.messenger.g0.L(20.0f) + i14, n6Var.getMeasuredWidth() + i15, org.telegram.messenger.g0.L(24.0f) + n6Var.getTextHeight() + i14);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        n6 n6Var = this.f34280c;
        int paddingRight = n6Var.getPaddingRight() + size;
        int L = paddingRight - org.telegram.messenger.g0.L(16.0f);
        n6Var.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(n6Var.getPaddingRight() + org.telegram.messenger.g0.L(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i10));
    }
}
