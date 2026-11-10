package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class w10 extends FrameLayout {
    public final org.telegram.ui.f30 f39858a;

    public w10(org.telegram.ui.f30 f30Var, Context context) {
        super(context);
        this.f39858a = f30Var;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        b20.I0(this.f39858a);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        if (View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10)) {
            z9 = true;
        } else {
            z9 = false;
        }
        org.telegram.ui.f30 f30Var = this.f39858a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f30Var.f32089m1.getLayoutParams();
        if (z9) {
            int L = org.telegram.messenger.g0.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        int y10 = org.telegram.messenger.camera.q.y(200.0f, View.MeasureSpec.getSize(i7), 2);
        f30Var.l1.setPadding(y10, 0, y10, 0);
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(370.0f), 1073741824));
        measureChildWithMargins(f30Var.n1, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), 1073741824), 0);
    }
}
