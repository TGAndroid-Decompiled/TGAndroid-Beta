package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;

public final class m2 implements Runnable {

    public final int f30529a = 0;

    public final long f30530b;

    public final boolean f30531c;
    public final Object d;

    public final Object f30532e;

    public final Object f30533f;

    public m2(Context context, String str, long j10, boolean z10, we.d dVar) {
        this.d = context;
        this.f30532e = str;
        this.f30530b = j10;
        this.f30531c = z10;
        this.f30533f = dVar;
    }

    @Override
    public final void run() {
        switch (this.f30529a) {
            case 0:
                Context context = (Context) this.d;
                String str = (String) this.f30532e;
                we.e.q(context, Uri.parse(str), this.f30530b == 0, this.f30531c, (we.d) this.f30533f);
                break;
            default:
                b8.B((b8) this.d, this.f30530b, this.f30531c, (TLRPC.Document) this.f30532e, (Runnable) this.f30533f);
                break;
        }
    }

    public m2(b8 b8Var, long j10, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = b8Var;
        this.f30530b = j10;
        this.f30531c = z10;
        this.f30532e = document;
        this.f30533f = runnable;
    }
}
