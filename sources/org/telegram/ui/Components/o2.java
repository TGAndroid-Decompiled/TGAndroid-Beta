package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class o2 implements Runnable {
    public final int f29641a = 0;
    public final long f29642b;
    public final boolean f29643c;
    public final Object d;
    public final Object f29644e;
    public final Object f29645f;

    public o2(Context context, String str, long j10, boolean z4, af.f fVar) {
        this.d = context;
        this.f29644e = str;
        this.f29642b = j10;
        this.f29643c = z4;
        this.f29645f = fVar;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f29641a) {
            case 0:
                Context context = (Context) this.d;
                af.f fVar = (af.f) this.f29645f;
                Uri parse = Uri.parse((String) this.f29644e);
                if (this.f29642b == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                af.g.q(context, parse, z4, this.f29643c, fVar);
                return;
            default:
                c8.A((c8) this.d, this.f29642b, this.f29643c, (TLRPC.Document) this.f29644e, (Runnable) this.f29645f);
                return;
        }
    }

    public o2(c8 c8Var, long j10, boolean z4, TLRPC.Document document, Runnable runnable) {
        this.d = c8Var;
        this.f29642b = j10;
        this.f29643c = z4;
        this.f29644e = document;
        this.f29645f = runnable;
    }
}
