package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class k2 implements Runnable {
    public final int f27697a = 0;
    public final long f27698b;
    public final boolean f27699c;
    public final Object d;
    public final Object e;
    public final Object f27700f;

    public k2(Context context, String str, long j10, boolean z10, gf.e eVar) {
        this.d = context;
        this.e = str;
        this.f27698b = j10;
        this.f27699c = z10;
        this.f27700f = eVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.h0 h0Var;
        org.telegram.ui.Wallet.h0 h0Var2;
        Object obj;
        jx0 r10;
        boolean z10 = false;
        switch (this.f27697a) {
            case 0:
                Context context = (Context) this.d;
                long j10 = this.f27698b;
                boolean z11 = this.f27699c;
                gf.e eVar = (gf.e) this.f27700f;
                Uri parse = Uri.parse((String) this.e);
                if (j10 == 0) {
                    z10 = true;
                }
                gf.f.p(context, parse, z10, z11, eVar);
                return;
            case 1:
                w7 w7Var = (w7) this.d;
                long j11 = this.f27698b;
                boolean z12 = this.f27699c;
                TLRPC.Document document = (TLRPC.Document) this.e;
                Runnable runnable = (Runnable) this.f27700f;
                HashSet hashSet = org.telegram.messenger.wp.r1(w7Var.f21584a).G1().f17623b;
                if (z12) {
                    hashSet.add(Long.valueOf(j11));
                } else {
                    hashSet.remove(Long.valueOf(j11));
                }
                long e = org.telegram.messenger.e20.i(w7Var.f21584a).e();
                TLRPC.UserFull a2 = org.telegram.messenger.wp.r1(w7Var.f21584a).a2(e);
                if (a2 != null) {
                    if (z12) {
                        a2.flags2 |= 2097152;
                        a2.saved_music = document;
                    } else {
                        TLRPC.Document document2 = a2.saved_music;
                        if (document2 != null && document2.f19800id == j11) {
                            a2.flags2 &= -2097153;
                            a2.saved_music = null;
                        }
                    }
                    org.telegram.messenger.is.a0(w7Var.f21584a).j2(a2, true);
                    org.telegram.messenger.at.f(w7Var.f21584a).k(246, Long.valueOf(e));
                }
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.d;
                long j12 = this.f27698b;
                String str = (String) this.e;
                boolean z13 = this.f27699c;
                org.telegram.messenger.r20 r20Var = (org.telegram.messenger.r20) this.f27700f;
                try {
                    obj = org.telegram.ui.Wallet.p0.f35003f;
                    synchronized (obj) {
                        p0Var.c(j12);
                        r10 = p0Var.r();
                    }
                } catch (Exception e7) {
                    e = e7;
                    h0Var = null;
                }
                if (((LinkedHashMap) r10.e).containsKey(str)) {
                    h0Var = p0Var.h(r10, str, j12);
                    try {
                        synchronized (obj) {
                            p0Var.c(j12);
                            if (z13) {
                                try {
                                    r10.f27589b = ConnectionsManager.getInstance(p0Var.f35007b).getCurrentTime();
                                    if (!p0Var.d.exists()) {
                                        if (p0Var.q().edit().putInt("lastUsageDate", r10.f27589b).commit()) {
                                            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.n0(20));
                                        } else {
                                            throw new IOException("usage write");
                                        }
                                    } else {
                                        p0Var.v(r10, new LinkedHashMap());
                                    }
                                } catch (Exception e10) {
                                    org.telegram.messenger.f8.g(e10, true);
                                }
                            }
                        }
                        h0Var2 = h0Var;
                    } catch (Exception e11) {
                        e = e11;
                        org.telegram.messenger.f8.g(e, true);
                        if (h0Var != null) {
                            h0Var.close();
                        }
                        h0Var2 = null;
                        org.telegram.messenger.i0.g3(new ag.a3(p0Var, h0Var2, r20Var, j12, 14));
                        return;
                    }
                    org.telegram.messenger.i0.g3(new ag.a3(p0Var, h0Var2, r20Var, j12, 14));
                    return;
                }
                h0Var2 = null;
                org.telegram.messenger.i0.g3(new ag.a3(p0Var, h0Var2, r20Var, j12, 14));
                return;
        }
    }

    public k2(w7 w7Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = w7Var;
        this.f27698b = j10;
        this.f27699c = z10;
        this.e = document;
        this.f27700f = runnable;
    }

    public k2(org.telegram.ui.Wallet.p0 p0Var, long j10, String str, boolean z10, org.telegram.messenger.r20 r20Var) {
        this.d = p0Var;
        this.f27698b = j10;
        this.e = str;
        this.f27699c = z10;
        this.f27700f = r20Var;
    }
}
