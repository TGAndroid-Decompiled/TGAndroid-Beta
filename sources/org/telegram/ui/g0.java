package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f37410a = 0;
    public final int f37411b;
    public final boolean f37412c;
    public final Object d;
    public final Object e;
    public final Object f37413f;
    public final Object f37414g;

    public g0(k4 k4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = k4Var;
        this.f37411b = i10;
        this.e = webPage;
        this.f37413f = messageObject;
        this.f37412c = z10;
        this.f37414g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37410a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w((k4) this.d, tLObject, this.f37411b, (TLRPC.WebPage) this.e, (MessageObject) this.f37413f, this.f37412c, (String) this.f37414g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new w((pf.c) this.d, (org.telegram.ui.ActionBar.c2[]) this.e, tLObject, this.f37411b, (Uri) this.f37413f, (Context) this.f37414g, this.f37412c));
                return;
        }
    }

    public g0(pf.c cVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = cVar;
        this.e = c2VarArr;
        this.f37411b = i10;
        this.f37413f = uri;
        this.f37414g = context;
        this.f37412c = z10;
    }
}
