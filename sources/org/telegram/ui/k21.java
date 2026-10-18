package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class k21 implements m21 {
    public final org.telegram.ui.ActionBar.n2 f38382a;
    public final Context f38383b;
    public final org.telegram.ui.ActionBar.d6 f38384c;
    public final org.telegram.ui.Components.go0 d;

    public k21(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.go0 go0Var) {
        this.f38382a = n2Var;
        this.f38383b = context;
        this.f38384c = d6Var;
        this.d = go0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new e21(this.f38382a, this.f38383b, this.f38384c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new lv0(26, this.f38382a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f38382a;
        n2Var.showDialog(new sg.y0(n2Var, 3, true));
    }
}
