package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ek extends s4.d0 {
    public final hg.e0 f23892r;

    public ek(hg.e0 e0Var, Context context) {
        super(context);
        this.f23892r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.q.B(56.0f, ((ok) this.f23892r.V).f26968r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
