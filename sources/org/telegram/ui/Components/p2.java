package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class p2 implements Runnable {
    public final int f29570a = 0;
    public final long f29571b;
    public final boolean f29572c;
    public final Object d;
    public final Object f29573e;
    public final Object f29574f;

    public p2(Context context, String str, long j3, boolean z10, nf.e eVar) {
        this.d = context;
        this.f29573e = str;
        this.f29571b = j3;
        this.f29572c = z10;
        this.f29574f = eVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f29570a) {
            case 0:
                Context context = (Context) this.d;
                nf.e eVar = (nf.e) this.f29574f;
                Uri parse = Uri.parse((String) this.f29573e);
                if (this.f29571b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nf.f.q(context, parse, z10, this.f29572c, eVar);
                return;
            default:
                j8.z((j8) this.d, this.f29571b, this.f29572c, (TLRPC.Document) this.f29573e, (Runnable) this.f29574f);
                return;
        }
    }

    public p2(j8 j8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = j8Var;
        this.f29571b = j3;
        this.f29572c = z10;
        this.f29573e = document;
        this.f29574f = runnable;
    }
}
