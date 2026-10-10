package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class uv extends jw {
    public final jw W;

    public uv(jw jwVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(n2Var, context, e6Var, arrayList);
        this.W = jwVar;
    }

    @Override
    public final void Z() {
        this.W.dismiss();
    }
}
