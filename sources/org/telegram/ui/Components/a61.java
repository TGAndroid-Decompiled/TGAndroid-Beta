package org.telegram.ui.Components;

import android.content.Context;
import androidx.core.widget.NestedScrollView;
public final class a61 extends NestedScrollView {
    public boolean S;
    public final b61 T;

    public a61(b61 b61Var, Context context) {
        super(context);
        this.T = b61Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b61.m(this.T);
    }

    @Override
    public final void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a61.onMeasure(int, int):void");
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        b61.m(this.T);
    }

    @Override
    public final void requestLayout() {
        if (this.S) {
            return;
        }
        super.requestLayout();
    }
}
