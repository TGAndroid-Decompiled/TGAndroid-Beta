package org.telegram.ui.Components;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.TLRPC;
public final class p2 implements Runnable {
    public final int f27114a = 0;
    public final long f27115b;
    public final boolean f27116c;
    public final Object d;
    public final Object e;
    public final Object f27117f;

    public p2(Context context, String str, long j3, boolean z10, nf.e eVar) {
        this.d = context;
        this.e = str;
        this.f27115b = j3;
        this.f27116c = z10;
        this.f27117f = eVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f27114a) {
            case 0:
                Context context = (Context) this.d;
                nf.e eVar = (nf.e) this.f27117f;
                Uri parse = Uri.parse((String) this.e);
                if (this.f27115b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nf.f.q(context, parse, z10, this.f27116c, eVar);
                return;
            default:
                i8.z((i8) this.d, this.f27115b, this.f27116c, (TLRPC.Document) this.e, (Runnable) this.f27117f);
                return;
        }
    }

    public p2(i8 i8Var, long j3, boolean z10, TLRPC.Document document, Runnable runnable) {
        this.d = i8Var;
        this.f27115b = j3;
        this.f27116c = z10;
        this.e = document;
        this.f27117f = runnable;
    }
}
