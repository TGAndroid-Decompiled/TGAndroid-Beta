package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import java.util.Calendar;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.up0;
import org.telegram.ui.o60;
public final class s implements c20 {
    public final int f43135a;
    public final Object f43136b;
    public final Object f43137c;

    public s(int i7, Object obj, Object obj2) {
        this.f43135a = i7;
        this.f43136b = obj;
        this.f43137c = obj2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f43135a) {
            case 0:
                ((i0) this.f43136b).close();
                ((h8) this.f43137c).a((String) obj);
                return;
            case 1:
                ((l0) this.f43136b).f42763q.put((TL_wallet.walletTransaction) obj, (bi.f4) this.f43137c);
                return;
            case 2:
                g0 g0Var = (g0) this.f43136b;
                i8 i8Var = (i8) this.f43137c;
                String str = (String) obj;
                if (str != null) {
                    g0Var.close();
                    l0.j("prepare disable backup, failed to save secret phrase to local storage: ".concat(str));
                    i8Var.a(null, str);
                    return;
                }
                l0.H("prepare disable backup: done!");
                i8Var.a(g0Var, null);
                return;
            case 3:
                ((i0) this.f43136b).close();
                ((s) this.f43137c).a((String) obj);
                return;
            case 4:
                org.telegram.messenger.g0.h3(new g((y1) this.f43136b, (k) this.f43137c, (String) obj, 2));
                return;
            case 5:
                ((d2) this.f43136b).h = false;
                ((o60) this.f43137c).a(null, (String) obj);
                return;
            case 6:
                ((i0) this.f43136b).close();
                ((m) this.f43137c).a((String) obj);
                return;
            case 7:
                ((i0) this.f43136b).close();
                ((m) this.f43137c).a((String) obj);
                return;
            case 8:
                z5 z5Var = (z5) this.f43136b;
                l0 l0Var = (l0) this.f43137c;
                String str2 = (String) obj;
                z5Var.C0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str2)) {
                    g8 g8Var = new g8();
                    g8Var.f42544s = l0Var.y();
                    z5Var.presentFragment(g8Var);
                    return;
                } else if (str2 != null) {
                    gc.a0(z5Var).e0(str2, false);
                    return;
                } else {
                    z5Var.presentFragment(new y9());
                    return;
                }
            case 9:
                g8 g8Var2 = (g8) this.f43136b;
                l0 l0Var2 = (l0) this.f43137c;
                String str3 = (String) obj;
                g8Var2.d.setLoading(false);
                if (str3 != null) {
                    gc.a0(g8Var2).e0(str3, false);
                    return;
                }
                g8Var2.finishFragment();
                l0Var2.L();
                return;
            case 10:
                p8 p8Var = (p8) this.f43136b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f43137c;
                String str4 = (String) obj;
                if (str4 != null) {
                    gc.a0(p8Var).e0(str4, false);
                    return;
                }
                p8Var.finishFragment();
                if (f2Var instanceof z5) {
                    org.telegram.messenger.g0.i3(new m3(2, f2Var), 300L);
                    return;
                }
                return;
            case 11:
                y9 y9Var = (y9) this.f43136b;
                String str5 = (String) obj;
                ((c20) this.f43137c).a(str5);
                if (str5 == null && !y9Var.f43399r) {
                    if (y9Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.f2 f2Var2 : y9Var.getParentLayout().getFragmentStack()) {
                            if (f2Var2 instanceof z5) {
                                ((z5) f2Var2).P0();
                            }
                        }
                    }
                    y9Var.finishFragment();
                    return;
                }
                return;
            case 12:
                ja.d0((ja) this.f43136b, (TL_wallet.tonConnectSession) this.f43137c, (c20) obj);
                return;
            case 13:
                org.telegram.ui.web.o1 o1Var = (org.telegram.ui.web.o1) this.f43136b;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj;
                o1Var.getClass();
                ((org.telegram.ui.web.z0[]) this.f43137c)[0].finishFragment();
                c20 c20Var = o1Var.f51196f;
                if (c20Var != null) {
                    o1Var.finishFragment();
                    c20Var.a(y0Var);
                    return;
                }
                vf.c.t(o1Var.getParentActivity(), y0Var.f51339c);
                return;
            case 14:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.f43136b;
                w1Var.getClass();
                org.telegram.messenger.g0.h3(new r31(w1Var, (org.telegram.ui.web.v1) this.f43137c, (Bitmap) obj, 9));
                return;
            case 15:
                zh.g1 g1Var = (zh.g1) this.f43136b;
                c20 c20Var2 = (c20) this.f43137c;
                Boolean bool = (Boolean) obj;
                g1Var.getClass();
                if (c20Var2 != null) {
                    c20Var2.a(bool);
                }
                if (bool.booleanValue()) {
                    g1Var.N0 = true;
                }
                g1Var.dismiss();
                return;
            case 16:
                bi.v9 v9Var = (bi.v9) this.f43136b;
                bi.i0 i0Var = (bi.i0) this.f43137c;
                if (((Object[]) obj)[1] == v9Var) {
                    i0Var.run();
                    return;
                }
                return;
            case 17:
                up0 up0Var = (up0) this.f43136b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f43137c;
                String str6 = (String) obj;
                bi.t9 t9Var = up0Var.f60297e;
                int i7 = tL_starGiftCollection.collection_id;
                t9Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i10 = t9Var.f4755a;
                updatestargiftcollection.peer = qp.s1(i10).j1(t9Var.f4756b);
                updatestargiftcollection.collection_id = i7;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str6;
                ConnectionsManager.getInstance(i10).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str6;
                up0Var.f(true);
                return;
            default:
                zh.b4 b4Var = (zh.b4) this.f43136b;
                TLRPC.User user = (TLRPC.User) this.f43137c;
                Void r10 = (Void) obj;
                long j3 = b4Var.U1;
                Runnable runnable = b4Var.f60231b2;
                if (runnable != null) {
                    runnable.run();
                }
                b4Var.dismiss();
                qs.f(p10.f24474s0).k(188, new Object[0]);
                org.telegram.messenger.g0.i3(new zh.s3(0, user), 250L);
                qp.s1(b4Var.T1).f24778e7.edit().putBoolean("show_gift_for_" + j3, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j3, true).apply();
                return;
        }
    }

    public s(l0 l0Var, g0 g0Var, i8 i8Var) {
        this.f43135a = 2;
        this.f43136b = g0Var;
        this.f43137c = i8Var;
    }
}
