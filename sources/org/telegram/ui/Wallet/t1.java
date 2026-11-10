package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.o60;
import org.telegram.ui.sl0;
import org.telegram.ui.u80;
public final class t1 implements v10 {
    public final int f43177a;
    public final Object f43178b;
    public final Object f43179c;

    public t1(int i7, Object obj, Object obj2) {
        this.f43177a = i7;
        this.f43178b = obj;
        this.f43179c = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z9;
        int i7 = this.f43177a;
        Object obj3 = null;
        int i10 = 0;
        Object obj4 = this.f43179c;
        Object obj5 = this.f43178b;
        switch (i7) {
            case 0:
                ((i0) obj5).close();
                ((o60) obj4).a((z1) obj, (String) obj2);
                return;
            case 1:
                ((i0) obj5).close();
                org.telegram.messenger.g0.h3(new g((bi.p5) obj4, (TL_wallet.inputTonConnectOauthSession) obj, (String) obj2, 5));
                return;
            case 2:
                p8.g0((p8) obj5, (c20) obj4, (i0) obj, (String) obj2);
                return;
            case 3:
                y9 y9Var = (y9) obj5;
                m mVar = (m) obj4;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) != null) {
                    y9Var.Z.setLoading(false);
                    return;
                }
                if (walletuseraddress != null) {
                    obj3 = walletuseraddress.address;
                }
                mVar.a(obj3);
                return;
            case 4:
                sh.p pVar = (sh.p) obj5;
                String str = (String) obj4;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i11 = pVar.f55346a;
                if (webpagepreview != null) {
                    qp.s1(i11).Y3(webpagepreview.users, false);
                    qp.s1(i11).S3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        obj3 = messageMedia.webpage;
                    }
                }
                pVar.f55347b.put(str, obj3);
                ArrayList arrayList = (ArrayList) pVar.f55348c.remove(str);
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
                wg.z zVar = (wg.z) obj5;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj4;
                Boolean bool = (Boolean) obj;
                String str2 = (String) obj2;
                zVar.f57851l2.f59428a.setLoading(false);
                if (zVar.getContext() != null) {
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    u80 u80Var = LaunchActivity.G1.f41291v0;
                    if (T != null) {
                        if (bool.booleanValue()) {
                            zVar.dismiss();
                            cn ta2 = cn.ta(-zVar.W1.f26960id);
                            T.presentFragment(ta2);
                            T.whenFullyVisible(new u9.f(20, ta2, tL_starsGiveawayOption));
                            if (u80Var != null) {
                                u80Var.c(true);
                                return;
                            }
                            return;
                        } else if (str2 != null) {
                            zVar.dismiss();
                            gc.a0(T).Q(2131624011, 36, id.a0(null, null, 2131743878, str2)).j();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                zh.c2 c2Var = (zh.c2) obj5;
                ArrayList arrayList2 = (ArrayList) obj;
                m41 m41Var = (m41) obj2;
                ArrayList arrayList3 = ((bi.v9) obj4).f4914l;
                int size2 = arrayList3.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj7 = arrayList3.get(i12);
                    i12++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    if (savedStarGift.pinned_to_top) {
                        int i13 = sl0.f49878b;
                        x31 K = x31.K(sl0.class);
                        K.G = savedStarGift;
                        if (c2Var.l1 == savedStarGift.gift.f27189id) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        K.L(z9);
                        K.f40165u = 1;
                        arrayList2.add(K);
                    }
                }
                return;
        }
    }
}
