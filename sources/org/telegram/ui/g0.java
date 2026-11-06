package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f45738a = 0;
    public final int f45739b;
    public final boolean f45740c;
    public final Object d;
    public final Object f45741e;
    public final Object f45742f;
    public final Object f45743g;

    public g0(g4 g4Var, int i7, TLRPC.WebPage webPage, org.telegram.messenger.ij ijVar, boolean z9, String str) {
        this.d = g4Var;
        this.f45739b = i7;
        this.f45741e = webPage;
        this.f45742f = ijVar;
        this.f45740c = z9;
        this.f45743g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45738a) {
            case 0:
                org.telegram.messenger.g0.h3(new w((g4) this.d, tLObject, this.f45739b, (TLRPC.WebPage) this.f45741e, (org.telegram.messenger.ij) this.f45742f, this.f45740c, (String) this.f45743g));
                return;
            default:
                org.telegram.messenger.g0.h3(new w((vf.b) this.d, (org.telegram.ui.ActionBar.u1[]) this.f45741e, tLObject, this.f45739b, (Uri) this.f45742f, (Context) this.f45743g, this.f45740c));
                return;
        }
    }

    public g0(vf.b bVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, Uri uri, Context context, boolean z9) {
        this.d = bVar;
        this.f45741e = u1VarArr;
        this.f45739b = i7;
        this.f45742f = uri;
        this.f45743g = context;
        this.f45740c = z9;
    }
}
