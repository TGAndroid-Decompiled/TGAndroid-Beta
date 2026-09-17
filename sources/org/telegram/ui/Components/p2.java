package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class p2 implements Runnable {
    public final int f26912a = 0;
    public final long f26913b;
    public final boolean f26914c;
    public final Object d;
    public final Object e;
    public final Object f26915f;

    public p2(Context context, String str, long j3, boolean z10, nf.e eVar) {
        this.d = context;
        this.e = str;
        this.f26913b = j3;
        this.f26914c = z10;
        this.f26915f = eVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f26912a) {
            case 0:
                Context context = (Context) this.d;
                nf.e eVar = (nf.e) this.f26915f;
                Uri parse = Uri.parse((String) this.e);
                if (this.f26913b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nf.f.q(context, parse, z10, this.f26914c, eVar);
                return;
            default:
                h8.z((h8) this.d, this.f26913b, this.f26914c, (TLRPC.Document) this.e, (Runnable) this.f26915f);
                return;
        }
    }

    public p2(h8 h8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = h8Var;
        this.f26913b = j3;
        this.f26914c = z10;
        this.e = document;
        this.f26915f = runnable;
    }
}
