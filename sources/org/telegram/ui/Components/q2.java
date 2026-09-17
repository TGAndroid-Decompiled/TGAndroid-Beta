package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class q2 implements Runnable {
    public final int f29547a = 0;
    public final long f29548b;
    public final boolean f29549c;
    public final Object d;
    public final Object f29550e;
    public final Object f29551f;

    public q2(Context context, String str, long j3, boolean z10, of.e eVar) {
        this.d = context;
        this.f29550e = str;
        this.f29548b = j3;
        this.f29549c = z10;
        this.f29551f = eVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f29547a) {
            case 0:
                Context context = (Context) this.d;
                of.e eVar = (of.e) this.f29551f;
                Uri parse = Uri.parse((String) this.f29550e);
                if (this.f29548b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                of.f.q(context, parse, z10, this.f29549c, eVar);
                return;
            default:
                k8.A((k8) this.d, this.f29548b, this.f29549c, (TLRPC.Document) this.f29550e, (Runnable) this.f29551f);
                return;
        }
    }

    public q2(k8 k8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = k8Var;
        this.f29548b = j3;
        this.f29549c = z10;
        this.f29550e = document;
        this.f29551f = runnable;
    }
}
