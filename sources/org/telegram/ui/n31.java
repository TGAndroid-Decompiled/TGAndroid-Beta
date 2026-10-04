package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class n31 implements r31 {
    public final yn f38809a;
    public final Activity f38810b;
    public final org.telegram.ui.ActionBar.d6 f38811c;
    public final MessageObject d;

    public n31(yn ynVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject) {
        this.f38809a = ynVar;
        this.f38810b = activity;
        this.f38811c = d6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new h31(this.f38809a, this.f38810b, this.f38811c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ve(this.f38809a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        yn ynVar = this.f38809a;
        ynVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) ynVar, 3, true));
    }
}
