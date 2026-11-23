package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class r2 implements Runnable {
    public final int f39154a = 0;
    public final long f39155b;
    public final boolean f39156c;
    public final Object d;
    public final Object f39157e;
    public final Object f39158f;

    public r2(Context context, String str, long j3, boolean z10, vf.b bVar) {
        this.d = context;
        this.f39157e = str;
        this.f39155b = j3;
        this.f39156c = z10;
        this.f39158f = bVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.s0 s0Var;
        pw0 s5;
        boolean z10 = false;
        org.telegram.ui.Wallet.s0 s0Var2 = null;
        switch (this.f39154a) {
            case 0:
                Context context = (Context) this.d;
                long j3 = this.f39155b;
                boolean z11 = this.f39156c;
                vf.b bVar = (vf.b) this.f39158f;
                Uri parse = Uri.parse((String) this.f39157e);
                if (j3 == 0) {
                    z10 = true;
                }
                vf.c.r(context, parse, z10, z11, bVar);
                return;
            case 1:
                e8 e8Var = (e8) this.d;
                long j10 = this.f39155b;
                boolean z12 = this.f39156c;
                TLRPC.Document document = (TLRPC.Document) this.f39157e;
                Runnable runnable = (Runnable) this.f39158f;
                HashSet hashSet = org.telegram.messenger.mp.u1(e8Var.f30223a).J1().f24154b;
                if (z12) {
                    hashSet.add(Long.valueOf(j10));
                } else {
                    hashSet.remove(Long.valueOf(j10));
                }
                long e10 = org.telegram.messenger.i10.i(e8Var.f30223a).e();
                TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(e8Var.f30223a).d2(e10);
                if (d2 != null) {
                    if (z12) {
                        d2.flags2 |= 2097152;
                        d2.saved_music = document;
                    } else {
                        TLRPC.Document document2 = d2.saved_music;
                        if (document2 != null && document2.f28498id == j10) {
                            d2.flags2 &= -2097153;
                            d2.saved_music = null;
                        }
                    }
                    org.telegram.messenger.tr.a0(e8Var.f30223a).j2(d2, true);
                    org.telegram.messenger.ks.f(e8Var.f30223a).k(249, Long.valueOf(e10));
                }
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.a1 a1Var = (org.telegram.ui.Wallet.a1) this.d;
                long j11 = this.f39155b;
                String str = (String) this.f39157e;
                boolean z13 = this.f39156c;
                org.telegram.messenger.w10 w10Var = (org.telegram.messenger.w10) this.f39158f;
                try {
                    a1Var.f44041f = null;
                    Object obj = org.telegram.ui.Wallet.a1.f44034g;
                    synchronized (obj) {
                        a1Var.c(j11);
                        s5 = a1Var.s();
                    }
                    if (((LinkedHashMap) s5.f38600e).containsKey(str)) {
                        s0Var = a1Var.h(s5, str, j11);
                        try {
                            synchronized (obj) {
                                a1Var.c(j11);
                                if (z13) {
                                    try {
                                        s5.f38598b = ConnectionsManager.getInstance(a1Var.f44038b).getCurrentTime();
                                        if (!a1Var.d.exists()) {
                                            if (a1Var.r().edit().putInt("lastUsageDate", s5.f38598b).commit()) {
                                                org.telegram.messenger.g0.g3(new org.telegram.ui.cd0(10));
                                            } else {
                                                throw new IOException("usage write");
                                            }
                                        } else {
                                            a1Var.w(s5, new LinkedHashMap());
                                        }
                                    } catch (Exception e11) {
                                        a1Var.m(e11);
                                    }
                                }
                            }
                            s0Var2 = s0Var;
                        } catch (Exception e12) {
                            e = e12;
                            a1Var.m(e);
                            if (s0Var != null) {
                                s0Var.close();
                            }
                            org.telegram.messenger.g0.g3(new di.j2(a1Var, s0Var2, w10Var, j11, 25));
                            return;
                        }
                    }
                } catch (Exception e13) {
                    e = e13;
                    s0Var = null;
                }
                org.telegram.messenger.g0.g3(new di.j2(a1Var, s0Var2, w10Var, j11, 25));
                return;
        }
    }

    public r2(e8 e8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = e8Var;
        this.f39155b = j3;
        this.f39156c = z10;
        this.f39157e = document;
        this.f39158f = runnable;
    }

    public r2(org.telegram.ui.Wallet.a1 a1Var, long j3, String str, boolean z10, org.telegram.messenger.w10 w10Var) {
        this.d = a1Var;
        this.f39155b = j3;
        this.f39157e = str;
        this.f39156c = z10;
        this.f39158f = w10Var;
    }
}
