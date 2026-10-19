package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h0 implements RequestDelegate {
    public final int f37441a = 0;
    public final int f37442b;
    public final boolean f37443c;
    public final Object d;
    public final Object e;
    public final Object f37444f;
    public final Object f37445g;

    public h0(l4 l4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = l4Var;
        this.f37442b = i10;
        this.e = webPage;
        this.f37444f = messageObject;
        this.f37443c = z10;
        this.f37445g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37441a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x((l4) this.d, tLObject, this.f37442b, (TLRPC.WebPage) this.e, (MessageObject) this.f37444f, this.f37443c, (String) this.f37445g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new x((pf.c) this.d, (org.telegram.ui.ActionBar.b2[]) this.e, tLObject, this.f37442b, (Uri) this.f37444f, (Context) this.f37445g, this.f37443c));
                return;
        }
    }

    public h0(pf.c cVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = cVar;
        this.e = b2VarArr;
        this.f37442b = i10;
        this.f37444f = uri;
        this.f37445g = context;
        this.f37443c = z10;
    }
}
