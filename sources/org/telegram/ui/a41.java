package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class a41 implements e41 {
    public final fo f33740a;
    public final Activity f33741b;
    public final org.telegram.ui.ActionBar.c6 f33742c;
    public final MessageObject d;

    public a41(fo foVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject) {
        this.f33740a = foVar;
        this.f33741b = activity;
        this.f33742c = c6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new u31(this.f33740a, this.f33741b, this.f33742c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new bf(this.f33740a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        fo foVar = this.f33740a;
        foVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) foVar, 3, true));
    }
}
