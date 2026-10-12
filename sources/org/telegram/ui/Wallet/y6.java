package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.zc;
public final class y6 implements Utilities.Callback {
    public final int f33886a;
    public final Object f33887b;
    public final Object f33888c;

    public y6(int i10, Object obj, Object obj2) {
        this.f33886a = i10;
        this.f33887b = obj;
        this.f33888c = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f33886a;
        Object obj2 = this.f33888c;
        Object obj3 = this.f33887b;
        switch (i10) {
            case 0:
                z6 z6Var = (z6) obj3;
                j0 j0Var = (j0) obj2;
                String str = (String) obj;
                z6Var.d.setLoading(false);
                if (str != null) {
                    zc.a0(z6Var).e0(str, false);
                    return;
                }
                z6Var.finishFragment();
                j0Var.I();
                return;
            case 1:
                k7 k7Var = (k7) obj3;
                k kVar = (k) obj2;
                String str2 = (String) obj;
                if (str2 != null) {
                    zc.a0(k7Var).e0(str2, false);
                    return;
                } else {
                    kVar.run();
                    return;
                }
            case 2:
                k7 k7Var2 = (k7) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                String str3 = (String) obj;
                if (str3 != null) {
                    zc.a0(k7Var2).e0(str3, false);
                    return;
                }
                k7Var2.finishFragment();
                if (m2Var instanceof z4) {
                    AndroidUtilities.runOnUIThread(new m(m2Var, 11), 300L);
                    return;
                }
                return;
            case 3:
                ((k7) obj3).f23964a.W2.N(true);
                ((Utilities.Callback) obj2).run((String) obj);
                return;
            case 4:
                r8 r8Var = (r8) obj3;
                String str4 = (String) obj;
                ((Utilities.Callback) obj2).run(str4);
                if (str4 == null && !r8Var.f33662n) {
                    if (r8Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.m2 m2Var2 : r8Var.getParentLayout().getFragmentStack()) {
                            if (m2Var2 instanceof z4) {
                                z4 z4Var = (z4) m2Var2;
                                z4Var.f33925f0 = 0;
                                di.h1 h1Var = z4Var.f33933n0;
                                if (h1Var != null) {
                                    h1Var.setPosition(0);
                                }
                            }
                        }
                    }
                    r8Var.finishFragment();
                    return;
                }
                return;
            case 5:
                c9.Y((c9) obj3, (TL_wallet.tonConnectSession) obj2, (Utilities.Callback) obj);
                return;
            case 6:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) obj3;
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                y1Var.getClass();
                ((org.telegram.ui.web.g1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = y1Var.e;
                if (callback != null) {
                    y1Var.finishFragment();
                    callback.run(c1Var);
                    return;
                }
                pf.d.s(y1Var.getParentActivity(), c1Var.f41323c);
                return;
            case 7:
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) obj3;
                h2Var.getClass();
                AndroidUtilities.runOnUIThread(new v70(h2Var, (org.telegram.ui.web.g2) obj2, (Bitmap) obj, 29));
                return;
            case 8:
                yh.p1 p1Var = (yh.p1) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                Boolean bool = (Boolean) obj;
                p1Var.getClass();
                if (callback2 != null) {
                    callback2.run(bool);
                }
                if (bool.booleanValue()) {
                    p1Var.skipDismissAnimation();
                }
                p1Var.dismiss();
                return;
            case 9:
                org.telegram.messenger.voip.f fVar = (org.telegram.messenger.voip.f) obj2;
                if (((Object[]) obj)[1] == ((zh.f5) obj3)) {
                    fVar.run();
                    return;
                }
                return;
            case 10:
                ns0 ns0Var = (ns0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str5 = (String) obj;
                zh.e5 e5Var = ns0Var.e;
                int i11 = tL_starGiftCollection.collection_id;
                e5Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i12 = e5Var.f50440a;
                updatestargiftcollection.peer = MessagesController.getInstance(i12).getInputPeer(e5Var.f50441b);
                updatestargiftcollection.collection_id = i11;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str5;
                ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str5;
                ns0Var.f(true);
                return;
            case 11:
                yh.x4 x4Var = (yh.x4) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                Void r12 = (Void) obj;
                long j10 = x4Var.Z;
                Runnable runnable = x4Var.f49206g0;
                if (runnable != null) {
                    runnable.run();
                }
                x4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new yh.o4(0, user), 250L);
                MessagesController.getInstance(x4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                return;
            case 12:
                zh.r3 r3Var = (zh.r3) obj3;
                String str6 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                zh.o3 o3Var = r3Var.f51078f0;
                fi.k[] kVarArr = r3Var.f51102t0;
                di.d dVar = r3Var.f51088k0;
                if (stargiftupgradepreview != null) {
                    o3Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    r3Var.s2(1, false, null);
                    o3Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str6), null);
                    kVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    kVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    kVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    r3Var.f51104v0.setVisibility(8);
                    r3Var.f51103u0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new zh.t0(r3Var, 4));
                    r3Var.show();
                    return;
                }
                return;
            case 13:
                zh.r3.n0((zh.r3) obj3, (org.telegram.ui.ActionBar.a2) obj2, (TL_stars.SavedStarGift) obj);
                return;
            case 14:
                zh.s2 s2Var = (zh.s2) obj3;
                s2Var.getClass();
                ((zh.q2) obj2).a((TL_stars.StarGift) obj, true);
                s2Var.d(true);
                return;
            case 15:
                zh.x2 x2Var = (zh.x2) obj3;
                ag.b bVar = (ag.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                pf.c cVar = x2Var.f51301n;
                if (cVar != null && bVar == x2Var.f51304q) {
                    cVar.c(false);
                }
                x2Var.f51303p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    x2Var.f51302o.put(bVar, new zh.v2(bVar, tL_payments_paymentFormStarGift));
                    x2Var.a(true);
                    return;
                }
                return;
            default:
                ((Utilities.Callback2) obj3).run((ag.a) obj, new zf.c((zh.h0[]) obj2, 16));
                return;
        }
    }
}
