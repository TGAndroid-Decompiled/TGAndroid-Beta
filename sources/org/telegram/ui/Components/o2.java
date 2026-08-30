package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class o2 implements Runnable {
    public final int f27431a = 0;
    public final long f27432b;
    public final boolean f27433c;
    public final Object d;
    public final Object e;
    public final Object f27434f;

    public o2(Context context, String str, long j10, boolean z4, af.f fVar) {
        this.d = context;
        this.e = str;
        this.f27432b = j10;
        this.f27433c = z4;
        this.f27434f = fVar;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f27431a) {
            case 0:
                Context context = (Context) this.d;
                af.f fVar = (af.f) this.f27434f;
                Uri parse = Uri.parse((String) this.e);
                if (this.f27432b == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                af.g.q(context, parse, z4, this.f27433c, fVar);
                return;
            default:
                c8.A((c8) this.d, this.f27432b, this.f27433c, (TLRPC.Document) this.e, (Runnable) this.f27434f);
                return;
        }
    }

    public o2(c8 c8Var, long j10, boolean z4, TLRPC.Document document, Runnable runnable) {
        this.d = c8Var;
        this.f27432b = j10;
        this.f27433c = z4;
        this.e = document;
        this.f27434f = runnable;
    }
}
