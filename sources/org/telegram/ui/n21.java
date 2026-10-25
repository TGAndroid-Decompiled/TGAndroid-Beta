package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class n21 implements q21 {
    public final un f41743a;
    public final Activity f41744b;
    public final org.telegram.ui.ActionBar.u6 f41745c;
    public final MessageObject d;

    public n21(un unVar, Activity activity, org.telegram.ui.ActionBar.u6 u6Var, MessageObject messageObject) {
        this.f41743a = unVar;
        this.f41744b = activity;
        this.f41745c = u6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new h21(this.f41743a, this.f41744b, this.f41745c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new te(this.f41743a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        un unVar = this.f41743a;
        unVar.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) unVar, 3, true));
    }
}
