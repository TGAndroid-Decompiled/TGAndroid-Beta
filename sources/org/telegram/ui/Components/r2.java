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
    public final int f30375a = 0;
    public final long f30376b;
    public final boolean f30377c;
    public final Object d;
    public final Object f30378e;
    public final Object f30379f;

    public r2(Context context, String str, long j3, boolean z10, of.e eVar) {
        this.d = context;
        this.f30378e = str;
        this.f30376b = j3;
        this.f30377c = z10;
        this.f30379f = eVar;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.Wallet.i0 i0Var;
        ez0 r10;
        switch (this.f30375a) {
            case 0:
                Context context = (Context) this.d;
                long j3 = this.f30376b;
                boolean z11 = this.f30377c;
                of.e eVar = (of.e) this.f30379f;
                Uri parse = Uri.parse((String) this.f30378e);
                if (j3 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                of.f.q(context, parse, z10, z11, eVar);
                return;
            case 1:
                l8.C((l8) this.d, this.f30376b, this.f30377c, (TLRPC.Document) this.f30378e, (Runnable) this.f30379f);
                return;
            default:
                org.telegram.ui.Wallet.q0 q0Var = (org.telegram.ui.Wallet.q0) this.d;
                long j10 = this.f30376b;
                String str = (String) this.f30378e;
                boolean z12 = this.f30377c;
                Utilities.Callback callback = (Utilities.Callback) this.f30379f;
                org.telegram.ui.Wallet.i0 i0Var2 = null;
                try {
                    Object obj = org.telegram.ui.Wallet.q0.f35470f;
                    synchronized (obj) {
                        q0Var.c(j10);
                        r10 = q0Var.r();
                    }
                    if (((LinkedHashMap) r10.f26255e).containsKey(str)) {
                        i0Var = q0Var.h(r10, str, j10);
                        try {
                            synchronized (obj) {
                                q0Var.c(j10);
                                if (z12) {
                                    try {
                                        r10.f26253b = ConnectionsManager.getInstance(q0Var.f35474b).getCurrentTime();
                                        if (!q0Var.d.exists()) {
                                            if (q0Var.q().edit().putInt("lastUsageDate", r10.f26253b).commit()) {
                                                AndroidUtilities.runOnUIThread(new org.telegram.ui.s21(6));
                                            } else {
                                                throw new IOException("usage write");
                                            }
                                        } else {
                                            q0Var.v(r10, new LinkedHashMap());
                                        }
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                }
                            }
                            i0Var2 = i0Var;
                        } catch (Exception e10) {
                            e = e10;
                            FileLog.e(e);
                            if (i0Var != null) {
                                i0Var.close();
                            }
                            AndroidUtilities.runOnUIThread(new p31(q0Var, i0Var2, callback, j10, 8));
                            return;
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    i0Var = null;
                }
                AndroidUtilities.runOnUIThread(new p31(q0Var, i0Var2, callback, j10, 8));
                return;
        }
    }

    public r2(l8 l8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = l8Var;
        this.f30376b = j3;
        this.f30377c = z10;
        this.f30378e = document;
        this.f30379f = runnable;
    }

    public r2(org.telegram.ui.Wallet.q0 q0Var, long j3, String str, boolean z10, Utilities.Callback callback) {
        this.d = q0Var;
        this.f30376b = j3;
        this.f30378e = str;
        this.f30377c = z10;
        this.f30379f = callback;
    }
}
