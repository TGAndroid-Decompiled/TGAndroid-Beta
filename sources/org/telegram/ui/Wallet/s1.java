package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.fc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f60;
import org.telegram.ui.n60;
import org.telegram.ui.p80;
import org.telegram.ui.wm;
public final class s1 implements n10 {
    public final int f43141a;
    public final Object f43142b;
    public final Object f43143c;

    public s1(int i3, Object obj, Object obj2) {
        this.f43141a = i3;
        this.f43142b = obj;
        this.f43143c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i3 = this.f43141a;
        Object obj3 = null;
        int i10 = 0;
        Object obj4 = this.f43143c;
        Object obj5 = this.f43142b;
        switch (i3) {
            case 0:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj5;
                n60 n60Var = (n60) obj4;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str = (String) obj2;
                if (str == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                n60Var.a(str);
                return;
            case 1:
                ((h0) obj5).close();
                ((f60) obj4).a((y1) obj, (String) obj2);
                return;
            case 2:
                ((h0) obj5).close();
                org.telegram.messenger.g0.h3(new g((s1) obj4, (TL_wallet.inputTonConnectOauthSession) obj, (String) obj2, 5));
                return;
            case 3:
                n8.g0((n8) obj5, (u10) obj4, (h0) obj, (String) obj2);
                return;
            case 4:
                w9 w9Var = (w9) obj5;
                m mVar = (m) obj4;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) != null) {
                    w9Var.f43357a0.setLoading(false);
                    return;
                }
                if (walletuseraddress != null) {
                    obj3 = walletuseraddress.address;
                }
                mVar.a(obj3);
                return;
            case 5:
                th.o oVar = (th.o) obj5;
                String str2 = (String) obj4;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i11 = oVar.f55440a;
                if (webpagepreview != null) {
                    hp.s1(i11).Y3(webpagepreview.users, false);
                    hp.s1(i11).S3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        obj3 = messageMedia.webpage;
                    }
                }
                oVar.f55441b.put(str2, obj3);
                ArrayList arrayList = (ArrayList) oVar.f55442c.remove(str2);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj6 = arrayList.get(i10);
                        i10++;
                        ((n10) obj6).a(obj3, tL_error);
                    }
                    return;
                }
                return;
            default:
                xg.a0 a0Var = (xg.a0) obj5;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj4;
                Boolean bool = (Boolean) obj;
                String str3 = (String) obj2;
                a0Var.f58640j2.f60461a.setLoading(false);
                if (a0Var.getContext() != null) {
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    p80 p80Var = LaunchActivity.K1.f41328y0;
                    if (T != null) {
                        if (bool.booleanValue()) {
                            a0Var.dismiss();
                            wm ra2 = wm.ra(-a0Var.U1.f27001id);
                            T.presentFragment(ra2);
                            T.whenFullyVisible(new u9.a(27, ra2, tL_starsGiveawayOption));
                            if (p80Var != null) {
                                p80Var.c(true);
                                return;
                            }
                            return;
                        } else if (str3 != null) {
                            a0Var.dismiss();
                            fc.a0(T).Q(2131624011, 36, bd.a0(null, null, 2131743888, str3)).j();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
