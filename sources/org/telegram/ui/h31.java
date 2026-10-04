package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class h31 implements Runnable {
    public final int f36849a;
    public final yn f36850b;
    public final Activity f36851c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final MessageObject f36852e;

    public h31(yn ynVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject, int i10) {
        this.f36849a = i10;
        this.f36850b = ynVar;
        this.f36851c = activity;
        this.d = d6Var;
        this.f36852e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f36849a) {
            case 0:
                yn ynVar = this.f36850b;
                org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(ynVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f36851c;
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
                MessageObject messageObject = this.f36852e;
                ynVar.Ea(messageObject);
                ynVar.Ga(messageObject);
                return;
            case 1:
                yn ynVar2 = this.f36850b;
                org.telegram.ui.Components.yc a03 = org.telegram.ui.Components.yc.a0(ynVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f36851c;
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
                MessageObject messageObject2 = this.f36852e;
                ynVar2.Ea(messageObject2);
                ynVar2.Ga(messageObject2);
                return;
            default:
                yn ynVar3 = this.f36850b;
                org.telegram.ui.Components.yc a04 = org.telegram.ui.Components.yc.a0(ynVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f36851c;
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
                MessageObject messageObject3 = this.f36852e;
                ynVar3.Ea(messageObject3);
                ynVar3.Ga(messageObject3);
                return;
        }
    }
}
