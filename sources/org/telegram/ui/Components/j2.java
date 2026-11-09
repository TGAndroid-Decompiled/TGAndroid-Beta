package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j2 implements Runnable {
    public final int f34909a = 0;
    public final long f34910b;
    public final boolean f34911c;
    public final Object d;
    public final Object f34912e;
    public final Object f34913f;

    public j2(Context context, String str, long j3, boolean z9, vf.b bVar) {
        this.d = context;
        this.f34912e = str;
        this.f34910b = j3;
        this.f34911c = z9;
        this.f34913f = bVar;
    }

    @Override
    public final void run() {
        org.telegram.ui.Wallet.i0 i0Var;
        org.telegram.ui.Wallet.i0 i0Var2;
        Object obj;
        fw0 r10;
        boolean z9 = false;
        switch (this.f34909a) {
            case 0:
                Context context = (Context) this.d;
                long j3 = this.f34910b;
                boolean z10 = this.f34911c;
                vf.b bVar = (vf.b) this.f34913f;
                Uri parse = Uri.parse((String) this.f34912e);
                if (j3 == 0) {
                    z9 = true;
                }
                vf.c.r(context, parse, z9, z10, bVar);
                return;
            case 1:
                b8 b8Var = (b8) this.d;
                long j10 = this.f34910b;
                boolean z11 = this.f34911c;
                TLRPC.Document document = (TLRPC.Document) this.f34912e;
                Runnable runnable = (Runnable) this.f34913f;
                HashSet hashSet = org.telegram.messenger.qp.s1(b8Var.f28621a).H1().f23589b;
                if (z11) {
                    hashSet.add(Long.valueOf(j10));
                } else {
                    hashSet.remove(Long.valueOf(j10));
                }
                long e10 = org.telegram.messenger.p10.i(b8Var.f28621a).e();
                TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(b8Var.f28621a).b2(e10);
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
                    org.telegram.messenger.yr.a0(b8Var.f28621a).j2(b22, true);
                    org.telegram.messenger.qs.f(b8Var.f28621a).k(246, Long.valueOf(e10));
                }
                runnable.run();
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.d;
                long j11 = this.f34910b;
                String str = (String) this.f34912e;
                boolean z12 = this.f34911c;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) this.f34913f;
                try {
                    obj = org.telegram.ui.Wallet.p0.f42965f;
                    synchronized (obj) {
                        p0Var.c(j11);
                        r10 = p0Var.r();
                    }
                } catch (Exception e11) {
                    e = e11;
                    i0Var = null;
                }
                if (((LinkedHashMap) r10.f33749e).containsKey(str)) {
                    i0Var = p0Var.h(r10, str, j11);
                    try {
                        synchronized (obj) {
                            p0Var.c(j11);
                            if (z12) {
                                try {
                                    r10.f33747b = ConnectionsManager.getInstance(p0Var.f42969b).getCurrentTime();
                                    if (!p0Var.d.exists()) {
                                        if (p0Var.q().edit().putInt("lastUsageDate", r10.f33747b).commit()) {
                                            org.telegram.messenger.g0.h3(new org.telegram.ui.p61(4));
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

    public j2(b8 b8Var, long j3, boolean z9, TLRPC.Document document, Runnable runnable) {
        this.d = b8Var;
        this.f34910b = j3;
        this.f34911c = z9;
        this.f34912e = document;
        this.f34913f = runnable;
    }

    public j2(org.telegram.ui.Wallet.p0 p0Var, long j3, String str, boolean z9, org.telegram.messenger.c20 c20Var) {
        this.d = p0Var;
        this.f34910b = j3;
        this.f34912e = str;
        this.f34911c = z9;
        this.f34913f = c20Var;
    }
}
