package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.eh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.la0;
import org.telegram.ui.n80;
import org.telegram.ui.ro0;
import org.telegram.ui.sn;
public final class s1 implements Utilities.Callback2 {
    public final int f34866a;
    public final Object f34867b;
    public final Object f34868c;

    public s1(int i10, Object obj, Object obj2) {
        this.f34866a = i10;
        this.f34867b = obj;
        this.f34868c = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        int i10 = this.f34866a;
        Object obj3 = null;
        int i11 = 0;
        Object obj4 = this.f34868c;
        Object obj5 = this.f34867b;
        switch (i10) {
            case 0:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj5;
                n80 n80Var = (n80) obj4;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                String str = (String) obj2;
                if (str == null) {
                    inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                }
                n80Var.run(str);
                return;
            case 1:
                ((j0) obj5).close();
                AndroidUtilities.runOnUIThread(new h((s1) obj4, (TL_wallet.inputTonConnectOauthSession) obj, (String) obj2, 5));
                return;
            case 2:
                ((j0) obj5).close();
                ((eh) obj4).run((b2) obj, (String) obj2);
                return;
            case 3:
                n8.b0((n8) obj5, (Utilities.Callback) obj4, (j0) obj, (String) obj2);
                return;
            case 4:
                w9 w9Var = (w9) obj5;
                p pVar = (p) obj4;
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                if (((String) obj2) != null) {
                    w9Var.V.setLoading(false);
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
                int i12 = rVar.f45834a;
                if (webpagepreview != null) {
                    MessagesController.getInstance(i12).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(i12).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia != null) {
                        obj3 = messageMedia.webpage;
                    }
                }
                rVar.f45835b.put(str2, obj3);
                ArrayList arrayList = (ArrayList) rVar.f45836c.remove(str2);
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
                zVar.f47858q0.f48988a.setLoading(false);
                if (zVar.getContext() != null) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    la0 la0Var = LaunchActivity.H1.f33194x0;
                    if (U != null) {
                        if (bool.booleanValue()) {
                            zVar.dismiss();
                            sn W9 = sn.W9(-zVar.f47844b0.f20279id);
                            U.presentFragment(W9);
                            U.whenFullyVisible(new uf.c(5, W9, tL_starsGiveawayOption));
                            if (la0Var != null) {
                                la0Var.c(true);
                                return;
                            }
                            return;
                        } else if (str3 != null) {
                            zVar.dismiss();
                            i2.d.s(R.string.UnknownErrorCode, new Object[]{str3}, xc.a0(U), R.raw.error, 36);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 7:
                yh.p2 p2Var = (yh.p2) obj5;
                ArrayList arrayList2 = (ArrayList) obj;
                s61 s61Var = (s61) obj2;
                ArrayList arrayList3 = ((ai.y9) obj4).f2498l;
                int size2 = arrayList3.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj7 = arrayList3.get(i13);
                    i13++;
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    if (savedStarGift.pinned_to_top) {
                        int i14 = ro0.f40801a;
                        f61 J = f61.J(ro0.class);
                        J.G = savedStarGift;
                        if (p2Var.f50506b == savedStarGift.gift.f20503id) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        J.K(z10);
                        J.f26156u = 1;
                        arrayList2.add(J);
                    }
                }
                return;
            default:
                zh.i0 i0Var = (zh.i0) obj5;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (i0Var.f51790w == ((int[]) obj4)[0]) {
                    i0Var.f51790w = 0;
                }
                if (tL_error2 != null) {
                    FileLog.e("QrShare: setShareTheme " + tL_error2.text);
                    if (!i0Var.E) {
                        zh.t0 t0Var = i0Var.f51784b;
                        t0Var.getClass();
                        t0Var.c1(R.drawable.msg_warning, LocaleController.getString(R.string.ErrorOccurred), null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
