package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class p2 implements Runnable {
    public final int f27188a = 0;
    public final long f27189b;
    public final boolean f27190c;
    public final Object d;
    public final Object e;
    public final Object f27191f;

    public p2(Context context, String str, long j3, boolean z10, nf.e eVar) {
        this.d = context;
        this.e = str;
        this.f27189b = j3;
        this.f27190c = z10;
        this.f27191f = eVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f27188a) {
            case 0:
                Context context = (Context) this.d;
                nf.e eVar = (nf.e) this.f27191f;
                Uri parse = Uri.parse((String) this.e);
                if (this.f27189b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nf.f.q(context, parse, z10, this.f27190c, eVar);
                return;
            default:
                j8.z((j8) this.d, this.f27189b, this.f27190c, (TLRPC.Document) this.e, (Runnable) this.f27191f);
                return;
        }
    }

    public p2(j8 j8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = j8Var;
        this.f27189b = j3;
        this.f27190c = z10;
        this.e = document;
        this.f27191f = runnable;
    }
}
