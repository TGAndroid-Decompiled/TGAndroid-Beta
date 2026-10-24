package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pa0;
import org.telegram.ui.r80;
import org.telegram.ui.ro0;
import org.telegram.ui.sn;
public final class r1 implements Utilities.Callback2 {
    public final int f35099a;
    public final Object f35100b;
    public final Object f35101c;

    public r1(int i10, Object obj, Object obj2) {
        this.f35099a = i10;
        this.f35100b = obj;
        this.f35101c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        int i10 = this.f35099a;
        Object obj3 = null;
        int i11 = 0;
        Object obj4 = this.f35101c;
        Object obj5 = this.f35100b;
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
                ((jh) obj4).run((a2) obj, (String) obj2);
                return;
            case 3:
                i8.b0((i8) obj5, (Utilities.Callback) obj4, (i0) obj, (String) obj2);
                return;
            case 4:
                s9 s9Var = (s9) obj5;
                o oVar = (o) obj4;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) != null) {
                    s9Var.Y.setLoading(false);
                    return;
                }
                if (walletuseraddress != null) {
                    obj3 = walletuseraddress.address;
                }
                oVar.run(obj3);
                return;
            case 5:
                rh.r rVar = (rh.r) obj5;
                String str2 = (String) obj4;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i12 = rVar.f46220a;
                if (webpagepreview != null) {
                    MessagesController.getInstance(i12).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i12).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        obj3 = messageMedia.webpage;
                    }
                }
                rVar.f46221b.put(str2, obj3);
                ArrayList arrayList = (ArrayList) rVar.f46222c.remove(str2);
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
                ug.y yVar = (ug.y) obj5;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj4;
                Boolean bool = (Boolean) obj;
                String str3 = (String) obj2;
                yVar.f48254q0.f49388a.setLoading(false);
                if (yVar.getContext() != null) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    pa0 pa0Var = LaunchActivity.I1.f33503x0;
                    if (U != null) {
                        if (bool.booleanValue()) {
                            yVar.dismiss();
                            sn W9 = sn.W9(-yVar.f48240b0.f20344id);
                            U.presentFragment(W9);
                            U.whenFullyVisible(new u2.k0(7, W9, tL_starsGiveawayOption));
                            if (pa0Var != null) {
                                pa0Var.c(true);
                                return;
                            }
                            return;
                        } else if (str3 != null) {
                            yVar.dismiss();
                            i2.o1.t(R.string.UnknownErrorCode, new Object[]{str3}, vc.a0(U), R.raw.error, 36);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                yh.o2 o2Var = (yh.o2) obj5;
                ArrayList arrayList2 = (ArrayList) obj;
                a71 a71Var = (a71) obj2;
                ArrayList arrayList3 = ((ai.y9) obj4).f2511l;
                int size2 = arrayList3.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj7 = arrayList3.get(i13);
                    i13++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    if (savedStarGift.pinned_to_top) {
                        int i14 = ro0.f41194a;
                        l61 J = l61.J(ro0.class);
                        J.G = savedStarGift;
                        if (o2Var.f50912b == savedStarGift.gift.f20568id) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        J.K(z10);
                        J.f28236u = 1;
                        arrayList2.add(J);
                    }
                }
                return;
        }
    }
}
