package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ix implements View.OnClickListener {
    public final boolean[] f35744a;
    public final org.telegram.messenger.ou f35745b;
    public final androidx.mediarouter.app.w f35746c;

    public ix(androidx.mediarouter.app.w wVar, boolean[] zArr, org.telegram.messenger.ou ouVar) {
        this.f35746c = wVar;
        this.f35744a = zArr;
        this.f35745b = ouVar;
    }

    @Override
    public final void onClick(View view) {
        lx lxVar = (lx) this.f35746c.f2790b;
        boolean[] zArr = this.f35744a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, lxVar.G.getContext(), null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        ly lyVar = lxVar.G;
        String str = lxVar.f36925x;
        if (str == null) {
            str = lyVar.X0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        org.telegram.messenger.g0.i3(new org.telegram.ui.f0(this, t1VarArr, ConnectionsManager.getInstance(lyVar.f36941d1).sendRequest(tL_messages_getEmojiURL, new bi.j6(this, t1VarArr, this.f35745b, 14)), 10), 1000L);
    }
}
