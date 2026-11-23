package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f48010a = 0;
    public final int f48011b;
    public final boolean f48012c;
    public final Object d;
    public final Object f48013e;
    public final Object f48014f;
    public final Object f48015g;

    public g0(g4 g4Var, int i7, TLRPC.WebPage webPage, org.telegram.messenger.fj fjVar, boolean z10, String str) {
        this.d = g4Var;
        this.f48011b = i7;
        this.f48013e = webPage;
        this.f48014f = fjVar;
        this.f48012c = z10;
        this.f48015g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48010a) {
            case 0:
                org.telegram.messenger.g0.g3(new ai.s((g4) this.d, tLObject, this.f48011b, (TLRPC.WebPage) this.f48013e, (org.telegram.messenger.fj) this.f48014f, this.f48012c, (String) this.f48015g));
                return;
            default:
                org.telegram.messenger.g0.g3(new ai.s((vf.b) this.d, (org.telegram.ui.ActionBar.t1[]) this.f48013e, tLObject, this.f48011b, (Uri) this.f48014f, (Context) this.f48015g, this.f48012c));
                return;
        }
    }

    public g0(vf.b bVar, org.telegram.ui.ActionBar.t1[] t1VarArr, int i7, Uri uri, Context context, boolean z10) {
        this.d = bVar;
        this.f48013e = t1VarArr;
        this.f48011b = i7;
        this.f48014f = uri;
        this.f48015g = context;
        this.f48012c = z10;
    }
}
