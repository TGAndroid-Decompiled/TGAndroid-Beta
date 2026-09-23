package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class g31 implements Runnable {
    public final int f33448a;
    public final xn f33449b;
    public final Activity f33450c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final MessageObject e;

    public g31(xn xnVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject, int i10) {
        this.f33448a = i10;
        this.f33449b = xnVar;
        this.f33450c = activity;
        this.d = d6Var;
        this.e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f33448a) {
            case 0:
                xn xnVar = this.f33449b;
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(xnVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f33450c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                nf.f.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                nf.f.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                nf.f.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                xnVar.Fa(messageObject);
                xnVar.Ha(messageObject);
                return;
            case 1:
                xn xnVar2 = this.f33449b;
                org.telegram.ui.Components.xc a03 = org.telegram.ui.Components.xc.a0(xnVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f33450c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                nf.f.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                nf.f.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                nf.f.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                xnVar2.Fa(messageObject2);
                xnVar2.Ha(messageObject2);
                return;
            default:
                xn xnVar3 = this.f33449b;
                org.telegram.ui.Components.xc a04 = org.telegram.ui.Components.xc.a0(xnVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f33450c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                nf.f.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                nf.f.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                nf.f.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                xnVar3.Fa(messageObject3);
                xnVar3.Ha(messageObject3);
                return;
        }
    }
}
