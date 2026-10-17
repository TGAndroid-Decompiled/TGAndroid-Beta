package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class c21 implements Runnable {
    public final int f35798a;
    public final sn f35799b;
    public final Activity f35800c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final MessageObject e;

    public c21(sn snVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject, int i10) {
        this.f35798a = i10;
        this.f35799b = snVar;
        this.f35800c = activity;
        this.d = d6Var;
        this.e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f35798a) {
            case 0:
                sn snVar = this.f35799b;
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(snVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f35800c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                pf.d.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                pf.d.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                pf.d.r(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                snVar.Ja(messageObject);
                snVar.La(messageObject);
                return;
            case 1:
                sn snVar2 = this.f35799b;
                org.telegram.ui.Components.xc a03 = org.telegram.ui.Components.xc.a0(snVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f35800c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                pf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                pf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                pf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                snVar2.Ja(messageObject2);
                snVar2.La(messageObject2);
                return;
            default:
                sn snVar3 = this.f35799b;
                org.telegram.ui.Components.xc a04 = org.telegram.ui.Components.xc.a0(snVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f35800c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                pf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                pf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                pf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                snVar3.Ja(messageObject3);
                snVar3.La(messageObject3);
                return;
        }
    }
}
