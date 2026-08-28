package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class m2 implements Runnable {
    public final int f30674a = 0;
    public final long f30675b;
    public final boolean f30676c;
    public final Object d;
    public final Object f30677e;
    public final Object f30678f;

    public m2(Context context, String str, long j10, boolean z10, ve.d dVar) {
        this.d = context;
        this.f30677e = str;
        this.f30675b = j10;
        this.f30676c = z10;
        this.f30678f = dVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f30674a) {
            case 0:
                Context context = (Context) this.d;
                ve.d dVar = (ve.d) this.f30678f;
                Uri parse = Uri.parse((String) this.f30677e);
                if (this.f30675b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ve.e.q(context, parse, z10, this.f30676c, dVar);
                return;
            default:
                c8.z((c8) this.d, this.f30675b, this.f30676c, (TLRPC.Document) this.f30677e, (Runnable) this.f30678f);
                return;
        }
    }

    public m2(c8 c8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = c8Var;
        this.f30675b = j10;
        this.f30676c = z10;
        this.f30677e = document;
        this.f30678f = runnable;
    }
}
