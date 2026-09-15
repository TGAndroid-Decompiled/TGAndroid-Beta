package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class p2 implements Runnable {
    public final int f26930a = 0;
    public final long f26931b;
    public final boolean f26932c;
    public final Object d;
    public final Object e;
    public final Object f26933f;

    public p2(Context context, String str, long j3, boolean z10, nf.e eVar) {
        this.d = context;
        this.e = str;
        this.f26931b = j3;
        this.f26932c = z10;
        this.f26933f = eVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f26930a) {
            case 0:
                Context context = (Context) this.d;
                nf.e eVar = (nf.e) this.f26933f;
                Uri parse = Uri.parse((String) this.e);
                if (this.f26931b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nf.f.q(context, parse, z10, this.f26932c, eVar);
                return;
            default:
                h8.z((h8) this.d, this.f26931b, this.f26932c, (TLRPC.Document) this.e, (Runnable) this.f26933f);
                return;
        }
    }

    public p2(h8 h8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = h8Var;
        this.f26931b = j3;
        this.f26932c = z10;
        this.e = document;
        this.f26933f = runnable;
    }
}
