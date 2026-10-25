package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.oa0;
import org.telegram.ui.q80;
import org.telegram.ui.un;
import org.telegram.ui.yo0;
public final class r1 implements Utilities.Callback2 {
    public final int f37153a;
    public final Object f37154b;
    public final Object f37155c;

    public r1(int i10, Object obj, Object obj2) {
        this.f37153a = i10;
        this.f37154b = obj;
        this.f37155c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        int i10 = this.f37153a;
        Object obj3 = null;
        int i11 = 0;
        Object obj4 = this.f37155c;
        Object obj5 = this.f37154b;
        switch (i10) {
            case 0:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj5;
                q80 q80Var = (q80) obj4;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str = (String) obj2;
                if (str == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                q80Var.run(str);
                return;
            case 1:
                ((i0) obj5).close();
                AndroidUtilities.runOnUIThread(new h((r1) obj4, (TL_wallet.inputTonConnectOauthSession) obj, (String) obj2, 5));
                return;
            case 2:
                ((i0) obj5).close();
                ((kh) obj4).run((a2) obj, (String) obj2);
                return;
            case 3:
                h8.c0((h8) obj5, (Utilities.Callback) obj4, (i0) obj, (String) obj2);
                return;
            case 4:
                r9 r9Var = (r9) obj5;
                o oVar = (o) obj4;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) != null) {
                    r9Var.Z.setLoading(false);
                    return;
                }
                if (walletuseraddress != null) {
                    obj3 = walletuseraddress.address;
                }
                oVar.run(obj3);
                return;
            case 5:
                sh.r rVar = (sh.r) obj5;
                String str2 = (String) obj4;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i12 = rVar.f48669a;
                if (webpagepreview != null) {
                    MessagesController.getInstance(i12).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i12).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        obj3 = messageMedia.webpage;
                    }
                }
                rVar.f48670b.put(str2, obj3);
                ArrayList arrayList = (ArrayList) rVar.f48671c.remove(str2);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj6 = arrayList.get(i11);
                        i11++;
                        ((Utilities.Callback2) obj6).run(obj3, tL_error);
                    }
                    return;
                }
                return;
            case 6:
                vg.a0 a0Var = (vg.a0) obj5;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj4;
                Boolean bool = (Boolean) obj;
                String str3 = (String) obj2;
                a0Var.f50130q0.f51748a.setLoading(false);
                if (a0Var.getContext() != null) {
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    oa0 oa0Var = LaunchActivity.I1.f35564x0;
                    if (U != null) {
                        if (bool.booleanValue()) {
                            a0Var.dismiss();
                            un ba2 = un.ba(-a0Var.f50116b0.f22027id);
                            U.presentFragment(ba2);
                            U.whenFullyVisible(new sg.u(23, ba2, tL_starsGiveawayOption));
                            if (oa0Var != null) {
                                oa0Var.c(true);
                                return;
                            }
                            return;
                        } else if (str3 != null) {
                            a0Var.dismiss();
                            ic.a.s(R.string.UnknownErrorCode, new Object[]{str3}, wc.b0(U), R.raw.error, 36);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                zh.q2 q2Var = (zh.q2) obj5;
                ArrayList arrayList2 = (ArrayList) obj;
                j71 j71Var = (j71) obj2;
                ArrayList arrayList3 = ((bi.t9) obj4).f5471l;
                int size2 = arrayList3.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj7 = arrayList3.get(i13);
                    i13++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    if (savedStarGift.pinned_to_top) {
                        int i14 = yo0.f46086a;
                        t61 K = t61.K(yo0.class);
                        K.G = savedStarGift;
                        if (q2Var.f53220b == savedStarGift.gift.f22254id) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        K.L(z10);
                        K.f32881u = 1;
                        arrayList2.add(K);
                    }
                }
                return;
        }
    }
}
