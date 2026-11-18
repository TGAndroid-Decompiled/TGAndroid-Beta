package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f47824a = 0;
    public final int f47825b;
    public final boolean f47826c;
    public final Object d;
    public final Object f47827e;
    public final Object f47828f;
    public final Object f47829g;

    public g0(g4 g4Var, int i7, TLRPC.WebPage webPage, org.telegram.messenger.fj fjVar, boolean z10, String str) {
        this.d = g4Var;
        this.f47825b = i7;
        this.f47827e = webPage;
        this.f47828f = fjVar;
        this.f47826c = z10;
        this.f47829g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47824a) {
            case 0:
                org.telegram.messenger.g0.g3(new ai.v((g4) this.d, tLObject, this.f47825b, (TLRPC.WebPage) this.f47827e, (org.telegram.messenger.fj) this.f47828f, this.f47826c, (String) this.f47829g));
                return;
            default:
                org.telegram.messenger.g0.g3(new ai.v((vf.b) this.d, (org.telegram.ui.ActionBar.u1[]) this.f47827e, tLObject, this.f47825b, (Uri) this.f47828f, (Context) this.f47829g, this.f47826c));
                return;
        }
    }

    public g0(vf.b bVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, Uri uri, Context context, boolean z10) {
        this.d = bVar;
        this.f47827e = u1VarArr;
        this.f47825b = i7;
        this.f47828f = uri;
        this.f47829g = context;
        this.f47826c = z10;
    }
}
