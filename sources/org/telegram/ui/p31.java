package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class p31 implements Runnable {
    public final int f40840a;
    public final eo f40841b;
    public final Activity f40842c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final MessageObject f40843e;

    public p31(eo eoVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject, int i10) {
        this.f40840a = i10;
        this.f40841b = eoVar;
        this.f40842c = activity;
        this.d = c6Var;
        this.f40843e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f40840a) {
            case 0:
                eo eoVar = this.f40841b;
                org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(eoVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f40842c;
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
                MessageObject messageObject = this.f40843e;
                eoVar.Ja(messageObject);
                eoVar.La(messageObject);
                return;
            case 1:
                eo eoVar2 = this.f40841b;
                org.telegram.ui.Components.zc a03 = org.telegram.ui.Components.zc.a0(eoVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f40842c;
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
                MessageObject messageObject2 = this.f40843e;
                eoVar2.Ja(messageObject2);
                eoVar2.La(messageObject2);
                return;
            default:
                eo eoVar3 = this.f40841b;
                org.telegram.ui.Components.zc a04 = org.telegram.ui.Components.zc.a0(eoVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f40842c;
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
                MessageObject messageObject3 = this.f40843e;
                eoVar3.Ja(messageObject3);
                eoVar3.La(messageObject3);
                return;
        }
    }
}
