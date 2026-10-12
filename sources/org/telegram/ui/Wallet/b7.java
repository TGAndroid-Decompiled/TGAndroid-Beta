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
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.Components.zc;
public final class b7 implements Utilities.Callback {
    public final int f34510a;
    public final Object f34511b;
    public final Object f34512c;

    public b7(int i10, Object obj, Object obj2) {
        this.f34510a = i10;
        this.f34511b = obj;
        this.f34512c = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f34510a;
        Object obj2 = this.f34512c;
        Object obj3 = this.f34511b;
        switch (i10) {
            case 0:
                c7 c7Var = (c7) obj3;
                l0 l0Var = (l0) obj2;
                String str = (String) obj;
                c7Var.d.setLoading(false);
                if (str != null) {
                    zc.a0(c7Var).e0(str, false);
                    return;
                }
                c7Var.finishFragment();
                l0Var.I();
                return;
            case 1:
                n7 n7Var = (n7) obj3;
                l lVar = (l) obj2;
                String str2 = (String) obj;
                if (str2 != null) {
                    zc.a0(n7Var).e0(str2, false);
                    return;
                } else {
                    lVar.run();
                    return;
                }
            case 2:
                n7 n7Var2 = (n7) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                String str3 = (String) obj;
                if (str3 != null) {
                    zc.a0(n7Var2).e0(str3, false);
                    return;
                }
                n7Var2.finishFragment();
                if (m2Var instanceof c5) {
                    AndroidUtilities.runOnUIThread(new n(m2Var, 11), 300L);
                    return;
                }
                return;
            case 3:
                ((n7) obj3).f27773a.W2.N(true);
                ((Utilities.Callback) obj2).run((String) obj);
                return;
            case 4:
                u8 u8Var = (u8) obj3;
                String str4 = (String) obj;
                ((Utilities.Callback) obj2).run(str4);
                if (str4 == null && !u8Var.f35425n) {
                    if (u8Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.m2 m2Var2 : u8Var.getParentLayout().getFragmentStack()) {
                            if (m2Var2 instanceof c5) {
                                c5 c5Var = (c5) m2Var2;
                                c5Var.f34555f0 = 0;
                                ci.h1 h1Var = c5Var.f34563n0;
                                if (h1Var != null) {
                                    h1Var.setPosition(0);
                                }
                            }
                        }
                    }
                    u8Var.finishFragment();
                    return;
                }
                return;
            case 5:
                e9.Y((e9) obj3, (TL_wallet.tonConnectSession) obj2, (Utilities.Callback) obj);
                return;
            case 6:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) obj3;
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                y1Var.getClass();
                ((org.telegram.ui.web.g1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = y1Var.f43490e;
                if (callback != null) {
                    y1Var.finishFragment();
                    callback.run(c1Var);
                    return;
                }
                of.f.s(y1Var.getParentActivity(), c1Var.f43220c);
                return;
            case 7:
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) obj3;
                h2Var.getClass();
                AndroidUtilities.runOnUIThread(new mh0(h2Var, (org.telegram.ui.web.g2) obj2, (Bitmap) obj, 24));
                return;
            case 8:
                xh.q1 q1Var = (xh.q1) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                Boolean bool = (Boolean) obj;
                q1Var.getClass();
                if (callback2 != null) {
                    callback2.run(bool);
                }
                if (bool.booleanValue()) {
                    q1Var.skipDismissAnimation();
                }
                q1Var.dismiss();
                return;
            case 9:
                org.telegram.messenger.voip.f fVar = (org.telegram.messenger.voip.f) obj2;
                if (((Object[]) obj)[1] == ((yh.f5) obj3)) {
                    fVar.run();
                    return;
                }
                return;
            case 10:
                xs0 xs0Var = (xs0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str5 = (String) obj;
                yh.d5 d5Var = xs0Var.f51724e;
                int i11 = tL_starGiftCollection.collection_id;
                d5Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i12 = d5Var.f52609a;
                updatestargiftcollection.peer = MessagesController.getInstance(i12).getInputPeer(d5Var.f52610b);
                updatestargiftcollection.collection_id = i11;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str5;
                ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str5;
                xs0Var.f(true);
                return;
            case 11:
                xh.y4 y4Var = (xh.y4) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                Void r12 = (Void) obj;
                long j3 = y4Var.Z;
                Runnable runnable = y4Var.f51842g0;
                if (runnable != null) {
                    runnable.run();
                }
                y4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new xh.p4(0, user), 250L);
                MessagesController.getInstance(y4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j3, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j3, true).apply();
                return;
            case 12:
                yh.s3 s3Var = (yh.s3) obj3;
                String str6 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                yh.p3 p3Var = s3Var.f53393f0;
                ei.k[] kVarArr = s3Var.f53417t0;
                ci.d dVar = s3Var.f53403k0;
                if (stargiftupgradepreview != null) {
                    p3Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    s3Var.s2(1, false, null);
                    p3Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str6), null);
                    kVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    kVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    kVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    s3Var.f53419v0.setVisibility(8);
                    s3Var.f53418u0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new yh.t0(s3Var, 4));
                    s3Var.show();
                    return;
                }
                return;
            case 13:
                yh.s3.n0((yh.s3) obj3, (org.telegram.ui.ActionBar.a2) obj2, (TL_stars.SavedStarGift) obj);
                return;
            case 14:
                yh.t2 t2Var = (yh.t2) obj3;
                t2Var.getClass();
                ((yh.r2) obj2).a((TL_stars.StarGift) obj, true);
                t2Var.d(true);
                return;
            case 15:
                yh.y2 y2Var = (yh.y2) obj3;
                zf.b bVar = (zf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                of.e eVar = y2Var.f53644n;
                if (eVar != null && bVar == y2Var.f53647q) {
                    eVar.c(false);
                }
                y2Var.f53646p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    y2Var.f53645o.put(bVar, new yh.w2(bVar, tL_payments_paymentFormStarGift));
                    y2Var.a(true);
                    return;
                }
                return;
            default:
                ((Utilities.Callback2) obj3).run((zf.a) obj, new yh.f0((yh.h0[]) obj2, 9));
                return;
        }
    }
}
