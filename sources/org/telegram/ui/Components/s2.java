package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class s2 implements Runnable {
    public final int f39466a = 0;
    public final long f39467b;
    public final boolean f39468c;
    public final Object d;
    public final Object f39469e;
    public final Object f39470f;

    public s2(Context context, String str, long j3, boolean z10, vf.b bVar) {
        this.d = context;
        this.f39469e = str;
        this.f39467b = j3;
        this.f39468c = z10;
        this.f39470f = bVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.r0 r0Var;
        qw0 s5;
        boolean z10 = false;
        org.telegram.ui.Wallet.r0 r0Var2 = null;
        switch (this.f39466a) {
            case 0:
                Context context = (Context) this.d;
                long j3 = this.f39467b;
                boolean z11 = this.f39468c;
                vf.b bVar = (vf.b) this.f39470f;
                Uri parse = Uri.parse((String) this.f39469e);
                if (j3 == 0) {
                    z10 = true;
                }
                vf.c.r(context, parse, z10, z11, bVar);
                return;
            case 1:
                f8 f8Var = (f8) this.d;
                long j10 = this.f39467b;
                boolean z12 = this.f39468c;
                TLRPC.Document document = (TLRPC.Document) this.f39469e;
                Runnable runnable = (Runnable) this.f39470f;
                HashSet hashSet = org.telegram.messenger.mp.u1(f8Var.f30170a).J1().f24074b;
                if (z12) {
                    hashSet.add(Long.valueOf(j10));
                } else {
                    hashSet.remove(Long.valueOf(j10));
                }
                long e10 = org.telegram.messenger.j10.i(f8Var.f30170a).e();
                TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(f8Var.f30170a).d2(e10);
                if (d2 != null) {
                    if (z12) {
                        d2.flags2 |= 2097152;
                        d2.saved_music = document;
                    } else {
                        TLRPC.Document document2 = d2.saved_music;
                        if (document2 != null && document2.f28437id == j10) {
                            d2.flags2 &= -2097153;
                            d2.saved_music = null;
                        }
                    }
                    org.telegram.messenger.tr.a0(f8Var.f30170a).j2(d2, true);
                    org.telegram.messenger.ks.f(f8Var.f30170a).k(249, Long.valueOf(e10));
                }
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.z0 z0Var = (org.telegram.ui.Wallet.z0) this.d;
                long j11 = this.f39467b;
                String str = (String) this.f39469e;
                boolean z13 = this.f39468c;
                org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) this.f39470f;
                try {
                    z0Var.f45379f = null;
                    Object obj = org.telegram.ui.Wallet.z0.f45372g;
                    synchronized (obj) {
                        z0Var.c(j11);
                        s5 = z0Var.s();
                    }
                    if (((LinkedHashMap) s5.f39015e).containsKey(str)) {
                        r0Var = z0Var.h(s5, str, j11);
                        try {
                            synchronized (obj) {
                                z0Var.c(j11);
                                if (z13) {
                                    try {
                                        s5.f39013b = ConnectionsManager.getInstance(z0Var.f45376b).getCurrentTime();
                                        if (!z0Var.d.exists()) {
                                            if (z0Var.r().edit().putInt("lastUsageDate", s5.f39013b).commit()) {
                                                org.telegram.messenger.g0.g3(new org.telegram.ui.cd0(10));
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
                            org.telegram.messenger.g0.g3(new di.j2(z0Var, r0Var2, x10Var, j11, 25));
                            return;
                        }
                    }
                } catch (Exception e13) {
                    e = e13;
                    r0Var = null;
                }
                org.telegram.messenger.g0.g3(new di.j2(z0Var, r0Var2, x10Var, j11, 25));
                return;
        }
    }

    public s2(f8 f8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = f8Var;
        this.f39467b = j3;
        this.f39468c = z10;
        this.f39469e = document;
        this.f39470f = runnable;
    }

    public s2(org.telegram.ui.Wallet.z0 z0Var, long j3, String str, boolean z10, org.telegram.messenger.x10 x10Var) {
        this.d = z0Var;
        this.f39467b = j3;
        this.f39469e = str;
        this.f39468c = z10;
        this.f39470f = x10Var;
    }
}
