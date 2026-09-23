package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class p2 implements Runnable {
    public final int f26906a = 0;
    public final long f26907b;
    public final boolean f26908c;
    public final Object d;
    public final Object e;
    public final Object f26909f;

    public p2(Context context, String str, long j3, boolean z10, nf.e eVar) {
        this.d = context;
        this.e = str;
        this.f26907b = j3;
        this.f26908c = z10;
        this.f26909f = eVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f26906a) {
            case 0:
                Context context = (Context) this.d;
                nf.e eVar = (nf.e) this.f26909f;
                Uri parse = Uri.parse((String) this.e);
                if (this.f26907b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nf.f.q(context, parse, z10, this.f26908c, eVar);
                return;
            default:
                j8.z((j8) this.d, this.f26907b, this.f26908c, (TLRPC.Document) this.e, (Runnable) this.f26909f);
                return;
        }
    }

    public p2(j8 j8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = j8Var;
        this.f26907b = j3;
        this.f26908c = z10;
        this.e = document;
        this.f26909f = runnable;
    }
}
