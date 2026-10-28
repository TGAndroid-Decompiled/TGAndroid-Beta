package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f39463a = 0;
    public final int f39464b;
    public final boolean f39465c;
    public final Object d;
    public final Object e;
    public final Object f39466f;
    public final Object f39467g;

    public g0(j4 j4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = j4Var;
        this.f39464b = i10;
        this.e = webPage;
        this.f39466f = messageObject;
        this.f39465c = z10;
        this.f39467g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39463a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w((j4) this.d, tLObject, this.f39464b, (TLRPC.WebPage) this.e, (MessageObject) this.f39466f, this.f39465c, (String) this.f39467g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new w((qf.c) this.d, (org.telegram.ui.ActionBar.e2[]) this.e, tLObject, this.f39464b, (Uri) this.f39466f, (Context) this.f39467g, this.f39465c));
                return;
        }
    }

    public g0(qf.c cVar, org.telegram.ui.ActionBar.e2[] e2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = cVar;
        this.e = e2VarArr;
        this.f39464b = i10;
        this.f39466f = uri;
        this.f39467g = context;
        this.f39465c = z10;
    }
}
