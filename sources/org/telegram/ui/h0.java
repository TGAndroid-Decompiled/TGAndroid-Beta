package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h0 implements RequestDelegate {
    public final int f37448a = 0;
    public final int f37449b;
    public final boolean f37450c;
    public final Object d;
    public final Object e;
    public final Object f37451f;
    public final Object f37452g;

    public h0(l4 l4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = l4Var;
        this.f37449b = i10;
        this.e = webPage;
        this.f37451f = messageObject;
        this.f37450c = z10;
        this.f37452g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37448a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x((l4) this.d, tLObject, this.f37449b, (TLRPC.WebPage) this.e, (MessageObject) this.f37451f, this.f37450c, (String) this.f37452g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new x((pf.c) this.d, (org.telegram.ui.ActionBar.b2[]) this.e, tLObject, this.f37449b, (Uri) this.f37451f, (Context) this.f37452g, this.f37450c));
                return;
        }
    }

    public h0(pf.c cVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = cVar;
        this.e = b2VarArr;
        this.f37449b = i10;
        this.f37451f = uri;
        this.f37452g = context;
        this.f37450c = z10;
    }
}
