package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.ws0;
public final class s implements Utilities.Callback {
    public final int f37231a;
    public final Object f37232b;
    public final Object f37233c;

    public s(int i10, Object obj, Object obj2) {
        this.f37231a = i10;
        this.f37232b = obj;
        this.f37233c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37231a) {
            case 0:
                ((i0) this.f37232b).close();
                ((x7) this.f37233c).run((String) obj);
                return;
            case 1:
                ((l0) this.f37232b).f36847q.put((TL_wallet.walletTransaction) obj, (bi.f4) this.f37233c);
                return;
            case 2:
                g0 g0Var = (g0) this.f37232b;
                z7 z7Var = (z7) this.f37233c;
                String str = (String) obj;
                if (str != null) {
                    g0Var.close();
                    l0.j("prepare disable backup, failed to save secret phrase to local storage: ".concat(str));
                    z7Var.run(null, str);
                    return;
                }
                l0.H("prepare disable backup: done!");
                z7Var.run(g0Var, null);
                return;
            case 3:
                ((e2) this.f37232b).h = false;
                ((kh) this.f37233c).run(null, (String) obj);
                return;
            case 4:
                ((i0) this.f37232b).close();
                ((o) this.f37233c).run((String) obj);
                return;
            case 5:
                ((i0) this.f37232b).close();
                ((o) this.f37233c).run((String) obj);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new h((z1) this.f37232b, (k) this.f37233c, (String) obj, 7));
                return;
            case 7:
                ((i0) this.f37232b).close();
                ((s) this.f37233c).run((String) obj);
                return;
            case 8:
                m5 m5Var = (m5) this.f37232b;
                l0 l0Var = (l0) this.f37233c;
                String str2 = (String) obj;
                m5Var.C0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str2)) {
                    w7 w7Var = new w7();
                    w7Var.f37472s = l0Var.y();
                    m5Var.presentFragment(w7Var);
                    return;
                } else if (str2 != null) {
                    wc.b0(m5Var).f0(str2, false);
                    return;
                } else {
                    m5Var.presentFragment(new r9());
                    return;
                }
            case 9:
                w7 w7Var2 = (w7) this.f37232b;
                l0 l0Var2 = (l0) this.f37233c;
                String str3 = (String) obj;
                w7Var2.d.setLoading(false);
                if (str3 != null) {
                    wc.b0(w7Var2).f0(str3, false);
                    return;
                }
                w7Var2.finishFragment();
                l0Var2.L();
                return;
            case 10:
                h8 h8Var = (h8) this.f37232b;
                h hVar = (h) this.f37233c;
                String str4 = (String) obj;
                if (str4 != null) {
                    wc.b0(h8Var).f0(str4, false);
                    return;
                } else {
                    hVar.run();
                    return;
                }
            case 11:
                h8 h8Var2 = (h8) this.f37232b;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f37233c;
                String str5 = (String) obj;
                if (str5 != null) {
                    wc.b0(h8Var2).f0(str5, false);
                    return;
                }
                h8Var2.finishFragment();
                if (r2Var instanceof m5) {
                    AndroidUtilities.runOnUIThread(new t2(2, r2Var), 300L);
                    return;
                }
                return;
            case 12:
                ((h8) this.f37232b).f30764a.f32504g3.O(true);
                ((Utilities.Callback) this.f37233c).run((String) obj);
                return;
            case 13:
                r9 r9Var = (r9) this.f37232b;
                String str6 = (String) obj;
                ((Utilities.Callback) this.f37233c).run(str6);
                if (str6 == null && !r9Var.f37226r) {
                    if (r9Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.r2 r2Var2 : r9Var.getParentLayout().getFragmentStack()) {
                            if (r2Var2 instanceof m5) {
                                ((m5) r2Var2).K0();
                            }
                        }
                    }
                    r9Var.finishFragment();
                    return;
                }
                return;
            case 14:
                ca.Z((ca) this.f37232b, (TL_wallet.tonConnectSession) this.f37233c, (Utilities.Callback) obj);
                return;
            case 15:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.f37232b;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                y1Var.getClass();
                ((org.telegram.ui.web.f1[]) this.f37233c)[0].finishFragment();
                Utilities.Callback callback = y1Var.f44973f;
                if (callback != null) {
                    y1Var.finishFragment();
                    callback.run(b1Var);
                    return;
                }
                qf.d.r(y1Var.getParentActivity(), b1Var.f44712c);
                return;
            case 16:
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) this.f37232b;
                h2Var.getClass();
                AndroidUtilities.runOnUIThread(new oy0(h2Var, (org.telegram.ui.web.g2) this.f37233c, (Bitmap) obj, 11));
                return;
            case 17:
                zh.p1 p1Var = (zh.p1) this.f37232b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f37233c;
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
            case 18:
                bi.t9 t9Var = (bi.t9) this.f37232b;
                bi.a0 a0Var = (bi.a0) this.f37233c;
                if (((Object[]) obj)[1] == t9Var) {
                    a0Var.run();
                    return;
                }
                return;
            case 19:
                ws0 ws0Var = (ws0) this.f37232b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f37233c;
                String str7 = (String) obj;
                bi.q9 q9Var = ws0Var.e;
                int i10 = tL_starGiftCollection.collection_id;
                q9Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i11 = q9Var.f5291a;
                updatestargiftcollection.peer = MessagesController.getInstance(i11).getInputPeer(q9Var.f5292b);
                updatestargiftcollection.collection_id = i10;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str7;
                ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str7;
                ws0Var.f(true);
                return;
            default:
                zh.y4 y4Var = (zh.y4) this.f37232b;
                TLRPC.User user = (TLRPC.User) this.f37233c;
                Void r10 = (Void) obj;
                long j10 = y4Var.Z;
                Runnable runnable = y4Var.f53399g0;
                if (runnable != null) {
                    runnable.run();
                }
                y4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new zh.p4(0, user), 250L);
                MessagesController.getInstance(y4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                return;
        }
    }

    public s(l0 l0Var, g0 g0Var, z7 z7Var) {
        this.f37231a = 2;
        this.f37232b = g0Var;
        this.f37233c = z7Var;
    }
}
