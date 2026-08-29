package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public abstract class om extends org.telegram.ui.Components.jl0 implements lh.z6 {
    public final tn T2;

    public om(tn tnVar, Context context, rn rnVar) {
        super(context, rnVar);
        this.T2 = tnVar;
    }

    @Override
    public final void a(int[] iArr) {
        tn tnVar = this.T2;
        iArr[0] = ((int) tnVar.f42921o9) - AndroidUtilities.dp(4.0f);
        iArr[1] = org.telegram.messenger.x3.z(3.0f, tnVar.f42973t0.getPaddingBottom(), tnVar.f42973t0.getMeasuredHeight());
    }
}
