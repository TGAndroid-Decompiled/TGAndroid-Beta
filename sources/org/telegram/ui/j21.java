package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class j21 implements n21 {
    public final sn f38443a;
    public final Activity f38444b;
    public final org.telegram.ui.ActionBar.g6 f38445c;
    public final MessageObject d;

    public j21(sn snVar, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, MessageObject messageObject) {
        this.f38443a = snVar;
        this.f38444b = activity;
        this.f38445c = g6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new d21(this.f38443a, this.f38444b, this.f38445c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new se(this.f38443a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        sn snVar = this.f38443a;
        snVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) snVar, 3, true));
    }
}
