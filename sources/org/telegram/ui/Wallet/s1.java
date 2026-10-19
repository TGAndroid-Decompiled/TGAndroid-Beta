package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ja0;
import org.telegram.ui.l80;
import org.telegram.ui.po0;
import org.telegram.ui.qn;
public final class s1 implements Utilities.Callback2 {
    public final int f34824a;
    public final Object f34825b;
    public final Object f34826c;

    public s1(int i10, Object obj, Object obj2) {
        this.f34824a = i10;
        this.f34825b = obj;
        this.f34826c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        int i10 = this.f34824a;
        Object obj3 = null;
        int i11 = 0;
        Object obj4 = this.f34826c;
        Object obj5 = this.f34825b;
        switch (i10) {
            case 0:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj5;
                l80 l80Var = (l80) obj4;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str = (String) obj2;
                if (str == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                l80Var.run(str);
                return;
            case 1:
                ((j0) obj5).close();
                AndroidUtilities.runOnUIThread(new h((s1) obj4, (TL_wallet.inputTonConnectOauthSession) obj, (String) obj2, 5));
                return;
            case 2:
                ((j0) obj5).close();
                ((fh) obj4).run((b2) obj, (String) obj2);
                return;
            case 3:
                h8.b0((h8) obj5, (Utilities.Callback) obj4, (j0) obj, (String) obj2);
                return;
            case 4:
                r9 r9Var = (r9) obj5;
                p pVar = (p) obj4;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) != null) {
                    r9Var.V.setLoading(false);
                    return;
                }
                if (walletuseraddress != null) {
                    obj3 = walletuseraddress.address;
                }
                pVar.run(obj3);
                return;
            case 5:
                rh.r rVar = (rh.r) obj5;
                String str2 = (String) obj4;
                TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i12 = rVar.f45786a;
                if (webpagepreview != null) {
                    MessagesController.getInstance(i12).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i12).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        obj3 = messageMedia.webpage;
                    }
                }
                rVar.f45787b.put(str2, obj3);
                ArrayList arrayList = (ArrayList) rVar.f45788c.remove(str2);
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
                ug.z zVar = (ug.z) obj5;
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) obj4;
                Boolean bool = (Boolean) obj;
                String str3 = (String) obj2;
                zVar.f47811q0.f48940a.setLoading(false);
                if (zVar.getContext() != null) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    ja0 ja0Var = LaunchActivity.H1.f33193x0;
                    if (U != null) {
                        if (bool.booleanValue()) {
                            zVar.dismiss();
                            qn W9 = qn.W9(-zVar.f47797b0.f20275id);
                            U.presentFragment(W9);
                            U.whenFullyVisible(new uf.c(5, W9, tL_starsGiveawayOption));
                            if (ja0Var != null) {
                                ja0Var.c(true);
                                return;
                            }
                            return;
                        } else if (str3 != null) {
                            zVar.dismiss();
                            i2.e.s(R.string.UnknownErrorCode, new Object[]{str3}, xc.a0(U), R.raw.error, 36);
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
                t61 t61Var = (t61) obj2;
                ArrayList arrayList3 = ((ai.y9) obj4).f2499l;
                int size2 = arrayList3.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj7 = arrayList3.get(i13);
                    i13++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    if (savedStarGift.pinned_to_top) {
                        int i14 = po0.f40265a;
                        g61 J = g61.J(po0.class);
                        J.G = savedStarGift;
                        if (o2Var.f50445b == savedStarGift.gift.f20499id) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        J.K(z10);
                        J.f26508u = 1;
                        arrayList2.add(J);
                    }
                }
                return;
        }
    }
}
