package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class d31 implements h31 {
    public final xn f35991a;
    public final Activity f35992b;
    public final org.telegram.ui.ActionBar.g6 f35993c;
    public final MessageObject d;

    public d31(xn xnVar, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, MessageObject messageObject) {
        this.f35991a = xnVar;
        this.f35992b = activity;
        this.f35993c = g6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new x21(this.f35991a, this.f35992b, this.f35993c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new re(this.f35991a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        xn xnVar = this.f35991a;
        xnVar.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) xnVar, 3, true));
    }
}
