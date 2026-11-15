package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class z10 extends FrameLayout {
    public final org.telegram.ui.d30 f42211a;

    public z10(org.telegram.ui.d30 d30Var, Context context) {
        super(context);
        this.f42211a = d30Var;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        e20.I0(this.f42211a);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z10;
        if (View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.d30 d30Var = this.f42211a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d30Var.n1.getLayoutParams();
        if (z10) {
            int L = org.telegram.messenger.g0.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        int y10 = org.telegram.messenger.i20.y(200.0f, View.MeasureSpec.getSize(i7), 2);
        d30Var.f34165m1.setPadding(y10, 0, y10, 0);
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(370.0f), 1073741824));
        measureChildWithMargins(d30Var.f34166o1, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), 1073741824), 0);
    }
}
