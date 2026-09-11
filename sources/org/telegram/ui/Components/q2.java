package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class q2 implements Runnable {
    public final int f29546a = 0;
    public final long f29547b;
    public final boolean f29548c;
    public final Object d;
    public final Object f29549e;
    public final Object f29550f;

    public q2(Context context, String str, long j3, boolean z10, of.e eVar) {
        this.d = context;
        this.f29549e = str;
        this.f29547b = j3;
        this.f29548c = z10;
        this.f29550f = eVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f29546a) {
            case 0:
                Context context = (Context) this.d;
                of.e eVar = (of.e) this.f29550f;
                Uri parse = Uri.parse((String) this.f29549e);
                if (this.f29547b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                of.f.q(context, parse, z10, this.f29548c, eVar);
                return;
            default:
                k8.A((k8) this.d, this.f29547b, this.f29548c, (TLRPC.Document) this.f29549e, (Runnable) this.f29550f);
                return;
        }
    }

    public q2(k8 k8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = k8Var;
        this.f29547b = j3;
        this.f29548c = z10;
        this.f29549e = document;
        this.f29550f = runnable;
    }
}
