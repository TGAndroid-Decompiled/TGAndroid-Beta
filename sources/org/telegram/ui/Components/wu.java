package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class wu extends lv {
    public final lv T;

    public wu(lv lvVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(p2Var, context, f6Var, arrayList);
        this.T = lvVar;
    }

    @Override
    public final void Y() {
        this.T.dismiss();
    }
}
