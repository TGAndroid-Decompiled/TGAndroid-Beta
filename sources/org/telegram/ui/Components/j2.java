package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j2 implements Runnable {
    public final int f34820a = 0;
    public final long f34821b;
    public final boolean f34822c;
    public final Object d;
    public final Object f34823e;
    public final Object f34824f;

    public j2(Context context, String str, long j3, boolean z9, vf.b bVar) {
        this.d = context;
        this.f34823e = str;
        this.f34821b = j3;
        this.f34822c = z9;
        this.f34824f = bVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.k0 k0Var;
        org.telegram.ui.Wallet.k0 k0Var2;
        Object obj;
        ew0 r10;
        boolean z9 = false;
        switch (this.f34820a) {
            case 0:
                Context context = (Context) this.d;
                long j3 = this.f34821b;
                boolean z10 = this.f34822c;
                vf.b bVar = (vf.b) this.f34824f;
                Uri parse = Uri.parse((String) this.f34823e);
                if (j3 == 0) {
                    z9 = true;
                }
                vf.c.r(context, parse, z9, z10, bVar);
                return;
            case 1:
                b8 b8Var = (b8) this.d;
                long j10 = this.f34821b;
                boolean z11 = this.f34822c;
                TLRPC.Document document = (TLRPC.Document) this.f34823e;
                Runnable runnable = (Runnable) this.f34824f;
                HashSet hashSet = org.telegram.messenger.qp.s1(b8Var.f28612a).H1().f23570b;
                if (z11) {
                    hashSet.add(Long.valueOf(j10));
                } else {
                    hashSet.remove(Long.valueOf(j10));
                }
                long e10 = org.telegram.messenger.p10.i(b8Var.f28612a).e();
                TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(b8Var.f28612a).b2(e10);
                if (b22 != null) {
                    if (z11) {
                        b22.flags2 |= 2097152;
                        b22.saved_music = document;
                    } else {
                        TLRPC.Document document2 = b22.saved_music;
                        if (document2 != null && document2.f26958id == j10) {
                            b22.flags2 &= -2097153;
                            b22.saved_music = null;
                        }
                    }
                    org.telegram.messenger.yr.a0(b8Var.f28612a).j2(b22, true);
                    org.telegram.messenger.qs.f(b8Var.f28612a).k(246, Long.valueOf(e10));
                }
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.d;
                long j11 = this.f34821b;
                String str = (String) this.f34823e;
                boolean z12 = this.f34822c;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.f34824f;
                try {
                    obj = org.telegram.ui.Wallet.r0.f43079f;
                    synchronized (obj) {
                        r0Var.c(j11);
                        r10 = r0Var.r();
                    }
                } catch (Exception e11) {
                    e = e11;
                    k0Var = null;
                }
                if (((LinkedHashMap) r10.f33342e).containsKey(str)) {
                    k0Var = r0Var.h(r10, str, j11);
                    try {
                        synchronized (obj) {
                            r0Var.c(j11);
                            if (z12) {
                                try {
                                    r10.f33340b = ConnectionsManager.getInstance(r0Var.f43083b).getCurrentTime();
                                    if (!r0Var.d.exists()) {
                                        if (r0Var.q().edit().putInt("lastUsageDate", r10.f33340b).commit()) {
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.z(2));
                                        } else {
                                            throw new IOException("usage write");
                                        }
                                    } else {
                                        r0Var.v(r10, new LinkedHashMap());
                                    }
                                } catch (Exception e12) {
                                    org.telegram.messenger.a8.g(e12, true);
                                }
                            }
                        }
                        k0Var2 = k0Var;
                    } catch (Exception e13) {
                        e = e13;
                        org.telegram.messenger.a8.g(e, true);
                        if (k0Var != null) {
                            k0Var.close();
                        }
                        k0Var2 = null;
                        org.telegram.messenger.g0.h3(new bi.w2(r0Var, k0Var2, c20Var, j11, 26));
                        return;
                    }
                    org.telegram.messenger.g0.h3(new bi.w2(r0Var, k0Var2, c20Var, j11, 26));
                    return;
                }
                k0Var2 = null;
                org.telegram.messenger.g0.h3(new bi.w2(r0Var, k0Var2, c20Var, j11, 26));
                return;
        }
    }

    public j2(b8 b8Var, long j3, boolean z9, TLRPC.Document document, Runnable runnable) {
        this.d = b8Var;
        this.f34821b = j3;
        this.f34822c = z9;
        this.f34823e = document;
        this.f34824f = runnable;
    }

    public j2(org.telegram.ui.Wallet.r0 r0Var, long j3, String str, boolean z9, org.telegram.messenger.c20 c20Var) {
        this.d = r0Var;
        this.f34821b = j3;
        this.f34823e = str;
        this.f34822c = z9;
        this.f34824f = c20Var;
    }
}
