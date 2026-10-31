package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class n20 extends FrameLayout {
    public final org.telegram.ui.b40 f28661a;

    public n20(org.telegram.ui.b40 b40Var, Context context) {
        super(context);
        this.f28661a = b40Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        r20.I0(this.f28661a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.b40 b40Var = this.f28661a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b40Var.f29804j1.getLayoutParams();
        if (z10) {
            int L = org.telegram.messenger.i0.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = org.telegram.messenger.i0.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        int y3 = org.telegram.messenger.z20.y(200.0f, View.MeasureSpec.getSize(i10), 2);
        b40Var.f29803i1.setPadding(y3, 0, y3, 0);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(370.0f), 1073741824));
        measureChildWithMargins(b40Var.f29805k1, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f), 1073741824), 0);
    }
}
