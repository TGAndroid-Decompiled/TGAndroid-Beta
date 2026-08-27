package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

public final class o21 implements s21 {

    public final rn f40979a;

    public final Activity f40980b;

    public final org.telegram.ui.ActionBar.c6 f40981c;
    public final MessageObject d;

    public o21(rn rnVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject) {
        this.f40979a = rnVar;
        this.f40980b = activity;
        this.f40981c = c6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new h21(this.f40979a, this.f40980b, this.f40981c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new me(this.f40979a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        rn rnVar = this.f40979a;
        rnVar.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) rnVar, 3, true));
    }
}
