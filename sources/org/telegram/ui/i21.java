package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class i21 implements k21 {
    public final org.telegram.ui.ActionBar.n2 f37841a;
    public final Context f37842b;
    public final org.telegram.ui.ActionBar.d6 f37843c;
    public final org.telegram.ui.Components.ho0 d;

    public i21(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ho0 ho0Var) {
        this.f37841a = n2Var;
        this.f37842b = context;
        this.f37843c = d6Var;
        this.d = ho0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new c21(this.f37841a, this.f37842b, this.f37843c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new jv0(26, this.f37841a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f37841a;
        n2Var.showDialog(new sg.y0(n2Var, 3, true));
    }
}
