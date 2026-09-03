package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class i31 implements m31 {
    public final zn f34797a;
    public final Activity f34798b;
    public final org.telegram.ui.ActionBar.f6 f34799c;
    public final MessageObject d;

    public i31(zn znVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject) {
        this.f34797a = znVar;
        this.f34798b = activity;
        this.f34799c = f6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new c31(this.f34797a, this.f34798b, this.f34799c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new te(this.f34797a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        zn znVar = this.f34797a;
        znVar.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) znVar, 3, true));
    }
}
