package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class l21 implements n21 {
    public final org.telegram.ui.ActionBar.o2 f39109a;
    public final Context f39110b;
    public final org.telegram.ui.ActionBar.g6 f39111c;
    public final org.telegram.ui.Components.jo0 d;

    public l21(org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.jo0 jo0Var) {
        this.f39109a = o2Var;
        this.f39110b = context;
        this.f39111c = g6Var;
        this.d = jo0Var;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new f21(this.f39109a, this.f39110b, this.f39111c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new lv0(26, this.f39109a, this.d), 200L);
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.o2 o2Var = this.f39109a;
        o2Var.showDialog(new sg.y0(o2Var, 3, true));
    }
}
