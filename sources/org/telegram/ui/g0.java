package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f39508a = 0;
    public final int f39509b;
    public final boolean f39510c;
    public final Object d;
    public final Object e;
    public final Object f39511f;
    public final Object f39512g;

    public g0(j4 j4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = j4Var;
        this.f39509b = i10;
        this.e = webPage;
        this.f39511f = messageObject;
        this.f39510c = z10;
        this.f39512g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39508a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w((j4) this.d, tLObject, this.f39509b, (TLRPC.WebPage) this.e, (MessageObject) this.f39511f, this.f39510c, (String) this.f39512g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new w((qf.c) this.d, (org.telegram.ui.ActionBar.e2[]) this.e, tLObject, this.f39509b, (Uri) this.f39511f, (Context) this.f39512g, this.f39510c));
                return;
        }
    }

    public g0(qf.c cVar, org.telegram.ui.ActionBar.e2[] e2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = cVar;
        this.e = e2VarArr;
        this.f39509b = i10;
        this.f39511f = uri;
        this.f39512g = context;
        this.f39510c = z10;
    }
}
