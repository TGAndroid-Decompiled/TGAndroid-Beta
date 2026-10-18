package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class i21 implements m21 {
    public final sn f37702a;
    public final Activity f37703b;
    public final org.telegram.ui.ActionBar.d6 f37704c;
    public final MessageObject d;

    public i21(sn snVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject) {
        this.f37702a = snVar;
        this.f37703b = activity;
        this.f37704c = d6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new c21(this.f37702a, this.f37703b, this.f37704c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ue(this.f37702a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        sn snVar = this.f37702a;
        snVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) snVar, 3, true));
    }
}
