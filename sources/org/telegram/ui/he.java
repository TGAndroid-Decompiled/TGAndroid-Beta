package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
public final class he implements Runnable {
    public final int f46298a;
    public final cn f46299b;
    public final String f46300c;

    public he(cn cnVar, String str, int i7) {
        this.f46298a = i7;
        this.f46299b = cnVar;
        this.f46300c = str;
    }

    @Override
    public final void run() {
        int i7 = this.f46298a;
        String str = this.f46300c;
        cn cnVar = this.f46299b;
        switch (i7) {
            case 0:
                cn.t1(cnVar, str);
                return;
            case 1:
                cn.B1(cnVar, str);
                return;
            case 2:
                g4.d(str, cnVar.currentAccount, cnVar.l1, null, cnVar.f44709za);
                return;
            case 3:
                if (str != null) {
                    cnVar.getClass();
                    if (str.length() != 0) {
                        cnVar.getMessagesController().A4(str, cnVar.f44446f);
                        return;
                    }
                }
                cnVar.getSendMessagesHelper().r0(org.telegram.messenger.ez.b("/start", cnVar.f44504j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                cnVar.Na(str);
                return;
            case 5:
                cnVar.getClass();
                cnVar.presentFragment(new org.telegram.ui.Wallet.l9(str));
                return;
            case 6:
                String str2 = cnVar.getMessagesController().H6;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = cnVar.getParentActivity();
                StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str2);
                m10.append(Uri.encode(str));
                vf.c.v(parentActivity, m10.toString(), false);
                return;
            case 7:
                cnVar.Fa(str, false);
                return;
            case 8:
                Activity parentActivity2 = cnVar.getParentActivity();
                vf.c.t(parentActivity2, "tel:" + str);
                return;
            case 9:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.camera.q.r(null, 2131747295, org.telegram.ui.Components.hc.a0(cnVar));
                return;
            case 10:
                cn.a0(cnVar, str);
                return;
            case 11:
                Activity parentActivity3 = cnVar.getParentActivity();
                vf.c.t(parentActivity3, "tel:" + str);
                return;
            case 12:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.camera.q.r(null, 2131747295, org.telegram.ui.Components.hc.a0(cnVar));
                return;
            default:
                Activity parentActivity4 = cnVar.getParentActivity();
                vf.c.t(parentActivity4, "https://fragment.com/username/" + str);
                return;
        }
    }
}
