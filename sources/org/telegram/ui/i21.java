package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class i21 implements Runnable {
    public final int f38993a;
    public final qn f38994b;
    public final Activity f38995c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final MessageObject f38996e;

    public i21(qn qnVar, Activity activity, org.telegram.ui.ActionBar.b6 b6Var, MessageObject messageObject, int i9) {
        this.f38993a = i9;
        this.f38994b = qnVar;
        this.f38995c = activity;
        this.d = b6Var;
        this.f38996e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f38993a) {
            case 0:
                qn qnVar = this.f38994b;
                org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(qnVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f38995c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                ve.e.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                ve.e.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                ve.e.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.f38996e;
                qnVar.Fa(messageObject);
                qnVar.Ha(messageObject);
                return;
            case 1:
                qn qnVar2 = this.f38994b;
                org.telegram.ui.Components.oc a03 = org.telegram.ui.Components.oc.a0(qnVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f38995c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                ve.e.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                ve.e.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                ve.e.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.f38996e;
                qnVar2.Fa(messageObject2);
                qnVar2.Ha(messageObject2);
                return;
            default:
                qn qnVar3 = this.f38994b;
                org.telegram.ui.Components.oc a04 = org.telegram.ui.Components.oc.a0(qnVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f38995c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                ve.e.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                ve.e.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                ve.e.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.f38996e;
                qnVar3.Fa(messageObject3);
                qnVar3.Ha(messageObject3);
                return;
        }
    }
}
