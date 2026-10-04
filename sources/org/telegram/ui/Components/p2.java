package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class p2 implements Runnable {
    public final int f29485a = 0;
    public final long f29486b;
    public final boolean f29487c;
    public final Object d;
    public final Object f29488e;
    public final Object f29489f;

    public p2(Context context, String str, long j3, boolean z10, nf.e eVar) {
        this.d = context;
        this.f29488e = str;
        this.f29486b = j3;
        this.f29487c = z10;
        this.f29489f = eVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f29485a) {
            case 0:
                Context context = (Context) this.d;
                nf.e eVar = (nf.e) this.f29489f;
                Uri parse = Uri.parse((String) this.f29488e);
                if (this.f29486b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nf.f.q(context, parse, z10, this.f29487c, eVar);
                return;
            default:
                j8.z((j8) this.d, this.f29486b, this.f29487c, (TLRPC.Document) this.f29488e, (Runnable) this.f29489f);
                return;
        }
    }

    public p2(j8 j8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = j8Var;
        this.f29486b = j3;
        this.f29487c = z10;
        this.f29488e = document;
        this.f29489f = runnable;
    }
}
