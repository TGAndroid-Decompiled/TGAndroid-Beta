package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f47895a = 0;
    public final int f47896b;
    public final boolean f47897c;
    public final Object d;
    public final Object f47898e;
    public final Object f47899f;
    public final Object f47900g;

    public g0(g4 g4Var, int i7, TLRPC.WebPage webPage, org.telegram.messenger.gj gjVar, boolean z10, String str) {
        this.d = g4Var;
        this.f47896b = i7;
        this.f47898e = webPage;
        this.f47899f = gjVar;
        this.f47897c = z10;
        this.f47900g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47895a) {
            case 0:
                org.telegram.messenger.g0.g3(new ai.v((g4) this.d, tLObject, this.f47896b, (TLRPC.WebPage) this.f47898e, (org.telegram.messenger.gj) this.f47899f, this.f47897c, (String) this.f47900g));
                return;
            default:
                org.telegram.messenger.g0.g3(new ai.v((vf.b) this.d, (org.telegram.ui.ActionBar.t1[]) this.f47898e, tLObject, this.f47896b, (Uri) this.f47899f, (Context) this.f47900g, this.f47897c));
                return;
        }
    }

    public g0(vf.b bVar, org.telegram.ui.ActionBar.t1[] t1VarArr, int i7, Uri uri, Context context, boolean z10) {
        this.d = bVar;
        this.f47898e = t1VarArr;
        this.f47896b = i7;
        this.f47899f = uri;
        this.f47900g = context;
        this.f47897c = z10;
    }
}
