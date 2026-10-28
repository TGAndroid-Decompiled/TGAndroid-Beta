package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class dk extends s4.d0 {
    public final jg.e0 f27475r;

    public dk(jg.e0 e0Var, Context context) {
        super(context);
        this.f27475r = e0Var;
    }

    @Override
    public final int k(int i10, View view) {
        return org.telegram.messenger.t.B(56.0f, ((nk) this.f27475r.V).f30947r.getPaddingTop() - AndroidUtilities.statusBarHeight, super.k(i10, view));
    }

    @Override
    public final int m(int i10) {
        return super.m(i10) * 2;
    }
}
