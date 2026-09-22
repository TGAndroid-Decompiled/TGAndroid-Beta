package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class o31 implements Runnable {
    public final int f36106a;
    public final bo f36107b;
    public final Activity f36108c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final MessageObject e;

    public o31(bo boVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject, int i10) {
        this.f36106a = i10;
        this.f36107b = boVar;
        this.f36108c = activity;
        this.d = e6Var;
        this.e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f36106a) {
            case 0:
                bo boVar = this.f36107b;
                org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(boVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f36108c;
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
                bo boVar2 = this.f36107b;
                org.telegram.ui.Components.vc a03 = org.telegram.ui.Components.vc.a0(boVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f36108c;
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
                bo boVar3 = this.f36107b;
                org.telegram.ui.Components.vc a04 = org.telegram.ui.Components.vc.a0(boVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f36108c;
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
