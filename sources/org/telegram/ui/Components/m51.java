package org.telegram.ui.Components;

import android.content.Context;
import androidx.core.widget.NestedScrollView;
public final class m51 extends NestedScrollView {
    public boolean f37429a0;
    public final n51 f37430b0;

    public m51(n51 n51Var, Context context) {
        super(context);
        this.f37430b0 = n51Var;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        n51.J0(this.f37430b0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m51.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        n51.J0(this.f37430b0);
    }

    @Override
    public final void requestLayout() {
        if (this.f37429a0) {
            return;
        }
        super.requestLayout();
    }
}
