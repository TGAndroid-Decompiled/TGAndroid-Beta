package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class nk0 extends rm0 {
    public final vk0 V2;

    public nk0(vk0 vk0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.V2 = vk0Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        vk0 vk0Var = this.V2;
        vb0 vb0Var = vk0Var.J;
        if (vb0Var != null) {
            vb0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 0));
        }
        super.onMeasure(i10, i11);
        vk0Var.j();
    }
}
