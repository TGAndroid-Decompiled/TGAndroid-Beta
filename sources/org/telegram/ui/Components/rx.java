package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class rx implements View.OnClickListener {
    public final boolean[] f30034a;
    public final l2.f f30035b;
    public final androidx.mediarouter.app.w f30036c;

    public rx(androidx.mediarouter.app.w wVar, boolean[] zArr, l2.f fVar) {
        this.f30036c = wVar;
        this.f30034a = zArr;
        this.f30035b = fVar;
    }

    @Override
    public final void onClick(View view) {
        ux uxVar = (ux) this.f30036c.f1886b;
        boolean[] zArr = this.f30034a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, uxVar.F.getContext(), null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        vy vyVar = uxVar.F;
        String str = uxVar.f31076x;
        if (str == null) {
            str = vyVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        org.telegram.messenger.i0.h3(new ag.o0(this, x1VarArr, ConnectionsManager.getInstance(vyVar.f31865c1).sendRequest(tL_messages_getEmojiURL, new ag.p0(this, x1VarArr, this.f30035b, 9)), 24), 1000L);
    }
}
