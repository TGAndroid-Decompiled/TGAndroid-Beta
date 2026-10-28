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
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ap0;
import org.telegram.ui.qa0;
import org.telegram.ui.r80;
import org.telegram.ui.wn;
public final class r1 implements Utilities.Callback2 {
    public final int f37180a;
    public final Object f37181b;
    public final Object f37182c;

    public r1(int i10, Object obj, Object obj2) {
        this.f37180a = i10;
        this.f37181b = obj;
        this.f37182c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        int i10 = this.f37180a;
        Object obj3 = null;
        int i11 = 0;
        Object obj4 = this.f37182c;
        Object obj5 = this.f37181b;
        switch (i10) {
            case 0:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj5;
                r80 r80Var = (r80) obj4;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str = (String) obj2;
                if (str == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                r80Var.run(str);
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
                int i12 = rVar.f48707a;
                if (webpagepreview != null) {
                    MessagesController.getInstance(i12).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i12).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        obj3 = messageMedia.webpage;
                    }
                }
                rVar.f48708b.put(str2, obj3);
                ArrayList arrayList = (ArrayList) rVar.f48709c.remove(str2);
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
                a0Var.f50168q0.f51809a.setLoading(false);
                if (a0Var.getContext() != null) {
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    qa0 qa0Var = LaunchActivity.I1.f35591x0;
                    if (U != null) {
                        if (bool.booleanValue()) {
                            a0Var.dismiss();
                            wn ea2 = wn.ea(-a0Var.f50154b0.f22028id);
                            U.presentFragment(ea2);
                            U.whenFullyVisible(new s9.g(24, ea2, tL_starsGiveawayOption));
                            if (qa0Var != null) {
                                qa0Var.c(true);
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
                k71 k71Var = (k71) obj2;
                ArrayList arrayList3 = ((bi.t9) obj4).f5471l;
                int size2 = arrayList3.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj7 = arrayList3.get(i13);
                    i13++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    if (savedStarGift.pinned_to_top) {
                        int i14 = ap0.f37806a;
                        u61 K = u61.K(ap0.class);
                        K.G = savedStarGift;
                        if (q2Var.f53281b == savedStarGift.gift.f22257id) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        K.L(z10);
                        K.f33258u = 1;
                        arrayList2.add(K);
                    }
                }
                return;
        }
    }
}
