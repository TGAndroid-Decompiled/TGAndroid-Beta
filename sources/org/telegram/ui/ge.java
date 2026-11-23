package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
public final class ge implements Runnable {
    public final int f48032a;
    public final bn f48033b;
    public final String f48034c;

    public ge(bn bnVar, String str, int i7) {
        this.f48032a = i7;
        this.f48033b = bnVar;
        this.f48034c = str;
    }

    @Override
    public final void run() {
        int i7 = this.f48032a;
        String str = this.f48034c;
        bn bnVar = this.f48033b;
        switch (i7) {
            case 0:
                bn.t1(bnVar, str);
                return;
            case 1:
                bn.B1(bnVar, str);
                return;
            case 2:
                g4.d(str, bnVar.currentAccount, bnVar.f46064m1, null, bnVar.Ba);
                return;
            case 3:
                if (str != null) {
                    bnVar.getClass();
                    if (str.length() != 0) {
                        bnVar.getMessagesController().K4(str, bnVar.f45972f);
                        return;
                    }
                }
                bnVar.getSendMessagesHelper().r0(org.telegram.messenger.yy.b("/start", bnVar.f46056l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                bnVar.Oa(str);
                return;
            case 5:
                bnVar.getClass();
                bnVar.presentFragment(new org.telegram.ui.Wallet.da(str));
                return;
            case 6:
                String str2 = bnVar.getMessagesController().K6;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = bnVar.getParentActivity();
                StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str2);
                m10.append(Uri.encode(str));
                vf.c.v(parentActivity, m10.toString(), false);
                return;
            case 7:
                bnVar.Ga(str, false);
                return;
            case 8:
                Activity parentActivity2 = bnVar.getParentActivity();
                vf.c.t(parentActivity2, "tel:" + str);
                return;
            case 9:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.o10.t(null, 2131747101, org.telegram.ui.Components.lc.b0(bnVar));
                return;
            case 10:
                bn.a0(bnVar, str);
                return;
            case 11:
                Activity parentActivity3 = bnVar.getParentActivity();
                vf.c.t(parentActivity3, "tel:" + str);
                return;
            case 12:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.o10.t(null, 2131747101, org.telegram.ui.Components.lc.b0(bnVar));
                return;
            default:
                Activity parentActivity4 = bnVar.getParentActivity();
                vf.c.t(parentActivity4, "https://fragment.com/username/" + str);
                return;
        }
    }
}
