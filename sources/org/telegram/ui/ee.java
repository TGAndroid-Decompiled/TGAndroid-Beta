package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
public final class ee implements Runnable {
    public final int f46753a;
    public final an f46754b;
    public final String f46755c;

    public ee(an anVar, String str, int i7) {
        this.f46753a = i7;
        this.f46754b = anVar;
        this.f46755c = str;
    }

    @Override
    public final void run() {
        int i7 = this.f46753a;
        String str = this.f46755c;
        an anVar = this.f46754b;
        switch (i7) {
            case 0:
                an.t1(anVar, str);
                return;
            case 1:
                an.B1(anVar, str);
                return;
            case 2:
                g4.d(str, anVar.currentAccount, anVar.f45277m1, null, anVar.Aa);
                return;
            case 3:
                if (str != null) {
                    anVar.getClass();
                    if (str.length() != 0) {
                        anVar.getMessagesController().A4(str, anVar.f45186f);
                        return;
                    }
                }
                anVar.getSendMessagesHelper().r0(org.telegram.messenger.cz.b("/start", anVar.f45258k6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                anVar.Oa(str);
                return;
            case 5:
                anVar.getClass();
                anVar.presentFragment(new org.telegram.ui.Wallet.p9(str));
                return;
            case 6:
                String str2 = anVar.getMessagesController().I6;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = anVar.getParentActivity();
                StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str2);
                m10.append(Uri.encode(str));
                vf.c.v(parentActivity, m10.toString(), false);
                return;
            case 7:
                anVar.Ga(str, false);
                return;
            case 8:
                Activity parentActivity2 = anVar.getParentActivity();
                vf.c.t(parentActivity2, "tel:" + str);
                return;
            case 9:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.i20.s(null, 2131747295, org.telegram.ui.Components.cc.a0(anVar));
                return;
            case 10:
                an.a0(anVar, str);
                return;
            case 11:
                Activity parentActivity3 = anVar.getParentActivity();
                vf.c.t(parentActivity3, "tel:" + str);
                return;
            case 12:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.i20.s(null, 2131747295, org.telegram.ui.Components.cc.a0(anVar));
                return;
            default:
                Activity parentActivity4 = anVar.getParentActivity();
                vf.c.t(parentActivity4, "https://fragment.com/username/" + str);
                return;
        }
    }
}
