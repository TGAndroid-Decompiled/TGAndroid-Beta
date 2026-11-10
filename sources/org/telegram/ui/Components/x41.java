package org.telegram.ui.Components;

import android.content.Context;
import androidx.core.widget.NestedScrollView;
public final class x41 extends NestedScrollView {
    public boolean W;
    public final y41 f40176a0;

    public x41(y41 y41Var, Context context) {
        super(context);
        this.f40176a0 = y41Var;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        y41.I0(this.f40176a0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x41.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        y41.I0(this.f40176a0);
    }

    @Override
    public final void requestLayout() {
        if (this.W) {
            return;
        }
        super.requestLayout();
    }
}
