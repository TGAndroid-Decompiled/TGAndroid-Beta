package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f45741a = 0;
    public final int f45742b;
    public final boolean f45743c;
    public final Object d;
    public final Object f45744e;
    public final Object f45745f;
    public final Object f45746g;

    public g0(g4 g4Var, int i7, TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar, boolean z9, String str) {
        this.d = g4Var;
        this.f45742b = i7;
        this.f45744e = webPage;
        this.f45745f = ijVar;
        this.f45743c = z9;
        this.f45746g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45741a) {
            case 0:
                org.telegram.messenger.g0.h3(new w((g4) this.d, tLObject, this.f45742b, (TLRPC.WebPage) this.f45744e, (org.telegram.messenger.ij) this.f45745f, this.f45743c, (String) this.f45746g));
                return;
            default:
                org.telegram.messenger.g0.h3(new w((vf.b) this.d, (org.telegram.ui.ActionBar.u1[]) this.f45744e, tLObject, this.f45742b, (Uri) this.f45745f, (Context) this.f45746g, this.f45743c));
                return;
        }
    }

    public g0(vf.b bVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, Uri uri, Context context, boolean z9) {
        this.d = bVar;
        this.f45744e = u1VarArr;
        this.f45742b = i7;
        this.f45745f = uri;
        this.f45746g = context;
        this.f45743c = z9;
    }
}
