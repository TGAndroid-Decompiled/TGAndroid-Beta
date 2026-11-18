package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f47860a = 0;
    public final int f47861b;
    public final boolean f47862c;
    public final Object d;
    public final Object f47863e;
    public final Object f47864f;
    public final Object f47865g;

    public g0(g4 g4Var, int i7, TLRPC.WebPage webPage, org.telegram.messenger.fj fjVar, boolean z10, String str) {
        this.d = g4Var;
        this.f47861b = i7;
        this.f47863e = webPage;
        this.f47864f = fjVar;
        this.f47862c = z10;
        this.f47865g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47860a) {
            case 0:
                org.telegram.messenger.g0.g3(new ai.v((g4) this.d, tLObject, this.f47861b, (TLRPC.WebPage) this.f47863e, (org.telegram.messenger.fj) this.f47864f, this.f47862c, (String) this.f47865g));
                return;
            default:
                org.telegram.messenger.g0.g3(new ai.v((vf.b) this.d, (org.telegram.ui.ActionBar.u1[]) this.f47863e, tLObject, this.f47861b, (Uri) this.f47864f, (Context) this.f47865g, this.f47862c));
                return;
        }
    }

    public g0(vf.b bVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, Uri uri, Context context, boolean z10) {
        this.d = bVar;
        this.f47863e = u1VarArr;
        this.f47861b = i7;
        this.f47864f = uri;
        this.f47865g = context;
        this.f47862c = z10;
    }
}
