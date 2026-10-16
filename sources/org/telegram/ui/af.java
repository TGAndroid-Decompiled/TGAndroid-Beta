package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class af implements Runnable {
    public final int f33890a;
    public final fo f33891b;
    public final String f33892c;

    public af(fo foVar, String str, int i10) {
        this.f33890a = i10;
        this.f33891b = foVar;
        this.f33892c = str;
    }

    @Override
    public final void run() {
        switch (this.f33890a) {
            case 0:
                fo.q1(this.f33891b, this.f33892c);
                return;
            case 1:
                fo.u1(this.f33891b, this.f33892c);
                return;
            case 2:
                k4.f(this.f33892c, r1.currentAccount, r1.X0, null, this.f33891b.f35633ea);
                return;
            case 3:
                fo foVar = this.f33891b;
                String str = this.f33892c;
                if (str != null) {
                    foVar.getClass();
                    if (str.length() != 0) {
                        foVar.getMessagesController().sendBotStart(foVar.f35636f, str);
                        return;
                    }
                }
                foVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", foVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f33891b.qa(this.f33892c);
                return;
            case 5:
                this.f33891b.ia(this.f33892c, false);
                return;
            case 6:
                Activity parentActivity = this.f33891b.getParentActivity();
                pf.d.r(parentActivity, "tel:" + this.f33892c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f33892c);
                org.telegram.messenger.sk.p(R.string.PhoneCopied, org.telegram.ui.Components.zc.a0(this.f33891b));
                return;
            case 8:
                fo.d1(this.f33891b, this.f33892c);
                return;
            case 9:
                Activity parentActivity2 = this.f33891b.getParentActivity();
                pf.d.r(parentActivity2, "tel:" + this.f33892c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f33892c);
                org.telegram.messenger.sk.p(R.string.PhoneCopied, org.telegram.ui.Components.zc.a0(this.f33891b));
                return;
            case 11:
                fo foVar2 = this.f33891b;
                foVar2.getClass();
                foVar2.presentFragment(new org.telegram.ui.Wallet.j8(this.f33892c));
                return;
            case 12:
                fo foVar3 = this.f33891b;
                String str2 = foVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity3 = foVar3.getParentActivity();
                StringBuilder u10 = a1.g.u(str2);
                u10.append(Uri.encode(this.f33892c));
                pf.d.t(parentActivity3, u10.toString());
                return;
            default:
                Activity parentActivity4 = this.f33891b.getParentActivity();
                pf.d.r(parentActivity4, "https://fragment.com/username/" + this.f33892c);
                return;
        }
    }
}
