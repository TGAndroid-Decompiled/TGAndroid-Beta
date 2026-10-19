package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class i21 implements k21 {
    public final org.telegram.ui.ActionBar.n2 f37835a;
    public final Context f37836b;
    public final org.telegram.ui.ActionBar.d6 f37837c;
    public final org.telegram.ui.Components.go0 d;

    public i21(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.go0 go0Var) {
        this.f37835a = n2Var;
        this.f37836b = context;
        this.f37837c = d6Var;
        this.d = go0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new c21(this.f37835a, this.f37836b, this.f37837c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new jv0(26, this.f37835a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f37835a;
        n2Var.showDialog(new sg.y0(n2Var, 3, true));
    }
}
