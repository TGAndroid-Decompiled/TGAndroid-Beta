package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class qj extends s4.d0 {
    public final hg.e0 f30046r;

    public qj(hg.e0 e0Var, Context context) {
        super(context);
        this.f30046r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.f0.A(8.0f, ((bk) this.f30046r.V).f24988s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
