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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.ss0;
public final class a7 implements Utilities.Callback {
    public final int f34673a;
    public final Object f34674b;
    public final Object f34675c;

    public a7(int i10, Object obj, Object obj2) {
        this.f34673a = i10;
        this.f34674b = obj;
        this.f34675c = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f34673a;
        Object obj2 = this.f34675c;
        Object obj3 = this.f34674b;
        switch (i10) {
            case 0:
                b7 b7Var = (b7) obj3;
                k0 k0Var = (k0) obj2;
                String str = (String) obj;
                b7Var.d.setLoading(false);
                if (str != null) {
                    ad.a0(b7Var).e0(str, false);
                    return;
                }
                b7Var.finishFragment();
                k0Var.I();
                return;
            case 1:
                m7 m7Var = (m7) obj3;
                l lVar = (l) obj2;
                String str2 = (String) obj;
                if (str2 != null) {
                    ad.a0(m7Var).e0(str2, false);
                    return;
                } else {
                    lVar.run();
                    return;
                }
            case 2:
                m7 m7Var2 = (m7) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                String str3 = (String) obj;
                if (str3 != null) {
                    ad.a0(m7Var2).e0(str3, false);
                    return;
                }
                m7Var2.finishFragment();
                if (n2Var instanceof b5) {
                    AndroidUtilities.runOnUIThread(new n(n2Var, 11), 300L);
                    return;
                }
                return;
            case 3:
                ((m7) obj3).f26629a.W2.N(true);
                ((Utilities.Callback) obj2).run((String) obj);
                return;
            case 4:
                t8 t8Var = (t8) obj3;
                String str4 = (String) obj;
                ((Utilities.Callback) obj2).run(str4);
                if (str4 == null && !t8Var.f35585n) {
                    if (t8Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.n2 n2Var2 : t8Var.getParentLayout().getFragmentStack()) {
                            if (n2Var2 instanceof b5) {
                                b5 b5Var = (b5) n2Var2;
                                b5Var.f34715f0 = 0;
                                ci.h1 h1Var = b5Var.f34723n0;
                                if (h1Var != null) {
                                    h1Var.setPosition(0);
                                }
                            }
                        }
                    }
                    t8Var.finishFragment();
                    return;
                }
                return;
            case 5:
                d9.Y((d9) obj3, (TL_wallet.tonConnectSession) obj2, (Utilities.Callback) obj);
                return;
            case 6:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) obj3;
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                z1Var.getClass();
                ((org.telegram.ui.web.g1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = z1Var.f43607e;
                if (callback != null) {
                    z1Var.finishFragment();
                    callback.run(c1Var);
                    return;
                }
                of.f.s(z1Var.getParentActivity(), c1Var.f43326c);
                return;
            case 7:
                org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) obj3;
                i2Var.getClass();
                AndroidUtilities.runOnUIThread(new cf0(i2Var, (org.telegram.ui.web.h2) obj2, (Bitmap) obj, 26));
                return;
            case 8:
                xh.r1 r1Var = (xh.r1) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                Boolean bool = (Boolean) obj;
                r1Var.getClass();
                if (callback2 != null) {
                    callback2.run(bool);
                }
                if (bool.booleanValue()) {
                    r1Var.skipDismissAnimation();
                }
                r1Var.dismiss();
                return;
            case 9:
                org.telegram.messenger.voip.f fVar = (org.telegram.messenger.voip.f) obj2;
                if (((Object[]) obj)[1] == ((yh.e5) obj3)) {
                    fVar.run();
                    return;
                }
                return;
            case 10:
                ss0 ss0Var = (ss0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str5 = (String) obj;
                yh.d5 d5Var = ss0Var.f51558e;
                int i11 = tL_starGiftCollection.collection_id;
                d5Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i12 = d5Var.f52429a;
                updatestargiftcollection.peer = MessagesController.getInstance(i12).getInputPeer(d5Var.f52430b);
                updatestargiftcollection.collection_id = i11;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str5;
                ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str5;
                ss0Var.f(true);
                return;
            case 11:
                xh.z4 z4Var = (xh.z4) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                Void r12 = (Void) obj;
                long j3 = z4Var.Z;
                Runnable runnable = z4Var.f51674g0;
                if (runnable != null) {
                    runnable.run();
                }
                z4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new xh.q4(0, user), 250L);
                MessagesController.getInstance(z4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j3, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j3, true).apply();
                return;
            case 12:
                yh.s3 s3Var = (yh.s3) obj3;
                String str6 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                yh.p3 p3Var = s3Var.f53213f0;
                ei.k[] kVarArr = s3Var.f53237t0;
                ci.d dVar = s3Var.f53223k0;
                if (stargiftupgradepreview != null) {
                    p3Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    s3Var.s2(1, false, null);
                    p3Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str6), null);
                    kVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    kVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    kVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    s3Var.f53239v0.setVisibility(8);
                    s3Var.f53238u0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new yh.t0(s3Var, 4));
                    s3Var.show();
                    return;
                }
                return;
            case 13:
                yh.s3.n0((yh.s3) obj3, (org.telegram.ui.ActionBar.b2) obj2, (TL_stars.SavedStarGift) obj);
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
                of.e eVar = y2Var.f53464n;
                if (eVar != null && bVar == y2Var.f53467q) {
                    eVar.c(false);
                }
                y2Var.f53466p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    y2Var.f53465o.put(bVar, new yh.w2(bVar, tL_payments_paymentFormStarGift));
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
