package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class m31 implements q31 {
    public final xn f35141a;
    public final Activity f35142b;
    public final org.telegram.ui.ActionBar.d6 f35143c;
    public final MessageObject d;

    public m31(xn xnVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject) {
        this.f35141a = xnVar;
        this.f35142b = activity;
        this.f35143c = d6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new g31(this.f35141a, this.f35142b, this.f35143c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new se(this.f35141a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        xn xnVar = this.f35141a;
        xnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) xnVar, 3, true));
    }
}
