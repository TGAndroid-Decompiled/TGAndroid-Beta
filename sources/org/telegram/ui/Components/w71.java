package org.telegram.ui.Components;

import android.content.Context;
import androidx.core.widget.NestedScrollView;
public final class w71 extends NestedScrollView {
    public boolean W;
    public final x71 f34386a0;

    public w71(x71 x71Var, Context context) {
        super(context);
        this.f34386a0 = x71Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        x71.m(this.f34386a0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w71.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        x71.m(this.f34386a0);
    }

    @Override
    public final void requestLayout() {
        if (this.W) {
            return;
        }
        super.requestLayout();
    }
}
