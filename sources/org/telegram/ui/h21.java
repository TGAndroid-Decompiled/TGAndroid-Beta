package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class h21 implements Runnable {
    public final int f39875a;
    public final un f39876b;
    public final Activity f39877c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final MessageObject e;

    public h21(un unVar, Activity activity, org.telegram.ui.ActionBar.u6 u6Var, MessageObject messageObject, int i10) {
        this.f39875a = i10;
        this.f39876b = unVar;
        this.f39877c = activity;
        this.d = u6Var;
        this.e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f39875a) {
            case 0:
                un unVar = this.f39876b;
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(unVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f39877c;
                b02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                qf.d.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                qf.d.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                qf.d.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                unVar.Oa(messageObject);
                unVar.Qa(messageObject);
                return;
            case 1:
                un unVar2 = this.f39876b;
                org.telegram.ui.Components.wc b03 = org.telegram.ui.Components.wc.b0(unVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f39877c;
                b03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                qf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                qf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                qf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                unVar2.Oa(messageObject2);
                unVar2.Qa(messageObject2);
                return;
            default:
                un unVar3 = this.f39876b;
                org.telegram.ui.Components.wc b04 = org.telegram.ui.Components.wc.b0(unVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f39877c;
                b04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                qf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                qf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                qf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                unVar3.Oa(messageObject3);
                unVar3.Qa(messageObject3);
                return;
        }
    }
}
