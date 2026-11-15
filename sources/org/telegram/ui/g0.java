package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f47258a = 0;
    public final int f47259b;
    public final boolean f47260c;
    public final Object d;
    public final Object f47261e;
    public final Object f47262f;
    public final Object f47263g;

    public g0(g4 g4Var, int i7, TLRPC.WebPage webPage, org.telegram.messenger.gj gjVar, boolean z10, String str) {
        this.d = g4Var;
        this.f47259b = i7;
        this.f47261e = webPage;
        this.f47262f = gjVar;
        this.f47260c = z10;
        this.f47263g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47258a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.u((g4) this.d, tLObject, this.f47259b, (TLRPC.WebPage) this.f47261e, (org.telegram.messenger.gj) this.f47262f, this.f47260c, (String) this.f47263g));
                return;
            default:
                org.telegram.messenger.g0.h3(new ai.u((vf.b) this.d, (org.telegram.ui.ActionBar.t1[]) this.f47261e, tLObject, this.f47259b, (Uri) this.f47262f, (Context) this.f47263g, this.f47260c));
                return;
        }
    }

    public g0(vf.b bVar, org.telegram.ui.ActionBar.t1[] t1VarArr, int i7, Uri uri, Context context, boolean z10) {
        this.d = bVar;
        this.f47261e = t1VarArr;
        this.f47259b = i7;
        this.f47262f = uri;
        this.f47263g = context;
        this.f47260c = z10;
    }
}
