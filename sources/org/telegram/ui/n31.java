package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class n31 implements Runnable {
    public final int f35877a;
    public final bo f35878b;
    public final Activity f35879c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final MessageObject e;

    public n31(bo boVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject, int i10) {
        this.f35877a = i10;
        this.f35878b = boVar;
        this.f35879c = activity;
        this.d = e6Var;
        this.e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f35877a) {
            case 0:
                bo boVar = this.f35878b;
                org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(boVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f35879c;
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
                boVar.Fa(messageObject);
                boVar.Ha(messageObject);
                return;
            case 1:
                bo boVar2 = this.f35878b;
                org.telegram.ui.Components.vc a03 = org.telegram.ui.Components.vc.a0(boVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f35879c;
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
                boVar2.Fa(messageObject2);
                boVar2.Ha(messageObject2);
                return;
            default:
                bo boVar3 = this.f35878b;
                org.telegram.ui.Components.vc a04 = org.telegram.ui.Components.vc.a0(boVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f35879c;
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
                boVar3.Fa(messageObject3);
                boVar3.Ha(messageObject3);
                return;
        }
    }
}
