package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f47891a = 0;
    public final int f47892b;
    public final boolean f47893c;
    public final Object d;
    public final Object f47894e;
    public final Object f47895f;
    public final Object f47896g;

    public g0(g4 g4Var, int i7, TLRPC.WebPage webPage, org.telegram.messenger.fj fjVar, boolean z10, String str) {
        this.d = g4Var;
        this.f47892b = i7;
        this.f47894e = webPage;
        this.f47895f = fjVar;
        this.f47893c = z10;
        this.f47896g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47891a) {
            case 0:
                org.telegram.messenger.g0.g3(new ai.v((g4) this.d, tLObject, this.f47892b, (TLRPC.WebPage) this.f47894e, (org.telegram.messenger.fj) this.f47895f, this.f47893c, (String) this.f47896g));
                return;
            default:
                org.telegram.messenger.g0.g3(new ai.v((vf.b) this.d, (org.telegram.ui.ActionBar.t1[]) this.f47894e, tLObject, this.f47892b, (Uri) this.f47895f, (Context) this.f47896g, this.f47893c));
                return;
        }
    }

    public g0(vf.b bVar, org.telegram.ui.ActionBar.t1[] t1VarArr, int i7, Uri uri, Context context, boolean z10) {
        this.d = bVar;
        this.f47894e = t1VarArr;
        this.f47892b = i7;
        this.f47895f = uri;
        this.f47896g = context;
        this.f47893c = z10;
    }
}
