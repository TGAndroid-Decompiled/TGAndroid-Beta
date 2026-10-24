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
public final class p2 implements Runnable {
    public final int f29451a = 0;
    public final long f29452b;
    public final boolean f29453c;
    public final Object d;
    public final Object e;
    public final Object f29454f;

    public p2(Context context, String str, long j10, boolean z10, pf.c cVar) {
        this.d = context;
        this.e = str;
        this.f29452b = j10;
        this.f29453c = z10;
        this.f29454f = cVar;
    }

    @Override
    public final void run() {
        boolean z10;
        org.telegram.ui.Wallet.i0 i0Var;
        yy0 r10;
        switch (this.f29451a) {
            case 0:
                Context context = (Context) this.d;
                long j10 = this.f29452b;
                boolean z11 = this.f29453c;
                pf.c cVar = (pf.c) this.f29454f;
                Uri parse = Uri.parse((String) this.e);
                if (j10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pf.d.p(context, parse, z10, z11, cVar);
                return;
            case 1:
                i8.F((i8) this.d, this.f29452b, this.f29453c, (TLRPC.Document) this.e, (Runnable) this.f29454f);
                return;
            default:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) this.d;
                long j11 = this.f29452b;
                String str = (String) this.e;
                boolean z12 = this.f29453c;
                Utilities.Callback callback = (Utilities.Callback) this.f29454f;
                org.telegram.ui.Wallet.i0 i0Var2 = null;
                try {
                    Object obj = org.telegram.ui.Wallet.p0.f34985f;
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
                                        r10.f33087b = ConnectionsManager.getInstance(p0Var.f34989b).getCurrentTime();
                                        if (!p0Var.d.exists()) {
                                            if (p0Var.q().edit().putInt("lastUsageDate", r10.f33087b).commit()) {
                                                AndroidUtilities.runOnUIThread(new org.telegram.ui.hf0(9));
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

    public p2(i8 i8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = i8Var;
        this.f29452b = j10;
        this.f29453c = z10;
        this.e = document;
        this.f29454f = runnable;
    }

    public p2(org.telegram.ui.Wallet.p0 p0Var, long j10, String str, boolean z10, Utilities.Callback callback) {
        this.d = p0Var;
        this.f29452b = j10;
        this.e = str;
        this.f29453c = z10;
        this.f29454f = callback;
    }
}
