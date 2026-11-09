package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class x10 extends FrameLayout {
    public final org.telegram.ui.e30 f40274a;

    public x10(org.telegram.ui.e30 e30Var, Context context) {
        super(context);
        this.f40274a = e30Var;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        c20.I0(this.f40274a);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
        if (View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10)) {
            z9 = true;
        } else {
            z9 = false;
        }
        org.telegram.ui.e30 e30Var = this.f40274a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e30Var.f32498j1.getLayoutParams();
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
        e30Var.f32497i1.setPadding(y10, 0, y10, 0);
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(370.0f), 1073741824));
        measureChildWithMargins(e30Var.f32499k1, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), 1073741824), 0);
    }
}
