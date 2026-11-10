package org.telegram.ui.Components;

import android.content.Context;
public final class do0 extends org.telegram.ui.Cells.d7 {
    public final fo0 N;

    public do0(fo0 fo0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(0, context, h6Var);
        this.N = fo0Var;
    }

    @Override
    public final String a() {
        if (this.N.f33619f.V1) {
            return org.telegram.messenger.id.M0(2131746184, null);
        }
        return org.telegram.messenger.id.M0(2131750488, null);
    }
}
