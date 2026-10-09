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
    public final int f30338a = 0;
    public final long f30339b;
    public final boolean f30340c;
    public final Object d;
    public final Object f30341e;
    public final Object f30342f;

    public r2(Context context, String str, long j3, boolean z10, of.e eVar) {
        this.d = context;
        this.f30341e = str;
        this.f30339b = j3;
        this.f30340c = z10;
        this.f30342f = eVar;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.Wallet.h0 h0Var;
        dz0 r10;
        switch (this.f30338a) {
            case 0:
                Context context = (Context) this.d;
                long j3 = this.f30339b;
                boolean z11 = this.f30340c;
                of.e eVar = (of.e) this.f30342f;
                Uri parse = Uri.parse((String) this.f30341e);
                if (j3 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                of.f.q(context, parse, z10, z11, eVar);
                return;
            case 1:
                l8.C((l8) this.d, this.f30339b, this.f30340c, (TLRPC.Document) this.f30341e, (Runnable) this.f30342f);
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.d;
                long j10 = this.f30339b;
                String str = (String) this.f30341e;
                boolean z12 = this.f30340c;
                Utilities.Callback callback = (Utilities.Callback) this.f30342f;
                org.telegram.ui.Wallet.h0 h0Var2 = null;
                try {
                    Object obj = org.telegram.ui.Wallet.p0.f35370f;
                    synchronized (obj) {
                        p0Var.c(j10);
                        r10 = p0Var.r();
                    }
                    if (((LinkedHashMap) r10.f25859e).containsKey(str)) {
                        h0Var = p0Var.h(r10, str, j10);
                        try {
                            synchronized (obj) {
                                p0Var.c(j10);
                                if (z12) {
                                    try {
                                        r10.f25857b = ConnectionsManager.getInstance(p0Var.f35374b).getCurrentTime();
                                        if (!p0Var.d.exists()) {
                                            if (p0Var.q().edit().putInt("lastUsageDate", r10.f25857b).commit()) {
                                                AndroidUtilities.runOnUIThread(new org.telegram.ui.t21(6));
                                            } else {
                                                throw new IOException("usage write");
                                            }
                                        } else {
                                            p0Var.v(r10, new LinkedHashMap());
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                }
                            }
                            h0Var2 = h0Var;
                        } catch (Exception e10) {
                            e = e10;
                            FileLog.e(e);
                            if (h0Var != null) {
                                h0Var.close();
                            }
                            AndroidUtilities.runOnUIThread(new o31(p0Var, h0Var2, callback, j10, 8));
                            return;
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    h0Var = null;
                }
                AndroidUtilities.runOnUIThread(new o31(p0Var, h0Var2, callback, j10, 8));
                return;
        }
    }

    public r2(l8 l8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = l8Var;
        this.f30339b = j3;
        this.f30340c = z10;
        this.f30341e = document;
        this.f30342f = runnable;
    }

    public r2(org.telegram.ui.Wallet.p0 p0Var, long j3, String str, boolean z10, Utilities.Callback callback) {
        this.d = p0Var;
        this.f30339b = j3;
        this.f30341e = str;
        this.f30340c = z10;
        this.f30342f = callback;
    }
}
