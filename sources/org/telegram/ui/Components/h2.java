package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.hb1;
public final class h2 implements Runnable {
    public final int f34263a = 0;
    public final long f34264b;
    public final boolean f34265c;
    public final Object d;
    public final Object f34266e;
    public final Object f34267f;

    public h2(Context context, String str, long j10, boolean z10, sf.b bVar) {
        this.d = context;
        this.f34266e = str;
        this.f34264b = j10;
        this.f34265c = z10;
        this.f34267f = bVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.h0 h0Var;
        org.telegram.ui.Wallet.h0 h0Var2;
        Object obj;
        dw0 r5;
        boolean z10 = false;
        switch (this.f34263a) {
            case 0:
                Context context = (Context) this.d;
                long j10 = this.f34264b;
                boolean z11 = this.f34265c;
                sf.b bVar = (sf.b) this.f34267f;
                Uri parse = Uri.parse((String) this.f34266e);
                if (j10 == 0) {
                    z10 = true;
                }
                sf.c.r(context, parse, z10, z11, bVar);
                return;
            case 1:
                z7 z7Var = (z7) this.d;
                long j11 = this.f34264b;
                boolean z12 = this.f34265c;
                TLRPC.Document document = (TLRPC.Document) this.f34266e;
                Runnable runnable = (Runnable) this.f34267f;
                HashSet hashSet = org.telegram.messenger.hp.s1(z7Var.f28583a).H1().f21571b;
                if (z12) {
                    hashSet.add(Long.valueOf(j11));
                } else {
                    hashSet.remove(Long.valueOf(j11));
                }
                long e10 = org.telegram.messenger.h10.i(z7Var.f28583a).e();
                TLRPC.UserFull b22 = org.telegram.messenger.hp.s1(z7Var.f28583a).b2(e10);
                if (b22 != null) {
                    if (z12) {
                        b22.flags2 |= 2097152;
                        b22.saved_music = document;
                    } else {
                        TLRPC.Document document2 = b22.saved_music;
                        if (document2 != null && document2.f27007id == j11) {
                            b22.flags2 &= -2097153;
                            b22.saved_music = null;
                        }
                    }
                    org.telegram.messenger.qr.a0(z7Var.f28583a).j2(b22, true);
                    org.telegram.messenger.hs.f(z7Var.f28583a).k(246, Long.valueOf(e10));
                }
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.o0 o0Var = (org.telegram.ui.Wallet.o0) this.d;
                long j12 = this.f34264b;
                String str = (String) this.f34266e;
                boolean z13 = this.f34265c;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.f34267f;
                try {
                    obj = org.telegram.ui.Wallet.o0.f42982f;
                    synchronized (obj) {
                        o0Var.c(j12);
                        r5 = o0Var.r();
                    }
                } catch (Exception e11) {
                    e = e11;
                    h0Var = null;
                }
                if (((LinkedHashMap) r5.f33203e).containsKey(str)) {
                    h0Var = o0Var.h(r5, str, j12);
                    try {
                        synchronized (obj) {
                            o0Var.c(j12);
                            if (z13) {
                                try {
                                    r5.f33201b = ConnectionsManager.getInstance(o0Var.f42986b).getCurrentTime();
                                    if (!o0Var.d.exists()) {
                                        if (o0Var.q().edit().putInt("lastUsageDate", r5.f33201b).commit()) {
                                            org.telegram.messenger.g0.h3(new hb1(3));
                                        } else {
                                            throw new IOException("usage write");
                                        }
                                    } else {
                                        o0Var.v(r5, new LinkedHashMap());
                                    }
                                } catch (Exception e12) {
                                    org.telegram.messenger.a8.g(e12, true);
                                }
                            }
                        }
                        h0Var2 = h0Var;
                    } catch (Exception e13) {
                        e = e13;
                        org.telegram.messenger.a8.g(e, true);
                        if (h0Var != null) {
                            h0Var.close();
                        }
                        h0Var2 = null;
                        org.telegram.messenger.g0.h3(new ci.l2(o0Var, h0Var2, u10Var, j12, 26));
                        return;
                    }
                    org.telegram.messenger.g0.h3(new ci.l2(o0Var, h0Var2, u10Var, j12, 26));
                    return;
                }
                h0Var2 = null;
                org.telegram.messenger.g0.h3(new ci.l2(o0Var, h0Var2, u10Var, j12, 26));
                return;
        }
    }

    public h2(z7 z7Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = z7Var;
        this.f34264b = j10;
        this.f34265c = z10;
        this.f34266e = document;
        this.f34267f = runnable;
    }

    public h2(org.telegram.ui.Wallet.o0 o0Var, long j10, String str, boolean z10, org.telegram.messenger.u10 u10Var) {
        this.d = o0Var;
        this.f34264b = j10;
        this.f34266e = str;
        this.f34265c = z10;
        this.f34267f = u10Var;
    }
}
