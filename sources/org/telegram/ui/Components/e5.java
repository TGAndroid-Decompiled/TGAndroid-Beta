package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class e5 extends FrameLayout {
    public boolean f34678a;
    public int f34679b;
    public o6 f34680c;
    public o6 d;

    public o6 getSubtitleTextView() {
        return this.d;
    }

    public o6 getTitle() {
        return this.f34680c;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        o6 o6Var = this.d;
        o6 o6Var2 = this.f34680c;
        int z11 = org.telegram.messenger.o10.z(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
        if (this.f34678a) {
            i13 = org.telegram.messenger.g0.f24040m;
        } else {
            i13 = 0;
        }
        int i14 = z11 + i13;
        int i15 = this.f34679b;
        if (o6Var.getVisibility() != 8) {
            o6Var2.layout(i15, (org.telegram.messenger.g0.L(1.0f) + i14) - o6Var2.getPaddingTop(), o6Var2.getMeasuredWidth() + i15, o6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.3f) + (o6Var2.getTextHeight() + i14)) - o6Var2.getPaddingTop()));
        } else {
            o6Var2.layout(i15, (org.telegram.messenger.g0.L(11.0f) + i14) - o6Var2.getPaddingTop(), o6Var2.getMeasuredWidth() + i15, o6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (o6Var2.getTextHeight() + i14)) - o6Var2.getPaddingTop()));
        }
        o6Var.layout(i15, org.telegram.messenger.g0.L(20.0f) + i14, o6Var.getMeasuredWidth() + i15, org.telegram.messenger.g0.L(24.0f) + o6Var.getTextHeight() + i14);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        o6 o6Var = this.f34680c;
        int paddingRight = o6Var.getPaddingRight() + size;
        int L = paddingRight - org.telegram.messenger.g0.L(16.0f);
        o6Var.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(o6Var.getPaddingRight() + org.telegram.messenger.g0.L(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i10));
    }
}
