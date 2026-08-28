package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class p21 implements t21 {
    public final qn f41316a;
    public final Activity f41317b;
    public final org.telegram.ui.ActionBar.b6 f41318c;
    public final MessageObject d;

    public p21(qn qnVar, Activity activity, org.telegram.ui.ActionBar.b6 b6Var, MessageObject messageObject) {
        this.f41316a = qnVar;
        this.f41317b = activity;
        this.f41318c = b6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new i21(this.f41316a, this.f41317b, this.f41318c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new me(this.f41316a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        qn qnVar = this.f41316a;
        qnVar.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) qnVar, 3, true));
    }
}
