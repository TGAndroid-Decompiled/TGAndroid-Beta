package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class tv extends iw {
    public final iw W;

    public tv(iw iwVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(n2Var, context, e6Var, arrayList);
        this.W = iwVar;
    }

    @Override
    public final void Z() {
        this.W.dismiss();
    }
}
