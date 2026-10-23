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
    public final int f29788a = 0;
    public final long f29789b;
    public final boolean f29790c;
    public final Object d;
    public final Object e;
    public final Object f29791f;

    public r2(Context context, String str, long j10, boolean z10, pf.c cVar) {
        this.d = context;
        this.e = str;
        this.f29789b = j10;
        this.f29790c = z10;
        this.f29791f = cVar;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.Wallet.j0 j0Var;
        wy0 r10;
        switch (this.f29788a) {
            case 0:
                Context context = (Context) this.d;
                long j10 = this.f29789b;
                boolean z11 = this.f29790c;
                pf.c cVar = (pf.c) this.f29791f;
                Uri parse = Uri.parse((String) this.e);
                if (j10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pf.d.p(context, parse, z10, z11, cVar);
                return;
            case 1:
                k8.B((k8) this.d, this.f29789b, this.f29790c, (TLRPC.Document) this.e, (Runnable) this.f29791f);
                return;
            default:
                org.telegram.ui.Wallet.q0 q0Var = (org.telegram.ui.Wallet.q0) this.d;
                long j11 = this.f29789b;
                String str = (String) this.e;
                boolean z12 = this.f29790c;
                Utilities.Callback callback = (Utilities.Callback) this.f29791f;
                org.telegram.ui.Wallet.j0 j0Var2 = null;
                try {
                    Object obj = org.telegram.ui.Wallet.q0.f34757f;
                    synchronized (obj) {
                        q0Var.c(j11);
                        r10 = q0Var.r();
                    }
                    if (((LinkedHashMap) r10.e).containsKey(str)) {
                        j0Var = q0Var.h(r10, str, j11);
                        try {
                            synchronized (obj) {
                                q0Var.c(j11);
                                if (z12) {
                                    try {
                                        r10.f32284b = ConnectionsManager.getInstance(q0Var.f34761b).getCurrentTime();
                                        if (!q0Var.d.exists()) {
                                            if (q0Var.q().edit().putInt("lastUsageDate", r10.f32284b).commit()) {
                                                AndroidUtilities.runOnUIThread(new org.telegram.ui.df0(9));
                                            } else {
                                                throw new IOException("usage write");
                                            }
                                        } else {
                                            q0Var.v(r10, new LinkedHashMap());
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                            }
                            j0Var2 = j0Var;
                        } catch (Exception e7) {
                            e = e7;
                            FileLog.e(e);
                            if (j0Var != null) {
                                j0Var.close();
                            }
                            AndroidUtilities.runOnUIThread(new ai.c3(q0Var, j0Var2, callback, j11, 26));
                            return;
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    j0Var = null;
                }
                AndroidUtilities.runOnUIThread(new ai.c3(q0Var, j0Var2, callback, j11, 26));
                return;
        }
    }

    public r2(k8 k8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = k8Var;
        this.f29789b = j10;
        this.f29790c = z10;
        this.e = document;
        this.f29791f = runnable;
    }

    public r2(org.telegram.ui.Wallet.q0 q0Var, long j10, String str, boolean z10, Utilities.Callback callback) {
        this.d = q0Var;
        this.f29789b = j10;
        this.e = str;
        this.f29790c = z10;
        this.f29791f = callback;
    }
}
