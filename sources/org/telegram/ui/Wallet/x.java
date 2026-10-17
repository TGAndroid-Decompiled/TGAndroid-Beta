package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.eh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.xc;
public final class x implements Utilities.Callback {
    public final int f35107a;
    public final Object f35108b;
    public final Object f35109c;

    public x(int i10, Object obj, Object obj2) {
        this.f35107a = i10;
        this.f35108b = obj;
        this.f35109c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35107a) {
            case 0:
                h0 h0Var = (h0) this.f35108b;
                c8 c8Var = (c8) this.f35109c;
                String str = (String) obj;
                if (str != null) {
                    h0Var.close();
                    m0.i("prepare disable backup, failed to save secret phrase to local storage: ".concat(str));
                    c8Var.run(null, str);
                    return;
                }
                m0.F("prepare disable backup: done!");
                c8Var.run(h0Var, null);
                return;
            case 1:
                ((f2) this.f35108b).h = false;
                ((eh) this.f35109c).run(null, (String) obj);
                return;
            case 2:
                ((j0) this.f35108b).close();
                ((p) this.f35109c).run((String) obj);
                return;
            case 3:
                ((j0) this.f35108b).close();
                ((p) this.f35109c).run((String) obj);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new h((a2) this.f35108b, (l) this.f35109c, (String) obj, 7));
                return;
            case 5:
                ((j0) this.f35108b).close();
                ((x) this.f35109c).run((String) obj);
                return;
            case 6:
                l5 l5Var = (l5) this.f35108b;
                m0 m0Var = (m0) this.f35109c;
                String str2 = (String) obj;
                l5Var.D0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str2)) {
                    z7 z7Var = new z7();
                    z7Var.f35217s = m0Var.x();
                    l5Var.presentFragment(z7Var);
                    return;
                } else if (str2 != null) {
                    xc.a0(l5Var).e0(str2, false);
                    return;
                } else {
                    l5Var.presentFragment(new t9());
                    return;
                }
            case 7:
                z7 z7Var2 = (z7) this.f35108b;
                m0 m0Var2 = (m0) this.f35109c;
                String str3 = (String) obj;
                z7Var2.d.setLoading(false);
                if (str3 != null) {
                    xc.a0(z7Var2).e0(str3, false);
                    return;
                }
                z7Var2.finishFragment();
                m0Var2.J();
                return;
            case 8:
                k8 k8Var = (k8) this.f35108b;
                h hVar = (h) this.f35109c;
                String str4 = (String) obj;
                if (str4 != null) {
                    xc.a0(k8Var).e0(str4, false);
                    return;
                } else {
                    hVar.run();
                    return;
                }
            case 9:
                k8 k8Var2 = (k8) this.f35108b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f35109c;
                String str5 = (String) obj;
                if (str5 != null) {
                    xc.a0(k8Var2).e0(str5, false);
                    return;
                }
                k8Var2.finishFragment();
                if (n2Var instanceof l5) {
                    AndroidUtilities.runOnUIThread(new v2(1, n2Var), 300L);
                    return;
                }
                return;
            case 10:
                ((k8) this.f35108b).f31190a.W2.N(true);
                ((Utilities.Callback) this.f35109c).run((String) obj);
                return;
            case 11:
                t9 t9Var = (t9) this.f35108b;
                String str6 = (String) obj;
                ((Utilities.Callback) this.f35109c).run(str6);
                if (str6 == null && !t9Var.f34910n) {
                    if (t9Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.n2 n2Var2 : t9Var.getParentLayout().getFragmentStack()) {
                            if (n2Var2 instanceof l5) {
                                ((l5) n2Var2).I0();
                            }
                        }
                    }
                    t9Var.finishFragment();
                    return;
                }
                return;
            case 12:
                da.Y((da) this.f35108b, (TL_wallet.tonConnectSession) this.f35109c, (Utilities.Callback) obj);
                return;
            case 13:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.f35108b;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                x1Var.getClass();
                ((org.telegram.ui.web.f1[]) this.f35109c)[0].finishFragment();
                Utilities.Callback callback = x1Var.e;
                if (callback != null) {
                    x1Var.finishFragment();
                    callback.run(b1Var);
                    return;
                }
                pf.d.r(x1Var.getParentActivity(), b1Var.f42560c);
                return;
            case 14:
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) this.f35108b;
                h2Var.getClass();
                AndroidUtilities.runOnUIThread(new ay0(h2Var, (org.telegram.ui.web.g2) this.f35109c, (Bitmap) obj, 11));
                return;
            case 15:
                yh.p1 p1Var = (yh.p1) this.f35108b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f35109c;
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
            case 16:
                ai.x9 x9Var = (ai.x9) this.f35108b;
                ai.z zVar = (ai.z) this.f35109c;
                if (((Object[]) obj)[1] == x9Var) {
                    zVar.run();
                    return;
                }
                return;
            case 17:
                is0 is0Var = (is0) this.f35108b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f35109c;
                String str7 = (String) obj;
                ai.v9 v9Var = is0Var.e;
                int i10 = tL_starGiftCollection.collection_id;
                v9Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i11 = v9Var.f2327a;
                updatestargiftcollection.peer = MessagesController.getInstance(i11).getInputPeer(v9Var.f2328b);
                updatestargiftcollection.collection_id = i10;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str7;
                ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str7;
                is0Var.f(true);
                return;
            default:
                yh.y4 y4Var = (yh.y4) this.f35108b;
                TLRPC.User user = (TLRPC.User) this.f35109c;
                Void r10 = (Void) obj;
                long j10 = y4Var.Z;
                Runnable runnable = y4Var.f50619g0;
                if (runnable != null) {
                    runnable.run();
                }
                y4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new yh.p4(0, user), 250L);
                MessagesController.getInstance(y4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                return;
        }
    }

    public x(m0 m0Var, h0 h0Var, c8 c8Var) {
        this.f35107a = 0;
        this.f35108b = h0Var;
        this.f35109c = c8Var;
    }
}
