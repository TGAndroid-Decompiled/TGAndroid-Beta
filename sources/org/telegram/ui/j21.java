package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class j21 implements Runnable {
    public final int f39414a;
    public final tn f39415b;
    public final Activity f39416c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final MessageObject f39417e;

    public j21(tn tnVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject, int i10) {
        this.f39414a = i10;
        this.f39415b = tnVar;
        this.f39416c = activity;
        this.d = c6Var;
        this.f39417e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f39414a) {
            case 0:
                tn tnVar = this.f39415b;
                org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(tnVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f39416c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                ye.d.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                ye.d.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                ye.d.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.f39417e;
                tnVar.Fa(messageObject);
                tnVar.Ha(messageObject);
                return;
            case 1:
                tn tnVar2 = this.f39415b;
                org.telegram.ui.Components.tc a03 = org.telegram.ui.Components.tc.a0(tnVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f39416c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                ye.d.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                ye.d.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                ye.d.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.f39417e;
                tnVar2.Fa(messageObject2);
                tnVar2.Ha(messageObject2);
                return;
            default:
                tn tnVar3 = this.f39415b;
                org.telegram.ui.Components.tc a04 = org.telegram.ui.Components.tc.a0(tnVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f39416c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                ye.d.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                ye.d.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                ye.d.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.f39417e;
                tnVar3.Fa(messageObject3);
                tnVar3.Ha(messageObject3);
                return;
        }
    }
}
