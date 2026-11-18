package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class r2 implements Runnable {
    public final int f38984a = 0;
    public final long f38985b;
    public final boolean f38986c;
    public final Object d;
    public final Object f38987e;
    public final Object f38988f;

    public r2(Context context, String str, long j3, boolean z10, vf.b bVar) {
        this.d = context;
        this.f38987e = str;
        this.f38985b = j3;
        this.f38986c = z10;
        this.f38988f = bVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.r0 r0Var;
        ow0 s5;
        boolean z10 = false;
        org.telegram.ui.Wallet.r0 r0Var2 = null;
        switch (this.f38984a) {
            case 0:
                Context context = (Context) this.d;
                long j3 = this.f38985b;
                boolean z11 = this.f38986c;
                vf.b bVar = (vf.b) this.f38988f;
                Uri parse = Uri.parse((String) this.f38987e);
                if (j3 == 0) {
                    z10 = true;
                }
                vf.c.r(context, parse, z10, z11, bVar);
                return;
            case 1:
                g8 g8Var = (g8) this.d;
                long j10 = this.f38985b;
                boolean z12 = this.f38986c;
                TLRPC.Document document = (TLRPC.Document) this.f38987e;
                Runnable runnable = (Runnable) this.f38988f;
                HashSet hashSet = org.telegram.messenger.mp.u1(g8Var.f30187a).J1().f24046b;
                if (z12) {
                    hashSet.add(Long.valueOf(j10));
                } else {
                    hashSet.remove(Long.valueOf(j10));
                }
                long e10 = org.telegram.messenger.j10.i(g8Var.f30187a).e();
                TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(g8Var.f30187a).d2(e10);
                if (d2 != null) {
                    if (z12) {
                        d2.flags2 |= 2097152;
                        d2.saved_music = document;
                    } else {
                        TLRPC.Document document2 = d2.saved_music;
                        if (document2 != null && document2.f28409id == j10) {
                            d2.flags2 &= -2097153;
                            d2.saved_music = null;
                        }
                    }
                    org.telegram.messenger.tr.a0(g8Var.f30187a).j2(d2, true);
                    org.telegram.messenger.ks.f(g8Var.f30187a).k(249, Long.valueOf(e10));
                }
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) this.d;
                long j11 = this.f38985b;
                String str = (String) this.f38987e;
                boolean z13 = this.f38986c;
                org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) this.f38988f;
                try {
                    z0Var.f45339f = null;
                    Object obj = org.telegram.ui.Wallet.z0.f45332g;
                    synchronized (obj) {
                        z0Var.c(j11);
                        s5 = z0Var.s();
                    }
                    if (((LinkedHashMap) s5.f38185e).containsKey(str)) {
                        r0Var = z0Var.h(s5, str, j11);
                        try {
                            synchronized (obj) {
                                z0Var.c(j11);
                                if (z13) {
                                    try {
                                        s5.f38183b = ConnectionsManager.getInstance(z0Var.f45336b).getCurrentTime();
                                        if (!z0Var.d.exists()) {
                                            if (z0Var.r().edit().putInt("lastUsageDate", s5.f38183b).commit()) {
                                                org.telegram.messenger.g0.g3(new org.telegram.ui.dd0(10));
                                            } else {
                                                throw new IOException("usage write");
                                            }
                                        } else {
                                            z0Var.w(s5, new LinkedHashMap());
                                        }
                                    } catch (Exception e11) {
                                        z0Var.m(e11);
                                    }
                                }
                            }
                            r0Var2 = r0Var;
                        } catch (Exception e12) {
                            e = e12;
                            z0Var.m(e);
                            if (r0Var != null) {
                                r0Var.close();
                            }
                            org.telegram.messenger.g0.g3(new di.i2(z0Var, r0Var2, x10Var, j11, 25));
                            return;
                        }
                    }
                } catch (Exception e13) {
                    e = e13;
                    r0Var = null;
                }
                org.telegram.messenger.g0.g3(new di.i2(z0Var, r0Var2, x10Var, j11, 25));
                return;
        }
    }

    public r2(g8 g8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = g8Var;
        this.f38985b = j3;
        this.f38986c = z10;
        this.f38987e = document;
        this.f38988f = runnable;
    }

    public r2(org.telegram.ui.Wallet.z0 z0Var, long j3, String str, boolean z10, org.telegram.messenger.x10 x10Var) {
        this.d = z0Var;
        this.f38985b = j3;
        this.f38987e = str;
        this.f38986c = z10;
        this.f38988f = x10Var;
    }
}
