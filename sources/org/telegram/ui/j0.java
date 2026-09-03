package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j0 implements RequestDelegate {
    public final int f35056a = 0;
    public final int f35057b;
    public final boolean f35058c;
    public final Object d;
    public final Object e;
    public final Object f35059f;
    public final Object f35060g;

    public j0(n4 n4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z4, String str) {
        this.d = n4Var;
        this.f35057b = i10;
        this.e = webPage;
        this.f35059f = messageObject;
        this.f35058c = z4;
        this.f35060g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35056a) {
            case 0:
                AndroidUtilities.runOnUIThread(new z((n4) this.d, tLObject, this.f35057b, (TLRPC.WebPage) this.e, (MessageObject) this.f35059f, this.f35058c, (String) this.f35060g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new z((ze.c) this.d, (org.telegram.ui.ActionBar.d2[]) this.e, tLObject, this.f35057b, (Uri) this.f35059f, (Context) this.f35060g, this.f35058c));
                return;
        }
    }

    public j0(ze.c cVar, org.telegram.ui.ActionBar.d2[] d2VarArr, int i10, Uri uri, Context context, boolean z4) {
        this.d = cVar;
        this.e = d2VarArr;
        this.f35057b = i10;
        this.f35059f = uri;
        this.f35060g = context;
        this.f35058c = z4;
    }
}
