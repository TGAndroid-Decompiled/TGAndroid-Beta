package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class i21 implements k21 {
    public final org.telegram.ui.ActionBar.n2 f37845a;
    public final Context f37846b;
    public final org.telegram.ui.ActionBar.d6 f37847c;
    public final org.telegram.ui.Components.ho0 d;

    public i21(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ho0 ho0Var) {
        this.f37845a = n2Var;
        this.f37846b = context;
        this.f37847c = d6Var;
        this.d = ho0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new c21(this.f37845a, this.f37846b, this.f37847c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new jv0(26, this.f37845a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f37845a;
        n2Var.showDialog(new sg.y0(n2Var, 3, true));
    }
}
