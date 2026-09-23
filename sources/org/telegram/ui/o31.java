package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class o31 implements q31 {
    public final org.telegram.ui.ActionBar.n2 f35674a;
    public final Context f35675b;
    public final org.telegram.ui.ActionBar.d6 f35676c;
    public final org.telegram.ui.Components.oy d;

    public o31(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.oy oyVar) {
        this.f35674a = n2Var;
        this.f35675b = context;
        this.f35676c = d6Var;
        this.d = oyVar;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new i31(this.f35674a, this.f35675b, this.f35676c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new by0(20, this.f35674a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f35674a;
        n2Var.showDialog(new rg.x0(n2Var, 3, true));
    }
}
