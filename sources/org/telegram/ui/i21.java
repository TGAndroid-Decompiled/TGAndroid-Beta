package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class i21 implements m21 {
    public final sn f37740a;
    public final Activity f37741b;
    public final org.telegram.ui.ActionBar.d6 f37742c;
    public final MessageObject d;

    public i21(sn snVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject) {
        this.f37740a = snVar;
        this.f37741b = activity;
        this.f37742c = d6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new c21(this.f37740a, this.f37741b, this.f37742c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ue(this.f37740a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        sn snVar = this.f37740a;
        snVar.showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) snVar, 3, true));
    }
}
