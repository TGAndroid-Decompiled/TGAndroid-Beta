package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class p21 implements s21 {
    public final wn f42288a;
    public final Activity f42289b;
    public final org.telegram.ui.ActionBar.u6 f42290c;
    public final MessageObject d;

    public p21(wn wnVar, Activity activity, org.telegram.ui.ActionBar.u6 u6Var, MessageObject messageObject) {
        this.f42288a = wnVar;
        this.f42289b = activity;
        this.f42290c = u6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new j21(this.f42288a, this.f42289b, this.f42290c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new te(this.f42288a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        wn wnVar = this.f42288a;
        wnVar.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) wnVar, 3, true));
    }
}
