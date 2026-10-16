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
    public final int f28401a = 0;
    public final long f28402b;
    public final boolean f28403c;
    public final Object d;
    public final Object e;
    public final Object f28404f;

    public r2(Context context, String str, long j10, boolean z10, pf.c cVar) {
        this.d = context;
        this.e = str;
        this.f28402b = j10;
        this.f28403c = z10;
        this.f28404f = cVar;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.Wallet.h0 h0Var;
        az0 r10;
        switch (this.f28401a) {
            case 0:
                Context context = (Context) this.d;
                long j10 = this.f28402b;
                boolean z11 = this.f28403c;
                pf.c cVar = (pf.c) this.f28404f;
                Uri parse = Uri.parse((String) this.e);
                if (j10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pf.d.p(context, parse, z10, z11, cVar);
                return;
            case 1:
                m8.C((m8) this.d, this.f28402b, this.f28403c, (TLRPC.Document) this.e, (Runnable) this.f28404f);
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.d;
                long j11 = this.f28402b;
                String str = (String) this.e;
                boolean z12 = this.f28403c;
                Utilities.Callback callback = (Utilities.Callback) this.f28404f;
                org.telegram.ui.Wallet.h0 h0Var2 = null;
                try {
                    Object obj = org.telegram.ui.Wallet.p0.f33303f;
                    synchronized (obj) {
                        p0Var.c(j11);
                        r10 = p0Var.r();
                    }
                    if (((LinkedHashMap) r10.e).containsKey(str)) {
                        h0Var = p0Var.h(r10, str, j11);
                        try {
                            synchronized (obj) {
                                p0Var.c(j11);
                                if (z12) {
                                    try {
                                        r10.f23327b = ConnectionsManager.getInstance(p0Var.f33307b).getCurrentTime();
                                        if (!p0Var.d.exists()) {
                                            if (p0Var.q().edit().putInt("lastUsageDate", r10.f23327b).commit()) {
                                                AndroidUtilities.runOnUIThread(new org.telegram.ui.b31(7));
                                            } else {
                                                throw new IOException("usage write");
                                            }
                                        } else {
                                            p0Var.v(r10, new LinkedHashMap());
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                            }
                            h0Var2 = h0Var;
                        } catch (Exception e7) {
                            e = e7;
                            FileLog.e(e);
                            if (h0Var != null) {
                                h0Var.close();
                            }
                            AndroidUtilities.runOnUIThread(new bi.b8(p0Var, h0Var2, callback, j11, 18));
                            return;
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    h0Var = null;
                }
                AndroidUtilities.runOnUIThread(new bi.b8(p0Var, h0Var2, callback, j11, 18));
                return;
        }
    }

    public r2(m8 m8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = m8Var;
        this.f28402b = j10;
        this.f28403c = z10;
        this.e = document;
        this.f28404f = runnable;
    }

    public r2(org.telegram.ui.Wallet.p0 p0Var, long j10, String str, boolean z10, Utilities.Callback callback) {
        this.d = p0Var;
        this.f28402b = j10;
        this.e = str;
        this.f28403c = z10;
        this.f28404f = callback;
    }
}
