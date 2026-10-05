package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class l31 implements p31 {
    public final yn f38219a;
    public final Activity f38220b;
    public final org.telegram.ui.ActionBar.d6 f38221c;
    public final MessageObject d;

    public l31(yn ynVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject) {
        this.f38219a = ynVar;
        this.f38220b = activity;
        this.f38221c = d6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new f31(this.f38219a, this.f38220b, this.f38221c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ve(this.f38219a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        yn ynVar = this.f38219a;
        ynVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) ynVar, 3, true));
    }
}
