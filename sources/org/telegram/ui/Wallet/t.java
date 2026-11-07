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
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.up0;
import org.telegram.ui.l60;
public final class t implements c20 {
    public final int f43143a;
    public final Object f43144b;
    public final Object f43145c;

    public t(int i7, Object obj, Object obj2) {
        this.f43143a = i7;
        this.f43144b = obj;
        this.f43145c = obj2;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f43143a) {
            case 0:
                ((k0) this.f43144b).close();
                ((g8) this.f43145c).a((String) obj);
                return;
            case 1:
                ((n0) this.f43144b).f42806q.put((TL_wallet.walletTransaction) obj, (bi.f4) this.f43145c);
                return;
            case 2:
                i0 i0Var = (i0) this.f43144b;
                h8 h8Var = (h8) this.f43145c;
                String str = (String) obj;
                if (str != null) {
                    i0Var.close();
                    n0.j("prepare disable backup, failed to save secret phrase to local storage: ".concat(str));
                    h8Var.a(null, str);
                    return;
                }
                n0.H("prepare disable backup: done!");
                h8Var.a(i0Var, null);
                return;
            case 3:
                ((k0) this.f43144b).close();
                ((t) this.f43145c).a((String) obj);
                return;
            case 4:
                org.telegram.messenger.g0.h3(new g((a2) this.f43144b, (k) this.f43145c, (String) obj, 2));
                return;
            case 5:
                ((f2) this.f43144b).h = false;
                ((l60) this.f43145c).a(null, (String) obj);
                return;
            case 6:
                ((k0) this.f43144b).close();
                ((m) this.f43145c).a((String) obj);
                return;
            case 7:
                ((k0) this.f43144b).close();
                ((m) this.f43145c).a((String) obj);
                return;
            case 8:
                y5 y5Var = (y5) this.f43144b;
                n0 n0Var = (n0) this.f43145c;
                String str2 = (String) obj;
                y5Var.C0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str2)) {
                    f8 f8Var = new f8();
                    f8Var.f42495s = n0Var.y();
                    y5Var.presentFragment(f8Var);
                    return;
                } else if (str2 != null) {
                    hc.a0(y5Var).e0(str2, false);
                    return;
                } else {
                    y5Var.presentFragment(new x9());
                    return;
                }
            case 9:
                f8 f8Var2 = (f8) this.f43144b;
                n0 n0Var2 = (n0) this.f43145c;
                String str3 = (String) obj;
                f8Var2.d.setLoading(false);
                if (str3 != null) {
                    hc.a0(f8Var2).e0(str3, false);
                    return;
                }
                f8Var2.finishFragment();
                n0Var2.L();
                return;
            case 10:
                o8 o8Var = (o8) this.f43144b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f43145c;
                String str4 = (String) obj;
                if (str4 != null) {
                    hc.a0(o8Var).e0(str4, false);
                    return;
                }
                o8Var.finishFragment();
                if (f2Var instanceof y5) {
                    org.telegram.messenger.g0.i3(new k3(2, f2Var), 300L);
                    return;
                }
                return;
            case 11:
                x9 x9Var = (x9) this.f43144b;
                String str5 = (String) obj;
                ((c20) this.f43145c).a(str5);
                if (str5 == null && !x9Var.f43343r) {
                    if (x9Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.f2 f2Var2 : x9Var.getParentLayout().getFragmentStack()) {
                            if (f2Var2 instanceof y5) {
                                ((y5) f2Var2).O0();
                            }
                        }
                    }
                    x9Var.finishFragment();
                    return;
                }
                return;
            case 12:
                ia.d0((ia) this.f43144b, (TL_wallet.tonConnectSession) this.f43145c, (c20) obj);
                return;
            case 13:
                org.telegram.ui.web.o1 o1Var = (org.telegram.ui.web.o1) this.f43144b;
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj;
                o1Var.getClass();
                ((org.telegram.ui.web.z0[]) this.f43145c)[0].finishFragment();
                c20 c20Var = o1Var.f51254f;
                if (c20Var != null) {
                    o1Var.finishFragment();
                    c20Var.a(y0Var);
                    return;
                }
                vf.c.t(o1Var.getParentActivity(), y0Var.f51397c);
                return;
            case 14:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) this.f43144b;
                w1Var.getClass();
                org.telegram.messenger.g0.h3(new r31(w1Var, (org.telegram.ui.web.v1) this.f43145c, (Bitmap) obj, 9));
                return;
            case 15:
                zh.h1 h1Var = (zh.h1) this.f43144b;
                c20 c20Var2 = (c20) this.f43145c;
                Boolean bool = (Boolean) obj;
                h1Var.getClass();
                if (c20Var2 != null) {
                    c20Var2.a(bool);
                }
                if (bool.booleanValue()) {
                    h1Var.N0 = true;
                }
                h1Var.dismiss();
                return;
            case 16:
                bi.v9 v9Var = (bi.v9) this.f43144b;
                bi.i0 i0Var2 = (bi.i0) this.f43145c;
                if (((Object[]) obj)[1] == v9Var) {
                    i0Var2.run();
                    return;
                }
                return;
            case 17:
                up0 up0Var = (up0) this.f43144b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f43145c;
                String str6 = (String) obj;
                bi.t9 t9Var = up0Var.f60220e;
                int i7 = tL_starGiftCollection.collection_id;
                t9Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i10 = t9Var.f4757a;
                updatestargiftcollection.peer = qp.s1(i10).j1(t9Var.f4758b);
                updatestargiftcollection.collection_id = i7;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str6;
                ConnectionsManager.getInstance(i10).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str6;
                up0Var.f(true);
                return;
            default:
                zh.b4 b4Var = (zh.b4) this.f43144b;
                TLRPC.User user = (TLRPC.User) this.f43145c;
                Void r10 = (Void) obj;
                long j3 = b4Var.R1;
                Runnable runnable = b4Var.Y1;
                if (runnable != null) {
                    runnable.run();
                }
                b4Var.dismiss();
                qs.f(p10.f24467s0).k(188, new Object[0]);
                org.telegram.messenger.g0.i3(new zh.s3(0, user), 250L);
                qp.s1(b4Var.Q1).f24767e7.edit().putBoolean("show_gift_for_" + j3, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j3, true).apply();
                return;
        }
    }

    public t(n0 n0Var, i0 i0Var, h8 h8Var) {
        this.f43143a = 2;
        this.f43144b = i0Var;
        this.f43145c = h8Var;
    }
}
