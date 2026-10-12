package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class wv extends lw {
    public final lw W;

    public wv(lw lwVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList) {
        super(m2Var, context, c6Var, arrayList);
        this.W = lwVar;
    }

    @Override
    public final void Z() {
        this.W.dismiss();
    }
}
