package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class hv extends wv {
    public final wv W;

    public hv(wv wvVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(n2Var, context, d6Var, arrayList);
        this.W = wvVar;
    }

    @Override
    public final void X() {
        this.W.dismiss();
    }
}
