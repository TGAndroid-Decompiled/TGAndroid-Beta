package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class x4 extends FrameLayout {
    public boolean f40173a;
    public int f40174b;
    public j6 f40175c;
    public j6 d;

    public j6 getSubtitleTextView() {
        return this.d;
    }

    public j6 getTitle() {
        return this.f40175c;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        j6 j6Var = this.d;
        j6 j6Var2 = this.f40175c;
        int y10 = org.telegram.messenger.camera.q.y(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
        if (this.f40173a) {
            i13 = org.telegram.messenger.g0.f22538m;
        } else {
            i13 = 0;
        }
        int i14 = y10 + i13;
        int i15 = this.f40174b;
        if (j6Var.getVisibility() != 8) {
            j6Var2.layout(i15, (org.telegram.messenger.g0.L(1.0f) + i14) - j6Var2.getPaddingTop(), j6Var2.getMeasuredWidth() + i15, j6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.3f) + (j6Var2.getTextHeight() + i14)) - j6Var2.getPaddingTop()));
        } else {
            j6Var2.layout(i15, (org.telegram.messenger.g0.L(11.0f) + i14) - j6Var2.getPaddingTop(), j6Var2.getMeasuredWidth() + i15, j6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (j6Var2.getTextHeight() + i14)) - j6Var2.getPaddingTop()));
        }
        j6Var.layout(i15, org.telegram.messenger.g0.L(20.0f) + i14, j6Var.getMeasuredWidth() + i15, org.telegram.messenger.g0.L(24.0f) + j6Var.getTextHeight() + i14);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        j6 j6Var = this.f40175c;
        int paddingRight = j6Var.getPaddingRight() + size;
        int L = paddingRight - org.telegram.messenger.g0.L(16.0f);
        j6Var.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(j6Var.getPaddingRight() + org.telegram.messenger.g0.L(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i10));
    }
}
