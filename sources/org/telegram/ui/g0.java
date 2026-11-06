package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f45765a = 0;
    public final int f45766b;
    public final boolean f45767c;
    public final Object d;
    public final Object f45768e;
    public final Object f45769f;
    public final Object f45770g;

    public g0(g4 g4Var, int i7, TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar, boolean z9, String str) {
        this.d = g4Var;
        this.f45766b = i7;
        this.f45768e = webPage;
        this.f45769f = ijVar;
        this.f45767c = z9;
        this.f45770g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45765a) {
            case 0:
                org.telegram.messenger.g0.h3(new w((g4) this.d, tLObject, this.f45766b, (TLRPC.WebPage) this.f45768e, (org.telegram.messenger.ij) this.f45769f, this.f45767c, (String) this.f45770g));
                return;
            default:
                org.telegram.messenger.g0.h3(new w((vf.b) this.d, (org.telegram.ui.ActionBar.u1[]) this.f45768e, tLObject, this.f45766b, (Uri) this.f45769f, (Context) this.f45770g, this.f45767c));
                return;
        }
    }

    public g0(vf.b bVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, Uri uri, Context context, boolean z9) {
        this.d = bVar;
        this.f45768e = u1VarArr;
        this.f45766b = i7;
        this.f45769f = uri;
        this.f45770g = context;
        this.f45767c = z9;
    }
}
