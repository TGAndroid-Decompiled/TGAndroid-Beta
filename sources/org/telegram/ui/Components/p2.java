package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class p2 implements Runnable {
    public final int f31550a = 0;
    public final long f31551b;
    public final boolean f31552c;
    public final Object d;
    public final Object f31553e;
    public final Object f31554f;

    public p2(Context context, String str, long j10, boolean z10, ye.c cVar) {
        this.d = context;
        this.f31553e = str;
        this.f31551b = j10;
        this.f31552c = z10;
        this.f31554f = cVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f31550a) {
            case 0:
                Context context = (Context) this.d;
                ye.c cVar = (ye.c) this.f31554f;
                Uri parse = Uri.parse((String) this.f31553e);
                if (this.f31551b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ye.d.q(context, parse, z10, this.f31552c, cVar);
                return;
            default:
                g8.A((g8) this.d, this.f31551b, this.f31552c, (TLRPC.Document) this.f31553e, (Runnable) this.f31554f);
                return;
        }
    }

    public p2(g8 g8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = g8Var;
        this.f31551b = j10;
        this.f31552c = z10;
        this.f31553e = document;
        this.f31554f = runnable;
    }
}
