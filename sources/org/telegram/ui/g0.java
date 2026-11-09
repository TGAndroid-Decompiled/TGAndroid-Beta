package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f45829a = 0;
    public final int f45830b;
    public final boolean f45831c;
    public final Object d;
    public final Object f45832e;
    public final Object f45833f;
    public final Object f45834g;

    public g0(g4 g4Var, int i7, TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar, boolean z9, String str) {
        this.d = g4Var;
        this.f45830b = i7;
        this.f45832e = webPage;
        this.f45833f = ijVar;
        this.f45831c = z9;
        this.f45834g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45829a) {
            case 0:
                org.telegram.messenger.g0.h3(new w((g4) this.d, tLObject, this.f45830b, (TLRPC.WebPage) this.f45832e, (org.telegram.messenger.ij) this.f45833f, this.f45831c, (String) this.f45834g));
                return;
            default:
                org.telegram.messenger.g0.h3(new w((vf.b) this.d, (org.telegram.ui.ActionBar.u1[]) this.f45832e, tLObject, this.f45830b, (Uri) this.f45833f, (Context) this.f45834g, this.f45831c));
                return;
        }
    }

    public g0(vf.b bVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, Uri uri, Context context, boolean z9) {
        this.d = bVar;
        this.f45832e = u1VarArr;
        this.f45830b = i7;
        this.f45833f = uri;
        this.f45834g = context;
        this.f45831c = z9;
    }
}
