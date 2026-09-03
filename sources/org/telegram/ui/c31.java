package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class c31 implements Runnable {
    public final int f33011a;
    public final zn f33012b;
    public final Activity f33013c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final MessageObject e;

    public c31(zn znVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject, int i10) {
        this.f33011a = i10;
        this.f33012b = znVar;
        this.f33013c = activity;
        this.d = f6Var;
        this.e = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f33011a) {
            case 0:
                zn znVar = this.f33012b;
                org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(znVar);
                String string = LocaleController.getString(R.string.AdReported);
                final Activity activity = this.f33013c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                ze.d.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                ze.d.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                ze.d.s(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                znVar.Fa(messageObject);
                znVar.Ha(messageObject);
                return;
            case 1:
                zn znVar2 = this.f33012b;
                org.telegram.ui.Components.qc a03 = org.telegram.ui.Components.qc.a0(znVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final Activity activity2 = this.f33013c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                ze.d.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                ze.d.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                ze.d.s(activity2, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                znVar2.Fa(messageObject2);
                znVar2.Ha(messageObject2);
                return;
            default:
                zn znVar3 = this.f33012b;
                org.telegram.ui.Components.qc a04 = org.telegram.ui.Components.qc.a0(znVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final Activity activity3 = this.f33013c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                ze.d.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                ze.d.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                ze.d.s(activity3, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                znVar3.Fa(messageObject3);
                znVar3.Ha(messageObject3);
                return;
        }
    }
}
