package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class mx implements View.OnClickListener {
    public final boolean[] f37562a;
    public final h6.o f37563b;
    public final androidx.mediarouter.app.w f37564c;

    public mx(androidx.mediarouter.app.w wVar, boolean[] zArr, h6.o oVar) {
        this.f37564c = wVar;
        this.f37562a = zArr;
        this.f37563b = oVar;
    }

    @Override
    public final void onClick(View view) {
        px pxVar = (px) this.f37564c.f2753b;
        boolean[] zArr = this.f37562a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, pxVar.G.getContext(), null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        qy qyVar = pxVar.G;
        String str = pxVar.f38608x;
        if (str == null) {
            str = qyVar.X0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        org.telegram.messenger.g0.h3(new org.telegram.ui.f0(this, t1VarArr, ConnectionsManager.getInstance(qyVar.f39047d1).sendRequest(tL_messages_getEmojiURL, new bi.q1(this, t1VarArr, this.f37563b, 16)), 10), 1000L);
    }
}
