package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h0 implements RequestDelegate {
    public final int f36561a = 0;
    public final int f36562b;
    public final boolean f36563c;
    public final Object d;
    public final Object e;
    public final Object f36564f;
    public final Object f36565g;

    public h0(k4 k4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = k4Var;
        this.f36562b = i10;
        this.e = webPage;
        this.f36564f = messageObject;
        this.f36563c = z10;
        this.f36565g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36561a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x((k4) this.d, tLObject, this.f36562b, (TLRPC.WebPage) this.e, (MessageObject) this.f36564f, this.f36563c, (String) this.f36565g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new x((pf.c) this.d, (org.telegram.ui.ActionBar.a2[]) this.e, tLObject, this.f36562b, (Uri) this.f36564f, (Context) this.f36565g, this.f36563c));
                return;
        }
    }

    public h0(pf.c cVar, org.telegram.ui.ActionBar.a2[] a2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = cVar;
        this.e = a2VarArr;
        this.f36562b = i10;
        this.f36564f = uri;
        this.f36565g = context;
        this.f36563c = z10;
    }
}
