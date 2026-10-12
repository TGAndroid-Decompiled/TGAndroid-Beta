package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class a41 implements e41 {
    public final fo f34037a;
    public final Activity f34038b;
    public final org.telegram.ui.ActionBar.c6 f34039c;
    public final MessageObject d;

    public a41(fo foVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject) {
        this.f34037a = foVar;
        this.f34038b = activity;
        this.f34039c = c6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new u31(this.f34037a, this.f34038b, this.f34039c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new bf(this.f34037a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        fo foVar = this.f34037a;
        foVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) foVar, 3, true));
    }
}
