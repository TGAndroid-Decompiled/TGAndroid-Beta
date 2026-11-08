package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j2 implements Runnable {
    public final int f34870a = 0;
    public final long f34871b;
    public final boolean f34872c;
    public final Object d;
    public final Object f34873e;
    public final Object f34874f;

    public j2(Context context, String str, long j3, boolean z9, vf.b bVar) {
        this.d = context;
        this.f34873e = str;
        this.f34871b = j3;
        this.f34872c = z9;
        this.f34874f = bVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.j0 j0Var;
        org.telegram.ui.Wallet.j0 j0Var2;
        Object obj;
        ew0 r10;
        boolean z9 = false;
        switch (this.f34870a) {
            case 0:
                Context context = (Context) this.d;
                long j3 = this.f34871b;
                boolean z10 = this.f34872c;
                vf.b bVar = (vf.b) this.f34874f;
                Uri parse = Uri.parse((String) this.f34873e);
                if (j3 == 0) {
                    z9 = true;
                }
                vf.c.r(context, parse, z9, z10, bVar);
                return;
            case 1:
                b8 b8Var = (b8) this.d;
                long j10 = this.f34871b;
                boolean z11 = this.f34872c;
                TLRPC.Document document = (TLRPC.Document) this.f34873e;
                Runnable runnable = (Runnable) this.f34874f;
                HashSet hashSet = org.telegram.messenger.qp.s1(b8Var.f28616a).H1().f23589b;
                if (z11) {
                    hashSet.add(Long.valueOf(j10));
                } else {
                    hashSet.remove(Long.valueOf(j10));
                }
                long e10 = org.telegram.messenger.p10.i(b8Var.f28616a).e();
                TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(b8Var.f28616a).b2(e10);
                if (b22 != null) {
                    if (z11) {
                        b22.flags2 |= 2097152;
                        b22.saved_music = document;
                    } else {
                        TLRPC.Document document2 = b22.saved_music;
                        if (document2 != null && document2.f26962id == j10) {
                            b22.flags2 &= -2097153;
                            b22.saved_music = null;
                        }
                    }
                    org.telegram.messenger.yr.a0(b8Var.f28616a).j2(b22, true);
                    org.telegram.messenger.qs.f(b8Var.f28616a).k(246, Long.valueOf(e10));
                }
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.q0 q0Var = (org.telegram.ui.Wallet.q0) this.d;
                long j11 = this.f34871b;
                String str = (String) this.f34873e;
                boolean z12 = this.f34872c;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.f34874f;
                try {
                    obj = org.telegram.ui.Wallet.q0.f43047f;
                    synchronized (obj) {
                        q0Var.c(j11);
                        r10 = q0Var.r();
                    }
                } catch (Exception e11) {
                    e = e11;
                    j0Var = null;
                }
                if (((LinkedHashMap) r10.f33394e).containsKey(str)) {
                    j0Var = q0Var.h(r10, str, j11);
                    try {
                        synchronized (obj) {
                            q0Var.c(j11);
                            if (z12) {
                                try {
                                    r10.f33392b = ConnectionsManager.getInstance(q0Var.f43051b).getCurrentTime();
                                    if (!q0Var.d.exists()) {
                                        if (q0Var.q().edit().putInt("lastUsageDate", r10.f33392b).commit()) {
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.o61(4));
                                        } else {
                                            throw new IOException("usage write");
                                        }
                                    } else {
                                        q0Var.v(r10, new LinkedHashMap());
                                    }
                                } catch (Exception e12) {
                                    org.telegram.messenger.a8.g(e12, true);
                                }
                            }
                        }
                        j0Var2 = j0Var;
                    } catch (Exception e13) {
                        e = e13;
                        org.telegram.messenger.a8.g(e, true);
                        if (j0Var != null) {
                            j0Var.close();
                        }
                        j0Var2 = null;
                        org.telegram.messenger.g0.h3(new bi.w2(q0Var, j0Var2, c20Var, j11, 26));
                        return;
                    }
                    org.telegram.messenger.g0.h3(new bi.w2(q0Var, j0Var2, c20Var, j11, 26));
                    return;
                }
                j0Var2 = null;
                org.telegram.messenger.g0.h3(new bi.w2(q0Var, j0Var2, c20Var, j11, 26));
                return;
        }
    }

    public j2(b8 b8Var, long j3, boolean z9, TLRPC.Document document, Runnable runnable) {
        this.d = b8Var;
        this.f34871b = j3;
        this.f34872c = z9;
        this.f34873e = document;
        this.f34874f = runnable;
    }

    public j2(org.telegram.ui.Wallet.q0 q0Var, long j3, String str, boolean z9, org.telegram.messenger.c20 c20Var) {
        this.d = q0Var;
        this.f34871b = j3;
        this.f34873e = str;
        this.f34872c = z9;
        this.f34874f = c20Var;
    }
}
