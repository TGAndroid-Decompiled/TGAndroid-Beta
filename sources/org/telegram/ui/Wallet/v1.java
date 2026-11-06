package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.l60;
import org.telegram.ui.pl0;
import org.telegram.ui.r80;
public final class v1 implements v10 {
    public final int f43227a;
    public final Object f43228b;
    public final Object f43229c;

    public v1(int i7, Object obj, Object obj2) {
        this.f43227a = i7;
        this.f43228b = obj;
        this.f43229c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z9;
        int i7 = this.f43227a;
        Object obj3 = null;
        int i10 = 0;
        Object obj4 = this.f43229c;
        Object obj5 = this.f43228b;
        switch (i7) {
            case 0:
                ((k0) obj5).close();
                ((l60) obj4).a((b2) obj, (String) obj2);
                return;
            case 1:
                ((k0) obj5).close();
                org.telegram.messenger.g0.h3(new g((bi.p5) obj4, (TL_wallet.inputTonConnectOauthSession) obj, (String) obj2, 5));
                return;
            case 2:
                o8.g0((o8) obj5, (c20) obj4, (k0) obj, (String) obj2);
                return;
            case 3:
                x9 x9Var = (x9) obj5;
                m mVar = (m) obj4;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) != null) {
                    x9Var.Z.setLoading(false);
                    return;
                }
                if (walletuseraddress != null) {
                    obj3 = walletuseraddress.address;
                }
                mVar.a(obj3);
                return;
            case 4:
                sh.o oVar = (sh.o) obj5;
                String str = (String) obj4;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i11 = oVar.f55242a;
                if (webpagepreview != null) {
                    qp.s1(i11).Y3(webpagepreview.users, false);
                    qp.s1(i11).S3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        obj3 = messageMedia.webpage;
                    }
                }
                oVar.f55243b.put(str, obj3);
                ArrayList arrayList = (ArrayList) oVar.f55244c.remove(str);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj6 = arrayList.get(i10);
                        i10++;
                        ((v10) obj6).a(obj3, tL_error);
                    }
                    return;
                }
                return;
            case 5:
                wg.a0 a0Var = (wg.a0) obj5;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj4;
                Boolean bool = (Boolean) obj;
                String str2 = (String) obj2;
                a0Var.f57592i2.f59322a.setLoading(false);
                if (a0Var.getContext() != null) {
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    r80 r80Var = LaunchActivity.G1.f41289v0;
                    if (T != null) {
                        if (bool.booleanValue()) {
                            a0Var.dismiss();
                            an ra2 = an.ra(-a0Var.T1.f26953id);
                            T.presentFragment(ra2);
                            T.whenFullyVisible(new ti.p(24, ra2, tL_starsGiveawayOption));
                            if (r80Var != null) {
                                r80Var.c(true);
                                return;
                            }
                            return;
                        } else if (str2 != null) {
                            a0Var.dismiss();
                            hc.a0(T).Q(2131624011, 36, hd.a0(null, null, 2131743879, str2)).j();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                zh.e2 e2Var = (zh.e2) obj5;
                ArrayList arrayList2 = (ArrayList) obj;
                l41 l41Var = (l41) obj2;
                ArrayList arrayList3 = ((bi.v9) obj4).f4915l;
                int size2 = arrayList3.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj7 = arrayList3.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    if (savedStarGift.pinned_to_top) {
                        int i13 = pl0.f48847b;
                        x31 K = x31.K(pl0.class);
                        K.G = savedStarGift;
                        if (e2Var.f60205i1 == savedStarGift.gift.f27182id) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        K.L(z9);
                        K.f40168u = 1;
                        arrayList2.add(K);
                    }
                }
                return;
        }
    }
}
