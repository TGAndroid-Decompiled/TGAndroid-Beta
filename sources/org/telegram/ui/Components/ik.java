package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ik extends s4.e0 {
    public final hg.f0 f27400r;

    public ik(hg.f0 f0Var, Context context) {
        super(context);
        this.f27400r = f0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.q.A(56.0f, ((sk) this.f27400r.V).f30810r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
