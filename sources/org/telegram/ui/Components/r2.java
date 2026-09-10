package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class r2 implements Runnable {
    public final int f26551a = 0;
    public final long f26552b;
    public final boolean f26553c;
    public final Object d;
    public final Object e;
    public final Object f26554f;

    public r2(Context context, String str, long j3, boolean z10, nf.e eVar) {
        this.d = context;
        this.e = str;
        this.f26552b = j3;
        this.f26553c = z10;
        this.f26554f = eVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f26551a) {
            case 0:
                Context context = (Context) this.d;
                nf.e eVar = (nf.e) this.f26554f;
                Uri parse = Uri.parse((String) this.e);
                if (this.f26552b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nf.f.q(context, parse, z10, this.f26553c, eVar);
                return;
            default:
                j8.z((j8) this.d, this.f26552b, this.f26553c, (TLRPC.Document) this.e, (Runnable) this.f26554f);
                return;
        }
    }

    public r2(j8 j8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = j8Var;
        this.f26552b = j3;
        this.f26553c = z10;
        this.e = document;
        this.f26554f = runnable;
    }
}
