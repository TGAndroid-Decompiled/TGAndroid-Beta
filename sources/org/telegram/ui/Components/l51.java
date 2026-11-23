package org.telegram.ui.Components;

import android.content.Context;
import androidx.core.widget.NestedScrollView;
public final class l51 extends NestedScrollView {
    public boolean f37043a0;
    public final m51 f37044b0;

    public l51(m51 m51Var, Context context) {
        super(context);
        this.f37044b0 = m51Var;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        m51.J0(this.f37044b0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l51.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        m51.J0(this.f37044b0);
    }

    @Override
    public final void requestLayout() {
        if (this.f37043a0) {
            return;
        }
        super.requestLayout();
    }
}
