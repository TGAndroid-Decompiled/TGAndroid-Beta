package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class b31 implements f31 {
    public final xn f32778a;
    public final Activity f32779b;
    public final org.telegram.ui.ActionBar.f6 f32780c;
    public final MessageObject d;

    public b31(xn xnVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject) {
        this.f32778a = xnVar;
        this.f32779b = activity;
        this.f32780c = f6Var;
        this.d = messageObject;
    }

    @Override
    public final void a() {
        AndroidUtilities.runOnUIThread(new v21(this.f32778a, this.f32779b, this.f32780c, this.d, 2), 200L);
    }

    @Override
    public final void b() {
        AndroidUtilities.runOnUIThread(new re(this.f32778a, this.d, 8), 200L);
    }

    @Override
    public final void c() {
        xn xnVar = this.f32778a;
        xnVar.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) xnVar, 3, true));
    }
}
