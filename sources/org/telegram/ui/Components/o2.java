package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class o2 implements Runnable {
    public final int f29652a = 0;
    public final long f29653b;
    public final boolean f29654c;
    public final Object d;
    public final Object f29655e;
    public final Object f29656f;

    public o2(Context context, String str, long j10, boolean z4, af.f fVar) {
        this.d = context;
        this.f29655e = str;
        this.f29653b = j10;
        this.f29654c = z4;
        this.f29656f = fVar;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f29652a) {
            case 0:
                Context context = (Context) this.d;
                af.f fVar = (af.f) this.f29656f;
                Uri parse = Uri.parse((String) this.f29655e);
                if (this.f29653b == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                af.g.q(context, parse, z4, this.f29654c, fVar);
                return;
            default:
                c8.A((c8) this.d, this.f29653b, this.f29654c, (TLRPC.Document) this.f29655e, (Runnable) this.f29656f);
                return;
        }
    }

    public o2(c8 c8Var, long j10, boolean z4, TLRPC.Document document, Runnable runnable) {
        this.d = c8Var;
        this.f29653b = j10;
        this.f29654c = z4;
        this.f29655e = document;
        this.f29656f = runnable;
    }
}
