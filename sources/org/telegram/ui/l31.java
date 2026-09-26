package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class l31 implements p31 {
    public final wn f35212a;
    public final Activity f35213b;
    public final org.telegram.ui.ActionBar.d6 f35214c;
    public final MessageObject d;

    public l31(wn wnVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject) {
        this.f35212a = wnVar;
        this.f35213b = activity;
        this.f35214c = d6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new f31(this.f35212a, this.f35213b, this.f35214c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new te(this.f35212a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        wn wnVar = this.f35212a;
        wnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) wnVar, 3, true));
    }
}
