package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class k21 implements o21 {
    public final sn f38754a;
    public final Activity f38755b;
    public final org.telegram.ui.ActionBar.g6 f38756c;
    public final MessageObject d;

    public k21(sn snVar, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, MessageObject messageObject) {
        this.f38754a = snVar;
        this.f38755b = activity;
        this.f38756c = g6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new e21(this.f38754a, this.f38755b, this.f38756c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new se(this.f38754a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        sn snVar = this.f38754a;
        snVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) snVar, 3, true));
    }
}
