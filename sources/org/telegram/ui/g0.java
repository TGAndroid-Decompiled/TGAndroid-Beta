package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f45892a = 0;
    public final int f45893b;
    public final boolean f45894c;
    public final Object d;
    public final Object f45895e;
    public final Object f45896f;
    public final Object f45897g;

    public g0(g4 g4Var, int i7, TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar, boolean z9, String str) {
        this.d = g4Var;
        this.f45893b = i7;
        this.f45895e = webPage;
        this.f45896f = ijVar;
        this.f45894c = z9;
        this.f45897g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45892a) {
            case 0:
                org.telegram.messenger.g0.h3(new w((g4) this.d, tLObject, this.f45893b, (TLRPC.WebPage) this.f45895e, (org.telegram.messenger.ij) this.f45896f, this.f45894c, (String) this.f45897g));
                return;
            default:
                org.telegram.messenger.g0.h3(new w((vf.b) this.d, (org.telegram.ui.ActionBar.u1[]) this.f45895e, tLObject, this.f45893b, (Uri) this.f45896f, (Context) this.f45897g, this.f45894c));
                return;
        }
    }

    public g0(vf.b bVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, Uri uri, Context context, boolean z9) {
        this.d = bVar;
        this.f45895e = u1VarArr;
        this.f45893b = i7;
        this.f45896f = uri;
        this.f45897g = context;
        this.f45894c = z9;
    }
}
