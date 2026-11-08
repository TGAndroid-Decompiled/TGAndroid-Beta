package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
public final class he implements Runnable {
    public final int f46353a;
    public final an f46354b;
    public final String f46355c;

    public he(an anVar, String str, int i7) {
        this.f46353a = i7;
        this.f46354b = anVar;
        this.f46355c = str;
    }

    @Override
    public final void run() {
        int i7 = this.f46353a;
        String str = this.f46355c;
        an anVar = this.f46354b;
        switch (i7) {
            case 0:
                an.x1(anVar, str);
                return;
            case 1:
                an.W0(anVar, str);
                return;
            case 2:
                g4.d(str, anVar.currentAccount, anVar.l1, null, anVar.f44028xa);
                return;
            case 3:
                if (str != null) {
                    anVar.getClass();
                    if (str.length() != 0) {
                        anVar.getMessagesController().A4(str, anVar.f43791f);
                        return;
                    }
                }
                anVar.getSendMessagesHelper().r0(org.telegram.messenger.ez.b("/start", anVar.f43848j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                anVar.La(str);
                return;
            case 5:
                anVar.Da(str, false);
                return;
            case 6:
                anVar.getClass();
                anVar.presentFragment(new org.telegram.ui.Wallet.m9(str));
                return;
            case 7:
                String str2 = anVar.getMessagesController().H6;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = anVar.getParentActivity();
                StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str2);
                m10.append(Uri.encode(str));
                vf.c.v(parentActivity, m10.toString(), false);
                return;
            case 8:
                Activity parentActivity2 = anVar.getParentActivity();
                vf.c.t(parentActivity2, "tel:" + str);
                return;
            case 9:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.camera.q.r(null, 2131747296, org.telegram.ui.Components.hc.a0(anVar));
                return;
            case 10:
                an.l1(anVar, str);
                return;
            case 11:
                Activity parentActivity3 = anVar.getParentActivity();
                vf.c.t(parentActivity3, "tel:" + str);
                return;
            case 12:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.camera.q.r(null, 2131747296, org.telegram.ui.Components.hc.a0(anVar));
                return;
            default:
                Activity parentActivity4 = anVar.getParentActivity();
                vf.c.t(parentActivity4, "https://fragment.com/username/" + str);
                return;
        }
    }
}
