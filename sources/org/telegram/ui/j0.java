package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j0 implements RequestDelegate {
    public final int f39376a = 0;
    public final int f39377b;
    public final boolean f39378c;
    public final Object d;
    public final Object f39379e;
    public final Object f39380f;
    public final Object f39381g;

    public j0(m4 m4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = m4Var;
        this.f39377b = i10;
        this.f39379e = webPage;
        this.f39380f = messageObject;
        this.f39378c = z10;
        this.f39381g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39376a) {
            case 0:
                AndroidUtilities.runOnUIThread(new z((m4) this.d, tLObject, this.f39377b, (TLRPC.WebPage) this.f39379e, (MessageObject) this.f39380f, this.f39378c, (String) this.f39381g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new z((ye.c) this.d, (org.telegram.ui.ActionBar.c2[]) this.f39379e, tLObject, this.f39377b, (Uri) this.f39380f, (Context) this.f39381g, this.f39378c));
                return;
        }
    }

    public j0(ye.c cVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = cVar;
        this.f39379e = c2VarArr;
        this.f39377b = i10;
        this.f39380f = uri;
        this.f39381g = context;
        this.f39378c = z10;
    }
}
