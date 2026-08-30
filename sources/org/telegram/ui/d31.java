package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class d31 implements f31 {
    public final org.telegram.ui.ActionBar.p2 f33504a;
    public final Context f33505b;
    public final org.telegram.ui.ActionBar.f6 f33506c;
    public final org.telegram.ui.Components.i80 d;

    public d31(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.i80 i80Var) {
        this.f33504a = p2Var;
        this.f33505b = context;
        this.f33506c = f6Var;
        this.d = i80Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new x21(this.f33504a, this.f33505b, this.f33506c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new l01(8, this.f33504a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f33504a;
        p2Var.showDialog(new eg.o1(p2Var, 3, true));
    }
}
