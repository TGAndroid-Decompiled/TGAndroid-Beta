package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
public final class fe implements Runnable {
    public final int f45264a;
    public final wm f45265b;
    public final String f45266c;

    public fe(wm wmVar, String str, int i3) {
        this.f45264a = i3;
        this.f45265b = wmVar;
        this.f45266c = str;
    }

    @Override
    public final void run() {
        int i3 = this.f45264a;
        String str = this.f45266c;
        wm wmVar = this.f45265b;
        switch (i3) {
            case 0:
                wm.x1(wmVar, str);
                return;
            case 1:
                wm.W0(wmVar, str);
                return;
            case 2:
                i4.d(str, wmVar.currentAccount, wmVar.m1, null, wmVar.f51557ya);
                return;
            case 3:
                if (str != null) {
                    wmVar.getClass();
                    if (str.length() != 0) {
                        wmVar.getMessagesController().A4(str, wmVar.f51306f);
                        return;
                    }
                }
                wmVar.getSendMessagesHelper().r0(org.telegram.messenger.wy.b("/start", wmVar.f51376k6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                wmVar.La(str);
                return;
            case 5:
                wmVar.Da(str, false);
                return;
            case 6:
                wmVar.getClass();
                wmVar.presentFragment(new org.telegram.ui.Wallet.m9(str));
                return;
            case 7:
                String str2 = wmVar.getMessagesController().H6;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = wmVar.getParentActivity();
                StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str2);
                l10.append(Uri.encode(str));
                sf.c.v(parentActivity, l10.toString(), false);
                return;
            case 8:
                Activity parentActivity2 = wmVar.getParentActivity();
                sf.c.t(parentActivity2, "tel:" + str);
                return;
            case 9:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.camera.q.r(null, 2131747303, org.telegram.ui.Components.fc.a0(wmVar));
                return;
            case 10:
                wm.l1(wmVar, str);
                return;
            case 11:
                Activity parentActivity3 = wmVar.getParentActivity();
                sf.c.t(parentActivity3, "tel:" + str);
                return;
            case 12:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.camera.q.r(null, 2131747303, org.telegram.ui.Components.fc.a0(wmVar));
                return;
            default:
                Activity parentActivity4 = wmVar.getParentActivity();
                sf.c.t(parentActivity4, "https://fragment.com/username/" + str);
                return;
        }
    }
}
