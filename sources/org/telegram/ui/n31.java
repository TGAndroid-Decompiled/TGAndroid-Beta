package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class n31 implements r31 {
    public final xn f35806a;
    public final Activity f35807b;
    public final org.telegram.ui.ActionBar.e6 f35808c;
    public final MessageObject d;

    public n31(xn xnVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject) {
        this.f35806a = xnVar;
        this.f35807b = activity;
        this.f35808c = e6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new h31(this.f35806a, this.f35807b, this.f35808c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new we(this.f35806a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        xn xnVar = this.f35806a;
        xnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) xnVar, 3, true));
    }
}
