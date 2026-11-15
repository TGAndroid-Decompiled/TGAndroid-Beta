package org.telegram.ui.Components;

import android.content.Context;
import androidx.core.widget.NestedScrollView;
public final class z41 extends NestedScrollView {
    public boolean f42247a0;
    public final a51 f42248b0;

    public z41(a51 a51Var, Context context) {
        super(context);
        this.f42248b0 = a51Var;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        a51.I0(this.f42248b0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z41.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        a51.I0(this.f42248b0);
    }

    @Override
    public final void requestLayout() {
        if (this.f42247a0) {
            return;
        }
        super.requestLayout();
    }
}
