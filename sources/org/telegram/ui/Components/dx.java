package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class dx implements View.OnClickListener {
    public final boolean[] f33104a;
    public final h9.f1 f33105b;
    public final androidx.mediarouter.app.w f33106c;

    public dx(androidx.mediarouter.app.w wVar, boolean[] zArr, h9.f1 f1Var) {
        this.f33106c = wVar;
        this.f33104a = zArr;
        this.f33105b = f1Var;
    }

    @Override
    public final void onClick(View view) {
        hx hxVar = (hx) this.f33106c.f2833b;
        boolean[] zArr = this.f33104a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, hxVar.F.getContext(), null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        hy hyVar = hxVar.F;
        String str = hxVar.f34386x;
        if (str == null) {
            str = hyVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        org.telegram.messenger.g0.i3(new org.telegram.ui.q8(this, u1VarArr, ConnectionsManager.getInstance(hyVar.f34400c1).sendRequest(tL_messages_getEmojiURL, new bi.f2(this, u1VarArr, this.f33105b, 13)), 7), 1000L);
    }
}
