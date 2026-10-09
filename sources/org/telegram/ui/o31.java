package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class o31 implements Runnable {
    public final int f40408a;
    public final zn f40409b;
    public final Activity f40410c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final MessageObject f40411e;

    public o31(zn znVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject, int i10) {
        this.f40408a = i10;
        this.f40409b = znVar;
        this.f40410c = activity;
        this.d = e6Var;
        this.f40411e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f40408a) {
            case 0:
                zn znVar = this.f40409b;
                org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(znVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f40410c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                of.f.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                of.f.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                of.f.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.f40411e;
                znVar.Ja(messageObject);
                znVar.La(messageObject);
                return;
            case 1:
                zn znVar2 = this.f40409b;
                org.telegram.ui.Components.ad a03 = org.telegram.ui.Components.ad.a0(znVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f40410c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                of.f.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                of.f.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                of.f.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.f40411e;
                znVar2.Ja(messageObject2);
                znVar2.La(messageObject2);
                return;
            default:
                zn znVar3 = this.f40409b;
                org.telegram.ui.Components.ad a04 = org.telegram.ui.Components.ad.a0(znVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f40410c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                of.f.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                of.f.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                of.f.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.f40411e;
                znVar3.Ja(messageObject3);
                znVar3.La(messageObject3);
                return;
        }
    }
}
