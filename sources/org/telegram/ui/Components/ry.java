package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ry implements View.OnClickListener {
    public final boolean[] f28961a;
    public final org.telegram.ui.ActionBar.z2 f28962b;
    public final sy f28963c;

    public ry(sy syVar, boolean[] zArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f28963c = syVar;
        this.f28961a = zArr;
        this.f28962b = z2Var;
    }

    @Override
    public final void onClick(View view) {
        vy vyVar = this.f28963c.f29229a;
        boolean[] zArr = this.f28961a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(vyVar.F.getContext(), 3, null)};
        TLRPC.TL_messages_getEmojiURL tL_messages_getEmojiURL = new TLRPC.TL_messages_getEmojiURL();
        wz wzVar = vyVar.F;
        String str = vyVar.f30676w;
        if (str == null) {
            str = wzVar.W0[0];
        }
        tL_messages_getEmojiURL.lang_code = str;
        AndroidUtilities.runOnUIThread(new org.telegram.ui.gm(this, a2VarArr, ConnectionsManager.getInstance(wzVar.f31014c1).sendRequest(tL_messages_getEmojiURL, new bi.e5(this, a2VarArr, this.f28962b, 8)), 4), 1000L);
    }
}
