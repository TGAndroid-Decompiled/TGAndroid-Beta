package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class qj extends s4.d0 {
    public final hg.f0 f30074r;

    public qj(hg.f0 f0Var, Context context) {
        super(context);
        this.f30074r = f0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.q.A(8.0f, ((bk) this.f30074r.V).f25009s.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
