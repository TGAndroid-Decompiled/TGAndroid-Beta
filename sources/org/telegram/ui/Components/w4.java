package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class w4 extends FrameLayout {
    public boolean f39871a;
    public int f39872b;
    public i6 f39873c;
    public i6 d;

    public i6 getSubtitleTextView() {
        return this.d;
    }

    public i6 getTitle() {
        return this.f39873c;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        i6 i6Var = this.d;
        i6 i6Var2 = this.f39873c;
        int y10 = org.telegram.messenger.camera.q.y(42.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2);
        if (this.f39871a) {
            i13 = org.telegram.messenger.g0.f22561m;
        } else {
            i13 = 0;
        }
        int i14 = y10 + i13;
        int i15 = this.f39872b;
        if (i6Var.getVisibility() != 8) {
            i6Var2.layout(i15, (org.telegram.messenger.g0.L(1.0f) + i14) - i6Var2.getPaddingTop(), i6Var2.getMeasuredWidth() + i15, i6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.3f) + (i6Var2.getTextHeight() + i14)) - i6Var2.getPaddingTop()));
        } else {
            i6Var2.layout(i15, (org.telegram.messenger.g0.L(11.0f) + i14) - i6Var2.getPaddingTop(), i6Var2.getMeasuredWidth() + i15, i6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (i6Var2.getTextHeight() + i14)) - i6Var2.getPaddingTop()));
        }
        i6Var.layout(i15, org.telegram.messenger.g0.L(20.0f) + i14, i6Var.getMeasuredWidth() + i15, org.telegram.messenger.g0.L(24.0f) + i6Var.getTextHeight() + i14);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        i6 i6Var = this.f39873c;
        int paddingRight = i6Var.getPaddingRight() + size;
        int L = paddingRight - org.telegram.messenger.g0.L(16.0f);
        i6Var.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6Var.getPaddingRight() + org.telegram.messenger.g0.L(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i10));
    }
}
