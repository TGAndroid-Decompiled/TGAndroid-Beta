package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i0 implements RequestDelegate {
    public final int f38966a = 0;
    public final int f38967b;
    public final boolean f38968c;
    public final Object d;
    public final Object f38969e;
    public final Object f38970f;
    public final Object f38971g;

    public i0(l4 l4Var, int i9, TLRPC.WebPage webPage, MessageObject messageObject, boolean z10, String str) {
        this.d = l4Var;
        this.f38967b = i9;
        this.f38969e = webPage;
        this.f38970f = messageObject;
        this.f38968c = z10;
        this.f38971g = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38966a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y((l4) this.d, tLObject, this.f38967b, (TLRPC.WebPage) this.f38969e, (MessageObject) this.f38970f, this.f38968c, (String) this.f38971g));
                return;
            default:
                AndroidUtilities.runOnUIThread(new y((ve.d) this.d, (org.telegram.ui.ActionBar.c2[]) this.f38969e, tLObject, this.f38967b, (Uri) this.f38970f, (Context) this.f38971g, this.f38968c));
                return;
        }
    }

    public i0(ve.d dVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i9, Uri uri, Context context, boolean z10) {
        this.d = dVar;
        this.f38969e = c2VarArr;
        this.f38967b = i9;
        this.f38970f = uri;
        this.f38971g = context;
        this.f38968c = z10;
    }
}
