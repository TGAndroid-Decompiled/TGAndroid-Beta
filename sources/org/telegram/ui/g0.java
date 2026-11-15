package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f47248a = 0;
    public final int f47249b;
    public final boolean f47250c;
    public final Object d;
    public final Object f47251e;
    public final Object f47252f;
    public final Object f47253g;

    public g0(g4 g4Var, int i7, TLRPC.WebPage webPage, org.telegram.messenger.gj gjVar, boolean z10, String str) {
        this.d = g4Var;
        this.f47249b = i7;
        this.f47251e = webPage;
        this.f47252f = gjVar;
        this.f47250c = z10;
        this.f47253g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47248a) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.v((g4) this.d, tLObject, this.f47249b, (TLRPC.WebPage) this.f47251e, (org.telegram.messenger.gj) this.f47252f, this.f47250c, (String) this.f47253g));
                return;
            default:
                org.telegram.messenger.g0.h3(new ai.v((vf.b) this.d, (org.telegram.ui.ActionBar.t1[]) this.f47251e, tLObject, this.f47249b, (Uri) this.f47252f, (Context) this.f47253g, this.f47250c));
                return;
        }
    }

    public g0(vf.b bVar, org.telegram.ui.ActionBar.t1[] t1VarArr, int i7, Uri uri, Context context, boolean z10) {
        this.d = bVar;
        this.f47251e = t1VarArr;
        this.f47249b = i7;
        this.f47252f = uri;
        this.f47253g = context;
        this.f47250c = z10;
    }
}
