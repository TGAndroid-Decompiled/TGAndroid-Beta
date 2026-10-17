package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class i21 implements m21 {
    public final sn f37726a;
    public final Activity f37727b;
    public final org.telegram.ui.ActionBar.d6 f37728c;
    public final MessageObject d;

    public i21(sn snVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject) {
        this.f37726a = snVar;
        this.f37727b = activity;
        this.f37728c = d6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new c21(this.f37726a, this.f37727b, this.f37728c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ue(this.f37726a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        sn snVar = this.f37726a;
        snVar.showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) snVar, 3, true));
    }
}
