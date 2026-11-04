package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h0 implements RequestDelegate {
    public final int f45764a = 0;
    public final int f45765b;
    public final boolean f45766c;
    public final Object d;
    public final Object f45767e;
    public final Object f45768f;
    public final Object f45769g;

    public h0(i4 i4Var, int i3, TLRPC.WebPage webPage, org.telegram.messenger.zi ziVar, boolean z10, String str) {
        this.d = i4Var;
        this.f45765b = i3;
        this.f45767e = webPage;
        this.f45768f = ziVar;
        this.f45766c = z10;
        this.f45769g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45764a) {
            case 0:
                org.telegram.messenger.g0.h3(new x((i4) this.d, tLObject, this.f45765b, (TLRPC.WebPage) this.f45767e, (org.telegram.messenger.zi) this.f45768f, this.f45766c, (String) this.f45769g));
                return;
            default:
                org.telegram.messenger.g0.h3(new x((sf.b) this.d, (org.telegram.ui.ActionBar.s1[]) this.f45767e, tLObject, this.f45765b, (Uri) this.f45768f, (Context) this.f45769g, this.f45766c));
                return;
        }
    }

    public h0(sf.b bVar, org.telegram.ui.ActionBar.s1[] s1VarArr, int i3, Uri uri, Context context, boolean z10) {
        this.d = bVar;
        this.f45767e = s1VarArr;
        this.f45765b = i3;
        this.f45768f = uri;
        this.f45769g = context;
        this.f45766c = z10;
    }
}
