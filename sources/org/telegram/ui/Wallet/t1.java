package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.k60;
import org.telegram.ui.r60;
import org.telegram.ui.r80;
public final class t1 implements s10 {
    public final int f44505a;
    public final Object f44506b;
    public final Object f44507c;

    public t1(int i7, Object obj, Object obj2) {
        this.f44505a = i7;
        this.f44506b = obj;
        this.f44507c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i7 = this.f44505a;
        Object obj3 = null;
        int i10 = 0;
        Object obj4 = this.f44507c;
        Object obj5 = this.f44506b;
        switch (i7) {
            case 0:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj5;
                r60 r60Var = (r60) obj4;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str = (String) obj2;
                if (str == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                r60Var.a(str);
                return;
            case 1:
                ((i0) obj5).close();
                ((k60) obj4).a((z1) obj, (String) obj2);
                return;
            case 2:
                ((i0) obj5).close();
                org.telegram.messenger.g0.h3(new g((t1) obj4, (TL_wallet.inputTonConnectOauthSession) obj, (String) obj2, 5));
                return;
            case 3:
                p8.g0((p8) obj5, (z10) obj4, (i0) obj, (String) obj2);
                return;
            case 4:
                z9 z9Var = (z9) obj5;
                m mVar = (m) obj4;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) != null) {
                    z9Var.f44853a0.setLoading(false);
                    return;
                }
                if (walletuseraddress != null) {
                    obj3 = walletuseraddress.address;
                }
                mVar.a(obj3);
                return;
            case 5:
                sh.o oVar = (sh.o) obj5;
                String str2 = (String) obj4;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i11 = oVar.f56899a;
                if (webpagepreview != null) {
                    np.s1(i11).Y3(webpagepreview.users, false);
                    np.s1(i11).S3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        obj3 = messageMedia.webpage;
                    }
                }
                oVar.f56900b.put(str2, obj3);
                ArrayList arrayList = (ArrayList) oVar.f56901c.remove(str2);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj6 = arrayList.get(i10);
                        i10++;
                        ((s10) obj6).a(obj3, tL_error);
                    }
                    return;
                }
                return;
            default:
                wg.y yVar = (wg.y) obj5;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj4;
                Boolean bool = (Boolean) obj;
                String str3 = (String) obj2;
                yVar.f59284m2.f60632a.setLoading(false);
                if (yVar.getContext() != null) {
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    r80 r80Var = LaunchActivity.H1.f42663w0;
                    if (T != null) {
                        if (bool.booleanValue()) {
                            yVar.dismiss();
                            an ua2 = an.ua(-yVar.X1.f28051id);
                            T.presentFragment(ua2);
                            T.whenFullyVisible(new ug.t1(9, ua2, tL_starsGiveawayOption));
                            if (r80Var != null) {
                                r80Var.c(true);
                                return;
                            }
                            return;
                        } else if (str3 != null) {
                            yVar.dismiss();
                            cc.a0(T).Q(2131624012, 36, hd.a0(null, null, 2131743878, str3)).j();
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
