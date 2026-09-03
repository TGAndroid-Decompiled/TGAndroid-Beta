package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class o2 implements Runnable {
    public final int f27434a = 0;
    public final long f27435b;
    public final boolean f27436c;
    public final Object d;
    public final Object e;
    public final Object f27437f;

    public o2(Context context, String str, long j10, boolean z4, ze.c cVar) {
        this.d = context;
        this.e = str;
        this.f27435b = j10;
        this.f27436c = z4;
        this.f27437f = cVar;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f27434a) {
            case 0:
                Context context = (Context) this.d;
                ze.c cVar = (ze.c) this.f27437f;
                Uri parse = Uri.parse((String) this.e);
                if (this.f27435b == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ze.d.q(context, parse, z4, this.f27436c, cVar);
                return;
            default:
                c8.A((c8) this.d, this.f27435b, this.f27436c, (TLRPC.Document) this.e, (Runnable) this.f27437f);
                return;
        }
    }

    public o2(c8 c8Var, long j10, boolean z4, TLRPC.Document document, Runnable runnable) {
        this.d = c8Var;
        this.f27435b = j10;
        this.f27436c = z4;
        this.e = document;
        this.f27437f = runnable;
    }
}
