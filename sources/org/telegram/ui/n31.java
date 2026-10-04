package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class n31 implements r31 {
    public final yn f38814a;
    public final Activity f38815b;
    public final org.telegram.ui.ActionBar.d6 f38816c;
    public final MessageObject d;

    public n31(yn ynVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject) {
        this.f38814a = ynVar;
        this.f38815b = activity;
        this.f38816c = d6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new h31(this.f38814a, this.f38815b, this.f38816c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ve(this.f38814a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        yn ynVar = this.f38814a;
        ynVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) ynVar, 3, true));
    }
}
