package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class px implements View.OnClickListener {
    public final boolean[] f38670a;
    public final hi.w4 f38671b;
    public final androidx.mediarouter.app.w f38672c;

    public px(androidx.mediarouter.app.w wVar, boolean[] zArr, hi.w4 w4Var) {
        this.f38672c = wVar;
        this.f38670a = zArr;
        this.f38671b = w4Var;
    }

    @Override
    public final void onClick(View view) {
        sx sxVar = (sx) this.f38672c.f2801b;
        boolean[] zArr = this.f38670a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, sxVar.G.getContext(), null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        ty tyVar = sxVar.G;
        String str = sxVar.f39716x;
        if (str == null) {
            str = tyVar.X0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        org.telegram.messenger.g0.h3(new org.telegram.ui.f0(this, t1VarArr, ConnectionsManager.getInstance(tyVar.f40091d1).sendRequest(tL_messages_getEmojiURL, new bi.q1(this, t1VarArr, this.f38671b, 16)), 10), 1000L);
    }
}
