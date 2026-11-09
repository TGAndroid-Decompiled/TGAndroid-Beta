package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class dx implements View.OnClickListener {
    public final boolean[] f33178a;
    public final h9.f1 f33179b;
    public final androidx.mediarouter.app.w f33180c;

    public dx(androidx.mediarouter.app.w wVar, boolean[] zArr, h9.f1 f1Var) {
        this.f33180c = wVar;
        this.f33178a = zArr;
        this.f33179b = f1Var;
    }

    @Override
    public final void onClick(View view) {
        hx hxVar = (hx) this.f33180c.f2833b;
        boolean[] zArr = this.f33178a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, hxVar.F.getContext(), null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        hy hyVar = hxVar.F;
        String str = hxVar.f34401x;
        if (str == null) {
            str = hyVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        org.telegram.messenger.g0.i3(new org.telegram.ui.q8(this, u1VarArr, ConnectionsManager.getInstance(hyVar.f34415c1).sendRequest(tL_messages_getEmojiURL, new bi.f2(this, u1VarArr, this.f33179b, 13)), 7), 1000L);
    }
}
