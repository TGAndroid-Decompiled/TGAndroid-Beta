package org.telegram.ui.Components;

import android.content.Context;
import androidx.core.widget.NestedScrollView;
public final class q41 extends NestedScrollView {
    public boolean f37343a0;
    public final r41 f37344b0;

    public q41(r41 r41Var, Context context) {
        super(context);
        this.f37344b0 = r41Var;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        r41.I0(this.f37344b0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q41.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i3, int i10, int i11, int i12) {
        super.onScrollChanged(i3, i10, i11, i12);
        r41.I0(this.f37344b0);
    }

    @Override
    public final void requestLayout() {
        if (this.f37343a0) {
            return;
        }
        super.requestLayout();
    }
}
