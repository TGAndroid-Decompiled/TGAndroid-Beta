package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i2 implements Runnable {
    public final int f34510a = 0;
    public final long f34511b;
    public final boolean f34512c;
    public final Object d;
    public final Object f34513e;
    public final Object f34514f;

    public i2(Context context, String str, long j3, boolean z9, vf.b bVar) {
        this.d = context;
        this.f34513e = str;
        this.f34511b = j3;
        this.f34512c = z9;
        this.f34514f = bVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.i0 i0Var;
        org.telegram.ui.Wallet.i0 i0Var2;
        Object obj;
        ew0 r10;
        boolean z9 = false;
        switch (this.f34510a) {
            case 0:
                Context context = (Context) this.d;
                long j3 = this.f34511b;
                boolean z10 = this.f34512c;
                vf.b bVar = (vf.b) this.f34514f;
                Uri parse = Uri.parse((String) this.f34513e);
                if (j3 == 0) {
                    z9 = true;
                }
                vf.c.r(context, parse, z9, z10, bVar);
                return;
            case 1:
                a8 a8Var = (a8) this.d;
                long j10 = this.f34511b;
                boolean z11 = this.f34512c;
                TLRPC.Document document = (TLRPC.Document) this.f34513e;
                Runnable runnable = (Runnable) this.f34514f;
                HashSet hashSet = org.telegram.messenger.qp.s1(a8Var.f28669a).H1().f23593b;
                if (z11) {
                    hashSet.add(Long.valueOf(j10));
                } else {
                    hashSet.remove(Long.valueOf(j10));
                }
                long e10 = org.telegram.messenger.p10.i(a8Var.f28669a).e();
                TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(a8Var.f28669a).b2(e10);
                if (b22 != null) {
                    if (z11) {
                        b22.flags2 |= 2097152;
                        b22.saved_music = document;
                    } else {
                        TLRPC.Document document2 = b22.saved_music;
                        if (document2 != null && document2.f26966id == j10) {
                            b22.flags2 &= -2097153;
                            b22.saved_music = null;
                        }
                    }
                    org.telegram.messenger.yr.a0(a8Var.f28669a).j2(b22, true);
                    org.telegram.messenger.qs.f(a8Var.f28669a).k(246, Long.valueOf(e10));
                }
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.d;
                long j11 = this.f34511b;
                String str = (String) this.f34513e;
                boolean z12 = this.f34512c;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.f34514f;
                try {
                    obj = org.telegram.ui.Wallet.p0.f42952f;
                    synchronized (obj) {
                        p0Var.c(j11);
                        r10 = p0Var.r();
                    }
                } catch (Exception e11) {
                    e = e11;
                    i0Var = null;
                }
                if (((LinkedHashMap) r10.f33347e).containsKey(str)) {
                    i0Var = p0Var.h(r10, str, j11);
                    try {
                        synchronized (obj) {
                            p0Var.c(j11);
                            if (z12) {
                                try {
                                    r10.f33345b = ConnectionsManager.getInstance(p0Var.f42956b).getCurrentTime();
                                    if (!p0Var.d.exists()) {
                                        if (p0Var.q().edit().putInt("lastUsageDate", r10.f33345b).commit()) {
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.q61(4));
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
                        org.telegram.messenger.g0.h3(new bi.w2(p0Var, i0Var2, c20Var, j11, 26));
                        return;
                    }
                    org.telegram.messenger.g0.h3(new bi.w2(p0Var, i0Var2, c20Var, j11, 26));
                    return;
                }
                i0Var2 = null;
                org.telegram.messenger.g0.h3(new bi.w2(p0Var, i0Var2, c20Var, j11, 26));
                return;
        }
    }

    public i2(a8 a8Var, long j3, boolean z9, TLRPC.Document document, Runnable runnable) {
        this.d = a8Var;
        this.f34511b = j3;
        this.f34512c = z9;
        this.f34513e = document;
        this.f34514f = runnable;
    }

    public i2(org.telegram.ui.Wallet.p0 p0Var, long j3, String str, boolean z9, org.telegram.messenger.c20 c20Var) {
        this.d = p0Var;
        this.f34511b = j3;
        this.f34513e = str;
        this.f34512c = z9;
        this.f34514f = c20Var;
    }
}
