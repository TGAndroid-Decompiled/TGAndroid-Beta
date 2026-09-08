package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class q2 implements Runnable {
    public final int f29573a = 0;
    public final long f29574b;
    public final boolean f29575c;
    public final Object d;
    public final Object f29576e;
    public final Object f29577f;

    public q2(Context context, String str, long j3, boolean z10, of.e eVar) {
        this.d = context;
        this.f29576e = str;
        this.f29574b = j3;
        this.f29575c = z10;
        this.f29577f = eVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f29573a) {
            case 0:
                Context context = (Context) this.d;
                of.e eVar = (of.e) this.f29577f;
                Uri parse = Uri.parse((String) this.f29576e);
                if (this.f29574b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                of.f.q(context, parse, z10, this.f29575c, eVar);
                return;
            default:
                k8.A((k8) this.d, this.f29574b, this.f29575c, (TLRPC.Document) this.f29576e, (Runnable) this.f29577f);
                return;
        }
    }

    public q2(k8 k8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = k8Var;
        this.f29574b = j3;
        this.f29575c = z10;
        this.f29576e = document;
        this.f29577f = runnable;
    }
}
