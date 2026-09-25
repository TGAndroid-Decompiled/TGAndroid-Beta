package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class l31 implements p31 {
    public final wn f35214a;
    public final Activity f35215b;
    public final org.telegram.ui.ActionBar.d6 f35216c;
    public final MessageObject d;

    public l31(wn wnVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject) {
        this.f35214a = wnVar;
        this.f35215b = activity;
        this.f35216c = d6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new f31(this.f35214a, this.f35215b, this.f35216c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new te(this.f35214a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        wn wnVar = this.f35214a;
        wnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) wnVar, 3, true));
    }
}
