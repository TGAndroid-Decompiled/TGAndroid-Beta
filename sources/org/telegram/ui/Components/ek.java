package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ek extends s4.d0 {
    public final hg.e0 f23683r;

    public ek(hg.e0 e0Var, Context context) {
        super(context);
        this.f23683r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.w1.z(56.0f, ((ok) this.f23683r.V).f26824r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
