package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class j0 implements RequestDelegate {

    public final int f39192a = 0;

    public final int f39193b;

    public final boolean f39194c;
    public final Object d;

    public final Object f39195e;

    public final Object f39196f;

    public final Object f39197g;

    public j0(m4 m4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = m4Var;
        this.f39193b = i10;
        this.f39195e = webPage;
        this.f39196f = messageObject;
        this.f39194c = z10;
        this.f39197g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39192a) {
            case 0:
                AndroidUtilities.runOnUIThread(new z((m4) this.d, tLObject, this.f39193b, (TLRPC.WebPage) this.f39195e, (MessageObject) this.f39196f, this.f39194c, (String) this.f39197g));
                break;
            default:
                AndroidUtilities.runOnUIThread(new z((we.d) this.d, (org.telegram.ui.ActionBar.b2[]) this.f39195e, tLObject, this.f39193b, (Uri) this.f39196f, (Context) this.f39197g, this.f39194c));
                break;
        }
    }

    public j0(we.d dVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = dVar;
        this.f39195e = b2VarArr;
        this.f39193b = i10;
        this.f39196f = uri;
        this.f39197g = context;
        this.f39194c = z10;
    }
}
