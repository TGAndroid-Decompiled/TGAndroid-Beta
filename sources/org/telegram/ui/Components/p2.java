package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class p2 implements Runnable {
    public final int f29486a = 0;
    public final long f29487b;
    public final boolean f29488c;
    public final Object d;
    public final Object f29489e;
    public final Object f29490f;

    public p2(Context context, String str, long j3, boolean z10, nf.e eVar) {
        this.d = context;
        this.f29489e = str;
        this.f29487b = j3;
        this.f29488c = z10;
        this.f29490f = eVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f29486a) {
            case 0:
                Context context = (Context) this.d;
                nf.e eVar = (nf.e) this.f29490f;
                Uri parse = Uri.parse((String) this.f29489e);
                if (this.f29487b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nf.f.q(context, parse, z10, this.f29488c, eVar);
                return;
            default:
                j8.z((j8) this.d, this.f29487b, this.f29488c, (TLRPC.Document) this.f29489e, (Runnable) this.f29490f);
                return;
        }
    }

    public p2(j8 j8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = j8Var;
        this.f29487b = j3;
        this.f29488c = z10;
        this.f29489e = document;
        this.f29490f = runnable;
    }
}
