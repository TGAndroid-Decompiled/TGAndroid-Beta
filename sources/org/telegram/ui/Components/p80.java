package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class p80 extends h9 {
    public final bg.z3 f31615e;

    public p80(bg.z3 z3Var, Context context) {
        super(context, false);
        this.f31615e = z3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int f9;
        int min = Math.min(3, ((r80) this.f31615e.f2639b).f32239w);
        if (min == 0) {
            f9 = 0;
        } else {
            f9 = com.google.android.recaptcha.internal.a.f(min, 1, 20, 32);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9), 1073741824), i11);
    }
}
