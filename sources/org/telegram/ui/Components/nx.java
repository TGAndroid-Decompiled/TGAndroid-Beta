package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class nx implements View.OnClickListener {
    public final boolean[] f37867a;
    public final hi.w4 f37868b;
    public final androidx.mediarouter.app.w f37869c;

    public nx(androidx.mediarouter.app.w wVar, boolean[] zArr, hi.w4 w4Var) {
        this.f37869c = wVar;
        this.f37867a = zArr;
        this.f37868b = w4Var;
    }

    @Override
    public final void onClick(View view) {
        qx qxVar = (qx) this.f37869c.f2782b;
        boolean[] zArr = this.f37867a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, qxVar.G.getContext(), null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        ry ryVar = qxVar.G;
        String str = qxVar.f38932x;
        if (str == null) {
            str = ryVar.X0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        org.telegram.messenger.g0.h3(new org.telegram.ui.b0(this, u1VarArr, ConnectionsManager.getInstance(ryVar.f39345d1).sendRequest(tL_messages_getEmojiURL, new bi.m1(this, u1VarArr, this.f37868b, 16)), 11), 1000L);
    }
}
