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
    public final int f35053a;
    public final Object f35054b;
    public final Object f35055c;

    public x(int i10, Object obj, Object obj2) {
        this.f35053a = i10;
        this.f35054b = obj;
        this.f35055c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35053a) {
            case 0:
                h0 h0Var = (h0) this.f35054b;
                f8 f8Var = (f8) this.f35055c;
                String str = (String) obj;
                if (str != null) {
                    h0Var.close();
                    m0.i("prepare disable backup, failed to save secret phrase to local storage: ".concat(str));
                    f8Var.run(null, str);
                    return;
                }
                m0.F("prepare disable backup: done!");
                f8Var.run(h0Var, null);
                return;
            case 1:
                ((f2) this.f35054b).h = false;
                ((eh) this.f35055c).run(null, (String) obj);
                return;
            case 2:
                ((j0) this.f35054b).close();
                ((p) this.f35055c).run((String) obj);
                return;
            case 3:
                ((j0) this.f35054b).close();
                ((p) this.f35055c).run((String) obj);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new h((a2) this.f35054b, (l) this.f35055c, (String) obj, 7));
                return;
            case 5:
                ((j0) this.f35054b).close();
                ((x) this.f35055c).run((String) obj);
                return;
            case 6:
                m5 m5Var = (m5) this.f35054b;
                m0 m0Var = (m0) this.f35055c;
                String str2 = (String) obj;
                m5Var.D0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str2)) {
                    c8 c8Var = new c8();
                    c8Var.f34106s = m0Var.x();
                    m5Var.presentFragment(c8Var);
                    return;
                } else if (str2 != null) {
                    xc.a0(m5Var).e0(str2, false);
                    return;
                } else {
                    m5Var.presentFragment(new w9());
                    return;
                }
            case 7:
                c8 c8Var2 = (c8) this.f35054b;
                m0 m0Var2 = (m0) this.f35055c;
                String str3 = (String) obj;
                c8Var2.d.setLoading(false);
                if (str3 != null) {
                    xc.a0(c8Var2).e0(str3, false);
                    return;
                }
                c8Var2.finishFragment();
                m0Var2.J();
                return;
            case 8:
                n8 n8Var = (n8) this.f35054b;
                h hVar = (h) this.f35055c;
                String str4 = (String) obj;
                if (str4 != null) {
                    xc.a0(n8Var).e0(str4, false);
                    return;
                } else {
                    hVar.run();
                    return;
                }
            case 9:
                n8 n8Var2 = (n8) this.f35054b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f35055c;
                String str5 = (String) obj;
                if (str5 != null) {
                    xc.a0(n8Var2).e0(str5, false);
                    return;
                }
                n8Var2.finishFragment();
                if (n2Var instanceof m5) {
                    AndroidUtilities.runOnUIThread(new v2(2, n2Var), 300L);
                    return;
                }
                return;
            case 10:
                ((n8) this.f35054b).f31197a.W2.N(true);
                ((Utilities.Callback) this.f35055c).run((String) obj);
                return;
            case 11:
                w9 w9Var = (w9) this.f35054b;
                String str6 = (String) obj;
                ((Utilities.Callback) this.f35055c).run(str6);
                if (str6 == null && !w9Var.f35047n) {
                    if (w9Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.n2 n2Var2 : w9Var.getParentLayout().getFragmentStack()) {
                            if (n2Var2 instanceof m5) {
                                ((m5) n2Var2).I0();
                            }
                        }
                    }
                    w9Var.finishFragment();
                    return;
                }
                return;
            case 12:
                ga.Y((ga) this.f35054b, (TL_wallet.tonConnectSession) this.f35055c, (Utilities.Callback) obj);
                return;
            case 13:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.f35054b;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                x1Var.getClass();
                ((org.telegram.ui.web.f1[]) this.f35055c)[0].finishFragment();
                Utilities.Callback callback = x1Var.e;
                if (callback != null) {
                    x1Var.finishFragment();
                    callback.run(b1Var);
                    return;
                }
                pf.d.r(x1Var.getParentActivity(), b1Var.f42585c);
                return;
            case 14:
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) this.f35054b;
                h2Var.getClass();
                AndroidUtilities.runOnUIThread(new ay0(h2Var, (org.telegram.ui.web.g2) this.f35055c, (Bitmap) obj, 11));
                return;
            case 15:
                yh.p1 p1Var = (yh.p1) this.f35054b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f35055c;
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
                ai.y9 y9Var = (ai.y9) this.f35054b;
                ai.z zVar = (ai.z) this.f35055c;
                if (((Object[]) obj)[1] == y9Var) {
                    zVar.run();
                    return;
                }
                return;
            case 17:
                is0 is0Var = (is0) this.f35054b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f35055c;
                String str7 = (String) obj;
                ai.v9 v9Var = is0Var.e;
                int i10 = tL_starGiftCollection.collection_id;
                v9Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i11 = v9Var.f2329a;
                updatestargiftcollection.peer = MessagesController.getInstance(i11).getInputPeer(v9Var.f2330b);
                updatestargiftcollection.collection_id = i10;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str7;
                ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str7;
                is0Var.f(true);
                return;
            case 18:
                yh.y4 y4Var = (yh.y4) this.f35054b;
                TLRPC.User user = (TLRPC.User) this.f35055c;
                Void r10 = (Void) obj;
                long j10 = y4Var.Z;
                Runnable runnable = y4Var.f50644g0;
                if (runnable != null) {
                    runnable.run();
                }
                y4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new yh.p4(0, user), 250L);
                MessagesController.getInstance(y4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                return;
            default:
                zh.t0 t0Var = (zh.t0) this.f35054b;
                zh.q0 q0Var = (zh.q0) this.f35055c;
                Bitmap bitmap = (Bitmap) obj;
                if (!q0Var.D && q0Var.e == null) {
                    t0Var.E0(q0Var, bitmap);
                    return;
                }
                return;
        }
    }

    public x(m0 m0Var, h0 h0Var, f8 f8Var) {
        this.f35053a = 0;
        this.f35054b = h0Var;
        this.f35055c = f8Var;
    }
}
