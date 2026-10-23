package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f37447a = 0;
    public final int f37448b;
    public final boolean f37449c;
    public final Object d;
    public final Object e;
    public final Object f37450f;
    public final Object f37451g;

    public g0(k4 k4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = k4Var;
        this.f37448b = i10;
        this.e = webPage;
        this.f37450f = messageObject;
        this.f37449c = z10;
        this.f37451g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37447a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w((k4) this.d, tLObject, this.f37448b, (TLRPC.WebPage) this.e, (MessageObject) this.f37450f, this.f37449c, (String) this.f37451g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new w((pf.c) this.d, (org.telegram.ui.ActionBar.c2[]) this.e, tLObject, this.f37448b, (Uri) this.f37450f, (Context) this.f37451g, this.f37449c));
                return;
        }
    }

    public g0(pf.c cVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = cVar;
        this.e = c2VarArr;
        this.f37448b = i10;
        this.f37450f = uri;
        this.f37451g = context;
        this.f37449c = z10;
    }
}
