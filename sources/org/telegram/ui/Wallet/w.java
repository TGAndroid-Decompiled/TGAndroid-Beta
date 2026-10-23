package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ih;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.xc;
public final class w implements Utilities.Callback {
    public final int f35333a;
    public final Object f35334b;
    public final Object f35335c;

    public w(int i10, Object obj, Object obj2) {
        this.f35333a = i10;
        this.f35334b = obj;
        this.f35335c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35333a) {
            case 0:
                g0 g0Var = (g0) this.f35334b;
                z7 z7Var = (z7) this.f35335c;
                String str = (String) obj;
                if (str != null) {
                    g0Var.close();
                    l0.i("prepare disable backup, failed to save secret phrase to local storage: ".concat(str));
                    z7Var.run(null, str);
                    return;
                }
                l0.F("prepare disable backup: done!");
                z7Var.run(g0Var, null);
                return;
            case 1:
                ((e2) this.f35334b).h = false;
                ((ih) this.f35335c).run(null, (String) obj);
                return;
            case 2:
                ((i0) this.f35334b).close();
                ((o) this.f35335c).run((String) obj);
                return;
            case 3:
                ((i0) this.f35334b).close();
                ((o) this.f35335c).run((String) obj);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new h((z1) this.f35334b, (k) this.f35335c, (String) obj, 7));
                return;
            case 5:
                ((i0) this.f35334b).close();
                ((w) this.f35335c).run((String) obj);
                return;
            case 6:
                o5 o5Var = (o5) this.f35334b;
                l0 l0Var = (l0) this.f35335c;
                String str2 = (String) obj;
                o5Var.B0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str2)) {
                    w7 w7Var = new w7();
                    w7Var.f35356s = l0Var.x();
                    o5Var.presentFragment(w7Var);
                    return;
                } else if (str2 != null) {
                    xc.a0(o5Var).e0(str2, false);
                    return;
                } else {
                    o5Var.presentFragment(new s9());
                    return;
                }
            case 7:
                w7 w7Var2 = (w7) this.f35334b;
                l0 l0Var2 = (l0) this.f35335c;
                String str3 = (String) obj;
                w7Var2.d.setLoading(false);
                if (str3 != null) {
                    xc.a0(w7Var2).e0(str3, false);
                    return;
                }
                w7Var2.finishFragment();
                l0Var2.J();
                return;
            case 8:
                i8 i8Var = (i8) this.f35334b;
                h hVar = (h) this.f35335c;
                String str4 = (String) obj;
                if (str4 != null) {
                    xc.a0(i8Var).e0(str4, false);
                    return;
                } else {
                    hVar.run();
                    return;
                }
            case 9:
                i8 i8Var2 = (i8) this.f35334b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f35335c;
                String str5 = (String) obj;
                if (str5 != null) {
                    xc.a0(i8Var2).e0(str5, false);
                    return;
                }
                i8Var2.finishFragment();
                if (o2Var instanceof o5) {
                    AndroidUtilities.runOnUIThread(new t2(2, o2Var), 300L);
                    return;
                }
                return;
            case 10:
                ((i8) this.f35334b).f25907a.Z2.N(true);
                ((Utilities.Callback) this.f35335c).run((String) obj);
                return;
            case 11:
                s9 s9Var = (s9) this.f35334b;
                String str6 = (String) obj;
                ((Utilities.Callback) this.f35335c).run(str6);
                if (str6 == null && !s9Var.f35185n) {
                    if (s9Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.o2 o2Var2 : s9Var.getParentLayout().getFragmentStack()) {
                            if (o2Var2 instanceof o5) {
                                ((o5) o2Var2).J0();
                            }
                        }
                    }
                    s9Var.finishFragment();
                    return;
                }
                return;
            case 12:
                da.Y((da) this.f35334b, (TL_wallet.tonConnectSession) this.f35335c, (Utilities.Callback) obj);
                return;
            case 13:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.f35334b;
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                y1Var.getClass();
                ((org.telegram.ui.web.g1[]) this.f35335c)[0].finishFragment();
                Utilities.Callback callback = y1Var.e;
                if (callback != null) {
                    y1Var.finishFragment();
                    callback.run(c1Var);
                    return;
                }
                pf.d.r(y1Var.getParentActivity(), c1Var.f43089c);
                return;
            case 14:
                org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) this.f35334b;
                i2Var.getClass();
                AndroidUtilities.runOnUIThread(new fy0(i2Var, (org.telegram.ui.web.h2) this.f35335c, (Bitmap) obj, 11));
                return;
            case 15:
                yh.o1 o1Var = (yh.o1) this.f35334b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f35335c;
                Boolean bool = (Boolean) obj;
                o1Var.getClass();
                if (callback2 != null) {
                    callback2.run(bool);
                }
                if (bool.booleanValue()) {
                    o1Var.skipDismissAnimation();
                }
                o1Var.dismiss();
                return;
            case 16:
                ai.y9 y9Var = (ai.y9) this.f35334b;
                ai.z zVar = (ai.z) this.f35335c;
                if (((Object[]) obj)[1] == y9Var) {
                    zVar.run();
                    return;
                }
                return;
            case 17:
                ns0 ns0Var = (ns0) this.f35334b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f35335c;
                String str7 = (String) obj;
                ai.v9 v9Var = ns0Var.e;
                int i10 = tL_starGiftCollection.collection_id;
                v9Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i11 = v9Var.f2319a;
                updatestargiftcollection.peer = MessagesController.getInstance(i11).getInputPeer(v9Var.f2320b);
                updatestargiftcollection.collection_id = i10;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str7;
                ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str7;
                ns0Var.f(true);
                return;
            case 18:
                yh.x4 x4Var = (yh.x4) this.f35334b;
                TLRPC.User user = (TLRPC.User) this.f35335c;
                Void r10 = (Void) obj;
                long j10 = x4Var.Z;
                Runnable runnable = x4Var.f51051g0;
                if (runnable != null) {
                    runnable.run();
                }
                x4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new yh.o4(0, user), 250L);
                MessagesController.getInstance(x4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                return;
            default:
                zh.c1 c1Var2 = (zh.c1) this.f35334b;
                zh.z0 z0Var = (zh.z0) this.f35335c;
                Bitmap bitmap = (Bitmap) obj;
                if (!z0Var.G && z0Var.e == null) {
                    c1Var2.E0(z0Var, bitmap);
                    return;
                }
                return;
        }
    }

    public w(l0 l0Var, g0 g0Var, z7 z7Var) {
        this.f35333a = 0;
        this.f35334b = g0Var;
        this.f35335c = z7Var;
    }
}
