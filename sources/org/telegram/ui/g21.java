package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class g21 implements k21 {
    public final qn f37177a;
    public final Activity f37178b;
    public final org.telegram.ui.ActionBar.d6 f37179c;
    public final MessageObject d;

    public g21(qn qnVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject) {
        this.f37177a = qnVar;
        this.f37178b = activity;
        this.f37179c = d6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new a21(this.f37177a, this.f37178b, this.f37179c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new se(this.f37177a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        qn qnVar = this.f37177a;
        qnVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) qnVar, 3, true));
    }
}
