package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class s10 extends FrameLayout {
    public final org.telegram.ui.x20 f37884a;

    public s10(org.telegram.ui.x20 x20Var, Context context) {
        super(context);
        this.f37884a = x20Var;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        x10.I0(this.f37884a);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        boolean z10;
        if (View.MeasureSpec.getSize(i3) > View.MeasureSpec.getSize(i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.x20 x20Var = this.f37884a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) x20Var.k1.getLayoutParams();
        if (z10) {
            int L = org.telegram.messenger.g0.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        int y9 = org.telegram.messenger.camera.q.y(200.0f, View.MeasureSpec.getSize(i3), 2);
        x20Var.f40192j1.setPadding(y9, 0, y9, 0);
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(370.0f), 1073741824));
        measureChildWithMargins(x20Var.f40193l1, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), 1073741824), 0);
    }
}
