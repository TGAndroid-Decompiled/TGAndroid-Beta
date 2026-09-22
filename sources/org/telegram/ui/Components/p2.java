package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class p2 implements Runnable {
    public final int f26927a = 0;
    public final long f26928b;
    public final boolean f26929c;
    public final Object d;
    public final Object e;
    public final Object f26930f;

    public p2(Context context, String str, long j3, boolean z10, nf.e eVar) {
        this.d = context;
        this.e = str;
        this.f26928b = j3;
        this.f26929c = z10;
        this.f26930f = eVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f26927a) {
            case 0:
                Context context = (Context) this.d;
                nf.e eVar = (nf.e) this.f26930f;
                Uri parse = Uri.parse((String) this.e);
                if (this.f26928b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nf.f.q(context, parse, z10, this.f26929c, eVar);
                return;
            default:
                h8.z((h8) this.d, this.f26928b, this.f26929c, (TLRPC.Document) this.e, (Runnable) this.f26930f);
                return;
        }
    }

    public p2(h8 h8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = h8Var;
        this.f26928b = j3;
        this.f26929c = z10;
        this.e = document;
        this.f26930f = runnable;
    }
}
