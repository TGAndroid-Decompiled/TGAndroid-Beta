package org.telegram.ui.Components;

import android.content.Context;
import androidx.core.widget.NestedScrollView;
public final class m71 extends NestedScrollView {
    public boolean W;
    public final n71 f26966a0;

    public m71(n71 n71Var, Context context) {
        super(context);
        this.f26966a0 = n71Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        n71.n(this.f26966a0);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m71.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        n71.n(this.f26966a0);
    }

    @Override
    public final void requestLayout() {
        if (this.W) {
            return;
        }
        super.requestLayout();
    }
}
