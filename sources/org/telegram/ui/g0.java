package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f45764a = 0;
    public final int f45765b;
    public final boolean f45766c;
    public final Object d;
    public final Object f45767e;
    public final Object f45768f;
    public final Object f45769g;

    public g0(g4 g4Var, int i7, TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar, boolean z9, String str) {
        this.d = g4Var;
        this.f45765b = i7;
        this.f45767e = webPage;
        this.f45768f = ijVar;
        this.f45766c = z9;
        this.f45769g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45764a) {
            case 0:
                org.telegram.messenger.g0.h3(new w((g4) this.d, tLObject, this.f45765b, (TLRPC.WebPage) this.f45767e, (org.telegram.messenger.ij) this.f45768f, this.f45766c, (String) this.f45769g));
                return;
            default:
                org.telegram.messenger.g0.h3(new w((vf.b) this.d, (org.telegram.ui.ActionBar.u1[]) this.f45767e, tLObject, this.f45765b, (Uri) this.f45768f, (Context) this.f45769g, this.f45766c));
                return;
        }
    }

    public g0(vf.b bVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, Uri uri, Context context, boolean z9) {
        this.d = bVar;
        this.f45767e = u1VarArr;
        this.f45765b = i7;
        this.f45768f = uri;
        this.f45769g = context;
        this.f45766c = z9;
    }
}
