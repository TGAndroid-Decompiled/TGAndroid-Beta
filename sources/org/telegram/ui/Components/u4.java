package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class u4 extends FrameLayout {
    public boolean f30853a;
    public int f30854b;
    public f6 f30855c;
    public f6 d;

    public f6 getSubtitleTextView() {
        return this.d;
    }

    public f6 getTitle() {
        return this.f30855c;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        f6 f6Var = this.d;
        f6 f6Var2 = this.f30855c;
        int y3 = org.telegram.messenger.a30.y(42.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2);
        if (this.f30853a) {
            i14 = org.telegram.messenger.i0.f16166m;
        } else {
            i14 = 0;
        }
        int i15 = y3 + i14;
        int i16 = this.f30854b;
        if (f6Var.getVisibility() != 8) {
            f6Var2.layout(i16, (org.telegram.messenger.i0.L(1.0f) + i15) - f6Var2.getPaddingTop(), f6Var2.getMeasuredWidth() + i16, f6Var2.getPaddingBottom() + ((org.telegram.messenger.i0.L(1.3f) + (f6Var2.getTextHeight() + i15)) - f6Var2.getPaddingTop()));
        } else {
            f6Var2.layout(i16, (org.telegram.messenger.i0.L(11.0f) + i15) - f6Var2.getPaddingTop(), f6Var2.getMeasuredWidth() + i16, f6Var2.getPaddingBottom() + ((org.telegram.messenger.i0.L(11.0f) + (f6Var2.getTextHeight() + i15)) - f6Var2.getPaddingTop()));
        }
        f6Var.layout(i16, org.telegram.messenger.i0.L(20.0f) + i15, f6Var.getMeasuredWidth() + i16, org.telegram.messenger.i0.L(24.0f) + f6Var.getTextHeight() + i15);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        f6 f6Var = this.f30855c;
        int paddingRight = f6Var.getPaddingRight() + size;
        int L = paddingRight - org.telegram.messenger.i0.L(16.0f);
        f6Var.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(f6Var.getPaddingRight() + org.telegram.messenger.i0.L(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i11));
    }
}
