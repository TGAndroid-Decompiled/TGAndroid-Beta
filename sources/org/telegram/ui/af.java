package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
public final class af implements Runnable {
    public final int f34194a;
    public final fo f34195b;
    public final String f34196c;

    public af(fo foVar, String str, int i10) {
        this.f34194a = i10;
        this.f34195b = foVar;
        this.f34196c = str;
    }

    @Override
    public final void run() {
        switch (this.f34194a) {
            case 0:
                fo.q1(this.f34195b, this.f34196c);
                return;
            case 1:
                fo.u1(this.f34195b, this.f34196c);
                return;
            case 2:
                k4.f(this.f34196c, r1.currentAccount, r1.X0, null, this.f34195b.f35932ea);
                return;
            case 3:
                fo foVar = this.f34195b;
                String str = this.f34196c;
                if (str != null) {
                    foVar.getClass();
                    if (str.length() != 0) {
                        foVar.getMessagesController().sendBotStart(foVar.f35935f, str);
                        return;
                    }
                }
                foVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", foVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 4:
                this.f34195b.qa(this.f34196c);
                return;
            case 5:
                this.f34195b.ia(this.f34196c, false);
                return;
            case 6:
                Activity parentActivity = this.f34195b.getParentActivity();
                pf.d.s(parentActivity, "tel:" + this.f34196c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f34196c);
                org.telegram.messenger.yh.o(R.string.PhoneCopied, org.telegram.ui.Components.zc.a0(this.f34195b));
                return;
            case 8:
                fo.d1(this.f34195b, this.f34196c);
                return;
            case 9:
                Activity parentActivity2 = this.f34195b.getParentActivity();
                pf.d.s(parentActivity2, "tel:" + this.f34196c);
                return;
            case 10:
                AndroidUtilities.addToClipboard(this.f34196c);
                org.telegram.messenger.yh.o(R.string.PhoneCopied, org.telegram.ui.Components.zc.a0(this.f34195b));
                return;
            case 11:
                fo foVar2 = this.f34195b;
                foVar2.getClass();
                foVar2.presentFragment(new org.telegram.ui.Wallet.i8(this.f34196c));
                return;
            case 12:
                fo foVar3 = this.f34195b;
                String str2 = foVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity3 = foVar3.getParentActivity();
                StringBuilder u10 = a1.g.u(str2);
                u10.append(Uri.encode(this.f34196c));
                pf.d.u(parentActivity3, u10.toString());
                return;
            default:
                Activity parentActivity4 = this.f34195b.getParentActivity();
                pf.d.s(parentActivity4, "https://fragment.com/username/" + this.f34196c);
                return;
        }
    }
}
