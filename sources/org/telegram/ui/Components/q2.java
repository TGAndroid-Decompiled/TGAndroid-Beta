package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class q2 implements Runnable {
    public final int f29574a = 0;
    public final long f29575b;
    public final boolean f29576c;
    public final Object d;
    public final Object f29577e;
    public final Object f29578f;

    public q2(Context context, String str, long j3, boolean z10, of.e eVar) {
        this.d = context;
        this.f29577e = str;
        this.f29575b = j3;
        this.f29576c = z10;
        this.f29578f = eVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f29574a) {
            case 0:
                Context context = (Context) this.d;
                of.e eVar = (of.e) this.f29578f;
                Uri parse = Uri.parse((String) this.f29577e);
                if (this.f29575b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                of.f.q(context, parse, z10, this.f29576c, eVar);
                return;
            default:
                k8.A((k8) this.d, this.f29575b, this.f29576c, (TLRPC.Document) this.f29577e, (Runnable) this.f29578f);
                return;
        }
    }

    public q2(k8 k8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = k8Var;
        this.f29575b = j3;
        this.f29576c = z10;
        this.f29577e = document;
        this.f29578f = runnable;
    }
}
