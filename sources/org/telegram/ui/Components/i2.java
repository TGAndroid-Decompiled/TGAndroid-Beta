package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i2 implements Runnable {
    public final int f35428a = 0;
    public final long f35429b;
    public final boolean f35430c;
    public final Object d;
    public final Object f35431e;
    public final Object f35432f;

    public i2(Context context, String str, long j3, boolean z10, vf.b bVar) {
        this.d = context;
        this.f35431e = str;
        this.f35429b = j3;
        this.f35430c = z10;
        this.f35432f = bVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.i0 i0Var;
        org.telegram.ui.Wallet.i0 i0Var2;
        Object obj;
        hw0 r10;
        boolean z10 = false;
        switch (this.f35428a) {
            case 0:
                Context context = (Context) this.d;
                long j3 = this.f35429b;
                boolean z11 = this.f35430c;
                vf.b bVar = (vf.b) this.f35432f;
                Uri parse = Uri.parse((String) this.f35431e);
                if (j3 == 0) {
                    z10 = true;
                }
                vf.c.r(context, parse, z10, z11, bVar);
                return;
            case 1:
                y7 y7Var = (y7) this.d;
                long j10 = this.f35429b;
                boolean z12 = this.f35430c;
                TLRPC.Document document = (TLRPC.Document) this.f35431e;
                Runnable runnable = (Runnable) this.f35432f;
                HashSet hashSet = org.telegram.messenger.np.s1(y7Var.f29679a).H1().f23895b;
                if (z12) {
                    hashSet.add(Long.valueOf(j10));
                } else {
                    hashSet.remove(Long.valueOf(j10));
                }
                long e10 = org.telegram.messenger.m10.i(y7Var.f29679a).e();
                TLRPC.UserFull b22 = org.telegram.messenger.np.s1(y7Var.f29679a).b2(e10);
                if (b22 != null) {
                    if (z12) {
                        b22.flags2 |= 2097152;
                        b22.saved_music = document;
                    } else {
                        TLRPC.Document document2 = b22.saved_music;
                        if (document2 != null && document2.f28057id == j10) {
                            b22.flags2 &= -2097153;
                            b22.saved_music = null;
                        }
                    }
                    org.telegram.messenger.vr.a0(y7Var.f29679a).j2(b22, true);
                    org.telegram.messenger.ns.f(y7Var.f29679a).k(246, Long.valueOf(e10));
                }
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.d;
                long j11 = this.f35429b;
                String str = (String) this.f35431e;
                boolean z13 = this.f35430c;
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) this.f35432f;
                try {
                    obj = org.telegram.ui.Wallet.p0.f44289f;
                    synchronized (obj) {
                        p0Var.c(j11);
                        r10 = p0Var.r();
                    }
                } catch (Exception e11) {
                    e = e11;
                    i0Var = null;
                }
                if (((LinkedHashMap) r10.f35367e).containsKey(str)) {
                    i0Var = p0Var.h(r10, str, j11);
                    try {
                        synchronized (obj) {
                            p0Var.c(j11);
                            if (z13) {
                                try {
                                    r10.f35365b = ConnectionsManager.getInstance(p0Var.f44293b).getCurrentTime();
                                    if (!p0Var.d.exists()) {
                                        if (p0Var.q().edit().putInt("lastUsageDate", r10.f35365b).commit()) {
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.ah0(8));
                                        } else {
                                            throw new IOException("usage write");
                                        }
                                    } else {
                                        p0Var.v(r10, new LinkedHashMap());
                                    }
                                } catch (Exception e12) {
                                    org.telegram.messenger.a8.g(e12, true);
                                }
                            }
                        }
                        i0Var2 = i0Var;
                    } catch (Exception e13) {
                        e = e13;
                        org.telegram.messenger.a8.g(e, true);
                        if (i0Var != null) {
                            i0Var.close();
                        }
                        i0Var2 = null;
                        org.telegram.messenger.g0.h3(new di.f2(p0Var, i0Var2, z10Var, j11, 26));
                        return;
                    }
                    org.telegram.messenger.g0.h3(new di.f2(p0Var, i0Var2, z10Var, j11, 26));
                    return;
                }
                i0Var2 = null;
                org.telegram.messenger.g0.h3(new di.f2(p0Var, i0Var2, z10Var, j11, 26));
                return;
        }
    }

    public i2(y7 y7Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = y7Var;
        this.f35429b = j3;
        this.f35430c = z10;
        this.f35431e = document;
        this.f35432f = runnable;
    }

    public i2(org.telegram.ui.Wallet.p0 p0Var, long j3, String str, boolean z10, org.telegram.messenger.z10 z10Var) {
        this.d = p0Var;
        this.f35429b = j3;
        this.f35431e = str;
        this.f35430c = z10;
        this.f35432f = z10Var;
    }
}
