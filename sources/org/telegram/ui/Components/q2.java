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
public final class q2 implements Runnable {
    public final int f29757a = 0;
    public final long f29758b;
    public final boolean f29759c;
    public final Object d;
    public final Object e;
    public final Object f29760f;

    public q2(Context context, String str, long j10, boolean z10, pf.c cVar) {
        this.d = context;
        this.e = str;
        this.f29758b = j10;
        this.f29759c = z10;
        this.f29760f = cVar;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.Wallet.i0 i0Var;
        zy0 r10;
        switch (this.f29757a) {
            case 0:
                Context context = (Context) this.d;
                long j10 = this.f29758b;
                boolean z11 = this.f29759c;
                pf.c cVar = (pf.c) this.f29760f;
                Uri parse = Uri.parse((String) this.e);
                if (j10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pf.d.p(context, parse, z10, z11, cVar);
                return;
            case 1:
                k8.F((k8) this.d, this.f29758b, this.f29759c, (TLRPC.Document) this.e, (Runnable) this.f29760f);
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.d;
                long j11 = this.f29758b;
                String str = (String) this.e;
                boolean z12 = this.f29759c;
                Utilities.Callback callback = (Utilities.Callback) this.f29760f;
                org.telegram.ui.Wallet.i0 i0Var2 = null;
                try {
                    Object obj = org.telegram.ui.Wallet.p0.f34983f;
                    synchronized (obj) {
                        p0Var.c(j11);
                        r10 = p0Var.r();
                    }
                    if (((LinkedHashMap) r10.e).containsKey(str)) {
                        i0Var = p0Var.h(r10, str, j11);
                        try {
                            synchronized (obj) {
                                p0Var.c(j11);
                                if (z12) {
                                    try {
                                        r10.f33365b = ConnectionsManager.getInstance(p0Var.f34987b).getCurrentTime();
                                        if (!p0Var.d.exists()) {
                                            if (p0Var.q().edit().putInt("lastUsageDate", r10.f33365b).commit()) {
                                                AndroidUtilities.runOnUIThread(new org.telegram.ui.if0(9));
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
                            i0Var2 = i0Var;
                        } catch (Exception e7) {
                            e = e7;
                            FileLog.e(e);
                            if (i0Var != null) {
                                i0Var.close();
                            }
                            AndroidUtilities.runOnUIThread(new ai.c3(p0Var, i0Var2, callback, j11, 26));
                            return;
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    i0Var = null;
                }
                AndroidUtilities.runOnUIThread(new ai.c3(p0Var, i0Var2, callback, j11, 26));
                return;
        }
    }

    public q2(k8 k8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = k8Var;
        this.f29758b = j10;
        this.f29759c = z10;
        this.e = document;
        this.f29760f = runnable;
    }

    public q2(org.telegram.ui.Wallet.p0 p0Var, long j10, String str, boolean z10, Utilities.Callback callback) {
        this.d = p0Var;
        this.f29758b = j10;
        this.e = str;
        this.f29759c = z10;
        this.f29760f = callback;
    }
}
