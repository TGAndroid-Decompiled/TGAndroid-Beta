package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
public final class v4 extends FrameLayout {
    public boolean f38988a;
    public int f38989b;
    public h6 f38990c;
    public h6 d;

    public h6 getSubtitleTextView() {
        return this.d;
    }

    public h6 getTitle() {
        return this.f38990c;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        h6 h6Var = this.d;
        h6 h6Var2 = this.f38990c;
        int y9 = org.telegram.messenger.camera.q.y(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
        if (this.f38988a) {
            i13 = org.telegram.messenger.g0.f22602m;
        } else {
            i13 = 0;
        }
        int i14 = y9 + i13;
        int i15 = this.f38989b;
        if (h6Var.getVisibility() != 8) {
            h6Var2.layout(i15, (org.telegram.messenger.g0.L(1.0f) + i14) - h6Var2.getPaddingTop(), h6Var2.getMeasuredWidth() + i15, h6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.3f) + (h6Var2.getTextHeight() + i14)) - h6Var2.getPaddingTop()));
        } else {
            h6Var2.layout(i15, (org.telegram.messenger.g0.L(11.0f) + i14) - h6Var2.getPaddingTop(), h6Var2.getMeasuredWidth() + i15, h6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (h6Var2.getTextHeight() + i14)) - h6Var2.getPaddingTop()));
        }
        h6Var.layout(i15, org.telegram.messenger.g0.L(20.0f) + i14, h6Var.getMeasuredWidth() + i15, org.telegram.messenger.g0.L(24.0f) + h6Var.getTextHeight() + i14);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        h6 h6Var = this.f38990c;
        int paddingRight = h6Var.getPaddingRight() + size;
        int L = paddingRight - org.telegram.messenger.g0.L(16.0f);
        h6Var.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(h6Var.getPaddingRight() + org.telegram.messenger.g0.L(32.0f), Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), Integer.MIN_VALUE));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i10));
    }
}
