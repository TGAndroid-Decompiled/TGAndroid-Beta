package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class i31 implements m31 {
    public final xn f37536a;
    public final Activity f37537b;
    public final org.telegram.ui.ActionBar.g6 f37538c;
    public final MessageObject d;

    public i31(xn xnVar, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, MessageObject messageObject) {
        this.f37536a = xnVar;
        this.f37537b = activity;
        this.f37538c = g6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new c31(this.f37536a, this.f37537b, this.f37538c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new re(this.f37536a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        xn xnVar = this.f37536a;
        xnVar.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) xnVar, 3, true));
    }
}
