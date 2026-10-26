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
public final class s2 implements Runnable {
    public final int f32407a = 0;
    public final long f32408b;
    public final boolean f32409c;
    public final Object d;
    public final Object e;
    public final Object f32410f;

    public s2(Context context, String str, long j10, boolean z10, qf.c cVar) {
        this.d = context;
        this.e = str;
        this.f32408b = j10;
        this.f32409c = z10;
        this.f32410f = cVar;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.Wallet.i0 i0Var;
        iz0 r6;
        switch (this.f32407a) {
            case 0:
                Context context = (Context) this.d;
                long j10 = this.f32408b;
                boolean z11 = this.f32409c;
                qf.c cVar = (qf.c) this.f32410f;
                Uri parse = Uri.parse((String) this.e);
                if (j10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qf.d.p(context, parse, z10, z11, cVar);
                return;
            case 1:
                m8.G((m8) this.d, this.f32408b, this.f32409c, (TLRPC.Document) this.e, (Runnable) this.f32410f);
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.d;
                long j11 = this.f32408b;
                String str = (String) this.e;
                boolean z12 = this.f32409c;
                Utilities.Callback callback = (Utilities.Callback) this.f32410f;
                org.telegram.ui.Wallet.i0 i0Var2 = null;
                try {
                    Object obj = org.telegram.ui.Wallet.p0.f37074f;
                    synchronized (obj) {
                        p0Var.c(j11);
                        r6 = p0Var.r();
                    }
                    if (((LinkedHashMap) r6.e).containsKey(str)) {
                        i0Var = p0Var.h(r6, str, j11);
                        try {
                            synchronized (obj) {
                                p0Var.c(j11);
                                if (z12) {
                                    try {
                                        r6.f29411b = ConnectionsManager.getInstance(p0Var.f37078b).getCurrentTime();
                                        if (!p0Var.d.exists()) {
                                            if (p0Var.q().edit().putInt("lastUsageDate", r6.f29411b).commit()) {
                                                AndroidUtilities.runOnUIThread(new org.telegram.ui.u90(12));
                                            } else {
                                                throw new IOException("usage write");
                                            }
                                        } else {
                                            p0Var.v(r6, new LinkedHashMap());
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
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
                            AndroidUtilities.runOnUIThread(new bi.y2(p0Var, i0Var2, callback, j11, 26));
                            return;
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    i0Var = null;
                }
                AndroidUtilities.runOnUIThread(new bi.y2(p0Var, i0Var2, callback, j11, 26));
                return;
        }
    }

    public s2(m8 m8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = m8Var;
        this.f32408b = j10;
        this.f32409c = z10;
        this.e = document;
        this.f32410f = runnable;
    }

    public s2(org.telegram.ui.Wallet.p0 p0Var, long j10, String str, boolean z10, Utilities.Callback callback) {
        this.d = p0Var;
        this.f32408b = j10;
        this.e = str;
        this.f32409c = z10;
        this.f32410f = callback;
    }
}
