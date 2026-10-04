package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class p2 implements Runnable {
    public final int f29491a = 0;
    public final long f29492b;
    public final boolean f29493c;
    public final Object d;
    public final Object f29494e;
    public final Object f29495f;

    public p2(Context context, String str, long j3, boolean z10, nf.e eVar) {
        this.d = context;
        this.f29494e = str;
        this.f29492b = j3;
        this.f29493c = z10;
        this.f29495f = eVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f29491a) {
            case 0:
                Context context = (Context) this.d;
                nf.e eVar = (nf.e) this.f29495f;
                Uri parse = Uri.parse((String) this.f29494e);
                if (this.f29492b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nf.f.q(context, parse, z10, this.f29493c, eVar);
                return;
            default:
                j8.z((j8) this.d, this.f29492b, this.f29493c, (TLRPC.Document) this.f29494e, (Runnable) this.f29495f);
                return;
        }
    }

    public p2(j8 j8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = j8Var;
        this.f29492b = j3;
        this.f29493c = z10;
        this.f29494e = document;
        this.f29495f = runnable;
    }
}
