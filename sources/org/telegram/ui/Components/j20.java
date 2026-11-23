package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class j20 extends FrameLayout {
    public final org.telegram.ui.g30 f36360a;

    public j20(org.telegram.ui.g30 g30Var, Context context) {
        super(context);
        this.f36360a = g30Var;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        o20.J0(this.f36360a);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        if (View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.g30 g30Var = this.f36360a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) g30Var.n1.getLayoutParams();
        if (z10) {
            int L = org.telegram.messenger.g0.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        int z11 = org.telegram.messenger.o10.z(200.0f, View.MeasureSpec.getSize(i7), 2);
        g30Var.f38062m1.setPadding(z11, 0, z11, 0);
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(370.0f), 1073741824));
        measureChildWithMargins(g30Var.f38063o1, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), 1073741824), 0);
    }
}
