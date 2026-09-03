package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ha extends oa {
    public final int G = 1;
    public final org.telegram.ui.Components.ql0 H;

    public ha(ia iaVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, f6Var);
        this.H = iaVar;
        this.f36698a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.G) {
            case 0:
                return ((ia) this.H).f34882c.f37780r;
            default:
                kg.f fVar = ((dp) this.H).f33509c.X2.f34177a;
                if (fVar == null) {
                    return null;
                }
                return fVar.getText().toString();
        }
    }

    public ha(dp dpVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.H = dpVar;
    }
}
