package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class k31 implements m31 {
    public final org.telegram.ui.ActionBar.p2 f35414a;
    public final Context f35415b;
    public final org.telegram.ui.ActionBar.f6 f35416c;
    public final org.telegram.ui.Components.z80 d;

    public k31(org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.z80 z80Var) {
        this.f35414a = p2Var;
        this.f35415b = context;
        this.f35416c = f6Var;
        this.d = z80Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new e31(this.f35414a, this.f35415b, this.f35416c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new b11(7, this.f35414a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.p2 p2Var = this.f35414a;
        p2Var.showDialog(new eg.o1(p2Var, 3, true));
    }
}
