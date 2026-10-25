package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g0 implements RequestDelegate {
    public final int f39505a = 0;
    public final int f39506b;
    public final boolean f39507c;
    public final Object d;
    public final Object e;
    public final Object f39508f;
    public final Object f39509g;

    public g0(j4 j4Var, int i10, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = j4Var;
        this.f39506b = i10;
        this.e = webPage;
        this.f39508f = messageObject;
        this.f39507c = z10;
        this.f39509g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39505a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w((j4) this.d, tLObject, this.f39506b, (TLRPC.WebPage) this.e, (MessageObject) this.f39508f, this.f39507c, (String) this.f39509g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new w((qf.c) this.d, (org.telegram.ui.ActionBar.e2[]) this.e, tLObject, this.f39506b, (Uri) this.f39508f, (Context) this.f39509g, this.f39507c));
                return;
        }
    }

    public g0(qf.c cVar, org.telegram.ui.ActionBar.e2[] e2VarArr, int i10, Uri uri, Context context, boolean z10) {
        this.d = cVar;
        this.e = e2VarArr;
        this.f39506b = i10;
        this.f39508f = uri;
        this.f39509g = context;
        this.f39507c = z10;
    }
}
