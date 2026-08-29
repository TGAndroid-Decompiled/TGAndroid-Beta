package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class p21 implements t21 {
    public final tn f41284a;
    public final Activity f41285b;
    public final org.telegram.ui.ActionBar.c6 f41286c;
    public final MessageObject d;

    public p21(tn tnVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject) {
        this.f41284a = tnVar;
        this.f41285b = activity;
        this.f41286c = c6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new j21(this.f41284a, this.f41285b, this.f41286c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new ke(this.f41284a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        tn tnVar = this.f41284a;
        tnVar.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) tnVar, 3, true));
    }
}
