package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class n21 implements q21 {
    public final un f41746a;
    public final Activity f41747b;
    public final org.telegram.ui.ActionBar.u6 f41748c;
    public final MessageObject d;

    public n21(un unVar, Activity activity, org.telegram.ui.ActionBar.u6 u6Var, MessageObject messageObject) {
        this.f41746a = unVar;
        this.f41747b = activity;
        this.f41748c = u6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new h21(this.f41746a, this.f41747b, this.f41748c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new te(this.f41746a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        un unVar = this.f41746a;
        unVar.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) unVar, 3, true));
    }
}
