package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class l31 implements p31 {
    public final wn f35181a;
    public final Activity f35182b;
    public final org.telegram.ui.ActionBar.d6 f35183c;
    public final MessageObject d;

    public l31(wn wnVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject) {
        this.f35181a = wnVar;
        this.f35182b = activity;
        this.f35183c = d6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new f31(this.f35181a, this.f35182b, this.f35183c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new te(this.f35181a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        wn wnVar = this.f35181a;
        wnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) wnVar, 3, true));
    }
}
