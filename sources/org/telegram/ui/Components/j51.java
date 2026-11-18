package org.telegram.ui.Components;

import android.content.Context;
import androidx.core.widget.NestedScrollView;
public final class j51 extends NestedScrollView {
    public boolean f36343a0;
    public final k51 f36344b0;

    public j51(k51 k51Var, Context context) {
        super(context);
        this.f36344b0 = k51Var;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        k51.J0(this.f36344b0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j51.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        k51.J0(this.f36344b0);
    }

    @Override
    public final void requestLayout() {
        if (this.f36343a0) {
            return;
        }
        super.requestLayout();
    }
}
