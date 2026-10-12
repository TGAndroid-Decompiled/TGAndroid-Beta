package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class r2 implements Runnable {
    public final int f28711a = 0;
    public final long f28712b;
    public final boolean f28713c;
    public final Object d;
    public final Object e;
    public final Object f28714f;

    public r2(Context context, String str, long j10, boolean z10, pf.c cVar) {
        this.d = context;
        this.e = str;
        this.f28712b = j10;
        this.f28713c = z10;
        this.f28714f = cVar;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.Wallet.g0 g0Var;
        zy0 r10;
        switch (this.f28711a) {
            case 0:
                Context context = (Context) this.d;
                long j10 = this.f28712b;
                boolean z11 = this.f28713c;
                pf.c cVar = (pf.c) this.f28714f;
                Uri parse = Uri.parse((String) this.e);
                if (j10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pf.d.q(context, parse, z10, z11, cVar);
                return;
            case 1:
                m8.B((m8) this.d, this.f28712b, this.f28713c, (TLRPC.Document) this.e, (Runnable) this.f28714f);
                return;
            default:
                org.telegram.ui.Wallet.o0 o0Var = (org.telegram.ui.Wallet.o0) this.d;
                long j11 = this.f28712b;
                String str = (String) this.e;
                boolean z12 = this.f28713c;
                Utilities.Callback callback = (Utilities.Callback) this.f28714f;
                org.telegram.ui.Wallet.g0 g0Var2 = null;
                try {
                    Object obj = org.telegram.ui.Wallet.o0.f33529f;
                    synchronized (obj) {
                        o0Var.c(j11);
                        r10 = o0Var.r();
                    }
                    if (((LinkedHashMap) r10.e).containsKey(str)) {
                        g0Var = o0Var.h(r10, str, j11);
                        try {
                            synchronized (obj) {
                                o0Var.c(j11);
                                if (z12) {
                                    try {
                                        r10.f32021b = ConnectionsManager.getInstance(o0Var.f33533b).getCurrentTime();
                                        if (!o0Var.d.exists()) {
                                            if (o0Var.q().edit().putInt("lastUsageDate", r10.f32021b).commit()) {
                                                AndroidUtilities.runOnUIThread(new org.telegram.ui.b31(7));
                                            } else {
                                                throw new IOException("usage write");
                                            }
                                        } else {
                                            o0Var.v(r10, new LinkedHashMap());
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                            }
                            g0Var2 = g0Var;
                        } catch (Exception e7) {
                            e = e7;
                            FileLog.e(e);
                            if (g0Var != null) {
                                g0Var.close();
                            }
                            AndroidUtilities.runOnUIThread(new bi.b8(o0Var, g0Var2, callback, j11, 18));
                            return;
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    g0Var = null;
                }
                AndroidUtilities.runOnUIThread(new bi.b8(o0Var, g0Var2, callback, j11, 18));
                return;
        }
    }

    public r2(m8 m8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = m8Var;
        this.f28712b = j10;
        this.f28713c = z10;
        this.e = document;
        this.f28714f = runnable;
    }

    public r2(org.telegram.ui.Wallet.o0 o0Var, long j10, String str, boolean z10, Utilities.Callback callback) {
        this.d = o0Var;
        this.f28712b = j10;
        this.e = str;
        this.f28713c = z10;
        this.f28714f = callback;
    }
}
