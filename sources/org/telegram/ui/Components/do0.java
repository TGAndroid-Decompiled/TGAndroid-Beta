package org.telegram.ui.Components;

import android.content.Context;
public final class do0 extends org.telegram.ui.Cells.d7 {
    public final fo0 N;

    public do0(fo0 fo0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(0, context, f6Var);
        this.N = fo0Var;
    }

    @Override
    public final String a() {
        if (this.N.f33629f.S1) {
            return org.telegram.messenger.id.M0(2131746187, null);
        }
        return org.telegram.messenger.id.M0(2131750489, null);
    }
}
