package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class hv extends wv {
    public final wv W;

    public hv(wv wvVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(p2Var, context, f6Var, arrayList);
        this.W = wvVar;
    }

    @Override
    public final void Y() {
        this.W.dismiss();
    }
}
