package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f47845a = 0;
    public final int f47846b;
    public final boolean f47847c;
    public final Object d;
    public final Object f47848e;
    public final Object f47849f;
    public final Object f47850g;

    public g0(g4 g4Var, int i7, TLRPC.WebPage webPage, org.telegram.messenger.gj gjVar, boolean z10, String str) {
        this.d = g4Var;
        this.f47846b = i7;
        this.f47848e = webPage;
        this.f47849f = gjVar;
        this.f47847c = z10;
        this.f47850g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47845a) {
            case 0:
                org.telegram.messenger.g0.g3(new ai.r((g4) this.d, tLObject, this.f47846b, (TLRPC.WebPage) this.f47848e, (org.telegram.messenger.gj) this.f47849f, this.f47847c, (String) this.f47850g));
                return;
            default:
                org.telegram.messenger.g0.g3(new ai.r((vf.b) this.d, (org.telegram.ui.ActionBar.t1[]) this.f47848e, tLObject, this.f47846b, (Uri) this.f47849f, (Context) this.f47850g, this.f47847c));
                return;
        }
    }

    public g0(vf.b bVar, org.telegram.ui.ActionBar.t1[] t1VarArr, int i7, Uri uri, Context context, boolean z10) {
        this.d = bVar;
        this.f47848e = t1VarArr;
        this.f47846b = i7;
        this.f47849f = uri;
        this.f47850g = context;
        this.f47847c = z10;
    }
}
