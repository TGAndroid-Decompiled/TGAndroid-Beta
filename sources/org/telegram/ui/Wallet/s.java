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
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.s31;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.n60;
public final class s implements c20 {
    public final int f43071a;
    public final Object f43072b;
    public final Object f43073c;

    public s(int i7, Object obj, Object obj2) {
        this.f43071a = i7;
        this.f43072b = obj;
        this.f43073c = obj2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f43071a) {
            case 0:
                ((i0) this.f43072b).close();
                ((e8) this.f43073c).a((String) obj);
                return;
            case 1:
                ((l0) this.f43072b).f42694q.put((TL_wallet.walletTransaction) obj, (bi.f4) this.f43073c);
                return;
            case 2:
                g0 g0Var = (g0) this.f43072b;
                f8 f8Var = (f8) this.f43073c;
                String str = (String) obj;
                if (str != null) {
                    g0Var.close();
                    l0.j("prepare disable backup, failed to save secret phrase to local storage: ".concat(str));
                    f8Var.a(null, str);
                    return;
                }
                l0.H("prepare disable backup: done!");
                f8Var.a(g0Var, null);
                return;
            case 3:
                ((i0) this.f43072b).close();
                ((s) this.f43073c).a((String) obj);
                return;
            case 4:
                org.telegram.messenger.g0.h3(new g((y1) this.f43072b, (k) this.f43073c, (String) obj, 2));
                return;
            case 5:
                ((d2) this.f43072b).h = false;
                ((n60) this.f43073c).a(null, (String) obj);
                return;
            case 6:
                ((i0) this.f43072b).close();
                ((m) this.f43073c).a((String) obj);
                return;
            case 7:
                ((i0) this.f43072b).close();
                ((m) this.f43073c).a((String) obj);
                return;
            case 8:
                w5 w5Var = (w5) this.f43072b;
                l0 l0Var = (l0) this.f43073c;
                String str2 = (String) obj;
                w5Var.C0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str2)) {
                    d8 d8Var = new d8();
                    d8Var.f42381s = l0Var.y();
                    w5Var.presentFragment(d8Var);
                    return;
                } else if (str2 != null) {
                    hc.a0(w5Var).e0(str2, false);
                    return;
                } else {
                    w5Var.presentFragment(new v9());
                    return;
                }
            case 9:
                d8 d8Var2 = (d8) this.f43072b;
                l0 l0Var2 = (l0) this.f43073c;
                String str3 = (String) obj;
                d8Var2.d.setLoading(false);
                if (str3 != null) {
                    hc.a0(d8Var2).e0(str3, false);
                    return;
                }
                d8Var2.finishFragment();
                l0Var2.L();
                return;
            case 10:
                m8 m8Var = (m8) this.f43072b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f43073c;
                String str4 = (String) obj;
                if (str4 != null) {
                    hc.a0(m8Var).e0(str4, false);
                    return;
                }
                m8Var.finishFragment();
                if (f2Var instanceof w5) {
                    org.telegram.messenger.g0.i3(new i3(2, f2Var), 300L);
                    return;
                }
                return;
            case 11:
                v9 v9Var = (v9) this.f43072b;
                String str5 = (String) obj;
                ((c20) this.f43073c).a(str5);
                if (str5 == null && !v9Var.f43230r) {
                    if (v9Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.f2 f2Var2 : v9Var.getParentLayout().getFragmentStack()) {
                            if (f2Var2 instanceof w5) {
                                ((w5) f2Var2).O0();
                            }
                        }
                    }
                    v9Var.finishFragment();
                    return;
                }
                return;
            case 12:
                ga.d0((ga) this.f43072b, (TL_wallet.tonConnectSession) this.f43073c, (c20) obj);
                return;
            case 13:
                org.telegram.ui.web.o1 o1Var = (org.telegram.ui.web.o1) this.f43072b;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj;
                o1Var.getClass();
                ((org.telegram.ui.web.z0[]) this.f43073c)[0].finishFragment();
                c20 c20Var = o1Var.f51242f;
                if (c20Var != null) {
                    o1Var.finishFragment();
                    c20Var.a(y0Var);
                    return;
                }
                vf.c.t(o1Var.getParentActivity(), y0Var.f51385c);
                return;
            case 14:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.f43072b;
                w1Var.getClass();
                org.telegram.messenger.g0.h3(new s31(w1Var, (org.telegram.ui.web.v1) this.f43073c, (Bitmap) obj, 9));
                return;
            case 15:
                zh.g1 g1Var = (zh.g1) this.f43072b;
                c20 c20Var2 = (c20) this.f43073c;
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
                bi.v9 v9Var2 = (bi.v9) this.f43072b;
                bi.i0 i0Var = (bi.i0) this.f43073c;
                if (((Object[]) obj)[1] == v9Var2) {
                    i0Var.run();
                    return;
                }
                return;
            case 17:
                vp0 vp0Var = (vp0) this.f43072b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f43073c;
                String str6 = (String) obj;
                bi.t9 t9Var = vp0Var.f60295e;
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
                vp0Var.f(true);
                return;
            default:
                zh.b4 b4Var = (zh.b4) this.f43072b;
                TLRPC.User user = (TLRPC.User) this.f43073c;
                Void r10 = (Void) obj;
                long j3 = b4Var.R1;
                Runnable runnable = b4Var.Y1;
                if (runnable != null) {
                    runnable.run();
                }
                b4Var.dismiss();
                qs.f(p10.f24470s0).k(188, new Object[0]);
                org.telegram.messenger.g0.i3(new zh.s3(0, user), 250L);
                qp.s1(b4Var.Q1).f24774e7.edit().putBoolean("show_gift_for_" + j3, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j3, true).apply();
                return;
        }
    }

    public s(l0 l0Var, g0 g0Var, f8 f8Var) {
        this.f43071a = 2;
        this.f43072b = g0Var;
        this.f43073c = f8Var;
    }
}
